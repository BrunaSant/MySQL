package org.generation.blogPessoal.Repository;

import java.util.List;

import org.generation.blogPessoal.model.TemaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<TemaModel, Long>{
	public List<TemaModel> findAllByDescricaoContainingIgnoreCase(String descricao);
}
