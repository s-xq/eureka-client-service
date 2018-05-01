package com.sxq.eurekaclientservicehello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientServiceHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientServiceHelloApplication.class, args);
	}
}
