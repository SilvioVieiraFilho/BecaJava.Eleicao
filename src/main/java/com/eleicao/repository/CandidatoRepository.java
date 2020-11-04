package com.eleicao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eleicao.model.Candidato;
import com.eleicao.model.Eleitor;

@Repository
public interface CandidatoRepository extends CrudRepository<Candidato, Long> {

}

