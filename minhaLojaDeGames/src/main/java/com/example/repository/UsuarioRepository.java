package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.UsuarioModel;


public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

}
