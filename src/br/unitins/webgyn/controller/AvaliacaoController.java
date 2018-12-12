package br.unitins.webgyn.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import br.unitins.webgyn.model.Aluno;
import br.unitins.webgyn.model.Avaliacao;
import br.unitins.webgyn.model.PessoaFisica;
import br.unitins.webgyn.repository.AlunoRepository;
import br.unitins.webgyn.repository.AvaliacaoRepository;
import br.unitins.webgyn.validation.Validation;


@Named
@ViewScoped
public class AvaliacaoController extends Controller<Avaliacao> {

	public AvaliacaoController(Validation<Avaliacao> validation) {
		super(validation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3780741359637379099L;

	
	private String pesquisa;

	private List<Avaliacao> listaAvaliacao = null;
	
	@Override
	public Avaliacao getEntity() {
		
		if (entity == null)
			entity = new Avaliacao();
		return entity;
	}
	
	@Override
	public void limpar() {
		setEntity(null);
		listaAvaliacao = null;
	}
	
	public void pesquisar() {
		AvaliacaoRepository repository = new AvaliacaoRepository(getEntityManager());
		listaAvaliacao = repository.getAvaliacao(pesquisa);
		
	}
	
	public List<Avaliacao> getListaAvaliacao() {
		if (listaAvaliacao == null)
			listaAvaliacao = new ArrayList<Avaliacao>();
		
		return listaAvaliacao;
	}
	
	public void alunoSelecionado(SelectEvent event) {
        PessoaFisica aluno = (PessoaFisica) event.getObject();
        getEntity().setAluno(aluno);
       
    }
	public void instrutorSelecionado(SelectEvent event) {
        PessoaFisica instrutor = (PessoaFisica) event.getObject();
        getEntity().setAluno(instrutor);
       
    }


	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}

}
