package br.edu.unifeob.app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.TabelaDeIrrfDAO;
import br.edu.unifeob.app.models.TabelaDeIRRF;


@WebServlet("/ExcluirTabelaDeIrrf")
public class ExcluirTabelaDeIrrf extends HttpServlet {
	private static final long serialVersionUID = 1L;     
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));		
		
		TabelaDeIrrfDAO dao = new TabelaDeIrrfDAO();
		TabelaDeIRRF tabela = dao.encontrarPorId(id);
		dao.deletar(tabela);
		
		response.sendRedirect(request.getContextPath() + "/paginas/tabelasDeIrrf/listaDeTabelas.jsp");
	}
	

}
