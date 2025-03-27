package com.spring.prodotti.entity;

public class Prodotto {
	
	private String marca, modello, descrizione,categoria;
	private double prezzo_consigliato, prezzo_max;
	private int quantità, ID;
	
	public Prodotto(int iD, String marca, String modello, String descrizione, String categoria,
			double prezzo_consigliato, double prezzo_max, int quantità) {
		super();
		ID = iD;
		this.marca = marca;
		this.modello = modello;
		this.descrizione = descrizione;
		this.categoria = categoria;
		this.prezzo_consigliato = prezzo_consigliato;
		this.prezzo_max = prezzo_max;
		this.quantità = quantità;
	}

	public Prodotto() {
		super();
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrezzo_consigliato() {
		return prezzo_consigliato;
	}

	public void setPrezzo_consigliato(double prezzo_consigliato) {
		this.prezzo_consigliato = prezzo_consigliato;
	}

	public double getPrezzo_max() {
		return prezzo_max;
	}

	public void setPrezzo_max(double prezzo_max) {
		this.prezzo_max = prezzo_max;
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}

	@Override
	public String toString() {
		return "Prodotto [ID=" + ID + ", marca=" + marca + ", modello=" + modello + ", descrizione=" + descrizione
				+ ", categoria=" + categoria + ", prezzo_consigliato=" + prezzo_consigliato + ", prezzo_max="
				+ prezzo_max + ", quantità=" + quantità + "]";
	}
	
	
	
	

}
