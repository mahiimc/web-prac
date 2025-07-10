package com.eventlistener.eventlistener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class Controller {

    private final ApplicationEventPublisher eventPublisher;

    @PostMapping("/event")
    public String publisherEvent(@RequestBody Event event) {
        try {
            eventPublisher.publishEvent(event);
            return "Sent event";
        }
        catch (Exception ex) {
            log.error("Error occurred while publishing event");
            return "Error occurred while publishing the event";
        }
    }

}