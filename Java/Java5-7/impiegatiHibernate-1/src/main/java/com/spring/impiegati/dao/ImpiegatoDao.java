package com.spring.impiegati.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.impiegati.dto.NomeCognomeDTO;
import com.spring.impiegati.entity.Impiegato;

public interface ImpiegatoDao extends JpaRepository<Impiegato, Integer>{
	
	@Query(nativeQuery = true, value = "select * from impiegato where salario_mensile > :valore")
	public List<Impiegato> getRicchi(double valore);
	
	@Query(nativeQuery = true, value = "select * from impiegato order by cognome")
	public List<Impiegato> ordinaPerCognome();
	
	@Query(nativeQuery = true, value = "select * from impiegato order by salario_mensile")
	public List<Impiegato> ordinaPerSalario();
	
	
}
