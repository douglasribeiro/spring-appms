package com.douglas.developer.appms;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.douglas.developer.appms.domain.Categoria;
import com.douglas.developer.appms.repositories.Categoriarepository;

@SpringBootApplication
public class AppmsApplication implements CommandLineRunner {

	@Autowired
	private Categoriarepository categoriarepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AppmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		categoriarepository.save(cat1);
		categoriarepository.save(cat2);
		
	}

}
