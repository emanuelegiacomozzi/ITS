package com.spring.prodotti.dao;

import java.util.List;

import com.spring.prodotti.entity.Prodotto;

public interface DaoProdotto {
	
	public boolean insert(Prodotto prodotto);
	public List<Prodotto> selectAll();
	public Prodotto selectById(Integer idProdotto);
}
