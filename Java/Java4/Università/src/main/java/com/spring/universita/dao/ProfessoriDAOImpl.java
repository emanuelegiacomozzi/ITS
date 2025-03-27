package com.spring.universita.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.universita.entity.Professore;

@Repository
public class ProfessoriDAOImpl implements ProfessoriDAO {
	
	private Map<Integer, Professore> mappa = new HashMap<>();
	
	public boolean insert(Professore professore) {
		if(mappa.containsKey(professore.getId()))
			return false;
		
		mappa.put(professore.getId(), professore);
		return true;

	}
	
	public Professore selectById(int id) {
		return mappa.get(id);
	}
	
	public List<Professore> selectAll(){
		return new ArrayList<>(mappa.values());
	}
	
	public Professore delete(int id) {
		Professore professore = mappa.remove(id);
		return professore;
	}
	
	public Professore update(int id, String materia) {
		Professore professore = mappa.get(id);
		professore.setMateria(materia);
		return professore;
	}
}
