package com.spring.universita.dao;

import java.util.List;

import com.spring.universita.entity.Studente;

public interface StudentiDAO {
	
	public boolean insert(Studente studente);
	public Studente selectByMatricola(int matricola);
	public List<Studente> selectAll();
	public Studente delete(int matricola);
	public Studente update(int matricola, String indirizzo);
}
