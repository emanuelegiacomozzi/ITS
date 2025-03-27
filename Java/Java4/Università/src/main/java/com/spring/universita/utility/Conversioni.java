package com.spring.universita.utility;

import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.dto.StudenteDTO;
import com.spring.universita.entity.Professore;
import com.spring.universita.entity.Studente;

public class Conversioni {
	
	public static Studente daStudenteDTOAStudente(StudenteDTO dto) {
		return new Studente(dto.getMatricola(), dto.getNome(), dto.getCognome(), dto.getIndirizzo(), dto.getAnno_nascita(), dto.getAnno_immatricolazione());
	}
	
	public static StudenteDTO daStudenteAStudenteDTO(Studente entity) {
		return new StudenteDTO(entity.getMatricola(), entity.getNome(), entity.getCognome(), entity.getIndirizzo(), entity.getAnno_nascita(), entity.getAnno_immatricolazione());
	}
	
	public static Professore daProfessoreDTOAProfessore(ProfessoreDTO dto) {
		return new Professore(dto.getId(), dto.getNome(), dto.getCognome(), dto.getMateria());
	}
	
	public static ProfessoreDTO daProfessoreAProfessoreDTO(Professore entity) {
		return new ProfessoreDTO(entity.getId(), entity.getNome(), entity.getCognome(), entity.getMateria());
	}
}
