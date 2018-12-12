package br.unitins.webgyn.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.webgyn.model.Equipamento;


public class EquipamentoRepository extends Repository<Equipamento> {

	public EquipamentoRepository(EntityManager em) {
		super(em);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Equipamento> getEquipamentos(String nome) {
		
		Query query = (Query) getEntityManager().createQuery("Select p From Equipamento p WHERE p.nome LIKE :nome Order by p.nome ");
		query.setParameter("nome","%" + nome +"%");
		
		List<Equipamento> lista = query.getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Equipamento>();
		
		
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Equipamento> getEquipamentos() {
		
		List<Equipamento> lista = getEntityManager().createQuery("Select p From Equipamento p Order by p.id desc ").getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Equipamento>();
		
		
		return lista;
	}

}
