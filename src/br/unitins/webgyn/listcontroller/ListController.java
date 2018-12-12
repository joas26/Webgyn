package br.unitins.webgyn.listcontroller;

import java.io.Serializable;

import javax.persistence.EntityManager;

import br.unitins.webgyn.factory.JPAFactory;

public class ListController implements Serializable {

	private static final long serialVersionUID = 8646046611780636891L;

	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		if (entityManager == null)
			entityManager = JPAFactory.getEntityManager();
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}