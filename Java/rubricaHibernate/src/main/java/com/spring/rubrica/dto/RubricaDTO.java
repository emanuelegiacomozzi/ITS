package com.spring.rubrica.dto;

import java.util.ArrayList;
import java.util.List;

public class RubricaDTO {

	private int idRubrica;
	
	private String proprietario;
	private int annoCreazione;
	
	private List<ContattoDTO> contatti = new ArrayList<>();

	public RubricaDTO(int idRubrica, String proprietario, int annoCreazione) {
		super();
		this.idRubrica = idRubrica;
		this.proprietario = proprietario;
		this.annoCreazione = annoCreazione;
	}

	public RubricaDTO() {
		super();
	}

	public int getIdRubrica() {
		return idRubrica;
	}

	public void setIdRubrica(int idRubrica) {
		this.idRubrica = idRubrica;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getAnnoCreazione() {
		return annoCreazione;
	}

	public void setAnnoCreazione(int annoCreazione) {
		this.annoCreazione = annoCreazione;
	}

	public List<ContattoDTO> getContatti() {
		return contatti;
	}

	public void setContatti(List<ContattoDTO> contatti) {
		this.contatti = contatti;
	}
	
	//Aggiungo metodo di buisness
	public void aggiungiContatto(ContattoDTO dto) {
		contatti.add(dto);
	}

}

