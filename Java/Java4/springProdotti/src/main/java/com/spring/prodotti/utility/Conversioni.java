package com.spring.prodotti.utility;

import com.spring.prodotti.dto.ProdottoDTO;
import com.spring.prodotti.dto.ProdottoNoIdDTO;
import com.spring.prodotti.entity.Prodotto;



public class Conversioni {
	
	public static Prodotto daProdottoDTOAProdotto(ProdottoDTO dto) {
		return new Prodotto(dto.getID(), dto.getMarca(), dto.getModello(), dto.getDescrizione(), dto.getCategoria(), dto.getPrezzo_consigliato(), dto.getPrezzo_max(), dto.getQuantità());
	}
	
	public static ProdottoDTO daProdottoAProdottoDTO(Prodotto entity) {
		return new ProdottoDTO(entity.getID(), entity.getMarca(), entity.getModello(), entity.getDescrizione(),entity.getCategoria(), entity.getPrezzo_consigliato(), entity.getPrezzo_max(), entity.getQuantità());
	}
	
	public static ProdottoNoIdDTO daProdottoAProdottoNoIdDTO(Prodotto entity) {
		return new ProdottoNoIdDTO(entity.getMarca(), entity.getModello(), entity.getDescrizione(),entity.getCategoria(), entity.getPrezzo_consigliato(), entity.getPrezzo_max(), entity.getQuantità());
	}

}
