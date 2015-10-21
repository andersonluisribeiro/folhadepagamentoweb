package br.edu.unifeob.app.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.SalarioMinimoDAO;
import br.edu.unifeob.app.models.SalarioMinimo;


@WebServlet("/AlterarSalarioMinimo")
public class AlterarSalarioMinimo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		Integer anoDeVigencia = Integer.parseInt(request.getParameter("anoDeVigencia"));
		Double valor = Double.parseDouble(request.getParameter("valor"));
		
		SalarioMinimo salarioMinimo = new SalarioMinimoDAO().encontrarPorId(id);
		salarioMinimo.setAnoDeVigencia(anoDeVigencia);
		salarioMinimo.setValor(valor);
		
		response.sendRedirect(request.getContextPath()+"/paginas/salarioMinimo/listaDeSalarios.jsp");
	}

}
