package com.spring.studente.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.studente.dao.DaoStudente;
import com.spring.studente.dto.StudenteDTO;
import com.spring.studente.entity.Studente;

@Service
@Transactional
public class StudenteServiceImpl implements StudenteService {
	
	@Autowired
	private DaoStudente dao;

	@Override
	public boolean immatricola(StudenteDTO dto) {
		Studente st = new Studente(dto.getMatricola(), dto.getNome(), dto.getCognome(), dto.getAnnoImm());
		
		Optional<Studente> opt= dao.findById(dto.getMatricola());
		if(opt.isPresent())
			return false;
		else {
			dao.save(st);
			return true;
		}
	}

	@Override
	public StudenteDTO cerca(int matricola) {
		Optional<Studente> opt= dao.findById(matricola);
		if(opt.isPresent()) {
			Studente st = opt.get();
			return new StudenteDTO(st.getMatricola(), st.getNome(), st.getCognome(), st.getAnnoImm());
		}
		return null;
	}

	@Override
	public List<StudenteDTO> selectAll() {
		List<Studente> list= dao.findAll();
		List<StudenteDTO> listDTO= new ArrayList<>();
		for(Studente st : list) {
			StudenteDTO dto = new StudenteDTO(st.getMatricola(), st.getNome(), st.getCognome(), st.getAnnoImm());
			listDTO.add(dto);
		}
		return listDTO;
	}

	@Override
	public StudenteDTO delete(int matricola) {
		Optional<Studente> opt= dao.findById(matricola);
		if(opt.isPresent()) {
			Studente st = opt.get();
			dao.delete(st);
			return new StudenteDTO(st.getMatricola(), st.getNome(), st.getCognome(), st.getAnnoImm());
			
		}
		return null;
	}

	@Override
	public List<StudenteDTO> getGiovani(int annoImm) {
		List<Studente> list= dao.getGiovani(annoImm);
		List<StudenteDTO> listDTO = list.stream().map(studente -> new StudenteDTO(studente.getMatricola(), studente.getNome(), studente.getCognome(), studente.getAnnoImm())).collect(Collectors.toList());
		return listDTO;
	}

//	@Override
//	public StudenteDTO update(int matricola) {
//		Optional<Studente> opt= dao.findById(matricola);
//		if(opt.isPresent()) {
//			Studente st = opt.get();
//			st.setMatricola(matricola);
//			return new StudenteDTO(st.getMatricola(), st.getNome(), st.getCognome(), st.getAnnoImm());
//		}
//		return null;
//	}
	
	
}
