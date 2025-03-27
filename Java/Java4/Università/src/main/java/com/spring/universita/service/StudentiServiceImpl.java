package com.spring.universita.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.universita.dao.StudentiDAO;
import com.spring.universita.dto.CognomeNascitaDTO;
import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.dto.StudenteDTO;
import com.spring.universita.entity.Studente;
import com.spring.universita.utility.Conversioni;

@Service
public class StudentiServiceImpl implements StudentiService {
	
	@Autowired
	private StudentiDAO dao;
	
	public boolean registra(StudenteDTO dto) {
		Studente entity = Conversioni.daStudenteDTOAStudente(dto);
		return dao.insert(entity);
	}
	
	public StudenteDTO cercaStudente(int matricola) {
		Studente studente = dao.selectByMatricola(matricola);
		if(studente!=null) {
			StudenteDTO dto = Conversioni.daStudenteAStudenteDTO(studente);
			return dto;
		}
		return null;
		}
	
	public List<StudenteDTO> mostraStudenti(){
		List<Studente> studenti = dao.selectAll();
		List<StudenteDTO> studentiDTO = new ArrayList<>();
		for(Studente studente:studenti) {
			StudenteDTO dto = Conversioni.daStudenteAStudenteDTO(studente);
			studentiDTO.add(dto);
		}
		return studentiDTO;
		}
	
	public StudenteDTO eliminaStudente(int matricola) {
		Studente studente = dao.selectByMatricola(matricola);
		if(studente!=null) {
			StudenteDTO dto = Conversioni.daStudenteAStudenteDTO(studente);
			dao.delete(matricola);
			return dto;
		}
		return null;
	}
	
	public StudenteDTO modificaStudente(int matricola, String indirizzo) {
		Studente studente = dao.selectByMatricola(matricola);
		if(studente!=null) {
			dao.update(matricola, indirizzo);
			StudenteDTO dto = Conversioni.daStudenteAStudenteDTO(studente);
			return dto;
		}
		return null;
	}
	
	public List<String> mostraNomi(){
		List<Studente> studenti = dao.selectAll();
		List<String> nomi = new ArrayList<>();
		for(Studente studente : studenti) {
			StudenteDTO dto = Conversioni.daStudenteAStudenteDTO(studente);
			String nome = dto.getNome();
			nomi.add(nome);
		}
		return nomi;
	}
	
}


