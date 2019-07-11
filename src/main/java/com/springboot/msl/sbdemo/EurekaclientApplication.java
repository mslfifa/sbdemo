package com.springboot.msl.sbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableScheduling 
@EnableEurekaClient
public class EurekaclientApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaclientApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "eureka client application!";
	}
}
