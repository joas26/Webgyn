package br.unitins.webgyn.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.unitins.webgyn.model.TipoUsuario;


@Entity
public class Instrutor extends DefaultEntity<Instrutor> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5562243774720359747L;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idpessoafisica",unique=true)
	private PessoaFisica pessoaFisica;

	private String senha;
	private String login;
	private TipoUsuario tipoUsuario;
	
	
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}


	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}

	

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	

}
