package com.springcloud.eclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientProvideApplication.class, args);
	}

}
