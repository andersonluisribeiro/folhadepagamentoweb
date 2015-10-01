package br.edu.unifeob.app.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.CategoriaDAO;
import br.edu.unifeob.app.models.Categoria;


@WebServlet("/ExcluirCategoria")
public class ExcluirCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ExcluirCategoria() {
        super();       
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		
		Categoria categoria = new Categoria();
		categoria.setId(id);
		
		CategoriaDAO dao = new CategoriaDAO();
		dao.deletar(categoria);
		
		response.sendRedirect(request.getContextPath() + "/paginas/categorias/listarCategorias.jsp");
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}
