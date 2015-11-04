package br.edu.unifeob.app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.TabelaDeInssDAO;
import br.edu.unifeob.app.models.TabelaDeInss;


@WebServlet("/CadastrarTabelaDeInss")
public class CadastrarTabelaDeInss extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		Integer anoDeVigencia = Integer.parseInt(request.getParameter("anoDeVigencia"));
		
		TabelaDeInss tabela = new TabelaDeInss(id, anoDeVigencia);
		new TabelaDeInssDAO().salvar(tabela);
		
		response.sendRedirect(request.getContextPath() + "/paginas/tabelasDeInss/listaDeTabelas.jsp");
	
	}


}
