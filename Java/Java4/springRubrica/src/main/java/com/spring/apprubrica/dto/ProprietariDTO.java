package com.spring.apprubrica.dto;

import java.util.ArrayList;
import java.util.List;

public class ProprietariDTO {
	private List<String> proprietari = new ArrayList<>();
	private int cont;
	
	public ProprietariDTO(List<String> proprietari, int cont) {
		super();
		this.proprietari = proprietari;
		this.cont = cont;
	}

	public ProprietariDTO() {
		super();
	}

	public List<String> getProprietari() {
		return proprietari;
	}

	public void setProprietari(List<String> proprietari) {
		this.proprietari = proprietari;
	}

	public int getCont() {
		return cont++;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	
	
}
