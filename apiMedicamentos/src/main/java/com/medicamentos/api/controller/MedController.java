package com.medicamentos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicamentos.api.estoque.DadosMedicamentos;
import com.medicamentos.api.model.Medicamentos;
import com.medicamentos.api.repository.MedicamentosRepository;

@Controller
@RequestMapping("/medicamentos")
public class MedController {
	
	@Autowired
	private MedicamentosRepository repository;
	
	@PostMapping
	public void Cadastrar(@RequestBody DadosMedicamentos dadosMed) {
		//System.out.println(dadosMed);
		repository.save(new Medicamentos(dadosMed));
	}
	@GetMapping("/javasp")
	public String javaServerPage() {
		return "Hello";	}
}
