package com.example.demo.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Equipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_equipe;
	private String nome_equipe;
	
	@OneToMany(mappedBy = "id_equipe")
	private List<Coordenador> id_coordenador;
	
	@OneToMany(mappedBy = "id_equipe")
	private List<Operador> id_operador;
	
	
	public Equipe() {
		
	}


	public Equipe(Integer id_equipe, String nome_equipe, List<Coordenador> id_coordenador, List<Operador> id_operador) {
		super();
		this.id_equipe = id_equipe;
		this.nome_equipe = nome_equipe;
		this.id_coordenador = id_coordenador;
		this.id_operador = id_operador;
	}


	public Integer getId_equipe() {
		return id_equipe;
	}


	public void setId_equipe(Integer id_equipe) {
		this.id_equipe = id_equipe;
	}


	public String getNome_equipe() {
		return nome_equipe;
	}


	public void setNome_equipe(String nome_equipe) {
		this.nome_equipe = nome_equipe;
	}


	public List<Coordenador> getId_coordenador() {
		return id_coordenador;
	}


	public void setId_coordenador(List<Coordenador> id_coordenador) {
		this.id_coordenador = id_coordenador;
	}


	public List<Operador> getId_operador() {
		return id_operador;
	}


	public void setId_operador(List<Operador> id_operador) {
		this.id_operador = id_operador;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id_equipe);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipe other = (Equipe) obj;
		return Objects.equals(id_equipe, other.id_equipe);
	}

	
	
	
}
