package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
@RequestMapping("/")
public class Controller implements WebMvcConfigurer{
	
	// acessar a pagina pelo localhost:8080
	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}
	
	
	//injeção
	@Autowired
	private ManutencaoRepository repository;
	
	//localhost:8080/manutencoes
	@GetMapping("/manutencoes")
	public List<ManutencaoTable> buscarTodos(){
		return repository.findAll();
	}
	
		//post resp por inserir
	@PostMapping("/manutencoes")
	public ManutencaoTable criar(@RequestBody ManutencaoTable objetinho) {
		repository.save(objetinho);
		return objetinho;
	}
	//parametro com/por id
	@GetMapping("/manutencoes/{id}")
	public Optional<ManutencaoTable> buscarUm(@PathVariable Long id){
		return repository.findById(id);
	}
	
	// put serva para atualizar
	//@requestBody inserir o que estiver no corpo 
	//setId vai forçar a alteração do corpo ( body ) , set = mudar
	
	@PutMapping("/manutencoes/{id}")
	public ManutencaoTable atualizar(@PathVariable Long id, @RequestBody ManutencaoTable objetinho) {
		objetinho.setId(id);
		repository.save(objetinho);
		return objetinho;
	}
	
	@GetMapping("/manutencoes/{nome}")
	public List<ManutencaoTable> buscarPorNome(@PathVariable String nome){
		return repository.findByNome(nome);
	}
	
	//inserir objeto categoria antes
	@ GetMapping("/manutencoes/{nome}/{categoria}")
	public Optional<ManutencaoTable> findByNomeAndCategoria(@PathVariable String nome, @PathVariable String categoria){
		return repository.findByNomeAndCategoria(nome, categoria);
	}
	
	//pegar parametro por id e deletar 
	@DeleteMapping("manutencoes/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}	

	
}

