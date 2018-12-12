package br.unitins.webgyn.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.unitins.webgyn.model.Instrutor;;

@WebFilter(filterName="securityFilter", urlPatterns ="/pages/*")
public class SecurityFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		
		// imprime o endereco da pagina solicitada
		System.out.println(servletRequest.getRequestURI());
		
		
		HttpSession session = servletRequest.getSession(false);
		Instrutor usuario = null;
		
		if (session != null)
			usuario = (Instrutor) session.getAttribute("usuarioLogado");
													  
		if (usuario == null) {
			((HttpServletResponse) response).sendRedirect("/WebGym/login.xhtml"); 
		} else {
			String endereco = servletRequest.getRequestURI();
			for (String pagina : usuario.getTipoUsuario().getPages()) {
				if (endereco.contains(pagina)) {
					chain.doFilter(request, response);
					return;
				}
			}
			
			((HttpServletResponse) response).sendRedirect("/WebGym/sempermissao.xhtml");
		}
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
		
		System.out.println("\n\n\n\n\n iniciou o Security Filter \n\n\n\n\n\n");
	}
	

}
