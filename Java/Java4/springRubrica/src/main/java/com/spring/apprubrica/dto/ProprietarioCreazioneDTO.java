package com.spring.apprubrica.dto;

public class ProprietarioCreazioneDTO {
	
	private String proprietario;
	private int anno_creazione;
	
	public ProprietarioCreazioneDTO(String proprietario, int anno_creazione) {
		super();
		this.proprietario = proprietario;
		this.anno_creazione = anno_creazione;
	}

	public ProprietarioCreazioneDTO() {
		super();
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getAnno_creazione() {
		return anno_creazione;
	}

	public void setAnno_creazione(int anno_creazione) {
		this.anno_creazione = anno_creazione;
	}
	
	
}
