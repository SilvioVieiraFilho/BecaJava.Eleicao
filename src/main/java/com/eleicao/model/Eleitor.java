package com.eleicao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Entity
public class Eleitor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//ID É UM AUTO INCREMENTO
    @Getter @Setter
	private Long Id;
    @Getter @Setter
	private String Nome;
    
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	




}