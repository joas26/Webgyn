package br.unitins.webgyn.validation;

import br.unitins.webgyn.application.ValidationException;
import br.unitins.webgyn.model.Exercicio;

public class ExercicioValidation implements Validation<Exercicio> {

	@Override
	public void validate(Exercicio t) throws ValidationException {
		
		
		if ( t.getEquipamento() == null || t.getEquipamento().getNome() == null || t.getEquipamento().getNome().trim().equals("")) {

			throw new ValidationException("O Equipamento n�o pode ser vazio");
		}
		
		if (t.getNome() == null || t.getNome().trim().equals("")) {

			throw new ValidationException("O Nome do Exercicio n�o pode ser vazio");
		}

		if (t.getRepeticao() == null ) {

			throw new ValidationException("O Campo repeti��o n�o pode ser vazio");
		}

		if (t.getCarga() == null || t.getNome().trim().equals("")) {

			throw new ValidationException("O Campo carga n�o pode ser vazio");
		}
		
		if (t.getRepeticao() == null ) {

			throw new ValidationException("O Campo repeti��o n�o pode ser vazio");
		}
		
		if (t.getIntervalo() == null || t.getIntervalo().trim().equals("")) {

			throw new ValidationException("O Campo intervalo n�o pode ser vazio");
		}
		
		if (t.getSessoes() == null ) {

			throw new ValidationException("O Campo Sess�es n�o pode ser vazio");
		}

		

	}

}
