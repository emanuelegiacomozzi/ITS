package com.spring.impiegati.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.impiegati.dao.ImpiegatoDao;
import com.spring.impiegati.dto.ImpiegatoDTO;
import com.spring.impiegati.dto.NomeCognomeDTO;
import com.spring.impiegati.entity.Impiegato;
import com.spring.impiegati.utility.Conversioni;

@Service
@Transactional
public class ImpiegatoServiceImpl implements ImpiegatoService{
	
	@Autowired
	private ImpiegatoDao dao;

	@Override
	public boolean assumi(ImpiegatoDTO dto) {
		Impiegato impiegato = Conversioni.daImpiegatoDTOAImpiegato(dto);
		Optional<Impiegato> opt = dao.findById(dto.getMatricola());
		if(opt.isPresent()) {
			return false;
		}else {
			dao.save(impiegato);
			return true;
		}
	}

	@Override
	public ImpiegatoDTO cerca(int matricola) {
		Optional<Impiegato> opt = dao.findById(matricola);
		if(opt.isPresent()) {
			Impiegato impiegato = opt.get();
			return Conversioni.daImpiegatoAImpiegatoDTO(impiegato);
		}
		return null;
	}

	@Override
	public List<ImpiegatoDTO> selectAll() {
		List<Impiegato> impiegati= dao.findAll();
		List<ImpiegatoDTO> impiegatiDTO = new ArrayList<>();
		if(!impiegati.isEmpty()) {
			for(Impiegato impiegato:impiegati) {
				ImpiegatoDTO impiegatoDTO = Conversioni.daImpiegatoAImpiegatoDTO(impiegato);
				impiegatiDTO.add(impiegatoDTO);
			}
			return impiegatiDTO;
		}
		return null;
	}

	@Override
	public ImpiegatoDTO delete(int matricola) {
		Optional<Impiegato> opt = dao.findById(matricola);
		if(opt.isPresent()) {
			Impiegato impiegato = opt.get();
			ImpiegatoDTO impiegatoDTO = Conversioni.daImpiegatoAImpiegatoDTO(impiegato);
			dao.delete(impiegato);
			return impiegatoDTO;
		}
		return null;
	}

	@Override
	public ImpiegatoDTO update(int matricola, double salario) {
		Optional<Impiegato> opt = dao.findById(matricola);
		if(opt.isPresent()) {
			Impiegato impiegato = opt.get();
			ImpiegatoDTO impiegatoDTO = Conversioni.daImpiegatoAImpiegatoDTO(impiegato);
			impiegato.setSalario_mensile(salario);
			return impiegatoDTO;
		}
		return null;
	}

	@Override
	public NomeCognomeDTO delete2(int matricola) {
		Optional<Impiegato> opt = dao.findById(matricola);
		NomeCognomeDTO nominativo = new NomeCognomeDTO();
		if(opt.isPresent()) {
			Impiegato impiegato = opt.get();
			ImpiegatoDTO impiegatoDTO = Conversioni.daImpiegatoAImpiegatoDTO(impiegato);
			nominativo.setNome(impiegatoDTO.getNome());
			nominativo.setCognome(impiegatoDTO.getCognome());
			dao.delete(impiegato);
			return nominativo;
		}
		return null;
	}
	
	
	@Override
	public List<NomeCognomeDTO> getNominativi() {
		List<Impiegato> impiegati = dao.findAll();
		List<NomeCognomeDTO> nominativi = new ArrayList<>();
		if(!impiegati.isEmpty()) {
			for(Impiegato impiegato:impiegati) {
				ImpiegatoDTO impiegatoDTO = Conversioni.daImpiegatoAImpiegatoDTO(impiegato);
				NomeCognomeDTO nominativo = new NomeCognomeDTO();
				nominativo.setNome(impiegatoDTO.getNome());
				nominativo.setCognome(impiegatoDTO.getCognome());
				nominativi.add(nominativo);
			}
			return nominativi;
		}
		return null;
	}

	@Override
	public List<ImpiegatoDTO> getRicchi(double valore) {
		List<Impiegato> impiegati = dao.getRicchi(valore);
		List<ImpiegatoDTO> impiegatiDTO = new ArrayList<>();
		if(!impiegati.isEmpty()) {
			for(Impiegato impiegato:impiegati) {
				ImpiegatoDTO impiegatoDTO = Conversioni.daImpiegatoAImpiegatoDTO(impiegato);
				impiegatiDTO.add(impiegatoDTO);
			}
			return impiegatiDTO;
		}
		return null;
	}

	@Override
	public List<ImpiegatoDTO> ordinaPerCognome() {
		List<Impiegato> impiegati = dao.ordinaPerCognome();
		List<ImpiegatoDTO> impiegatiDTO = new ArrayList<>();
		if(!impiegati.isEmpty()) {
			for(Impiegato impiegato:impiegati) {
				ImpiegatoDTO impiegatoDTO = Conversioni.daImpiegatoAImpiegatoDTO(impiegato);
				impiegatiDTO.add(impiegatoDTO);
			}
			return impiegatiDTO;
		}
		return null;
	}

	@Override
	public List<ImpiegatoDTO> ordinaPerSalario() {
		List<Impiegato> impiegati = dao.ordinaPerSalario();
		List<ImpiegatoDTO> impiegatiDTO = new ArrayList<>();
		if(!impiegati.isEmpty()) {
			for(Impiegato impiegato:impiegati) {
				ImpiegatoDTO impiegatoDTO = Conversioni.daImpiegatoAImpiegatoDTO(impiegato);
				impiegatiDTO.add(impiegatoDTO);
			}
			return impiegatiDTO;
		}
		return null;
	}

}
