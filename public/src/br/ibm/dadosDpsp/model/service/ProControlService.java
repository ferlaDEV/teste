package br.ibm.dadosDpsp.model.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ibm.dadosDpsp.model.dao.ProControlDAO;
import br.ibm.dadosDpsp.model.entity.ProControl;


@Service
public class ProControlService {

	private ProControlDAO dao;

	@Autowired
	public ProControlService(ProControlDAO pdao) {
		dao = pdao;
	}

	@Transactional
	public ProControl inserirProControl(ProControl proControl) throws IOException {
		int id = dao.inserirProControl(proControl);
		proControl.setIdChamado(id);
		return proControl;
	}

	public void excluirProControl(ProControl proControl) throws IOException {
		dao.removerProControl(proControl);
	}

	public List<ProControl> listarProControl() throws IOException{
		return dao.listarProControl();
	}
	
	public Long produtividade() throws IOException {
		return dao.produtividade();

	}
	
	public Long produtividadeMensal() throws IOException {
		return dao.produtividadeMensal();

	}
}