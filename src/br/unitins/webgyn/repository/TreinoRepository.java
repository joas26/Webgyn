package br.unitins.webgyn.repository;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.webgyn.model.DiasSemana;
import br.unitins.webgyn.model.Treino;

public class TreinoRepository extends Repository<Treino> {
	
	public TreinoRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Treino> getTreinos(String nome) {
		Query query = getEntityManager().
				createQuery("Select p From Treino p WHERE LOWER(p.nome) LIKE LOWER(:nome) Order by p.nome");
		query.setParameter("nome", "%" + nome + "%");
		List<Treino> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList<Treino>();
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Treino> getTreinos() {
		List<Treino> lista = getEntityManager().
				createQuery("Select p From Treino p Order by p.id desc").getResultList();
			if (lista == null)
				lista = new ArrayList<Treino>();
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Treino> getTreinos(Integer id, DiasSemana dia) {
		Query query = getEntityManager().
				createQuery("SELECT * FROM treinoaluno a inner join treino t on t.id=a.idtreino WHERE a.idaluno = :id and t.dia = :dia ORDER BY a.idtreino");
		
		
		query.setParameter("id", id);
		query.setParameter("dia", dia);
		List<Treino> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList<Treino>();
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Treino> getTreinosDia(DiasSemana dia) {
		Query query = getEntityManager().
				createQuery("Select p From Treino p WHERE  p.dia = :dia");
		query.setParameter("dia", dia);
		List<Treino> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList<Treino>();
		return lista;
	}
}
