package com.spring.impiegati.dto;

public class ImpiegatoDTO {
		
	private int matricola;
	private String cognome,nome;
	private double salario_mensile;
	
	public ImpiegatoDTO(int matricola, String cognome, String nome, double salario_mensile) {
		super();
		this.matricola = matricola;
		this.cognome = cognome;
		this.nome = nome;
		this.salario_mensile = salario_mensile;
	}

	public ImpiegatoDTO() {
		super();
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
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

	public double getSalario_mensile() {
		return salario_mensile;
	}

	public void setSalario_mensile(double salario_mensile) {
		this.salario_mensile = salario_mensile;
	}
	
	
	
	
}