package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Cadastro;
import com.example.demo.entities.Coordenador;
import com.example.demo.entities.Equipe;
import com.example.demo.entities.Operador;
import com.example.demo.sevices.Services;

@RestController
@RequestMapping(value = "/brastech")
public class Controllers {
	
	@Autowired
	private Services services;
	
	//Adicionando uma Equipe
	@PostMapping(value = "/addEquipe")
	public ResponseEntity<Equipe> insertEquip(@RequestBody Equipe obj){
		obj = services.insertEquip(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	//Adicionando um Coordenador
	@PostMapping(value = "/addCoord")
	public ResponseEntity<Coordenador> insertCoord(@RequestBody Coordenador obj){
		obj = services.insertCoord(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	//Adicionando um Operador
	@PostMapping(value = "/addOp")
	public ResponseEntity<Operador> insertOp(@RequestBody Operador obj){
		obj = services.insertOp(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	//Adicionando um Cadastro
	@PostMapping(value = "/addCadastro")
	public ResponseEntity<Cadastro> insertCad(@RequestBody Cadastro obj){
		obj = services.insertCad(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	//Alterando um Coordenador
	@PutMapping(value = "alterCoord/{id_coordenador}")
	public ResponseEntity<Coordenador> updateCoord(@PathVariable Integer id_coordenador, @RequestBody Coordenador obj){
		obj = services.updateCoord(id_coordenador, obj);
		return ResponseEntity.ok().body(obj);
	}
}
