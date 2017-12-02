package com.hackathon.dasa.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "exame")
public class Exame {

	private Long codigo;
	private String data;
	private String laudo;
	//private List<Imagem> imagem;
	
	
	public Long getCodigo() { 
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getLaudo() {
		return laudo;
	}
	public void setLaudo(String laudo) {
		this.laudo = laudo;
	}
	
	
	
	
	
}
