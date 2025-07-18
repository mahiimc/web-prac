package com.imc.virtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VirtualApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualApplication.class, args);
	}

}
