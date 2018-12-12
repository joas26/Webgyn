package br.unitins.webgyn.model;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.primefaces.event.SelectEvent;

@Entity
public class Avaliacao extends DefaultEntity<Avaliacao> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7773021255020022734L;
	private Date dataAvaliacao;
	private Double altura;
	private Double peso;
	private Double gordura;
	private String anotacao;
	

	
	private PessoaFisica aluno;
	private PessoaFisica instrutor;
	

	public Avaliacao(){
		
	}
	
	
	public Avaliacao(Date dataAvaliacao, Double altura, Double peso, Double gordura, String anotacao) {
		super();
		this.dataAvaliacao = dataAvaliacao;
		this.altura = altura;
		this.peso = peso;
		this.gordura = gordura;
		this.anotacao = anotacao;
	}
	
	


	public Date getDataAvaliacao() {
		return dataAvaliacao;
	}
	public void setDataAvaliacao(Date dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getGordura() {
		return gordura;
	}
	public void setGordura(Double gordura) {
		this.gordura = gordura;
	}
	public String getAnotacao() {
		return anotacao;
	}
	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}


	public PessoaFisica getAluno() {
		return aluno;
	}


	public void setAluno(PessoaFisica aluno) {
		this.aluno = aluno;
	}


	public PessoaFisica getInstrutor() {
		return instrutor;
	}


	public void setInstrutor(PessoaFisica instrutor) {
		this.instrutor = instrutor;
	}
	
	

	

}
