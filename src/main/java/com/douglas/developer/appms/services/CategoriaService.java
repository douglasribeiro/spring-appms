package com.douglas.developer.appms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglas.developer.appms.domain.Categoria;
import com.douglas.developer.appms.repositories.Categoriarepository;

@Service
public class CategoriaService {

	@Autowired
	private Categoriarepository repository;
	
	public Categoria buscar(Long id) {
		Categoria obj = repository.findById(id).get();
		return obj;
	}
}
