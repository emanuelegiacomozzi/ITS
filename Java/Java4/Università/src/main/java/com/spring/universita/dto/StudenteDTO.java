package com.spring.universita.dto;

public class StudenteDTO {
	
	private int matricola,anno_nascita, anno_immatricolazione;
	private String nome, cognome, indirizzo;
	
	public StudenteDTO(int matricola, String nome, String cognome, String indirizzo, int anno_nascita,
			int anno_immatricolazione) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.anno_nascita = anno_nascita;
		this.anno_immatricolazione = anno_immatricolazione;
	}

	public StudenteDTO() {
		super();
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
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

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getAnno_nascita() {
		return anno_nascita;
	}

	public void setAnno_nascita(int anno_nascita) {
		this.anno_nascita = anno_nascita;
	}

	public int getAnno_immatricolazione() {
		return anno_immatricolazione;
	}

	public void setAnno_immatricolazione(int anno_immatricolazione) {
		this.anno_immatricolazione = anno_immatricolazione;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", indirizzo="
				+ indirizzo + ", anno_nascita=" + anno_nascita + ", anno_immatricolazione=" + anno_immatricolazione + "]";
	}
	
	
}
