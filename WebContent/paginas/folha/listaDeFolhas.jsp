<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
				<p>Ralação das folhas de pagamento de todos os colaboradores da empresa. </p>
				<p>
					<a class="btn btn-primary btn-lg" href="#" role="button">Veja a documentação &raquo;</a>
				</p>
			</div>
		</div>

		<table class="table">
			<tr>
				<th style="width: 10%">Id</th>
				<th style="width: 10%">Mês</th>
				<th style="width: 10%">Ano</th>
				<th style="width: 50%">Empregado</th>
				<th style="width: 10%" class="button-column">Editar</th>
				<th style="width: 10%" class="button-column">Excluir</th>
			</tr>

			<jsp:useBean id="dao" class="br.edu.unifeob.app.daos.FolhaDePagamentoDAO" />

			<c:forEach var="folha" items="${dao.lista}">
				<tr>
					<td>${folha.id}</td>					
					<td>${folha.mes}</td>
					<td>${folha.ano}</td>
					<td>${folha.empregado.nome}</td>
					<td class="button-column">
						<a class="btn btn-default btn-lg" href="${pageContext.request.contextPath}/EditarFolha?id=${folha.id}"><span class="glyphicon glyphicon-edit"></span></a>
					</td>
					<td class="button-column">						
						<form action="${pageContext.request.contextPath}/ExcluirFolha">
							<button type="submit" class="btn btn-default btn-lg">
								<span class="glyphicon glyphicon-remove-circle"></span>
							</button>
							<input type="hidden" name="id" value="${folha.id}" />
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>

		<a href="${pageContext.request.contextPath}/paginas/folha/lancamento.jsp" class="btn btn-primary btn-lg active">Novo</a>

	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap/dist/js/bootstrap.min.js"></script>

</body>

</body>
</html>