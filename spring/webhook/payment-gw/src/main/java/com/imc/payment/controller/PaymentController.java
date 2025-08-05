package com.imc.payment.controller;


import com.imc.payment.dto.PaymentRequest;
import com.imc.payment.dto.PaymentStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/gw")
public class PaymentController {

    private final WebClient webHookClient = WebClient.create("http://localhost:8080");

    @PostMapping("/pay")
    public Mono<Void> simmulatePayment(@RequestBody PaymentRequest paymentRequest) {
        return  Mono.delay(Duration.ofSeconds(5))
                .flatMap(delay -> {
                    int number = ThreadLocalRandom.current().nextInt(0,11);
                    PaymentStatus status;
                    if ( number % 2 == 0 ) {
                        status = new PaymentStatus(
                                paymentRequest.transactionId(), "success"
                        );
                    }
                    else {
                        status = new PaymentStatus(paymentRequest.transactionId(), "failed");
                    }
                    return webHookClient.post()
                            .uri("/client/webhook/payment-status")
                            .contentType(MediaType.APPLICATION_JSON)
                            .bodyValue(status)
                            .retrieve()
                            .bodyToMono(Void.class);
                });
    }

}
