package com.hackathon.dasa.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.dasa.api.model.Imagem;
import com.hackathon.dasa.api.repository.ImagemRepository;

@RestController
@RequestMapping("/imagem")
public class ImagemResource {
	
	@Autowired
	private ImagemRepository imagemRepository;
	
	@GetMapping
	public List<Imagem> listar(){
		return imagemRepository.findAll();
	}

	
	@GetMapping("/{id}")
	public ResponseEntity<Imagem> buscaPorImagem(@PathVariable("id") Long id ) {
		
		Imagem imagem = imagemRepository.findById(id);
		
		return imagem != null ? ResponseEntity.ok(imagem) : ResponseEntity.notFound().build();
	}
}
