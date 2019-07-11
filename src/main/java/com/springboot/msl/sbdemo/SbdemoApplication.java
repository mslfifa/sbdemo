package com.springboot.msl.sbdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling 
public class SbdemoApplication {
	
	private static Logger log = LoggerFactory.getLogger(SbdemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SbdemoApplication.class, args);
	}

}
