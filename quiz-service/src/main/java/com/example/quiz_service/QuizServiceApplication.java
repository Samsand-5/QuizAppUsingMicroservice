package com.example.quiz_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//This is Quiz Service Class

@SpringBootApplication
@EnableFeignClients
public class QuizServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(QuizServiceApplication.class, args);
	}

}
