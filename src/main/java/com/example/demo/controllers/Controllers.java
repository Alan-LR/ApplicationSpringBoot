package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Cadastro;
import com.example.demo.entities.Coordenador;
import com.example.demo.entities.Equipe;
import com.example.demo.entities.Operador;
import com.example.demo.sevices.Services;

import java.util.List;

@RestController
@RequestMapping(value = "/brastech")
public class Controllers {
	
	@Autowired
	private Services services;
	
	
	//	-----FUNÇÕES QUE FORAM PASSADAS NO MONDAY----

	
	//Adicionando uma Equipe
	@PostMapping(value = "/addEquipe")
	public ResponseEntity<Equipe> insertEquip(@RequestBody Equipe obj){
		obj = services.insertEquip(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	//Deletar uma equipe (A equipe só pode ser deletada se estiver vazia, sem coordenador/operadores, equipes com coordenadores e operadores não podem ser
		//deletadas, para a propria segurança do sistema)
		@DeleteMapping(value = "deletarEquipe/{id_equipe}")
		public ResponseEntity<Void> deletarEquipe (@PathVariable Integer id_equipe){
			services.deletarEquipe(id_equipe);
			return ResponseEntity.noContent().build();
		}
	
	//Adicionando um Coordenador
	@PostMapping(value = "/addCoord")
	public ResponseEntity<Coordenador> insertCoord(@RequestBody Coordenador obj){
		obj = services.insertCoord(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	//Alterando um Coordenador
		@PutMapping(value = "alterCoord/{id_coordenador}")
		public ResponseEntity<Coordenador> updateCoord(@PathVariable Integer id_coordenador, @RequestBody Coordenador obj){
			obj = services.updateCoord(id_coordenador, obj);
			return ResponseEntity.ok().body(obj);
		}
		
		
	//Adicionando um Operador
	@PostMapping(value = "/addOp")
	public ResponseEntity<Operador> insertOp(@RequestBody Operador obj){
		obj = services.insertOp(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	//Função para deletar Operador
		@DeleteMapping(value = "deletarOp/{id_operador}")
		public ResponseEntity<Void> deletarOperador (@PathVariable Integer id_operador){
			services.deletarOperador(id_operador);
			return ResponseEntity.noContent().build();
		}
		
	//Adicionando um Cadastro
	@PostMapping(value = "/addCadastro")
	public ResponseEntity<Cadastro> insertCad(@RequestBody Cadastro obj){
		obj = services.insertCad(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	//Rota para coordenador ver todos os cadastros da equipe
	@RequestMapping(value = "/cadastrosdaequipe/{id_equipe}", method = RequestMethod.GET)
	public ResponseEntity<List> buscarCadastroCoord(@PathVariable String id_equipe){
		List result = services.buscarCadastroCoord(id_equipe);
		return ResponseEntity.ok().body(result);
	} 
	
	//Rota para atendente ver apenas os seus cadastros
	@RequestMapping(value = "cadastrosOperador/{id_operador}", method = RequestMethod.GET)
	public ResponseEntity<List> cadastrosOperador(@PathVariable String id_operador){
		List result = services.cadastrosOPerador(id_operador);
		return ResponseEntity.ok().body(result);
	}
	//Rota para retorno de dados da equipe: nome, coordenador, cadastros realizados, quantidade de atendentes da equipe
	
	
	
	
	
	
}


