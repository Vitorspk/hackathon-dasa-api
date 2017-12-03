package com.hackathon.dasa.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.dasa.api.model.Paciente;
import com.hackathon.dasa.api.repository.PacienteRepository;

@RestController
@RequestMapping("/pacientes")
public class PacienteResource {

	@Autowired
	private PacienteRepository pacienteRepository;
	
	@CrossOrigin(origins = "http://localhost:8100")
	@GetMapping
	public List<Paciente> listar() {
		return pacienteRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:8100")
	@GetMapping("/{nome}")
	public ResponseEntity<Paciente> buscaPeloCpf(@PathVariable("nome") String nome) {
		
		Paciente paciente = pacienteRepository.findByNome(nome);

		return paciente != null ? ResponseEntity.ok(paciente) : ResponseEntity.notFound().build();
	}
	
}
