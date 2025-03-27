package com.spring.apprubrica.entity;

import java.util.ArrayList;
import java.util.List;

import com.spring.apprubrica.dto.ContattoDTO;

public class Rubrica {
	
	private String proprietario;
	private int id, anno_creazione;
	private List<Contatto> contatti = new ArrayList<>();
	
	public Rubrica(String proprietario, int id, int anno_creazione, List<Contatto> contatti) {
		super();
		this.proprietario = proprietario;
		this.id = id;
		this.anno_creazione = anno_creazione;
		this.contatti = contatti;
	}

	public Rubrica() {
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

 	public List<Contatto> getContatti() {
		return contatti;
	}

	public void setContatti(List<Contatto> contatti) {
		this.contatti = contatti;
	}

	@Override
	public String toString() {
		return "Rubrica [proprietario=" + proprietario + ", id=" + id + ", anno_creazione=" + anno_creazione
				+ ", contatti=" + contatti + "]";
	}

	
	
	
	
	
}
