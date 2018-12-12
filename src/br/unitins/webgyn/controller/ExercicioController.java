package br.unitins.webgyn.controller;

import java.util.ArrayList;
import java.util.List;


import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import br.unitins.webgyn.model.Equipamento;
import br.unitins.webgyn.model.Exercicio;
import br.unitins.webgyn.repository.ExercicioRepository;
import br.unitins.webgyn.validation.ExercicioValidation;
import br.unitins.webgyn.validation.Validation;

@Named
@ViewScoped
public class ExercicioController extends Controller<Exercicio> {

	public ExercicioController() {
		super(new ExercicioValidation());
	
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -9099224520262609199L;

	private String pesquisa;

	private List<Exercicio> listaExercicio = null;
	
	private Equipamento equipamento;

	@Override
	public void limpar() {
		setEntity(null);
		listaExercicio = null;
	}

	public void pesquisar() {
		ExercicioRepository repository = new ExercicioRepository(getEntityManager());
		listaExercicio = repository.getExercicios(pesquisa);

	}

	public List<Exercicio> getListaExercicio() {
		if (listaExercicio == null)
			listaExercicio = new ArrayList<Exercicio>();

		return listaExercicio;
	}

	public Exercicio getEntity() {
		if (entity == null)
			entity = new Exercicio();
		return entity;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	
	}
	
	
	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public void EquipamentoSelecionado(SelectEvent event) {
        Equipamento equipamento= (Equipamento) event.getObject();
        getEntity().setEquipamento(equipamento);
        
    }
}

