package br.unitins.webgyn.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Equipamento extends DefaultEntity<Equipamento> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 388595563213757106L;


	private String nome;
	private String descricao;
	private String marca;
	
	

	public Equipamento() {
		
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	
}
