package com.spring.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //indica a Spring che dovrà istanziare e gestire questa classe
@RequestMapping(path="/calcolatrice")
public class CalcolatriceController {
	
	//qui ci sarebbe il costruttore di default
	@GetMapping(path="/sum")
	public int somma(int n1, int n2) {
		return n1+n2;
	}
	
	@GetMapping(path="/diff")
	public int differenza(int n1, int n2) {
		return n1-n2;
	}
	
	@GetMapping(path="/molt")
	public int moltiplicazione(int n1, int n2) {
		return n1*n2;
	}
	
	@GetMapping(path="/div")
	public double divisione(double n1, double n2) {
		try {
			return n1/n2;
		}catch(ArithmeticException e){
			System.out.println("Errore:Divisione per zero!");
			return Double.NaN;
		}
	}
	
	
	

}
