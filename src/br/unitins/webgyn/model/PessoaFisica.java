package br.unitins.webgyn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PessoaFisica extends Pessoa {

	private static final long serialVersionUID = -3763771903748482697L;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	private String cpf;
	private String rg;
	private Perfil perfil;
	private Sexo sexo;
	
	@ManyToOne
	@JoinColumn(name="idCidadeNatal")
	private Cidade cidadeNatal;
	
	
	
	public Sexo getSexo() {
		return sexo;
	}


	@Enumerated(EnumType.STRING)
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}


	@Enumerated(EnumType.STRING)
	public Perfil getPerfil() {
		return perfil;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Cidade getCidadeNatal() {
		return cidadeNatal;
	}

	public void setCidadeNatal(Cidade cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}

}
