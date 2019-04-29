package br.ibm.dadosDpsp.model.dao;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.ibm.dadosDpsp.model.entity.TentativaContato;



@Repository
public class TentativaContatoDAO {
	@PersistenceContext
	EntityManager manager;

	@Transactional
	public int inserirTentativaContato(TentativaContato tentativaContato) throws IOException {
		manager.persist(tentativaContato);
		return tentativaContato.getIdTentativa();
	}
	
	public Long tentativasContato() throws IOException {

		String jpql = "select COUNT(t.idTentativa) from TentativaContato t";
		Query query = manager.createQuery(jpql);
		Long count = (Long) query.getSingleResult();
		return count;
		
	}

}
