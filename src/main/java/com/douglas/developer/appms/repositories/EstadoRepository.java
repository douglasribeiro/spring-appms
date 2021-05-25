package com.douglas.developer.appms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douglas.developer.appms.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
	
}
