<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Folha de Pagamento Web</title>
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/bootstrap/starter-template.css" rel="stylesheet">
</head>
<body>

	<jsp:include page="../../menu.jsp"></jsp:include>

	<div class="container">

		<div class="jumbotron">
			<div class="container">
				<h2>Lista de Folhas</h2>
				<p>Ralação das folhas de pagamento de todos os colaboradores da empresa.</p>
				<p>
					<a class="btn btn-primary btn-lg" href="#" role="button">Veja a documentação &raquo;</a>
				</p>
			</div>
		</div>

		<form role="form" action="${pageContext.request.contextPath}/CadastrarFolha" method="post">
			
			<fmt:setLocale value="pt_BR"/>
			
			<div class="row">
				<div class="col-md-4">
					<label for="id">ID</label> <input type="text" class="form-control" name="id" id="id" placeholder="Código da folha" value="${folha.id}">
				</div>
				<div class="col-md-4">
					<label for="mes">Mês</label> <input type="text" class="form-control" name="mes" id="mes" placeholder="Mês da folha" value="${folha.mes}">
				</div>
				<div class="col-md-4">
					<label for="ano">Ano</label> <input type="text" class="form-control" name="ano" id="ano" placeholder="Ano da folha" value="${folha.ano}">
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-md-4">
					<label for="empregado">Empregado</label> <select id="empregadoId" name="empregadoId" class="form-control">
						<option>Selecione</option>
						<jsp:useBean id="empregadoDAO" class="br.edu.unifeob.app.daos.EmpregadoDAO" />
						<c:forEach var="empregado" items="${empregadoDAO.lista}">
							<option value="${empregado.id}">${empregado.nome}</option>s
						</c:forEach>
					</select>
				</div>
				<div class="col-md-4">
					<label for="tabelaDeInss">Tabela de INSS</label> <select id="tabelaDeInss" name="tabelaDeInss" class="form-control">
						<option>Selecione</option>
						<jsp:useBean id="tabelaDeInssDAO" class="br.edu.unifeob.app.daos.TabelaDeInssDAO" />
						<c:forEach var="tabelaDeInss" items="${tabelaDeInssDAO.lista}">
							<option value="${tabelaDeInss.id}">${tabelaDeInss.anoDeVigencia}</option>s
						</c:forEach>
					</select>
				</div>
				<div class="col-md-4">
					<label for="tabelaDeIrrf">Tabela de IRRF</label> <select id="tabelaDeIrrf" name="tabelaDeIrrf" class="form-control">
						<option>Selecione</option>
						<jsp:useBean id="tabelaDeIrrfDAO" class="br.edu.unifeob.app.daos.TabelaDeIrrfDAO" />
						<c:forEach var="tabelaDeIrrf" items="${tabelaDeIrrfDAO.lista}">
							<option value="${tabelaDeIrrf.id}">${tabelaDeIrrf.anoDeVigencia}</option>s
						</c:forEach>
					</select>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-md-4">
					<label for="salarioMinimo">Salário Mínimo</label> <select id="salarioMinimo" name="salarioMinimo" class="form-control">
						<option>Selecione</option>
						<jsp:useBean id="salarioMinimoDAO" class="br.edu.unifeob.app.daos.SalarioMinimoDAO" />
						<c:forEach var="salarioMinimo" items="${salarioMinimoDAO.lista}">
							<option value="${salarioMinimo.id}">${salarioMinimo.anoDeVigencia}</option>s
						</c:forEach>
					</select>
				</div>
				<div class="col-md-4">
					<label for="adiantamento">Adiatamento</label> <input type="text" class="form-control" name="adiantamento" id="adiantamento" placeholder="Adiantamento do empregado" value="${folha.adiantamento}">
				</div>
				<div class="col-md-4">					
					<label for="impostoDeRenda">R$ IRRF</label> <input type="text" disabled="disabled" class="form-control" name="irrf" id="irrf" placeholder="IRRF do empregado" value="<fmt:formatNumber value="${irrf}" type="number" maxFractionDigits="2"/>">
				</div>
			</div>


			<div class="form-group" style="padding: 15px">
				<button type="submit" class="btn btn-primary btn-lg active" id="saveButton">Salvar</button>
			</div>

		</form>

	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap/dist/js/bootstrap.min.js"></script>

</body>

</body>
</html>