package com.spring.utenti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.utenti.dao.DAOUtente;
import com.spring.utenti.dto.NomeCognomeDTO;
import com.spring.utenti.dto.NumeroUtentiDTO;
import com.spring.utenti.dto.UtenteDTO;
import com.spring.utenti.entity.Utente;
import com.spring.utenti.utility.Conversioni;

@Service
public class UtentiServiceImpl implements UtentiService{
	
	@Autowired
	private DAOUtente dao ;
	
	public boolean registra(UtenteDTO dto) {
		//1.trasformo  dto in entity
		Utente entity = Conversioni.daUtenteDTOAUtente(dto);
		//2.Inserisco entity attraverso dao
		return dao.insert(entity);
	}
	
	public UtenteDTO cercaPerId(int id) {
		//1.chiamo il dao
		Utente utente = dao.selectById(id);
		
		//2.trasformo
		if(utente != null) {
			UtenteDTO dto = Conversioni.daUtenteAUtenteDTO(utente);
			return dto;
		}
		return null;
	}
	
	public List<UtenteDTO> visuallizzaUtenti(){
		List<Utente>utenti = dao.selectAll();
		
		List<UtenteDTO> utentiDTO = new ArrayList<>();
		for(Utente utente:utenti) {
			UtenteDTO dto = Conversioni.daUtenteAUtenteDTO(utente);
			utentiDTO.add(dto);
		}
		return utentiDTO;
		}
	
	public UtenteDTO elimina(int id) {
		Utente utente = dao.selectById(id);
		if(utente != null) {
			UtenteDTO dto = Conversioni.daUtenteAUtenteDTO(utente);
			dao.delete(id);
			return dto;
		}
		return null;
	}
	
//	public boolean update(UtenteDTO dto) {
//		Utente entity = Conversioni.daUtenteDTOAUtente(dto);
//		
//
//	}
	
	public NomeCognomeDTO getNomeCognome(int id) {
		Utente utente = dao.selectById(id);
		if(utente != null) {
			return new NomeCognomeDTO(utente.getNome(), utente.getCognome());
		}
		return null;
	}
	
	public NumeroUtentiDTO getAllNomeCognome(){
		List<Utente>utenti = dao.selectAll();
		NumeroUtentiDTO utentidto = new NumeroUtentiDTO();
		ArrayList<String> nomeCognome = new ArrayList<>();
		for(Utente utente:utenti) {
			nomeCognome.add(utente.getNome());
			nomeCognome.add(utente.getCognome());
			utentidto.setUtenti(nomeCognome);
			utentidto.getCont();
		}
		return utentidto;
		
		
		 
	}

}
