package br.unitins.webgyn.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;




@Entity
public class Treino extends DefaultEntity<Treino> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5765753738739180211L;
	

	
	

	@ManyToMany
	@JoinTable(name="Treinoexercicio", joinColumns= @JoinColumn(name="idtreino"), inverseJoinColumns =@JoinColumn(name="idexercicio"))
	private List<Exercicio> listaExercicio;
	@JoinTable(name="Treinoaluno", joinColumns= @JoinColumn(name="idtreino"), inverseJoinColumns =@JoinColumn(name="idaluno"))
	private PessoaFisica aluno;
	
	private String grupoMuscular;

	private DiasSemana dia;
	
	public String getGrupoMuscular() {
		return grupoMuscular;
	}

	public void setGrupoMuscular(String grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}

	public PessoaFisica getAluno() {
		return aluno;
	}

	public void setAluno(PessoaFisica aluno) {
		this.aluno = aluno;
	}

	public List<Exercicio> getListaExercicio() {
		return listaExercicio;
	}

	public void setListaExercicio(List<Exercicio> listaExercicio) {
		this.listaExercicio = listaExercicio;
	}
	public DiasSemana getDia() {
		return dia;
	}
 	public void setDia(DiasSemana diaSemana) {
		this.dia = diaSemana;
	}

	
	
	
	

}
