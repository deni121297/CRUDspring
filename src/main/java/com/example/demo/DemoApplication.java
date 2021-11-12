package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={
		"com.example.demo.model", "com.example.demo.controller","com.example.demo.service","com.example.demo.sql"})
@EnableJpaRepositories(basePackages = "com.example.demo.controller")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
