package com.oak.Configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication(scanBasePackages = {"com.oak.controllers,com.oak.exceptions,com.oak.Configuration,com.oak.service"})
@EnableJpaRepositories(basePackages = {"com.oak.Repository"})
@EntityScan(basePackages = {"com.oak.dto"})

public class QuizAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizAppApplication.class, args);
	}

}
