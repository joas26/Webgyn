package br.unitins.webgyn.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Mensalidade extends  DefaultEntity<Mensalidade> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5870994204215263051L;

	
	private String mes;
	private String ano;
	private double valor;
	private String status;
	private Date dataPagamento;
	private PessoaFisica aluno;

	
	
	public PessoaFisica getAluno() {
		return aluno;
	}

	public void setAluno(PessoaFisica aluno) {
		this.aluno = aluno;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	
	

}
