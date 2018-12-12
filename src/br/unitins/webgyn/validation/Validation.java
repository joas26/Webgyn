package br.unitins.webgyn.validation;

import br.unitins.webgyn.application.ValidationException;

public interface Validation<T> {
	public void validate(T t) throws ValidationException;
}