package com.spring.impiegati.utility;

import com.spring.impiegati.dto.ImpiegatoDTO;
import com.spring.impiegati.entity.Impiegato;

public class Conversioni {
	
	public static Impiegato daImpiegatoDTOAImpiegato(ImpiegatoDTO dto) {
		return new Impiegato(dto.getMatricola(), dto.getCognome(), dto.getNome(), dto.getSalario_mensile());
	}
	
	public static ImpiegatoDTO daImpiegatoAImpiegatoDTO(Impiegato entity) {
		return new ImpiegatoDTO(entity.getMatricola(), entity.getCognome(), entity.getNome(), entity.getSalario_mensile());
	}
}
