package br.unitins.webgyn.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Aluno extends DefaultEntity<Aluno> {

	
	private static final long serialVersionUID = 2285939380429834146L;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idpessoafisica",unique=true)
	private PessoaFisica pessoaFisica;
	
	private String matricula;
	private String formaPagamento;
	


	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}


	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getFormaPagamento() {
		return formaPagamento;
	}


	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	

}
