package br.edu.unifeob.app.servlets;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.SalarioMinimoDAO;
import br.edu.unifeob.app.models.SalarioMinimo;


@WebServlet("/CadastrarSalarioMinimo")
public class CadastrarSalarioMinimo extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;    
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		Integer anoDeVigencia = Integer.parseInt(request.getParameter("anoDeVigencia"));
		Double valor = Double.parseDouble(request.getParameter("valor"));
		
		SalarioMinimo salarioMinimo = new SalarioMinimo(id, anoDeVigencia, valor);
		
		SalarioMinimoDAO dao = new SalarioMinimoDAO();
		dao.salvar(salarioMinimo);
		
		response.sendRedirect(request.getContextPath() + "/paginas/salarioMinimo/listaDeSalarios.jsp");
		
	}

}
