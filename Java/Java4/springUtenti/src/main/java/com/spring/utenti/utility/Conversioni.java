package com.spring.utenti.utility;

import com.spring.utenti.dto.UtenteDTO;
import com.spring.utenti.entity.Utente;

public class Conversioni {
	
	public static Utente daUtenteDTOAUtente(UtenteDTO dto) {
		return new Utente(dto.getId(), dto.getNome(), dto.getCognome(), dto.getUsername(), dto.getPassword());
	}
	
	public static UtenteDTO daUtenteAUtenteDTO(Utente entity) {
		return new UtenteDTO(entity.getId(), entity.getNome(), entity.getCognome(), entity.getUsername(), entity.getPassword());
	}

	
}
