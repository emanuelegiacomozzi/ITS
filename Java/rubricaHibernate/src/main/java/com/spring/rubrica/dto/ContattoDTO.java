package com.spring.rubrica.dto;


public class ContattoDTO {

	private int idContatto;
	
	private String nome,cognome,numero;

	public ContattoDTO(int idContatto, String nome, String cognome, String numero) {
		super();
		this.idContatto = idContatto;
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
	}

	public ContattoDTO() {
		super();
	}



	public int getIdContatto() {
		return idContatto;
	}

	public void setIdContatto(int idContatto) {
		this.idContatto = idContatto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
