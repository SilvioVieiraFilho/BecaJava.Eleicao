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

import com.eleicao.model.Eleitor;
import com.eleicao.repository.EleitorRepository;

@RestController
@RequestMapping("/Eleitors")

public class EleitorController {

	final EleitorRepository _EleitorRepository; // Criando propriedade da Interface Município

	public EleitorController(EleitorRepository EleitorRepository) {
		_EleitorRepository = EleitorRepository; // Alimentando a propriedade com a construção da classe
	}

	@PostMapping
	public ResponseEntity inserir(@RequestBody Eleitor Eleitor) {
		_EleitorRepository.save(Eleitor);
		return ResponseEntity.status(HttpStatus.CREATED).body("Eleitor criado com sucesso!");
	}

	@GetMapping
	public ResponseEntity listar() {
		Iterable<Eleitor> Eleitors = _EleitorRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(Eleitors);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity obter(@PathVariable Long id) {
		Optional<Eleitor> Eleitor = _EleitorRepository.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(Eleitor);
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity atualizar(@RequestBody Eleitor Eleitor, @PathVariable Long id) {
		Eleitor.setId(id);
		_EleitorRepository.save(Eleitor);
		return ResponseEntity.status(HttpStatus.OK).body("Eleitor atualizado com sucesso!");
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity deletar(@PathVariable Long id) {
		_EleitorRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}