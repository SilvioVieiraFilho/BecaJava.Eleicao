package com.eleicao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eleicao.model.Voto;

@Repository
public interface VotoRepository extends CrudRepository <Voto, Long> {

}
