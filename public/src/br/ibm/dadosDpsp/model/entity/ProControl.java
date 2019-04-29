package br.ibm.dadosDpsp.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="proControl")
public class ProControl {

	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idChamado;

	private String numeroChamado;

	private String dataAbertura;
	
	private String produto;
	
	private String horaInicio;
	
	private String horaFim;
	
	private String fila;
	
	private String atuacao;
	
	private String descricao;
	
	private String dataHoraChamado;
	
	private transient Long produtividade;
	
	private transient Long produtividadeMensal;

	public int getIdChamado() {
		return idChamado;
	}

	public void setIdChamado(int idChamado) {
		this.idChamado = idChamado;
	}

	public String getNumeroChamado() {
		return numeroChamado;
	}

	public void setNumeroChamado(String numeroChamado) {
		this.numeroChamado = numeroChamado;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public String getAtuacao() {
		return atuacao;
	}

	public void setAtuacao(String atuacao) {
		this.atuacao = atuacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Long getProdutividade() {
		return produtividade;
	}
	
	public void setProdutividade(Long produtividade) {
		this.produtividade = produtividade;
	}
	
	public Long getProdutividadeMensal() {
		return produtividadeMensal;
	}
	
	public void setProdutividadeMensal(Long produtividadeMensal) {
		this.produtividadeMensal = produtividadeMensal;
	}
	
	public String getDataHoraChamado() {
		return dataHoraChamado;
	}
	
	public void setDataHoraChamado(String dataHoraChamado) {
		this.dataHoraChamado = dataHoraChamado;
	}

	@Override
	public String toString() {
		return "ProControl [idChamado=" + idChamado + ", numeroChamado=" + numeroChamado + ", dataAbertura="
				+ dataAbertura + ", produto=" + produto + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim
				+ ", fila=" + fila + ", atuacao=" + atuacao + ", descricao=" + descricao + "]";
	}
}
