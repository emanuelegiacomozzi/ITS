package com.spring.rubrica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rubrica.dto.ContattoDTO;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.service.RubricaService;

@RestController
@RequestMapping(path="/rubrica")
public class RubricaController {
	
	@Autowired
	private RubricaService service;
	
	@PostMapping(consumes="application/json")
	public boolean creaRubrica(@RequestBody RubricaDTO dto) {
		return service.creaRubrica(dto);
	}
	
	@GetMapping(path="/{idRubrica}", produces="application/json")
	public RubricaDTO cercaRubrica(@PathVariable Integer idRubrica) {
		return service.cerca(idRubrica);
	}
	
	@PostMapping(path="/{idRubrica}/contatti" , consumes="application/json")
	public boolean aggiungiContatto(@PathVariable Integer idRubrica, @RequestBody ContattoDTO dto ) {
		return service.aggiungiContatto(idRubrica, dto);
	}
	
	@PatchMapping(path="/{idRubrica}/{idContatto}/{numero}/numeroContatto")
	public ContattoDTO modificaContatto(@PathVariable int idRubrica, @PathVariable int idContatto, @PathVariable String numero) {
		return service.modifica(idRubrica, idContatto, numero);
	}
}
