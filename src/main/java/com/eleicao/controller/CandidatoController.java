package com.eleicao.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eleicao.model.Candidato;
import com.eleicao.model.Municipio;
import com.eleicao.repository.CandidatoRepository;

@RestController
@RequestMapping("/Candidato")

public class CandidatoController {

	final CandidatoRepository _CandidatoRepository; // Criando propriedade da Interface Município

	public CandidatoController(CandidatoRepository CandidatoRepository) {
		_CandidatoRepository = CandidatoRepository; // Alimentando a propriedade com a construção da classe
	}

	@PostMapping
	public ResponseEntity inserir(@RequestBody Candidato candidato) {
	
		
		_CandidatoRepository.save(candidato);

		return ResponseEntity.status(HttpStatus.CREATED).body("Candidato criado com sucesso!");
	}

	@GetMapping
	public ResponseEntity listar() {
		Iterable<Candidato> Candidato = _CandidatoRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(Candidato);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity obter(@PathVariable Long id) {
		Optional<Candidato> Candidato = _CandidatoRepository.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(Candidato);
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity atualizar(@RequestBody Candidato Candidato, @PathVariable Long id) {
		Candidato.setId(id);
		_CandidatoRepository.save(Candidato);
		return ResponseEntity.status(HttpStatus.OK).body("Candidato atualizado com sucesso!");
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity deletar(@PathVariable Long id) {
		_CandidatoRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}