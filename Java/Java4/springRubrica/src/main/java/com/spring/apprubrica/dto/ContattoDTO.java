package com.spring.apprubrica.dto;

import java.time.LocalDate;

public class ContattoDTO {
		
		private String nome,cognome,gruppo;
		private LocalDate data_nascita;
		private int id;
		private Long numero;
		private boolean preferito;
		
		public ContattoDTO(String nome, String cognome, String gruppo, LocalDate data_nascita, int id, Long numero, boolean preferito) {
			super();
			this.nome = nome;
			this.cognome = cognome;
			this.gruppo = gruppo;
			this.data_nascita = data_nascita;
			this.id = id;
			this.numero = numero;
			this.preferito = preferito;
		}

		public ContattoDTO() {
			super();
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

		public LocalDate getData_nascita() {
			return data_nascita;
		}

		public void setData_nascita(LocalDate data_nascita) {
			this.data_nascita = data_nascita;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getGruppo() {
			return gruppo;
		}

		public void setGruppo(String gruppo) {
			this.gruppo = gruppo;
		}

		public boolean isPreferito() {
			return preferito;
		}

		public void setPreferito(boolean preferito) {
			this.preferito = preferito;
		}

		public Long getNumero() {
			return numero;
		}

		public void setNumero(Long numero) {
			this.numero = numero;
		}

		@Override
		public String toString() {
			return "ContattoDTO [nome=" + nome + ", cognome=" + cognome + ", gruppo=" + gruppo + ", data_nascita="
					+ data_nascita + ", id=" + id + ", numero=" + numero + ", preferito=" + preferito + "]";
		}

		
}
