package br.edu.unifeob.app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.CargoDAO;
import br.edu.unifeob.app.daos.EmpregadoDAO;
import br.edu.unifeob.app.daos.FolhaDePagamentoDAO;
import br.edu.unifeob.app.models.Cargo;
import br.edu.unifeob.app.models.Empregado;
import br.edu.unifeob.app.models.FolhaDePagamento;


@WebServlet("/EditarFolha")
public class EditarFolha extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		Long id = Long.parseLong(request.getParameter("id"));		
		FolhaDePagamento folha = new FolhaDePagamentoDAO().encontrarPorId(id);
		
		request.setAttribute("folha", folha);
		request.setAttribute("irrf", folha.impostoDeRenda());
		request.getRequestDispatcher("/paginas/folha/edicaoDeFolha.jsp").forward(request, response);
		
	}

}
