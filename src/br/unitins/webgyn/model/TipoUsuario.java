package br.unitins.webgyn.model;

import java.util.Arrays;
import java.util.List;

public enum TipoUsuario {
	
	ADMINSTRADOR(0, "Adminstrador", 
			Arrays.asList("cadastropessoafisica.xhtml", "cadastrocidade.xhtml", "listagemcidade.xhtml", "listagempessoafisica.xhtml", "cadastroinstrutor.xhtml", "cadastroaluno.xhtml", "cadastroequipamento.xhtml", "cadastrotreino.xhtml", "cadastromensalidade.xhtml", "cadastroexercicio.xhtml", "cadastroavaliacao.xhtml", "FichaReport")),
	INSTRUTOR(1, "Instrutor", Arrays.asList("cadastropessoafisica.xhtml","cadastrocidade.xhtml", "listagemcidade.xhtml","cadastroaluno.xhtml", "cadastroequipamento.xhtml", "cadastrotreino.xhtml", "cadastromensalidade.xhtml", "cadastroexercicio.xhtml", "cadastroavaliacao.xhtml"));
	
	
	//
	private int id;
	private String label;
	private List<String> pages;
	
	private TipoUsuario(int id, String label, List<String> pages) {
		this.id = id;
		this.label = label;
		this.pages = pages;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getLabel() {
		return label;
	}

	public List<String> getPages() {
		return pages;
	}
	
}
