package com.spring.first.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/data")
public class DataController {
	
	@GetMapping(path="/personalizzata")
	public LocalDate dataPersonalizzata() {
		LocalDate localDate = LocalDate.of(2025, 11, 2);
		return localDate;
	}
	
	@GetMapping(path="/corrente")
	public LocalDate dataCorrente() {
		LocalDate localDate = LocalDate.now();
		return localDate;
	}
}
