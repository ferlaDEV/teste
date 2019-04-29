package br.ibm.dadosDpsp.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tentativaContato")
public class TentativaContato {
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTentativa;

	private String numeroChamado;
	
	private String horaInicio;
	
	private String horaFim;
	
	private transient Long numeroTentativa;

	public int getIdTentativa() {
		return idTentativa;
	}

	public void setIdTentativa(int idTentativa) {
		this.idTentativa = idTentativa;
	}

	public String getNumeroChamado() {
		return numeroChamado;
	}

	public void setNumeroChamado(String numeroChamado) {
		this.numeroChamado = numeroChamado;
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
	
	public Long getNumeroTentativa() {
		return numeroTentativa;
	}

	public void setNumeroTentativa(Long numeroTentativa) {
		this.numeroTentativa = numeroTentativa;
	}
	
	@Override
	public String toString() {
		return "TentativaContato [idTentativa=" + idTentativa + ", numeroChamado=" + numeroChamado + ", horaInicio="
				+ horaInicio + ", horaFim=" + horaFim + "]";
	}
}
