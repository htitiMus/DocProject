package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ATestServiceConfigApplication {

	//test Commit
	public static void main(String[] args) {
		SpringApplication.run(ATestServiceConfigApplication.class, args);
	}
}
