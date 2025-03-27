package com.spring.universita.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.universita.entity.Studente;


@Repository
public class StudentiDAOImpl implements StudentiDAO {
	
	private Map<Integer, Studente> mappa = new HashMap<>();
	
	public boolean insert(Studente studente) {
		if(mappa.containsKey(studente.getMatricola()))
			return false;
		
		mappa.put(studente.getMatricola(), studente);
		return true;

	}
	
	public Studente selectByMatricola(int matricola) {
		return mappa.get(matricola);
	}
	
	public List<Studente> selectAll(){
		return new ArrayList<>(mappa.values());
	}
	
	public Studente delete(int matricola) {
		Studente studente = mappa.remove(matricola);
		return studente;
	}
	
	public Studente update(int matricola, String indirizzo) {
		Studente studente = mappa.get(matricola);
		studente.setIndirizzo(indirizzo);
		return studente;
	}
}
