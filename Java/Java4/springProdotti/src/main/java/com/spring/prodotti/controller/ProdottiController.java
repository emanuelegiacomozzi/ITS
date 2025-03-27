package com.spring.prodotti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.prodotti.dto.ProdottoDTO;
import com.spring.prodotti.dto.ReportoDTO;
import com.spring.prodotti.service.ProdottiService;

@RestController
@RequestMapping(path="/prodotti")
public class ProdottiController {
	
	@Autowired
	private ProdottiService service;
	
	@GetMapping(path="/registra", consumes = "application/json")
	public boolean registra(@RequestBody ProdottoDTO dto) {
		return service.registra(dto);
	}
	
	@GetMapping(path="/mostraProdotti", consumes = "application/json")
	public List<ProdottoDTO> mostraProdotti() {
		return service.visualizzaProdotti();
	}
	
	@GetMapping(path="/cerca/{id}", consumes = "application/json")
	public ProdottoDTO mostraProdotto(@PathVariable int id) {
		return service.cercaPerId(id);
	}
	
	@GetMapping(path="/report", consumes = "application/json")
	public ReportoDTO mostraReport() {
		return service.report();
	}
	


}
