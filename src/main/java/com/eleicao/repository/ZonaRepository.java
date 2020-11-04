package com.eleicao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.eleicao.model.Zona;

@Repository
public interface ZonaRepository extends JpaRepository<Zona, Long> {

}
