package br.edu.unifeob.app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.CargoDAO;
import br.edu.unifeob.app.daos.EmpregadoDAO;
import br.edu.unifeob.app.models.Cargo;
import br.edu.unifeob.app.models.Empregado;


@WebServlet("/EditarEmpregado")
public class EditarEmpregado extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		Long id = Long.parseLong(request.getParameter("id"));		
		Empregado empregado = new EmpregadoDAO().encontrarPorId(id);
		
		request.setAttribute("empregado", empregado);
		request.getRequestDispatcher("/paginas/empregados/edicaoDeEmpregados.jsp").forward(request, response);
		
	}

}
