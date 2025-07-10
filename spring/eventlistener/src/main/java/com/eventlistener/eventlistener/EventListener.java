package com.eventlistener.eventlistener;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EventListener {

    @org.springframework.context.event.EventListener
    public void listener(Event event) {
        log.info("Received event : {}", event);
    }

    @org.springframework.context.event.EventListener(value = ApplicationReadyEvent.class)
    public void onApplicationReady() {
        log.info("Application is ready!!");
    }
}
