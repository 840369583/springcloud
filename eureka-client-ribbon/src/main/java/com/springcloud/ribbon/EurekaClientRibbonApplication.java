package com.springcloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="provide1" ,configuration =CommonConfig.class)
public class EurekaClientRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientRibbonApplication.class, args);
	}

}
