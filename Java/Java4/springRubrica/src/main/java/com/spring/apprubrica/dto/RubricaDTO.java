package com.spring.apprubrica.dto;

import java.util.ArrayList;
import java.util.List;

import com.spring.apprubrica.entity.Contatto;

public class RubricaDTO {
	
	private String proprietario;
	private int id, anno_creazione;
	public List<ContattoDTO> contatti = new ArrayList<>();
	
	public RubricaDTO(String proprietario, int id, int anno_creazione, List<ContattoDTO> contatti) {
		super();
		this.proprietario = proprietario;
		this.id = id;
		this.anno_creazione = anno_creazione;
		this.contatti = contatti;
	}

	public RubricaDTO() {
		super();
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnno_creazione() {
		return anno_creazione;
	}

	public void setAnno_creazione(int anno_creazione) {
		this.anno_creazione = anno_creazione;
	}

	public List<ContattoDTO> getContatti() {
		return contatti;
	}

	public void setContatti(List<ContattoDTO> contatti) {
		this.contatti = contatti;
	}

	@Override
	public String toString() {
		return "RubricaDTO [proprietario=" + proprietario + ", id=" + id + ", anno_creazione=" + anno_creazione
				+ ", contatti=" + contatti + "]";
	}

	
	
	
	
	
}