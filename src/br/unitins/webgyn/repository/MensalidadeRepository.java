package br.unitins.webgyn.repository;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.webgyn.model.Mensalidade;

public class MensalidadeRepository extends Repository<Mensalidade> {

	
	
	public MensalidadeRepository(EntityManager em) {
		super(em);
	}
	


	@SuppressWarnings("unchecked")
	public List<Mensalidade> getMensalidades(String nome) {
		
		Query query = (Query) getEntityManager().createQuery("Select p From Mensalidade p WHERE p.nome LIKE :nome Order by p.nome ");
		query.setParameter("nome","%" + nome +"%");
		
		List<Mensalidade> lista = query.getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Mensalidade>();
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Mensalidade> getMensalidades() {
		
		List<Mensalidade> lista = getEntityManager().createQuery("Select p From Mensalidade p Order by p.id desc ").getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Mensalidade>();
		
		
		return lista;
	}
	
	
	
}
