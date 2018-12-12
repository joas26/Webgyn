package br.unitins.webgyn.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa extends DefaultEntity<Pessoa> {

	private static final long serialVersionUID = 8722334069992408682L;

	private String nome;
	private String email;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="pessoa", orphanRemoval=true)
	private List<Telefone> listaTelefone;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idendereco",unique=true)
	private Endereco endereco;

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Telefone> getListaTelefone() {
		return listaTelefone;
	}

	public void setListaTelefone(List<Telefone> listaTelefone) {
		this.listaTelefone = listaTelefone;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
