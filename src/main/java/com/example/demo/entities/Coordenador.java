package com.example.demo.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Coordenador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_coordenador;
	private String nome_coordenador;
	private String email_coordenador;
	
	@ManyToOne
	@JoinColumn(name = "id_equipe")
	private Equipe id_equipe;
	
	public Coordenador () {
		
	}

	public Coordenador(Integer id_coordenador, String nome_coordenador, String email_coordenador, Equipe id_equipe) {
		this.id_coordenador = id_coordenador;
		this.nome_coordenador = nome_coordenador;
		this.email_coordenador = email_coordenador;
		this.id_equipe = id_equipe;
	}

	public Integer getId_coordenador() {
		return id_coordenador;
	}

	public void setId_coordenador(Integer id_coordenador) {
		this.id_coordenador = id_coordenador;
	}

	public String getNome_coordenador() {
		return nome_coordenador;
	}

	public void setNome_coordenador(String nome_coordenador) {
		this.nome_coordenador = nome_coordenador;
	}

	public String getEmail_coordenador() {
		return email_coordenador;
	}

	public void setEmail_coordenador(String email_coordenador) {
		this.email_coordenador = email_coordenador;
	}

	public Equipe getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(Equipe id_equipe) {
		this.id_equipe = id_equipe;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_coordenador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenador other = (Coordenador) obj;
		return Objects.equals(id_coordenador, other.id_coordenador);
	}
	
	

}
