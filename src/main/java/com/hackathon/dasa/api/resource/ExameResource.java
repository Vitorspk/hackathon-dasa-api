package com.hackathon.dasa.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.dasa.api.model.Exame;
import com.hackathon.dasa.api.repository.ExameRepository;

@RestController
@RequestMapping("/exame")
public class ExameResource {
	
	@Autowired
	private ExameRepository exameRepository;
	
	@GetMapping
	public List<Exame> listar(){
		return exameRepository.findAll();
	}

}
