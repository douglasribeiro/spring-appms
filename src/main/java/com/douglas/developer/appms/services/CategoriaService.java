package com.douglas.developer.appms.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglas.developer.appms.domain.Categoria;
import com.douglas.developer.appms.exceptions.ObjectNotFoundException;
import com.douglas.developer.appms.repositories.Categoriarepository;



@Service
public class CategoriaService {

	@Autowired
	private Categoriarepository repository;
	
	public Categoria buscar(Long id) throws ObjectNotFoundException {
		Optional<Categoria> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: "+ id + ", tipo: " + Categoria.class.getName()));
	}
}
