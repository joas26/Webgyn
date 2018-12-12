package br.unitins.webgyn.validation;

import br.unitins.webgyn.application.ValidationException;
import br.unitins.webgyn.model.Cidade;

public class CidadeValidation implements Validation<Cidade>{

	@Override
	public void validate(Cidade t) throws ValidationException {
		if(t.getNome() == null || t.getNome().trim().equals("")) {
			
			throw new ValidationException("O nome da cidade não pode ser vazio");
		}
		
		if(t.getEstado() == null || t.getEstado().trim().equals("")) {
			
			throw new ValidationException("O nome do estado não pode ser vazio");
		}

		
		
	}

}
