package com.configprops;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/config")
public class TestController {

    private final EmailConfiguration emailConfiguration;

    @GetMapping("/")
    public ResponseEntity<EmailConfiguration> mailProps() {
        return ResponseEntity.ok(emailConfiguration);
    }
}
