package com.spring.first.controller;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/lista")
public class ListaController {
	
	@GetMapping(path="/random")
	public LinkedList<Integer> Lista(){
		LinkedList<Integer> listaInteri = new LinkedList<>();
		for(int i =0; i <5; i++) {
			int randomNum = (int) (Math.random()*90);
			listaInteri.add(randomNum);
		}
		return listaInteri;
	}
}
