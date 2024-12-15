package com.br.festive.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FestiveApplication {

	public static void main(String[] args) {

		SpringApplication.run(FestiveApplication.class, args);
//		SpringApplication application = new SpringApplication(FestiveApplication.class);
//		application.addListeners(new EnvLoader());
//		application.run(args);

	}
}
