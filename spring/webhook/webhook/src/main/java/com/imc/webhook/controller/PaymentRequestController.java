package com.imc.webhook.controller;


import com.imc.webhook.dto.PaymentRequest;
import com.imc.webhook.dto.PaymentStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.core.publisher.MonoSink;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/client")
@Slf4j
public class PaymentRequestController {

    private final WebClient webClient = WebClient.create("http://localhost:8081");
    private final Map<String, MonoSink<String>> responseSinks = new ConcurrentHashMap<>();

    @PostMapping("/pay")
    public Mono<String> makePayment(@RequestBody PaymentRequest paymentRequest) {
        return Mono.create(sink -> {
            responseSinks.put(paymentRequest.transactionId(),sink);
            webClient.post()
                    .uri("/gw/pay")
                    .contentType(MediaType.APPLICATION_JSON)
                    .bodyValue(paymentRequest)
                    .retrieve()
                    .bodyToMono(Void.class)
                    .subscribe();
        });
    }

    @PostMapping("/webhook/payment-status")
    public Mono<Void> receiveStatus(@RequestBody PaymentStatus paymentStatus) {
        MonoSink<String> sink = responseSinks.remove(paymentStatus.transactionId());
        if(sink != null && "success".equalsIgnoreCase(paymentStatus.status())) {
            log.info("Payment successful for Transaction ID : {} ", paymentStatus.transactionId());
            sink.success("Payment successful for Transaction ID "  + paymentStatus.transactionId());
        }
        else {
            assert  sink != null;
            log.error("Payment failed for transaction ID : {}", paymentStatus.transactionId() );
            sink.success("Payment failed for transaction ID : " + paymentStatus.transactionId());
        }
        return  Mono.empty();
    }
}
