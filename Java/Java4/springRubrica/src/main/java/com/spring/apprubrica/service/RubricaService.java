package com.spring.apprubrica.service;

import java.time.LocalDate;
import java.util.List;

import com.spring.apprubrica.dto.AnnoCreazioneDTO;
import com.spring.apprubrica.dto.ContattoDTO;
import com.spring.apprubrica.dto.ProprietariDTO;
import com.spring.apprubrica.dto.ProprietarioCreazioneDTO;
import com.spring.apprubrica.dto.RubricaDTO;

public interface RubricaService {
	public boolean inserisci(RubricaDTO dto);
	public RubricaDTO visualizza(Integer id);
	public List<RubricaDTO> visualizzaRubriche();
	public RubricaDTO delete(int id);
	public ProprietarioCreazioneDTO getProprietarioAnno(int id);
	public RubricaDTO update(int id, String proprietario);
	public RubricaDTO updateAnno(int id, int anno);
	public ProprietariDTO proprietari();
	public ProprietarioCreazioneDTO Oldest();
	public List<AnnoCreazioneDTO> anni_creazione();
	public boolean inserisciContatto(Integer id,ContattoDTO dto);
	public ContattoDTO visualizzaContatto(Integer idRubrica, Integer id);
	public ContattoDTO modificaContatto(Integer idRubrica, Integer id, String nome, String cognome, String gruppo, LocalDate data_nascita, boolean preferito);
//	public ContattoDTO eliminaContatto(Integer idRubrica, Integer id);
	public List<ContattoDTO> visualizzaContatti(Integer idRubrica);
	public Integer numContatti(Integer idRubrica);
	public ContattoDTO numero(Integer idRubrica, Long numero);
}
