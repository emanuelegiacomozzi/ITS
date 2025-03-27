package com.spring.universita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.service.ProfessoriService;

@RestController
@RequestMapping(path="/professori")
public class ProfessoriController {
	
	@Autowired
	private ProfessoriService service;
	
	@GetMapping(path="/registra", consumes = "application/json")
	public boolean registra(@RequestBody ProfessoreDTO dto) {
		return service.registra(dto);
	}
	
	@GetMapping(path="/cercaProfessore/{id}", produces = "application/json")
	public ProfessoreDTO cerca(@PathVariable int id) {
		return service.cercaProfessore(id);
	}
	
	@GetMapping(path="/mostraProfessori", produces = "application/json")
	public List<ProfessoreDTO> visualizza(){
		return service.mostraProfessori();
	}
	
	@GetMapping(path="/eliminaProfessore/{id}", produces = "application/json")
	public ProfessoreDTO elimina(@PathVariable int id) {
		return service.eliminaProfessore(id);
	}
	
	@GetMapping(path="/modificaProfessore/{id}{materia}", produces = "application/json", consumes = "application/json")
	public ProfessoreDTO modifica(@PathVariable int id, String materia) {
		return service.modificaProfessore(id, materia);
	}
	
	@GetMapping(path="/mostraProfessoriMateria/{materia}", produces = "application/json")
	public List<ProfessoreDTO> mostra(@PathVariable String materia){
		return service.materiaProf(materia);
	}
	
	@GetMapping(path="/professoriOrdinati", produces="application/json" )
	public List<ProfessoreDTO> ordina(){
		return service.orderByCognome();
	}
	
	@GetMapping(path="/mostraMaterie", produces = "application/json")
	public List<String> materie(){
		return service.materie();
	}
	
	
}
	
