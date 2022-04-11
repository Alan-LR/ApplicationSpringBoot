package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;



@Repository
public class RepositoryQueries {

	@PersistenceContext
	public EntityManager entityManager;
	
	@Transactional
	public List buscarCadastroCoord(String id_equipe) {
		List query = entityManager.createNativeQuery("select id_equipe, nome_cadastro, id_operador from cadastro where id_equipe = " +id_equipe+";")
				.getResultList();
		
		return query;
	}
	
	@Transactional
	public List cadastrosOperador(String id_operador) {
		List query = entityManager.createNativeQuery("select * from cadastro where id_operador ="+id_operador+ ";")
				.getResultList();		
		return query;
	}

}
