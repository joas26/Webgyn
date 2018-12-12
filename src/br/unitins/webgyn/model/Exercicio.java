package br.unitins.webgyn.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Exercicio  extends DefaultEntity<Exercicio>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5579892621725198832L;
	
	private String nome;
	private Integer repeticao;
	private String intervalo;
	private Integer sessoes;
	private Double carga;
	
	@ManyToOne
	@JoinColumn(name="idTreino")
	private Treino treino;
	
	@ManyToOne
	@JoinColumn(name="idequipamento")
	private Equipamento equipamento;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getRepeticao() {
		return repeticao;
	}
	public void setRepeticao(Integer repeticao) {
		this.repeticao = repeticao;
	}
	
	public String getIntervalo() {
		return intervalo;
	}
	public void setIntervalo(String intervalo) {
		this.intervalo = intervalo;
	}
	public Integer getSessoes() {
		return sessoes;
	}
	public void setSessoes(Integer sessoes) {
		this.sessoes = sessoes;
	}
	public Double getCarga() {
		return carga;
	}
	public void setCarga(Double carga) {
		this.carga = carga;
	}
	public Treino getTreino() {
		return treino;
	}
	public void setTreino(Treino treino) {
		this.treino = treino;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	
	

}
