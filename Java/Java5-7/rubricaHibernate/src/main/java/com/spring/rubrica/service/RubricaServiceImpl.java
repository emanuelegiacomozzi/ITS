package com.spring.rubrica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rubrica.dao.DAORubrica;
import com.spring.rubrica.dto.ContattoDTO;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.entity.Rubrica;
import com.spring.rubrica.utility.Conversioni;

@Service
@Transactional
public class RubricaServiceImpl implements RubricaService {
	
	@Autowired
	private DAORubrica dao;
	
	@Override
	public boolean creaRubrica(RubricaDTO dto) {
		Rubrica rubrica = Conversioni.daRubricaDtoARubrica(dto);
		dao.save(rubrica);
		return true;
	}

	@Override
	public RubricaDTO cerca(Integer idRubrica) {
		Optional<Rubrica> opt = dao.findById(idRubrica);
		if(opt.isPresent()) {
			Rubrica rubrica = opt.get();
			return Conversioni.daRubricaARubricaDto(rubrica);
		}
		return null;
	}

	@Override
	public boolean aggiungiContatto(Integer idRubrica, ContattoDTO dto) {
		Optional<Rubrica> opt = dao.findById(idRubrica);
		if(opt.isPresent()) {
			Rubrica rubrica = opt.get();
			rubrica.aggiungiContatto(Conversioni.daContattoDtoAContatto(dto));
			return true;
		}
		return false;
		
	}

	@Override
	public ContattoDTO modifica(Integer idRubrica, Integer idContatto, String numero) {
		Optional<Rubrica> opt = dao.findById(idRubrica);
		if(opt.isPresent()) {
			Rubrica rubrica = opt.get();
			RubricaDTO rubricaDTO = Conversioni.daRubricaARubricaDto(rubrica);
			List<ContattoDTO> contattiDTO = rubricaDTO.getContatti();
			if(!contattiDTO.isEmpty()) {
				for(ContattoDTO contattoDTO: contattiDTO) {
					if(idRubrica.equals(contattoDTO.getIdContatto())) {
						contattoDTO.setNumero(numero);
						return contattoDTO;
					}
					return null;
				}
			}
			return null;
		}
		return null;
	}

}
