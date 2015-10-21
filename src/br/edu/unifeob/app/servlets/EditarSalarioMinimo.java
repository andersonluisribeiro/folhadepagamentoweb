package br.edu.unifeob.app.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.SalarioMinimoDAO;
import br.edu.unifeob.app.models.SalarioMinimo;


@WebServlet("/EditarSalarioMinimo")
public class EditarSalarioMinimo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	       	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		
		SalarioMinimo salarioMinimo = new SalarioMinimoDAO().encontrarPorId(id);
		
		request.setAttribute("salario", salarioMinimo);
		request.getRequestDispatcher("/paginas/salarioMinimo/edicaoDeSalario.jsp").forward(request, response);
			
	}	
	

}
