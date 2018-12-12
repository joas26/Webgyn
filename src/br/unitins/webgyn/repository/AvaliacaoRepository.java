package br.unitins.webgyn.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.webgyn.model.Avaliacao;

public class AvaliacaoRepository extends Repository<Avaliacao>{

	public AvaliacaoRepository(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public List<Avaliacao> getAvaliacao(String nome) {
		
		Query query = (Query) getEntityManager().createQuery("Select p From Avaliacao p WHERE p.anotacao LIKE :anotacao Order by p.anotacao ");
		query.setParameter("nome","%" + nome +"%");
		
		List<Avaliacao> lista = query.getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Avaliacao>();
		
		
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Avaliacao> getAvaliacao(){
		
		List<Avaliacao> lista = getEntityManager().createQuery("Select p From Avaliacao p Order by p.id desc ").getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Avaliacao>();
		return null;		
	}
	

}
