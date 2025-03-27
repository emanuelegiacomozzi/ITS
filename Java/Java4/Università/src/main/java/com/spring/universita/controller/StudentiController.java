package com.spring.universita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.universita.dto.StudenteDTO;
import com.spring.universita.service.StudentiService;

@RestController
@RequestMapping(path="/studenti")
public class StudentiController {
	
	@Autowired
	private StudentiService service;
	
	@GetMapping(path="/registra", consumes = "application/json")
	public boolean registra(@RequestBody StudenteDTO dto) {
		return service.registra(dto);
	}
	
	@GetMapping(path="/cercaStudente/{matricola}", produces = "application/json")
	public StudenteDTO cerca(@PathVariable int matricola) {
		return service.cercaStudente(matricola);
	}
	
	@GetMapping(path="/mostraStudenti", produces = "application/json")
	public List<StudenteDTO> visualizza(){
		return service.mostraStudenti();
	}
	
	@GetMapping(path="/eliminaStudente/{matricola}", produces = "application/json")
	public StudenteDTO elimina(@PathVariable int matricola) {
		return service.eliminaStudente(matricola);
	}
	
	@GetMapping(path="/modificaStudente/{matricola}{indirizzo}", produces = "application/json", consumes = "application/json")
	public StudenteDTO modifica(@PathVariable int matricola, String indirizzo) {
		return service.modificaStudente(matricola, indirizzo);
	}
	
	@GetMapping(path="/mostraNomi", produces = "application/json")
	public List<String> visualizzaNomi(){
		return service.mostraNomi();
	}
	

}
