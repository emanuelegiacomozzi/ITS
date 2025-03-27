package com.spring.impiegati.dto;

public class NomeCognomeDTO {
	
	private String cognome,nome;

	public NomeCognomeDTO(String cognome, String nome) {
		super();
		this.cognome = cognome;
		this.nome = nome;
	}

	public NomeCognomeDTO() {
		super();
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
