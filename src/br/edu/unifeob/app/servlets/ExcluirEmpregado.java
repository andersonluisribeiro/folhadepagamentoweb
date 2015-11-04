package br.edu.unifeob.app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.EmpregadoDAO;
import br.edu.unifeob.app.models.Empregado;


@WebServlet("/ExcluirEmpregado")
public class ExcluirEmpregado extends HttpServlet {
	private static final long serialVersionUID = 1L;     
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));		
		
		EmpregadoDAO dao = new EmpregadoDAO();
		Empregado empregado = dao.encontrarPorId(id);
		dao.deletar(empregado);
		
		response.sendRedirect(request.getContextPath() + "/paginas/empregados/listaDeEmpregados.jsp");
	}
	

}
