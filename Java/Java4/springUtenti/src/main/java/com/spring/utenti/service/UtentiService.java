package com.spring.utenti.service;

import java.util.List;

import com.spring.utenti.dto.NomeCognomeDTO;
import com.spring.utenti.dto.NumeroUtentiDTO;
import com.spring.utenti.dto.UtenteDTO;

public interface UtentiService {
	
	public boolean registra(UtenteDTO dto);
	public UtenteDTO cercaPerId(int id);
	public List<UtenteDTO> visuallizzaUtenti();
	public UtenteDTO elimina(int id) ;
	public NomeCognomeDTO getNomeCognome(int id);
	public NumeroUtentiDTO getAllNomeCognome();

}
