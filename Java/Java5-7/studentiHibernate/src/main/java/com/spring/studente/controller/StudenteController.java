package com.spring.studente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.studente.dto.StudenteDTO;
import com.spring.studente.service.StudenteService;

@RestController
@RequestMapping(path="/studenti")
public class StudenteController {
		
		@Autowired
		private StudenteService service;
		
		@PostMapping(consumes="application/json")
		public boolean immatricola(@RequestBody StudenteDTO dto) {
			return service.immatricola(dto);
		}
		
		@GetMapping(path="/{matricola}", produces="application/json")
		public StudenteDTO cerca(@PathVariable int matricola) {
			return service.cerca(matricola);
		}
		
		@GetMapping(path="/selectAll", produces="application/json")
		public List<StudenteDTO> selectAll() {
			return service.selectAll();
		}
		
		@GetMapping(path="/delete/{matricola}", produces="application/json")
		public StudenteDTO delete(@PathVariable int matricola) {
			return service.delete(matricola);
		}
		
//		@GetMapping(path="/update/{matricola}", consumes="application/json", produces="application/json")
//		public StudenteDTO update(@PathVariable int matricola) {
//			return service.update(matricola);
//		}
		
		@GetMapping(path="/giovani", produces="application/json")
		public List<StudenteDTO> getGiovani(@RequestParam int annoImm){
			return service.getGiovani(annoImm);
		}
		
}
