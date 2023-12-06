package com.example.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.thymeleaf.entities.User;

@SpringBootApplication
@ComponentScan(basePackageClasses = User.class)
@EntityScan(basePackages = "com.example.thymeleaf.entities")
@ComponentScan(basePackages = {"com.example.thymeleaf.controllers","com.example.thymeleaf.services"})
@EnableJpaRepositories(basePackages = "com.example.thymeleaf.repositories")
public class ThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafApplication.class, args);
	}

}

