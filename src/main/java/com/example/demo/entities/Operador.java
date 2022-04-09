package com.example.demo.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Operador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_operador;
	private String nome_operador;
	private String email_operador;
	
	@ManyToOne
	@JoinColumn(name = "id_equipe")
	private Equipe id_equipe;
	
	@OneToMany(mappedBy = "id_operador")
	private List<Cadastro> id_cadastro;
	
	public Operador () {
		
	}

	public Operador(Integer id_operador, String nome_operador, String email_operador, Equipe id_equipe,
			List<Cadastro> id_cadastro) {
		super();
		this.id_operador = id_operador;
		this.nome_operador = nome_operador;
		this.email_operador = email_operador;
		this.id_equipe = id_equipe;
		this.id_cadastro = id_cadastro;
	}

	public Integer getId_operador() {
		return id_operador;
	}

	public void setId_operador(Integer id_operador) {
		this.id_operador = id_operador;
	}

	public String getNome_operador() {
		return nome_operador;
	}

	public void setNome_operador(String nome_operador) {
		this.nome_operador = nome_operador;
	}

	public String getEmail_operador() {
		return email_operador;
	}

	public void setEmail_operador(String email_operador) {
		this.email_operador = email_operador;
	}

	public Equipe getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(Equipe id_equipe) {
		this.id_equipe = id_equipe;
	}

	public List<Cadastro> getId_cadastro() {
		return id_cadastro;
	}

	public void setId_cadastro(List<Cadastro> id_cadastro) {
		this.id_cadastro = id_cadastro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_operador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operador other = (Operador) obj;
		return Objects.equals(id_operador, other.id_operador);
	}

	
	
	
	
}
