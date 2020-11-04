package com.eleicao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.eleicao.model.Eleitor;


@Repository
public interface EleitorRepository extends CrudRepository<Eleitor, Long> {

}

