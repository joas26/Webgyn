package br.unitins.webgyn.validation;

import br.unitins.webgyn.application.ValidationException;
import br.unitins.webgyn.model.Equipamento;

public class EquipamentoValidation implements Validation<Equipamento> {

	@Override
	public void validate(Equipamento t) throws ValidationException {
		
		
		if ( t.getNome() == null || t.getNome() == null || t.getNome().trim().equals("")) {

			throw new ValidationException("O Nome não pode ser vazio");
		}
		

		if (t.getMarca() == null || t.getMarca().trim().equals("") ) {

			throw new ValidationException("O Campo Marca não pode ser vazio");
		}
		
		
		
		

	}

}
