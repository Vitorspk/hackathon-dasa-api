package com.hackathon.dasa.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.dasa.api.model.Exame;
import com.hackathon.dasa.api.repository.ExameRepository;

@RestController
@RequestMapping("/exames")
public class ExameResource {
	
	@Autowired
	private ExameRepository exameRepository;
	
	@GetMapping
	public List<Exame> listar(){
		return exameRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Exame> buscaPorLaudo(@PathVariable("id") Long id ) {
		
		Exame exame = exameRepository.findById(id);
		
		return exame != null ? ResponseEntity.ok(exame) : ResponseEntity.notFound().build();
	}
	
}
