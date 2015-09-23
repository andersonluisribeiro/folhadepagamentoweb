package br.edu.unifeob.app.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.CargoDAO;
import br.edu.unifeob.app.models.Cargo;


@WebServlet("/ExcluirCargo")
public class ExcluirCargo extends HttpServlet {
	private static final long serialVersionUID = 1L;       
   
    public ExcluirCargo() {
        super();
    }
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		Cargo cargo = new Cargo();
		cargo.setId(id);
		
		CargoDAO dao = new CargoDAO();
		dao.deletar(cargo);
		
		response.sendRedirect(request.getContextPath() + "/paginas/cargos/listaDeCargos.jsp");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
