package br.edu.unifeob.app.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.AliquotaDeInssDAO;
import br.edu.unifeob.app.daos.CargoDAO;
import br.edu.unifeob.app.daos.TabelaDeInssDAO;
import br.edu.unifeob.app.models.AliquotaDeINSS;
import br.edu.unifeob.app.models.Cargo;
import br.edu.unifeob.app.models.TabelaDeInss;


@WebServlet("/CadastrarAliquotaDeInss")
public class CadastrarAliquotaDeInss extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		Long tabelaId = Long.parseLong(request.getParameter("tabela"));		
		Double salarioInicial = Double.parseDouble(request.getParameter("salarioInicial"));
		Double salarioFinal = Double.parseDouble(request.getParameter("salarioFinal"));
		Double valor = Double.parseDouble(request.getParameter("valor"));
		Double valorFixo = request.getParameter("valorFixo") == null || request.getParameter("valorFixo").isEmpty() ?  null : Double.parseDouble(request.getParameter("valorFixo"));
		
		AliquotaDeINSS aliquota = new AliquotaDeINSS(id, salarioInicial, salarioFinal, valor, valorFixo);
		TabelaDeInss tabela = new TabelaDeInssDAO().encontrarPorId(tabelaId);
		tabela.getAliquotas().add(aliquota);
		new AliquotaDeInssDAO().salvar(aliquota);
		
		response.sendRedirect(request.getContextPath() + "/paginas/aliquotasDeInss/listaDeAliquotas.jsp");
	
	}


}
