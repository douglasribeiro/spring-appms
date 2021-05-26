package com.douglas.developer.appms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppmsApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(AppmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {}

}
