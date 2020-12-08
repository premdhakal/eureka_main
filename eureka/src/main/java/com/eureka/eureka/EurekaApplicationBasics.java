package com.eureka.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationBasics {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplicationBasics.class, args);
	}

}
