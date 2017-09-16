package com.hackaton.sensedia.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hackaton.sensedia.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
