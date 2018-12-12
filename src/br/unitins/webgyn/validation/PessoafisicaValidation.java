package br.unitins.webgyn.validation;

import br.unitins.webgyn.application.ValidationException;
import br.unitins.webgyn.model.PessoaFisica;

public class PessoafisicaValidation implements Validation<PessoaFisica>{

	@Override
	public void validate(PessoaFisica t) throws ValidationException {
		if(t.getCpf() == null || t.getCpf().trim().equals("") ) {
			
			throw new ValidationException("O CPF não pode ser vazio");
		}
		
			if(t.getNome() == null || t.getNome().trim().equals("") ) {
			
			throw new ValidationException("O Nome não pode ser vazio");
		}
				
	}


}
