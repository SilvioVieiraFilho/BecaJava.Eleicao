package com.eleicao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Candidato{
//@Table(name = "cargos")

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String Numero;
	
	@ManyToOne
	@JoinColumn(name = "MunicipioId")
	
     private Municipio Municipio;
	
	
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

	public String getNumero() {
		return Numero;
	}

	public void setnNumero(String numero) {
		this.Numero = numero;
	}

} 
	
	


