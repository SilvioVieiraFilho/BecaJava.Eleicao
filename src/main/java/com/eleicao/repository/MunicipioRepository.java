package com.eleicao.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eleicao.model.Municipio;



	@Repository
	public interface MunicipioRepository extends CrudRepository<Municipio, Long> {

	}


