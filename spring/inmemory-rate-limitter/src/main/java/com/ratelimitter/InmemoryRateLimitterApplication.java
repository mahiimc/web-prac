package com.ratelimitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InmemoryRateLimitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(InmemoryRateLimitterApplication.class, args);
	}

}