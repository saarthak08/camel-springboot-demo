package com.sg.byeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ByeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ByeServiceApplication.class, args);
	}

}
