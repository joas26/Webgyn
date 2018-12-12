package br.unitins.webgyn.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.webgyn.model.Exercicio;


public class ExercicioRepository extends Repository<Exercicio> {

	public ExercicioRepository(EntityManager em) {
		super(em);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Exercicio> getExercicios(String nome) {
		
		Query query = (Query) getEntityManager().createQuery("Select p From Exercicio p WHERE p.nome LIKE :nome Order by p.nome ");
		query.setParameter("nome","%" + nome +"%");
		
		List<Exercicio> lista = query.getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Exercicio>();
		
		
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Exercicio> getExercicios() {
		
		List<Exercicio> lista = getEntityManager().createQuery("Select p From Exercicio p Order by p.id desc ").getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Exercicio>();
		
		
		return lista;
	}

}
