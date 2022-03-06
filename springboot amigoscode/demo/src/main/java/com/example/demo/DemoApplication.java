package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // makes the class serve REST endpoints
public class DemoApplication {

	// ?running this function will find various beans and put them into the spring context
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
