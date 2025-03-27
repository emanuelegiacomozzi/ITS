package com.spring.universita.service;

import java.util.List;

import com.spring.universita.dto.ProfessoreDTO;

public interface ProfessoriService {
	
	public boolean registra(ProfessoreDTO dto);
	public ProfessoreDTO cercaProfessore(int id);
	public List<ProfessoreDTO> mostraProfessori();
	public ProfessoreDTO eliminaProfessore(int id);
	public ProfessoreDTO modificaProfessore(int id, String materia);
	public List<ProfessoreDTO> materiaProf(String materia);
	public List<ProfessoreDTO> orderByCognome();
	public List<String> materie();
}
