package com.spring.impiegati.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.impiegati.dto.ImpiegatoDTO;
import com.spring.impiegati.dto.NomeCognomeDTO;
import com.spring.impiegati.service.ImpiegatoService;

@RestController
@RequestMapping(path="/impiegato")
public class ImpiegatoController {
	
	@Autowired
	private ImpiegatoService service;
	
	@PostMapping(consumes="application/json")
	public boolean assumi(@RequestBody ImpiegatoDTO dto) {
		return service.assumi(dto);
	}
	
	@GetMapping(path="/{matricola}", produces="application/json")
	public ImpiegatoDTO cerca(@PathVariable int matricola) {
		return service.cerca(matricola);
	}
	
	@GetMapping(path="/selectAll", produces="application/json")
	public List<ImpiegatoDTO> selectAll(){
		return service.selectAll();
	}
	
	@DeleteMapping(path="/{matricola}", produces="application/json")
	public ImpiegatoDTO delete(@PathVariable int matricola) {
		return service.delete(matricola);
	}
	
	@PutMapping(path="/{matricola}/{salario}", produces="application/json" )
	public ImpiegatoDTO update(@PathVariable int matricola, @PathVariable double salario) {
		return service.update(matricola, salario);
	}
	
	@DeleteMapping(path="/{matricola}/deleteGetNominativi", produces="application/json")
	public NomeCognomeDTO delete2(@PathVariable int matricola) {
		return service.delete2(matricola);
	}
	
	@GetMapping(path="/nominativi" , produces="application/json")
	public List<NomeCognomeDTO> getNominativi(){
		return service.getNominativi();
	}
	
	@GetMapping(path="/ricchi", produces="application/json")
	public List<ImpiegatoDTO> getRicchi(@RequestParam double valore){
		return service.getRicchi(valore);
	}
	
	@GetMapping(path="/ordinatiPerCognome", produces="application/json")
	public List<ImpiegatoDTO> ordinaPerCognome(){
		return service.ordinaPerCognome();
	}
	
	@GetMapping(path="/ordinatiPerSalario", produces="application/json")
	public List<ImpiegatoDTO> ordinaPerSalario(){
		return service.ordinaPerSalario();
	}
	
	

}
