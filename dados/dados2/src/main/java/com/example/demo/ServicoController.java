package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ponto no endereço do site
@RequestMapping("/hello")
@RestController
public class ServicoController {

	
	//MVC - model(tables)
	//MVC - View (front)
	//MVC - Controller (cérebro/endereçamento)
	/*@GetMapping("/get1")
	public String hello1() {
		return "Hey Get1 Hello World";
	}	
	
	@GetMapping("/get2")
	public String hello2() {
		return "Hey Get2 Hello Word";
	}
	//www.seusite.com.br/hello/get1*/
	
		//injeção
		@Autowired
		private ServicoRepository repository;
		
		//get com find all - get vai pegar
		@GetMapping ("/servicos")
		public List<ServicoModel> pegarTodos() {		
			return repository.findAll();
		}
		//post é responsavel por inserir, inserir, inserir
		@PostMapping("/servicos")
		public ServicoModel criar (@RequestBody ServicoModel tabelaServico) {
			repository.save(tabelaServico);
			return tabelaServico;
		}

}
