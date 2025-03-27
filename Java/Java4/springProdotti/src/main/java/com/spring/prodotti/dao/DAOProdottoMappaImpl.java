package com.spring.prodotti.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.prodotti.dto.ProdottoNoIdDTO;
import com.spring.prodotti.entity.Prodotto;


@Repository
public class DAOProdottoMappaImpl implements DaoProdotto {
	
	private Map<Integer, Prodotto> mappa = new HashMap<>();
	
	public boolean insert(Prodotto prodotto) {
		if(mappa.containsKey(prodotto.getID()))
			return false;
		
		mappa.put(prodotto.getID(), prodotto);
		return true;

	}
	
	public List<Prodotto> selectAll(){
		return new ArrayList<>(mappa.values());
	}
	
	public Prodotto selectById(Integer idProdotto) {
		return mappa.get(idProdotto);
	}
}
