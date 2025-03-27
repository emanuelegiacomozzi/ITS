package com.spring.studente.service;

import java.util.List;

import com.spring.studente.dto.StudenteDTO;

public interface StudenteService {
	
	public boolean immatricola(StudenteDTO dto);
	public StudenteDTO cerca(int matricola);
	public List<StudenteDTO> selectAll();
	public StudenteDTO delete(int matricola);
//	public StudenteDTO update(int matricola);
	public List<StudenteDTO> getGiovani(int annoImm);

}
