package com.spring.prodotti.service;

import java.util.List;

import com.spring.prodotti.dto.ProdottoDTO;
import com.spring.prodotti.dto.ReportoDTO;

public interface ProdottiService {
	
	public boolean registra(ProdottoDTO dto);
	public List<ProdottoDTO> visualizzaProdotti();
	public ProdottoDTO cercaPerId(int id);
	public ReportoDTO report();
	

}
