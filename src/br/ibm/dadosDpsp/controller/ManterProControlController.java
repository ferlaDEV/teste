package br.ibm.dadosDpsp.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ibm.dadosDpsp.model.entity.ProControl;
import br.ibm.dadosDpsp.model.entity.TentativaContato;
import br.ibm.dadosDpsp.model.service.ProControlService;
import br.ibm.dadosDpsp.model.service.TentativaContatoService;

@Controller
public class ManterProControlController  {

	@Autowired
	private ProControlService pService;
	@Autowired
	private TentativaContatoService tService;
	
	@RequestMapping("/proControl")
	public String proControl(ProControl proControl, TentativaContato tentativaContato, Model model, HttpSession session) throws IOException {
		long produtividade;
		long produtividadeMensal;
		produtividade = pService.produtividade();
		proControl.setProdutividade(produtividade);
		produtividadeMensal = pService.produtividadeMensal();
		proControl.setProdutividadeMensal(produtividadeMensal);
		//long numeroTentativa;
		//numeroTentativa = tService.numeroTetativa();
		//tentativaContato.setNumeroTentativa(numeroTentativa);
		//model.addAttribute("NumeroTentativa", numeroTentativa);
		model.addAttribute("proControl", proControl);
		return "proControl";
	}
	
	@RequestMapping("/tentativaContato")
	public String TentativaContato(TentativaContato tentativaContato, Model model, HttpSession session) throws IOException {
		long numeroTentativa;
		numeroTentativa = tService.numeroTetativa();
		tentativaContato.setNumeroTentativa(numeroTentativa);
		model.addAttribute("NumeroTentativa", numeroTentativa);
		return "tentativaContato";
	}

	@RequestMapping("/criar_ProControl")
	public String criarProControl(ProControl proControl, Model model, HttpSession session) {
		try {
			long produtividade;
			long produtividadeMensal;
			proControl = pService.inserirProControl(proControl);
			produtividade = pService.produtividade();
			proControl.setProdutividade(produtividade);
			produtividadeMensal = pService.produtividadeMensal();
			proControl.setProdutividadeMensal(produtividadeMensal);
			model.addAttribute("proControl", proControl);
			return "proControl";

		} catch (IOException e) {
			e.printStackTrace();
			model.addAttribute("erro", e);
			return "Erro";
		}
	}
	
	@RequestMapping("/listar_ProControl")
	public String listarProControl(ProControl proControl, TentativaContato tentativaContato, HttpSession session, Model model) {
		try {
			long produtividade;
			long produtividadeMensal;
			//long numeroTentativa;
			List<ProControl> listaProControl;
			listaProControl = pService.listarProControl();
			produtividade = pService.produtividade();
			proControl.setProdutividade(produtividade);
			produtividadeMensal = pService.produtividadeMensal();
			proControl.setProdutividadeMensal(produtividadeMensal);
			session.setAttribute("proControl", proControl);
			//numeroTentativa = tService.numeroTetativa();
			//tentativaContato.setNumeroTentativa(numeroTentativa);
			session.setAttribute("tentativaContato", tentativaContato);
			session.setAttribute("listaProControl", listaProControl);
			return "listaProControl";
		} catch (IOException e) {
			e.printStackTrace();
			model.addAttribute("erro", e);
			return "erro";
		}
		
	}
	
	@RequestMapping("/criar_Tentativa")
	public String criarTentativa(ProControl proControl, TentativaContato tentativaContato, Model model, HttpSession session) {
		try {
			long produtividade;
			long produtividadeMensal;
			long numeroTentativa;
			tentativaContato = tService.inserirTentativaContato(tentativaContato);
			numeroTentativa = tService.numeroTetativa();
			produtividade = pService.produtividade();
			proControl.setProdutividade(produtividade);
			produtividadeMensal = pService.produtividadeMensal();
			proControl.setProdutividadeMensal(produtividadeMensal);
			tentativaContato.setNumeroTentativa(numeroTentativa);
			session.setAttribute("proControl", proControl);
			model.addAttribute("NumeroTentativa", numeroTentativa);
			return "proControl";

		} catch (IOException e) {
			e.printStackTrace();
			model.addAttribute("erro", e);
			return "Erro";
		}
	}
}