package com.spring.impiegati.service;

import java.util.List;

import com.spring.impiegati.dto.ImpiegatoDTO;
import com.spring.impiegati.dto.NomeCognomeDTO;
import com.spring.impiegati.entity.Impiegato;

public interface ImpiegatoService {
	
	public boolean assumi(ImpiegatoDTO dto);
	public ImpiegatoDTO cerca(int matricola);
	public List<ImpiegatoDTO> selectAll();
	public ImpiegatoDTO delete(int matricola);
	public ImpiegatoDTO update(int matricola, double salario);
	public NomeCognomeDTO delete2(int matricola);
	public List<NomeCognomeDTO> getNominativi();
	public List<ImpiegatoDTO> getRicchi(double  valore);
	public List<ImpiegatoDTO> ordinaPerCognome();
	public List<ImpiegatoDTO> ordinaPerSalario();
}
