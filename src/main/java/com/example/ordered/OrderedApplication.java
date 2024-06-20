package com.example.ordered;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderedApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderedApplication.class, args);
	}

}
