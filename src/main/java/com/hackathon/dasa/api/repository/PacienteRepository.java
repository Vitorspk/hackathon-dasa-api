package com.hackathon.dasa.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.dasa.api.model.Paciente;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

	@Query("select p from Paciente p where p.nome like %?1")
	List<Paciente> findByNomeLikeIgnoreCase(String nome);

}

