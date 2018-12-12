package br.unitins.webgyn.validation;

import br.unitins.webgyn.application.ValidationException;
import br.unitins.webgyn.model.Mensalidade;

public class MensalidadeValidation implements Validation<Mensalidade> {

	@Override
	public void validate(Mensalidade t) throws ValidationException {
		if (t.getAluno() == null || t.getAluno().getNome().trim().equals("")) {

			throw new ValidationException("O Nome do Aluno n�o pode ser vazio");
		}
		if (t.getValor() == 0) {

			throw new ValidationException("O Valor n�o pode ser vazio");
		}

		if (t.getMes() == null || t.getMes().trim().equals("")) {

			throw new ValidationException("O Mes n�o pode ser vazio");
		}
		
		if (t.getAno() == null || t.getAno().trim().equals("")) {

			throw new ValidationException("O Ano  n�o pode ser vazio");
		}

	}

}
