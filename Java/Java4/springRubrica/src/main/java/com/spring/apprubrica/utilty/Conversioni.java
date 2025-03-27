package com.spring.apprubrica.utilty;

import java.util.ArrayList;
import java.util.List;

import com.spring.apprubrica.dto.ContattoDTO;
import com.spring.apprubrica.dto.RubricaDTO;
import com.spring.apprubrica.entity.Contatto;
import com.spring.apprubrica.entity.Rubrica;

public class Conversioni {
	
	public static Contatto daContattoDTOAContatto(ContattoDTO dto) {
		return new Contatto(dto.getNome(), dto.getCognome(), dto.getGruppo(), dto.getData_nascita(), dto.getId(), dto.getNumero(), dto.isPreferito());
	}
	
	public static ContattoDTO daContattoAContattoDTO(Contatto entity) {
		return new ContattoDTO(entity.getNome(), entity.getCognome(), entity.getGruppo(), entity.getData_nascita(), entity.getId(), entity.getNumero(), entity.isPreferito());
	}
	
	public static Rubrica daRubricaDTOARubrica(RubricaDTO dto) {
		List<Contatto> contatti = new ArrayList<>();
		for(ContattoDTO contattoDTO:dto.getContatti()) {
			contatti.add(daContattoDTOAContatto(contattoDTO));
		}
			return new Rubrica(dto.getProprietario(), dto.getId(), dto.getAnno_creazione(), contatti);
	}
	
	public static RubricaDTO daRubricaARubricaDTO(Rubrica entity) {
		List<ContattoDTO> contattiDTO = new ArrayList<>();
		for(Contatto contatto:entity.getContatti()) {
			contattiDTO.add(daContattoAContattoDTO(contatto));
		}
		return new RubricaDTO(entity.getProprietario(), entity.getId(), entity.getAnno_creazione(), contattiDTO);
	}
	
	
	

}

