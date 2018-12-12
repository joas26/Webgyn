package br.unitins.webgyn.controller;


import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.webgyn.model.Mensalidade;
import br.unitins.webgyn.repository.MensalidadeRepository;
import br.unitins.webgyn.validation.MensalidadeValidation;
import br.unitins.webgyn.validation.Validation;

@Named
@ViewScoped
public class MensalidadeController extends Controller<Mensalidade>  {

	public MensalidadeController() {
		super(new MensalidadeValidation());
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = -4270221378549569000L;

	private String pesquisa;
	

	private List<Mensalidade> listaMensalidade = null;
	
	
	public void limpar() {
		setEntity(null);
		listaMensalidade = null;
	}
	
	public void pesquisar() {
		MensalidadeRepository repository = new MensalidadeRepository(getEntityManager());
		listaMensalidade = repository.getMensalidades(pesquisa);
		
	}
	
	public List<Mensalidade> getListaMensalidade() {
		if (listaMensalidade == null)
			listaMensalidade = new ArrayList<Mensalidade>();
		
		return listaMensalidade;
	}

	public Mensalidade getEntity() {
		if (entity == null)
			entity = new Mensalidade();
		return entity;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
}