package com.hackathon.dasa.api.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Embeddable
public class Exame {
	
	private String codigo;
	
	private String data;
	private String laudo;
	
	@Embedded
	private Imagem imagem;
	
	
	
}
