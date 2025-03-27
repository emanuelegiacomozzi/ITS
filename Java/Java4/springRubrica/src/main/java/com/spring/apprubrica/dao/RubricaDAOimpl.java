package com.spring.apprubrica.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.apprubrica.entity.Contatto;
import com.spring.apprubrica.entity.Rubrica;

@Repository
public class RubricaDAOimpl implements RubricaDAO {
	
		
		private Map<Integer, Rubrica> mappa = new HashMap<>();
		
		public boolean insert(Rubrica rubrica) {
			if(mappa.containsKey(rubrica.getId()))
				return false;
			
			mappa.put(rubrica.getId(), rubrica);
			return true;

		}
		
		public Rubrica visualizza(Integer id) {
			return mappa.get(id);
		}

		
		public List<Rubrica> visualizzaRubriche() {
			return new ArrayList<>(mappa.values());
			
		}
		
		public Rubrica delete(Integer id) {
			mappa.remove(id);
			return mappa.get(id);
		}
		
		public Rubrica update(int id, String proprietario) {
			Rubrica rubrica = mappa.get(id);
			rubrica.setProprietario(proprietario);
			return rubrica;
		}
}
