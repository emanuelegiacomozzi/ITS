package com.spring.utenti.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.utenti.dto.ErroreDTO;
import com.spring.utenti.dto.NomeCognomeDTO;
import com.spring.utenti.dto.NumeroUtentiDTO;
import com.spring.utenti.dto.UtenteDTO;
import com.spring.utenti.entity.Utente;
import com.spring.utenti.service.UtentiService;

@RestController
@RequestMapping(path="/utenti")
public class UtentiController {
	
	@Autowired
	private UtentiService service;
	
	@PostMapping(path="", consumes = "application/json")
	public boolean registra(@RequestBody UtenteDTO dto) {
//		System.out.println("ho registrato l'utente: "+ dto);
//		return true;
		
		return service.registra(dto);
	}
	
	@GetMapping(path="/{id}", produces = "application/json")
	public UtenteDTO cercaPerId(@PathVariable int id) {
//		return new Utente(id, "mario", "rossi", "mario", "red");
		return service.cercaPerId(id);
	}
	
	@GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<UtenteDTO> mostraTutti(){
//		ArrayList<Utente> lista = new ArrayList<>();
//		lista.add(new Utente(10, "mario", "rossi", "mario", "red"));
//		lista.add(new Utente(20, "marco", "verdi", "marco", "green"));
//		lista.add(new Utente(30, "anna", "neri", "anna", "black"));
//		return lista;
		return service.visuallizzaUtenti();
	}
	
	@DeleteMapping(path="/{id}", produces= "application/json")
	public UtenteDTO delete(@PathVariable int id) {
		return service.elimina(id);
	}
	
	@GetMapping(path="/{id}/nomeCognome", produces = "application/json")
	public NomeCognomeDTO getNomeCognome(@PathVariable int id) {
		return service.getNomeCognome(id);
	}
	
	@GetMapping(path="/mostraNomiCognomi", produces="application/json")
	public NumeroUtentiDTO mostraNomiCognomi(){
		return service.getAllNomeCognome();
	}
	
	@ExceptionHandler
	public ResponseEntity<ErroreDTO> gestore(RuntimeException e){
		ErroreDTO errore = new ErroreDTO(e.getMessage());
		ResponseEntity<ErroreDTO> response = new ResponseEntity<ErroreDTO>(errore, HttpStatus.NOT_FOUND);
		return response;
	}
	
	
}
