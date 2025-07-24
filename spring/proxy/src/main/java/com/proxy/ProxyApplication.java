package com.proxy;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@EnableCaching
@SpringBootApplication
public class ProxyApplication {

	public static void main(String[] args) {
		var application = 	new SpringApplication(ProxyApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}
