package com.spring.utenti.dao;

import java.util.List;

import com.spring.utenti.entity.Utente;

public interface DAOUtente {
	
	public boolean insert(Utente utente);
	public List<Utente> selectAll();
	public Utente selectById(Integer idUtente);
	public boolean delete(Integer idUtente);
}
