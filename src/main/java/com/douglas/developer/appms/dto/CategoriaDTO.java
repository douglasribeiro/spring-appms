package com.douglas.developer.appms.dto;

import java.io.Serializable;



import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.douglas.developer.appms.domain.Categoria;


public class CategoriaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	
	@NotEmpty(message = "Preenchimento obrigatório.")
	@Length(min=5, max=80, message = "O tamanho deve estar entre 5 e 80 caracteres")
	private String nome;
	
	public CategoriaDTO() {}
	
	public CategoriaDTO(Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
