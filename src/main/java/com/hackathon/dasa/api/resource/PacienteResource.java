package com.hackathon.dasa.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.dasa.api.model.Paciente;
import com.hackathon.dasa.api.repository.PacienteRepository;

@RestController
@RequestMapping("/pacientes")
public class PacienteResource {

	@Autowired
	private PacienteRepository pacienteRepository;
	
	@GetMapping
	public List<Paciente> listar() {
		return pacienteRepository.findAll();
	}
	
}
