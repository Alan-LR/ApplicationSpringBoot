package com.example.demo.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Cadastro;
import com.example.demo.entities.Coordenador;
import com.example.demo.entities.Equipe;
import com.example.demo.entities.Operador;
import com.example.demo.repository.CadastroRepository;
import com.example.demo.repository.CoordenadorRepository;
import com.example.demo.repository.EquipeRepository;
import com.example.demo.repository.OperadorRepository;

@Service
public class Services {

	@Autowired
	private EquipeRepository equipRep;
	
	@Autowired
	private CoordenadorRepository coordRep;
	
	@Autowired
	private OperadorRepository opRep;
	
	@Autowired
	private CadastroRepository cadRep;

	public Equipe insertEquip(Equipe obj) {
		return equipRep.save(obj);
	}

	public Coordenador insertCoord(Coordenador obj) {
		return coordRep.save(obj);
	}
	
	public Operador insertOp(Operador obj) {
		return opRep.save(obj);
	}

	public Cadastro insertCad(Cadastro obj) {
		return cadRep.save(obj);
	}

	public Coordenador updateCoord(Integer id_coordenador, Coordenador obj) {
		Coordenador entity = coordRep.getById(id_coordenador);
		updateNewCoord(entity, obj);
		return coordRep.save(entity);
	}

	private void updateNewCoord(Coordenador entity, Coordenador obj) {
		entity.setNome_coordenador(obj.getNome_coordenador());
		entity.setEmail_coordenador(obj.getEmail_coordenador());
		entity.setId_equipe(obj.getId_equipe());
		
	}
}
