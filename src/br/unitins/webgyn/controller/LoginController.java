package br.unitins.webgyn.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.webgyn.application.Util;
import br.unitins.webgyn.factory.JPAFactory;
import br.unitins.webgyn.model.Instrutor;
import br.unitins.webgyn.repository.InstrutorRepository;

@Named
@RequestScoped
public class LoginController extends DefaultController {

	private static final long serialVersionUID = -2482810615603773001L;
	
	private Instrutor usuario;
	
	public String entrar() {
		InstrutorRepository repository = 
				new InstrutorRepository(JPAFactory.getEntityManager());
		Instrutor usuarioValidado = repository
				.getInstrutor(getUsuario().getLogin(), getUsuario().getSenha());
		
		if (usuarioValidado == null) {
			Util.addErroMessage("Usuario ou Senha inválido.");
			return null;
		}
		// setando o usuario na sessao
		setUsuarioLogado(usuarioValidado);
		
		Util.redirect("pages/cadastroinstrutor.xhtml");
		return "";
	}

	public Instrutor getUsuario() {
		if (usuario == null)
			usuario = new Instrutor();
		return usuario;
	}

	public void setUsuario(Instrutor usuario) {
		this.usuario = usuario;
	}
	

}
