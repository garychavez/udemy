package com.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootServicioProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServicioProductosApplication.class, args);
	}

}
