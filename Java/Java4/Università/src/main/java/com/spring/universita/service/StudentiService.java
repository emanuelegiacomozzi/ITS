package com.spring.universita.service;

import java.util.List;

import com.spring.universita.dto.StudenteDTO;

public interface StudentiService {
	
	public boolean registra(StudenteDTO dto);
	public StudenteDTO cercaStudente(int matricola);
	public List<StudenteDTO> mostraStudenti();
	public StudenteDTO eliminaStudente(int matricola);
	public StudenteDTO modificaStudente(int matricola, String indirizzo);
	public List<String> mostraNomi();
}
