package br.unitins.webgyn.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.webgyn.model.Endereco;

public class EnderecoRepository extends Repository<Endereco> {

	
	
	public EnderecoRepository(EntityManager em) {
		super(em);
	}
	


	@SuppressWarnings("unchecked")
	public List<Endereco> getEnderecos(String nome) {
		
		Query query = (Query) getEntityManager().createQuery("Select p From Endereco p WHERE p.nome LIKE :nome Order by p.nome ");
		query.setParameter("nome","%" + nome +"%");
		
		List<Endereco> lista = query.getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Endereco>();
		
		
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Endereco> getEnderecos() {
		
		List<Endereco> lista = getEntityManager().createQuery("Select p From Endereco p Order by p.id desc ").getResultList();
		   
		if(lista == null)
		   lista = new ArrayList<Endereco>();
		
		
		return lista;
	}
	
	
	
}
