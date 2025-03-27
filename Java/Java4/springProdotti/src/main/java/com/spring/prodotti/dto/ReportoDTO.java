package com.spring.prodotti.dto;

import java.util.ArrayList;
import java.util.List;

public class ReportoDTO {
	
	private List<String> descrizioni = new ArrayList<>();
	private int pezziTotali;
	private int prodottiNonDisponibili;
	private double mediaPrezzi;
	private List<String> non_disponibili = new ArrayList<>();
	
	public ReportoDTO(List<String> descrizioni, int pezziTotali, int prodottiNonDisponibili, double mediaPrezzi,
			List<String> non_disponibili) {
		super();
		this.descrizioni = descrizioni;
		this.pezziTotali = pezziTotali;
		this.prodottiNonDisponibili = prodottiNonDisponibili;
		this.mediaPrezzi = mediaPrezzi;
		this.non_disponibili = non_disponibili;
	}

	public ReportoDTO() {
		super();
	}



	public List<String> getDescrizioni() {
		return descrizioni;
	}

	public void setDescrizioni(List<String> descrizioni) {
		this.descrizioni = descrizioni;
	}

	public int getPezziTotali() {
		return pezziTotali;
	}

	public void setPezziTotali(int pezziTotali) {
		this.pezziTotali = pezziTotali;
	}

	public int getProdottiNonDisponibili() {
		return prodottiNonDisponibili;
	}

	public void setProdottiNonDisponibili(int prodottiNonDisponibili) {
		this.prodottiNonDisponibili = prodottiNonDisponibili;
	}

	public double getMediaPrezzi() {
		return mediaPrezzi;
	}

	public void setMediaPrezzi(double mediaPrezzi) {
		this.mediaPrezzi = mediaPrezzi;
	}

	public List<String> getNon_disponibili() {
		return non_disponibili;
	}

	public void setNon_disponibili(List<String> non_disponibili) {
		this.non_disponibili = non_disponibili;
	}
	
	
	
	
}
