package com.ecommerce.ecommerce_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcommerceServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceServiceRegistryApplication.class, args);
	}

}
