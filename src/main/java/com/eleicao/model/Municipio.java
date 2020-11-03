package com.eleicao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jdbc.repository.query.Query;

@Entity
public class Municipio {
	
			
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	private String Nome;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

}
