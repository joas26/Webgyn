package br.unitins.webgyn.conversor.jsf;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.unitins.webgyn.factory.JPAFactory;
import br.unitins.webgyn.model.Exercicio;
import br.unitins.webgyn.model.Exercicio;
import br.unitins.webgyn.repository.ExercicioRepository;

// com essa anotacao, este conversor precisa adicionar na interface
//@FacesConverter("ExercicioConverter")

// conversor padrao - nao precisa de adicionar na interface
@FacesConverter(forClass=Exercicio.class)
public class ExercicioConverter implements Converter<Exercicio>{

	@Override
	public Exercicio getAsObject(FacesContext context, 
			UIComponent component, 
			String value) {
		if (value != null && !value.trim().isEmpty()) {
			ExercicioRepository repo = new ExercicioRepository(JPAFactory.getEntityManager());
			Exercicio c = repo.find(Integer.parseInt(value), Exercicio.class);
	
			return c;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Exercicio value) {
		if (value != null && value.getId() != null) {
			return value.getId().toString();
		}
		return null;
	}

}
