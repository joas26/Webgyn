package br.unitins.webgyn.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;


import br.unitins.webgyn.model.Aluno;
import br.unitins.webgyn.model.FormaPagamento;
import br.unitins.webgyn.model.PessoaFisica;
import br.unitins.webgyn.repository.AlunoRepository;
import br.unitins.webgyn.validation.AlunoValidation;

@Named
@ViewScoped
public class AlunoController extends Controller<Aluno> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3819416611255448958L;
	
	private String pesquisa;
	private PessoaFisica pessoaFisica;
	private FormaPagamento formaPagamento;
	
	private List<Aluno> listaAluno = null;
	
	public AlunoController() {
		super(new AlunoValidation());
	}
	

	public Aluno getEntity() {
		if (entity == null)
			entity = new Aluno();
			
		return entity;
	}
	
	public void pessoaFisicaSelecionada(SelectEvent event) {
        PessoaFisica Aluno = (PessoaFisica) event.getObject();
        getEntity().setPessoaFisica(Aluno);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Pessoa Selecionada: "+ getEntity().getPessoaFisica().getNome()));  
        
    }
	
	
	@Override
	public void limpar() {
		setEntity(null);
		listaAluno = null;
		
	}
	
	public void pesquisar() {
		AlunoRepository repository = new AlunoRepository(getEntityManager());
		listaAluno = repository.getAlunos(pesquisa);
		
	}
	
	public FormaPagamento[] getVetorFormaPagamento() {
		return FormaPagamento.values();
	}
	
	
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public List<Aluno> getListaAluno() {
		if (listaAluno == null)
			listaAluno = new ArrayList<Aluno>();
		
		return listaAluno;
	}

	
	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
	
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

}
