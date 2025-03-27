package com.spring.apprubrica.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.apprubrica.dao.RubricaDAO;
import com.spring.apprubrica.dto.AnnoCreazioneDTO;
import com.spring.apprubrica.dto.ContattoDTO;
import com.spring.apprubrica.dto.ProprietariDTO;
import com.spring.apprubrica.dto.ProprietarioCreazioneDTO;
import com.spring.apprubrica.dto.RubricaDTO;
import com.spring.apprubrica.entity.Contatto;
import com.spring.apprubrica.entity.Rubrica;
import com.spring.apprubrica.utilty.Conversioni;

@Service

public class RubricaServiceImpl implements RubricaService {
	
	@Autowired
	private RubricaDAO dao;
	
	
	public boolean inserisci(RubricaDTO dto) {
		Rubrica entity = Conversioni.daRubricaDTOARubrica(dto);
		return dao.insert(entity);
	}
	
	
	
	public RubricaDTO visualizza(Integer id) {
		Rubrica rubrica = dao.visualizza(id);
		if(rubrica != null) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			return dto;
		}
		return null;
	}
	
	

	@Override
	public List<RubricaDTO> visualizzaRubriche() {
		List<Rubrica> rubriche = dao.visualizzaRubriche();
		List<RubricaDTO> rubricheDTO = new ArrayList<>();
		for(Rubrica rubrica : rubriche) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			rubricheDTO.add(dto);
		}
		return rubricheDTO;
	}
	
	

	@Override
	public RubricaDTO delete(int id) {
		Rubrica rubrica = dao.visualizza(id);
		if(rubrica != null) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			dao.delete(id);
			return dto;
		}
		return null;
	}
	
	

	@Override
	public ProprietarioCreazioneDTO getProprietarioAnno(int id) {
		Rubrica rubrica = dao.visualizza(id);
		if(rubrica != null) {
			return new ProprietarioCreazioneDTO(rubrica.getProprietario(), rubrica.getAnno_creazione());
		}
		return null;
	}
	
	

	@Override
	public RubricaDTO update(int id, String proprietario) {
		Rubrica rubrica = dao.visualizza(id);
		if(rubrica != null) {
			dao.update(id, proprietario);
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			return dto;
		}
		return null;
	}
	
	

	@Override
	public RubricaDTO updateAnno(int id, int anno) {
		Rubrica rubrica = dao.visualizza(id);
		if(rubrica != null) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			dto.setAnno_creazione(anno);
			return dto;
		}
		return null;
	}
	
	

	@Override
	public ProprietariDTO proprietari() {
		List<Rubrica> rubriche = dao.visualizzaRubriche();
		ProprietariDTO proprietariDTO = new ProprietariDTO();
		List<String> proprietariRubriche = new ArrayList<>();
		for(Rubrica rubrica: rubriche) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			proprietariRubriche.add(dto.getProprietario());
			proprietariDTO.setProprietari(proprietariRubriche);
			proprietariDTO.getCont();
		}
		return proprietariDTO;
	}
	
	

	@Override
	public ProprietarioCreazioneDTO Oldest() {
		List<Rubrica>rubriche = dao.visualizzaRubriche();
    	List<ProprietarioCreazioneDTO> proprietariCreazione = new ArrayList<>();
    	for(Rubrica rubrica: rubriche) {
    		ProprietarioCreazioneDTO proprietarioCreazione = new ProprietarioCreazioneDTO(rubrica.getProprietario(), rubrica.getAnno_creazione());
    		proprietariCreazione.add(proprietarioCreazione);
    		proprietariCreazione.sort(Comparator.comparing(ProprietarioCreazioneDTO::getAnno_creazione));
    	}
    	return proprietariCreazione.get(0);
    }
	
	

	@Override
	public List<AnnoCreazioneDTO> anni_creazione() {
		List<Rubrica>rubriche = dao.visualizzaRubriche();
		List<AnnoCreazioneDTO> anniRubriche = new ArrayList<>();
		for(Rubrica rubrica:rubriche) {
			AnnoCreazioneDTO anno_creazione = new AnnoCreazioneDTO(rubrica.getAnno_creazione());
			anniRubriche.add(anno_creazione);
			anniRubriche.sort(Comparator.comparing(AnnoCreazioneDTO::getAnno_creazione));
		}
		return anniRubriche;
	}
	
	

	@Override
	public boolean inserisciContatto(Integer id ,ContattoDTO dto) {
		Rubrica rubrica = dao.visualizza(id);
		if(rubrica!=null) {
			Contatto entity = Conversioni.daContattoDTOAContatto(dto);
			List<Contatto> contatti = rubrica.getContatti();
			for(Contatto contatto:contatti) {
				 if (contatto.getId().equals(entity.getId())) {
				        return false;
				    } 
			}
			contatti.add(entity);
	        return true;
		}
		return false;
}
	

	

	@Override
	public ContattoDTO visualizzaContatto(Integer idRubrica, Integer id) {
		Rubrica rubrica = dao.visualizza(idRubrica);
		if(rubrica != null) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			List<ContattoDTO> contatti = dto.getContatti();
			for(ContattoDTO cont: contatti) {
				if(id.equals(cont.getId())) {
					return cont;
				}
			}
		}
		return null;
		
	}
	
	
	
	
	@Override
	public ContattoDTO modificaContatto(Integer idRubrica, Integer id, String nome, String cognome, String gruppo, LocalDate data_nascita, boolean preferito) {
		Rubrica rubrica = dao.visualizza(idRubrica);
		if(rubrica != null) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			List<ContattoDTO> contatti = dto.getContatti();
			for(ContattoDTO cont: contatti) {
				if(id.equals(cont.getId())) {
					cont.setNome(nome);
					cont.setCognome(cognome);
					cont.setData_nascita(data_nascita);
					cont.setGruppo(gruppo);
					cont.setPreferito(preferito);
					return cont;
				}
			}
		}
		return null;
	}
	
	
	
	
//	@Override
//	public ContattoDTO eliminaContatto(Integer idRubrica, Integer id) {
//		Rubrica rubrica = dao.visualizza(idRubrica);
//		if(rubrica != null) {
//			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
//			List<ContattoDTO> contatti = dto.getContatti();
//			for(ContattoDTO cont: contatti) {
//				if(id.equals(cont.getId())) {
//					contatti.remove(cont);
//					return cont;
//				}
//			}
//		}
//		return null;
//		
//	}
	
	
	
	
	
	
	
	
	@Override
	public List<ContattoDTO> visualizzaContatti(Integer idRubrica) {
		Rubrica rubrica = dao.visualizza(idRubrica);
		if(rubrica != null) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			List<ContattoDTO> contatti = dto.getContatti();
			if(contatti!=null) {
				return contatti;
			}
			return null;
		}
		return null;
		
	}



	@Override
	public Integer numContatti(Integer idRubrica) {
		Rubrica rubrica = dao.visualizza(idRubrica);
		if(rubrica != null) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			List<ContattoDTO> contatti = dto.getContatti();
			if(contatti!=null) {
				return contatti.size();
			}
			return null;
		}
		return null;
		
	}
	
	public ContattoDTO numero(Integer idRubrica, Long numero) {
		Rubrica rubrica = dao.visualizza(idRubrica);
		if(rubrica != null) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			List<ContattoDTO> contatti = dto.getContatti();
			for(ContattoDTO contatto : contatti) {
				if(numero.equals(contatto.getNumero())) {
					return contatto;
				}
		}
	}
	return null;
}
	
	
	
	
	




	
	
	
	
	
}
