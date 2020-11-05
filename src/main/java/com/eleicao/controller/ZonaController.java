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

import com.eleicao.model.Zona;
import com.eleicao.repository.ZonaRepository;

@RestController
@RequestMapping("/Zonas")

public class ZonaController {

	final ZonaRepository _ZonaRepository; // Criando propriedade da Interface Município

	public ZonaController(ZonaRepository ZonaRepository) {
		_ZonaRepository = ZonaRepository; // Alimentando a propriedade com a construção da classe
	}

	@PostMapping
	public ResponseEntity inserir(@RequestBody Zona Zona) {
		_ZonaRepository.save(Zona);
		return ResponseEntity.status(HttpStatus.CREATED).body("Zona criado com sucesso!");
	}

	@GetMapping
	public ResponseEntity listar() {
		Iterable<Zona> Zonas = _ZonaRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(Zonas);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity obter(@PathVariable Long id) {
		Optional<Zona> Zona = _ZonaRepository.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(Zona);
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity atualizar(@RequestBody Zona Zona, @PathVariable Long id) {
		Zona.setId(id);
		_ZonaRepository.save(Zona);
		return ResponseEntity.status(HttpStatus.OK).body("Zona atualizado com sucesso!");
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity deletar(@PathVariable Long id) {
		_ZonaRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}