package com.spring.prodotti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.prodotti.dao.DaoProdotto;
import com.spring.prodotti.dto.ProdottoDTO;
import com.spring.prodotti.dto.ProdottoNoIdDTO;
import com.spring.prodotti.dto.ReportoDTO;
import com.spring.prodotti.entity.Prodotto;
import com.spring.prodotti.utility.Conversioni;

@Service
public class ProdottiServiceImpl implements ProdottiService{
	
	@Autowired
	private DaoProdotto dao;
	
	public boolean registra(ProdottoDTO dto) {
		Prodotto entity = Conversioni.daProdottoDTOAProdotto(dto);
		return dao.insert(entity);
	}
	
	public List<ProdottoDTO> visualizzaProdotti(){
		List<Prodotto>prodotti = dao.selectAll();
		
		List<ProdottoDTO> prodottiDTO = new ArrayList<>();
		for(Prodotto prodotto:prodotti) {
			ProdottoDTO dto = Conversioni.daProdottoAProdottoDTO(prodotto);
			prodottiDTO.add(dto);
		}
		return prodottiDTO;
		}
	
	public ProdottoDTO cercaPerId(int id) {
		Prodotto prodotto = dao.selectById(id);
		if(prodotto != null) {
			ProdottoDTO dto = Conversioni.daProdottoAProdottoDTO(prodotto);
			return dto;
		}
		return null;
	}
	
	public ReportoDTO report() {
		int pezzi_totali = 0;
		double prezzi_totali = 0;
		List<Prodotto>prodotti = dao.selectAll();
		List<String> prodottiNonDisp = new ArrayList<>();
		ReportoDTO report = new ReportoDTO();
		List<String> descrizioni = new ArrayList<>();
		for(Prodotto prodotto: prodotti) {
			if(prodotto.getQuantità()!=0) {
				ProdottoDTO dto = Conversioni.daProdottoAProdottoDTO(prodotto);
				descrizioni.add(dto.getDescrizione());
				report.setDescrizioni(descrizioni);
				pezzi_totali = pezzi_totali + dto.getQuantità();
				report.setPezziTotali(pezzi_totali);
				prezzi_totali = prezzi_totali + dto.getPrezzo_consigliato();
			}
			else {
				ProdottoNoIdDTO nodto = Conversioni.daProdottoAProdottoNoIdDTO(prodotto);
				String nome = nodto.getModello();
				prodottiNonDisp.add(nome);
				int totNonDisp = prodottiNonDisp.size();
				report.setNon_disponibili(prodottiNonDisp);
				report.setProdottiNonDisponibili(totNonDisp);
				
			}
		}
		double media = prezzi_totali/prodotti.size();
		report.setMediaPrezzi(media);
		return report;
	}

}
