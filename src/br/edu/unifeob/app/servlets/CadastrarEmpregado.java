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


@WebServlet("/CadastrarEmpregado")
public class CadastrarEmpregado extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		String matricula = request.getParameter("matricula");
		String nome =request.getParameter("nome");
		String cpf =request.getParameter("cpf");
		Integer quantidadeDeDependentes = Integer.parseInt(request.getParameter("quantidadeDeDependentes"));
		
		Long cargoId = Long.parseLong(request.getParameter("cargoId"));
		Cargo cargo = new CargoDAO().encontrarPorId(cargoId);
		
		Empregado empregado = new Empregado(id, matricula, nome, cpf, cargo, quantidadeDeDependentes);
		
		new EmpregadoDAO().salvar(empregado);		
		
		response.sendRedirect(request.getContextPath() + "/paginas/empregados/listaDeEmpregados.jsp");
	
	}


}
