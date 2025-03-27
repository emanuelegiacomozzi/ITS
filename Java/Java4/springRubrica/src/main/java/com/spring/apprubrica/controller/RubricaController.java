package com.spring.apprubrica.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.apprubrica.dto.AnnoCreazioneDTO;
import com.spring.apprubrica.dto.ContattoDTO;
import com.spring.apprubrica.dto.ProprietariDTO;
import com.spring.apprubrica.dto.ProprietarioCreazioneDTO;
import com.spring.apprubrica.dto.RubricaDTO;
import com.spring.apprubrica.service.RubricaService;

@RestController
@RequestMapping(path="/rubriche")
public class RubricaController {
	
	@Autowired
	private RubricaService service;
	
	@PostMapping(path="", consumes = "application/json")
	public boolean inserisci(@RequestBody RubricaDTO dto) {
		return service.inserisci(dto);
	}
	
	@GetMapping(path="/{id}", produces= "application/json")
	public RubricaDTO visualizza(@PathVariable int id) {
		return service.visualizza(id);
	}
	
	@GetMapping(path="", produces="application/json")
	public List<RubricaDTO> visualizzaRubriche(){
		return service.visualizzaRubriche();
	}
	
	@DeleteMapping(path="/{id}", produces="application/json")
	public RubricaDTO eliminaRubrica(@PathVariable int id){
		return service.delete(id);
	}
	
	@GetMapping(path="/{id}/proprietarioCreazione", produces="application/json")
	public ProprietarioCreazioneDTO getProprietarioAnno(@PathVariable int id){
		return service.getProprietarioAnno(id);
	}
	
	@PutMapping(path="/{id}{proprietario}", produces="application/json")
	public RubricaDTO update(@PathVariable int id, String proprietario){
		return service.update(id, proprietario);
	}
	
	@PutMapping(path="/{id}/{anno_creazione}", produces="application/json")
	public RubricaDTO update(@PathVariable int id, @PathVariable int anno_creazione){
		return service.updateAnno(id, anno_creazione);
	}
	
	@GetMapping(path="/proprietari", produces="application/json")
	public ProprietariDTO proprietari(){
		return service.proprietari();
	}
	
	@GetMapping(path="/proprietarioRubricaPiuVecchia", produces="application/json")
	public ProprietarioCreazioneDTO getProprietarioCreazioneOldest(){
		return service.Oldest();
	}
	
	@GetMapping(path="/anni_creazione", produces="application/json")
	public List<AnnoCreazioneDTO> anni_creazione(){
		return service.anni_creazione();
	}
	
	@PostMapping(path="/{id}/contatto", consumes = "application/json")
	public boolean inserisciContatti(@PathVariable Integer id, @RequestBody ContattoDTO dto){
		return service.inserisciContatto(id, dto);
	}
	
	@GetMapping(path="/{idRubrica}/{id}", produces = "application/json")
	public ContattoDTO visualizzaContatti(@PathVariable Integer idRubrica, @PathVariable Integer id){
		return service.visualizzaContatto(idRubrica, id);
	}
	
	@PutMapping(path="/{idRubrica}/{id}", consumes="application/json")
	public ContattoDTO modificaContatti(@PathVariable Integer idRubrica, @PathVariable Integer id, @RequestBody ContattoDTO dto){
		return service.modificaContatto(idRubrica, id, dto.getNome(), dto.getCognome(), dto.getGruppo(), dto.getData_nascita(), dto.isPreferito());
	}
	
//	@GetMapping(path="/eliminaContatto/{idRubrica}/{id}", produces = "application/json")
//	public ContattoDTO eliminaContatti(@PathVariable Integer idRubrica, @PathVariable Integer id){
//		return service.eliminaContatto(idRubrica, id);
//	}
    
	@GetMapping(path="/{idRubrica}/contatti", produces = "application/json")
	public List<ContattoDTO> visualizzaContatti(@PathVariable Integer idRubrica){
		return service.visualizzaContatti(idRubrica);
	}
	
	@GetMapping(path="/{idRubrica}/numeroContatti", produces = "application/json")
	public Integer numeroContatti(@PathVariable Integer idRubrica){
		return service.numContatti(idRubrica);
	}
	
	@GetMapping(path="/{idRubrica}{numero}", produces = "application/json")
	public ContattoDTO numero(@PathVariable Integer idRubrica, @PathVariable Long numero){
		return service.numero(idRubrica, numero);
	}
	
	
	
	
	
	
	
	
}
