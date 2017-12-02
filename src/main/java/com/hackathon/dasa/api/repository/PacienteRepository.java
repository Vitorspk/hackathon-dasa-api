package com.hackathon.dasa.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.dasa.api.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}