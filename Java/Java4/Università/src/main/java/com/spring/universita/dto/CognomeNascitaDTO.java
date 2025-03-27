package com.spring.universita.dto;

public class CognomeNascitaDTO {
	
	private String cognome;
	private int anno_nascita;
	
	public CognomeNascitaDTO(String cognome, int anno_nascita) {
		super();
		this.cognome = cognome;
		this.anno_nascita = anno_nascita;
	}

	public CognomeNascitaDTO() {
		super();
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getAnno_nascita() {
		return anno_nascita;
	}

	public void setAnno_nascita(int anno_nascita) {
		this.anno_nascita = anno_nascita;
	}

	@Override
	public String toString() {
		return "CognomeNascitaDTO [cognome=" + cognome + ", anno_nascita=" + anno_nascita + "]";
	}
	
	

}
