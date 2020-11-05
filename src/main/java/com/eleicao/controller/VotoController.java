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

import com.eleicao.model.Voto;
import com.eleicao.repository.VotoRepository;

@RestController
@RequestMapping("/Votos")

public class VotoController {

	final VotoRepository _VotoRepository; // Criando propriedade da Interface Município

	public VotoController(VotoRepository VotoRepository) {
		_VotoRepository = VotoRepository; // Alimentando a propriedade com a construção da classe
	}

	@PostMapping
	public ResponseEntity inserir(@RequestBody Voto voto) {
		_VotoRepository.save(voto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Voto criado com sucesso!");
	}

	@GetMapping
	public ResponseEntity listar() {
		Iterable<Voto> Votos = _VotoRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(Votos);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity obter(@PathVariable Long id) {
		Optional<Voto> Voto = _VotoRepository.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(Voto);
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity atualizar(@RequestBody Voto voto, @PathVariable Long id) {
		voto.setId(id);
		_VotoRepository.save(voto);
		return ResponseEntity.status(HttpStatus.OK).body("VOTOatualizado com sucesso!");
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity deletar(@PathVariable Long id) {
		_VotoRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}