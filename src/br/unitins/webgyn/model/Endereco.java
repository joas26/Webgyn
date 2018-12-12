package br.unitins.webgyn.model;


import javax.persistence.Entity;

@Entity
public class Endereco extends DefaultEntity<Endereco> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1974099048678853387L;

	private String logradouro;
	private String numero;
	private Cep cep;

	public Cep getCep() {
		return cep;
	}

	public void setCep(Cep cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
