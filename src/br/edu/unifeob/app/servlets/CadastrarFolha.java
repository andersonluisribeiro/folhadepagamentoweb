package br.edu.unifeob.app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unifeob.app.daos.EmpregadoDAO;
import br.edu.unifeob.app.daos.FolhaDePagamentoDAO;
import br.edu.unifeob.app.daos.SalarioMinimoDAO;
import br.edu.unifeob.app.daos.TabelaDeInssDAO;
import br.edu.unifeob.app.daos.TabelaDeIrrfDAO;
import br.edu.unifeob.app.models.FolhaDePagamento;


@WebServlet("/CadastrarFolha")
public class CadastrarFolha extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		Integer ano = Integer.parseInt(request.getParameter("ano"));
		Integer mes = Integer.parseInt(request.getParameter("mes"));		
		Long empregadoId = Long.parseLong(request.getParameter("empregadoId"));
		Long tabelaDeInssId = Long.parseLong(request.getParameter("tabelaDeInss"));
		Long tabelaDeIrrfId = Long.parseLong(request.getParameter("tabelaDeIrrf"));
		Long salarioMinimoId = Long.parseLong(request.getParameter("salarioMinimo"));
		Double adiantamento = Double.parseDouble(request.getParameter("adiantamento"));
		
		FolhaDePagamento folha = new FolhaDePagamento();
		folha.setId(id);
		folha.setAno(ano);
		folha.setMes(mes);
		folha.setEmpregado(new EmpregadoDAO().encontrarPorId(empregadoId));
		folha.setTabelaDeInss(new TabelaDeInssDAO().encontrarPorId(tabelaDeInssId));
		folha.setTabelaDeIRRF(new TabelaDeIrrfDAO().encontrarPorId(tabelaDeIrrfId));
		folha.setSalarioMinimo(new SalarioMinimoDAO().encontrarPorId(salarioMinimoId));
		folha.setAdiantamento(adiantamento);
		
		new FolhaDePagamentoDAO().salvar(folha);
		
		response.sendRedirect(request.getContextPath() + "/paginas/folha/listaDeFolhas.jsp");
	
	}


}
