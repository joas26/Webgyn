package br.unitins.webgyn.validation;

import br.unitins.webgyn.application.ValidationException;
import br.unitins.webgyn.model.Instrutor;

public class InstrutorValidation implements Validation<Instrutor> {

	@Override
	public void validate(Instrutor t) throws ValidationException {
		if (t.getPessoaFisica() == null || t.getPessoaFisica().getNome().trim().equals("")) {

			throw new ValidationException("O Nome do Instrutor n�o pode ser vazio");
		}

		if (t.getSenha() == null || t.getSenha().trim().equals("")) {

			throw new ValidationException("O Campo  senha n�o pode ser vazio");
		}

		if (t.getTipoUsuario() == null || t.getTipoUsuario().equals("")) {

			throw new ValidationException("O Campo  senha n�o pode ser vazio");
		}
		
		if (t.getLogin() == null || t.getLogin().trim().equals("")) {

			throw new ValidationException("O Campo  login n�o pode ser vazio");
		}

	}

}
