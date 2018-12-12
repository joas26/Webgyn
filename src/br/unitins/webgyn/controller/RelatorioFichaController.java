package br.unitins.webgyn.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.webgyn.application.Util;
import br.unitins.webgyn.factory.JPAFactory;
import br.unitins.webgyn.model.Cidade;
import br.unitins.webgyn.repository.CidadeRepository;

@Named
@ViewScoped
public class RelatorioFichaController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8960480190786168795L;

	private String nomePessoa;
	
	
	public void pesquisar() {
		
	}
	
	public void imprimir() {
		Util.redirect("/WebGym/FichaReport?NomeAluno="+getNomePessoa());
		
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	
	
	
	
	
}
