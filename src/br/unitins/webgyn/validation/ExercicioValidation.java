package br.unitins.webgyn.validation;

import br.unitins.webgyn.application.ValidationException;
import br.unitins.webgyn.model.Exercicio;

public class ExercicioValidation implements Validation<Exercicio> {

	@Override
	public void validate(Exercicio t) throws ValidationException {
		
		
		if ( t.getEquipamento() == null || t.getEquipamento().getNome() == null || t.getEquipamento().getNome().trim().equals("")) {

			throw new ValidationException("O Equipamento não pode ser vazio");
		}
		
		if (t.getNome() == null || t.getNome().trim().equals("")) {

			throw new ValidationException("O Nome do Exercicio não pode ser vazio");
		}

		if (t.getRepeticao() == null ) {

			throw new ValidationException("O Campo repetição não pode ser vazio");
		}

		if (t.getCarga() == null || t.getNome().trim().equals("")) {

			throw new ValidationException("O Campo carga não pode ser vazio");
		}
		
		if (t.getRepeticao() == null ) {

			throw new ValidationException("O Campo repetição não pode ser vazio");
		}
		
		if (t.getIntervalo() == null || t.getIntervalo().trim().equals("")) {

			throw new ValidationException("O Campo intervalo não pode ser vazio");
		}
		
		if (t.getSessoes() == null ) {

			throw new ValidationException("O Campo Sessões não pode ser vazio");
		}

		

	}

}
