package br.edu.unifeob.app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.CargoDAO;
import br.edu.unifeob.app.models.Cargo;


@WebServlet("/AlterarCargo")
public class AlterarCargo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		String descricao = request.getParameter("descricao");
		Double salarioBase = Double.parseDouble(request.getParameter("salarioBase"));
		Double nivelDeInsalubridade = Double.parseDouble(request.getParameter("nivelDeInsalubridade"));

		Cargo cargo = new CargoDAO().encontrarPorId(id);
		cargo.setDescricao(descricao);
		cargo.setSalarioBase(salarioBase);
		cargo.setNivelDeInsalubridade(nivelDeInsalubridade);
		
		response.sendRedirect(request.getContextPath() + "/paginas/cargos/listaDeCargos.jsp");
	
	}

}
