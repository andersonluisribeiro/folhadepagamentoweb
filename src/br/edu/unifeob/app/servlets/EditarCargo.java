package br.edu.unifeob.app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.CargoDAO;
import br.edu.unifeob.app.models.Cargo;


@WebServlet("/EditarCargo")
public class EditarCargo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		Long id = Long.parseLong(request.getParameter("id"));
		CargoDAO dao = new CargoDAO();
		Cargo cargo = dao.encontrarPorId(id);
		
		request.setAttribute("cargo", cargo);
		request.getRequestDispatcher("/paginas/cargos/edicaoDeCargo.jsp").forward(request, response);
		
	}

}
