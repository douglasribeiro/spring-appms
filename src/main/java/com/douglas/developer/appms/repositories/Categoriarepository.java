package com.douglas.developer.appms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douglas.developer.appms.domain.Categoria;

@Repository
public interface Categoriarepository extends JpaRepository<Categoria, Long> {
	
}
