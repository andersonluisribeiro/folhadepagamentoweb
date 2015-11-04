package br.edu.unifeob.app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.TabelaDeInssDAO;
import br.edu.unifeob.app.models.TabelaDeInss;


@WebServlet("/EditarTabelaDeInss")
public class EditarTabelaDeInss extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		Long id = Long.parseLong(request.getParameter("id"));		
		TabelaDeInss tabela = new TabelaDeInssDAO().encontrarPorId(id);
		
		request.setAttribute("tabela", tabela);
		request.getRequestDispatcher("/paginas/tabelasDeInss/edicaoDeTabela.jsp").forward(request, response);
		
	}

}
