package com.spring.apprubrica.dao;

import java.util.List;

import com.spring.apprubrica.dto.RubricaDTO;
import com.spring.apprubrica.entity.Contatto;
import com.spring.apprubrica.entity.Rubrica;

public interface RubricaDAO {
	
	public boolean insert(Rubrica rubrica);
	public Rubrica visualizza(Integer id);
	public List<Rubrica> visualizzaRubriche();
	public Rubrica delete(Integer id);
	public Rubrica update(int id, String proprietario);
}
