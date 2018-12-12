package br.unitins.webgyn.controller;



import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import br.unitins.webgyn.repository.ExercicioRepository;
import br.unitins.webgyn.model.Treino;
import br.unitins.webgyn.model.DiasSemana;
import br.unitins.webgyn.model.Exercicio;
import br.unitins.webgyn.repository.TreinoRepository;
import br.unitins.webgyn.validation.Validation;

@Named
@ViewScoped
public class TreinoController extends Controller<Treino>  {

	public TreinoController() {
		super(null);
		// TODO Auto-generated constructor stub
	}



	private static final long serialVersionUID = -4270221378549569000L;

	private String pesquisa;
	
	private Exercicio exercicio;
	private List<Exercicio> listaExercicio = null;
	
	
	
	private List<Treino> listaTreino = null;
	
	
	
	public void adicionarExercicio() {
		if (getEntity().getListaExercicio() == null)
			getEntity().setListaExercicio(new ArrayList<Exercicio>());
		
		// relacionando o Exercicio com  o treino
		getExercicio().setTreino(getEntity());
		
		// adicionando o Exercicio na lista
		getEntity().getListaExercicio().add(getExercicio());
		
		//limpando o Exercicio depois da adicao
		setExercicio(null);
	}
	
	
	
	
	public void removerExercicio(Exercicio exercicio) {
		getEntity().getListaExercicio().remove(exercicio);
	}
	
	
	public void limpar() {
		setEntity(null);
		listaTreino = null;
	}
	
	public void pesquisar() {
		TreinoRepository repository = new TreinoRepository(getEntityManager());
		listaTreino = repository.getTreinos(pesquisa);
	}
	
	public List<Treino> getListaTreino() {
		if (listaTreino == null)
			listaTreino = new ArrayList<Treino>();
		return listaTreino;
	}

	@Override
	public Treino getEntity() {
		if (entity == null) {
			entity = new Treino();
			
		}
		return entity;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}

	public Exercicio getExercicio() {
		if (exercicio == null) {
			exercicio = new Exercicio();
		}
		return exercicio;
	}
	
	


	public void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}


	
	public List<Exercicio> getListaExercicio() {
		if (listaExercicio == null) {
			ExercicioRepository repo = new ExercicioRepository(getEntityManager());
			listaExercicio = repo.getExercicios("");
		}
		return listaExercicio;
	}
	
	
	public DiasSemana[] getVetorDia() {
		return DiasSemana.values();
		
		
	}
	
	public void consultar() {
		TreinoRepository repository = new TreinoRepository(getEntityManager());
		//getListaTreino().addAll(repository.getTreinosDia(DiasSemana.SEGUNDA));
		getListaTreino().addAll(repository.getTreinos(getEntity().getAluno().getId(),getEntity().getDia()));
	    
		if(getListaTreino().get(0)!=null)
			setEntity(getListaTreino().get(0));
		
	}

}
