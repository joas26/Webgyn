package br.unitins.webgyn.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cep extends DefaultEntity<Cep> {

	private static final long serialVersionUID = -4998349913226212795L;

	private String cep;

	private String bairro;
		
	@ManyToOne
	@JoinColumn(name="idcidade")
	private Cidade cidade;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	


}
