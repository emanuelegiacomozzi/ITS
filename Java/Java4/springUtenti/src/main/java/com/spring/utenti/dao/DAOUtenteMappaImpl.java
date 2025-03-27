package com.spring.utenti.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.utenti.entity.Utente;

@Repository
public class DAOUtenteMappaImpl implements DAOUtente{

	private Map<Integer, Utente> mappa = new HashMap<>();

	public boolean insert(Utente utente) {
		if(mappa.containsKey(utente.getId()))
			return false;
		
		mappa.put(utente.getId(), utente);
		return true;

	}
	public List<Utente> selectAll(){
		return new ArrayList<>(mappa.values());
	}

	public Utente selectById(Integer idUtente) {
		Utente utente = mappa.get(idUtente);
		if(utente!=null) 
			return utente;
		else 
			throw new RuntimeException("id non presente");
		
	}
	
	public boolean delete(Integer idUtente) {
		Utente utente = mappa.remove(idUtente);
		return utente!=null;
	}
	
	

}
