package com.eleicao.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eleicao.model.Municipio;

public class MunicipioRepository {

	@Repository
	public interface LivroRepository extends CrudRepository<Municipio, Long> {

	}

}
