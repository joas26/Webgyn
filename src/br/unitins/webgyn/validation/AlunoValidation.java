package br.unitins.webgyn.validation;

import br.unitins.webgyn.application.ValidationException;
import br.unitins.webgyn.model.Aluno;

public class AlunoValidation implements Validation<Aluno>{

	@Override
	public void validate(Aluno t) throws ValidationException {
		if(t.getPessoaFisica() == null || t.getPessoaFisica().getNome().trim().equals("") ) {
			
			throw new ValidationException("O Nome do Aluno não pode ser vazio");
		}
		
		if(t.getMatricula() == null || t.getMatricula().trim().equals("") ) {
			
			throw new ValidationException("O Nome da matricula não pode ser vazio");
		}
		
		
	}

}
