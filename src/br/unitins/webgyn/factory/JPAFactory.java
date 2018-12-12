package br.unitins.webgyn.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFactory {

	// garante que a clase nãp pode ser instanciada
	private JPAFactory() {}
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebGym");
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
}