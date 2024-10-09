package com.example.eureka_diskovery_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiskoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiskoveryServerApplication.class, args);
	}

}