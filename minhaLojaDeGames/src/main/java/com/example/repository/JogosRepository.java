package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.JogosModel;

public interface JogosRepository extends JpaRepository<JogosModel, Long>{
	public List<JogosModel> findAllByNomeContainingIgnoreCase (String nome);
}
