package com.example.demo.entities;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cadastro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cadastro;
	private String nome_cadastro;
	
	@ManyToOne
	@JoinColumn(name = "id_operador")
	private Operador id_operador;
	
	@ManyToOne
	@JoinColumn(name = "id_equipe")
	private Equipe id_equipe;
	
	public Cadastro () {
		
	}

	public Cadastro(Integer id_cadastro, String nome_cadastro, Operador id_operador, Equipe id_equipe) {
		super();
		this.id_cadastro = id_cadastro;
		this.nome_cadastro = nome_cadastro;
		this.id_operador = id_operador;
		this.id_equipe = id_equipe;
	}

	
	public Equipe getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(Equipe id_equipe) {
		this.id_equipe = id_equipe;
	}

	public Integer getId_cadastro() {
		return id_cadastro;
	}

	public void setId_cadastro(Integer id_cadastro) {
		this.id_cadastro = id_cadastro;
	}

	public String getNome_cadastro() {
		return nome_cadastro;
	}

	public void setNome_cadastro(String nome_cadastro) {
		this.nome_cadastro = nome_cadastro;
	}

	public Operador getId_operador() {
		return id_operador;
	}

	public void setId_operador(Operador id_operador) {
		this.id_operador = id_operador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_cadastro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro other = (Cadastro) obj;
		return Objects.equals(id_cadastro, other.id_cadastro);
	}
	
	

	
	
	
}
