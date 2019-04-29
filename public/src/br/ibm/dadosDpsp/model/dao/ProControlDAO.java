package br.ibm.dadosDpsp.model.dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.ibm.dadosDpsp.model.entity.ProControl;



@Repository
public class ProControlDAO {
	@PersistenceContext
	EntityManager manager;



	@Transactional
	public int inserirProControl(ProControl proControl) throws IOException {
		manager.persist(proControl);
		return proControl.getIdChamado();
	}

	public void removerProControl(ProControl proControl) throws IOException {
		manager.remove(manager.find(ProControl.class, proControl.getIdChamado()));
	}
	
	@SuppressWarnings("unchecked")
	public List<ProControl> listarProControl() throws IOException {
		return manager.createQuery("select p from ProControl p").getResultList();
	}
	
	public Long produtividade() throws IOException {

		String jpql = "select COUNT(p.idChamado) from ProControl p WHERE date(p.dataHoraChamado) = current_date()";
		Query query = manager.createQuery(jpql);
		Long count = (Long) query.getSingleResult();
		return count;
		
	}
	
	public Long produtividadeMensal() throws IOException {

		String jpql = "select COUNT(p.idChamado) from ProControl p";
		Query query = manager.createQuery(jpql);
		Long count = (Long) query.getSingleResult();
		return count;
		
	}

}
