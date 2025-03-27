package com.spring.utenti.dto;

import java.util.ArrayList;

public class NumeroUtentiDTO {
	
	private ArrayList<String> utenti = new ArrayList<>();
	private int cont;
	
	public NumeroUtentiDTO(ArrayList<String> utenti, int cont) {
		super();
		this.utenti = utenti;
		this.cont = cont;
	}

	public NumeroUtentiDTO() {
		super();
	}



	public ArrayList<String> getUtenti() {
		return utenti;
	}

	public void setUtenti(ArrayList<String> utenti) {
		this.utenti = utenti;
	}

	public int getCont() {
		return cont++;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	
	
	

	

	
	
	
	
}
