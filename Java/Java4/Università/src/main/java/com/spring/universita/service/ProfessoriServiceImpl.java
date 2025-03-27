package com.spring.universita.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.universita.dao.ProfessoriDAO;
import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.dto.StudenteDTO;
import com.spring.universita.entity.Professore;
import com.spring.universita.entity.Studente;
import com.spring.universita.utility.Conversioni;

@Service
public class ProfessoriServiceImpl implements ProfessoriService {
	
	@Autowired
	private ProfessoriDAO dao;;
	
	public boolean registra(ProfessoreDTO dto) {
		Professore entity = Conversioni.daProfessoreDTOAProfessore(dto);
		return dao.insert(entity);
	}
	
	public ProfessoreDTO cercaProfessore(int id) {
		Professore professore = dao.selectById(id);
		if(professore!=null) {
			ProfessoreDTO dto = Conversioni.daProfessoreAProfessoreDTO(professore);
			return dto;
		}
		return null;
	}
	
	public List<ProfessoreDTO> mostraProfessori(){
		List<Professore> professori = dao.selectAll();
		List<ProfessoreDTO> professoriDTO = new ArrayList<>();
		for(Professore professore:professori) {
			ProfessoreDTO dto = Conversioni.daProfessoreAProfessoreDTO(professore);
			professoriDTO.add(dto);
		}
		return professoriDTO;
	}
	
	public ProfessoreDTO eliminaProfessore(int id) {
		Professore professore = dao.selectById(id);
		if(professore!=null) {
			ProfessoreDTO dto = Conversioni.daProfessoreAProfessoreDTO(professore);
			dao.delete(id);
			return dto;
		}
		return null;
	}
	
	public ProfessoreDTO modificaProfessore(int id, String materia) {
		Professore professore = dao.selectById(id);
		if(professore!=null) {
			dao.update(id, materia);
			ProfessoreDTO dto = Conversioni.daProfessoreAProfessoreDTO(professore);
			return dto;
		}
		return null;
	}
	
    public List<ProfessoreDTO> materiaProf(String materia){
    	List<Professore>professori = dao.selectAll();
    	List<ProfessoreDTO> profMateria = new ArrayList<>();
    	for(Professore professore: professori) {
    		ProfessoreDTO dto = Conversioni.daProfessoreAProfessoreDTO(professore);
    		if(dto.getMateria().equals(materia)) {
    			profMateria.add(dto);
    		}
    	}
    	return profMateria;
    }
    
    public List<ProfessoreDTO> orderByCognome(){
    	List<Professore>professori = dao.selectAll();
    	List<ProfessoreDTO> profMateria = new ArrayList<>();
    	for(Professore professore: professori) {
    		ProfessoreDTO dto = Conversioni.daProfessoreAProfessoreDTO(professore);
    		profMateria.add(dto);
    		profMateria.sort(Comparator.comparing(ProfessoreDTO::getCognome));
    	}
    	return profMateria;
    }
    
    public List<String> materie(){
    	List<Professore>professori = dao.selectAll();
    	List<String> materie = new ArrayList<>();
    	for(Professore professore:professori) {
    		ProfessoreDTO dto = Conversioni.daProfessoreAProfessoreDTO(professore);
    		String materia = dto.getMateria();
    		if(!materie.contains(materia)) {
    			materie.add(materia);
    		}
    	}
    	return materie;
    }
}
