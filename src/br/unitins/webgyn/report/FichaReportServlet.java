package br.unitins.webgyn.report;

import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.servlet.annotation.WebServlet;

import br.unitins.webgyn.factory.JPAFactory;

@WebServlet("/FichaReport")
public class FichaReportServlet extends ReportServlet {

	@Override
	public String getArquivoJasper() {
		return "FichaParametrizada1.jasper";
	}

	@Override
	public HashMap<String, Class<?>> getParametros() {
		HashMap<String, Class<?>> param = new HashMap<String, Class<?>>();
		param.put("NomeAluno", String.class);
		
		return param;
	}

	@Override
	public EntityManager getEntityManager() {
		return JPAFactory.getEntityManager();
	}

}