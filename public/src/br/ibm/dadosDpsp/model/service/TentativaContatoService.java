package br.ibm.dadosDpsp.model.service;

import java.io.IOException;

import javax.transaction.Transactional;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ibm.dadosDpsp.model.dao.TentativaContatoDAO;
import br.ibm.dadosDpsp.model.entity.TentativaContato;


@Service
public class TentativaContatoService {

	private TentativaContatoDAO dao;

	@Autowired
	public TentativaContatoService(TentativaContatoDAO tdao) {
		dao = tdao;
	}

	@Transactional
	public TentativaContato inserirTentativaContato(TentativaContato tentativaContato) throws IOException {
		int id = dao.inserirTentativaContato(tentativaContato);
		tentativaContato.setIdTentativa(id);
		return tentativaContato;
	}

	public Long numeroTetativa() throws IOException {
		return dao.tentativasContato();

	}
}