package br.unitins.webgyn.controller;

import java.io.Serializable;

import br.unitins.webgyn.application.Session;
import br.unitins.webgyn.application.Util;
import br.unitins.webgyn.model.Instrutor;

public class DefaultController implements Serializable {

	private static final long serialVersionUID = 1007297527954376818L;
	private static final String userKey = "usuarioLogado";
	
	public Instrutor getUsuarioLogado() {
		return (Instrutor) Session.getInstance().getAttribute(userKey);
	}

	public void setUsuarioLogado(Instrutor usuario) {
		Session.getInstance().setAttribute(userKey, usuario);
	}
	
	public void encerrarSessao() {
		Session.getInstance().invalidateSession();
		Util.redirect("login.xhtml");
	}
	
}
