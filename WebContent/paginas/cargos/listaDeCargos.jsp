<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/bootstrap/starter-template.css" rel="stylesheet">
</head>
<body>

	<jsp:include page="../../menu.jsp"></jsp:include>

	<div class="container">

		<div class="jumbotron">
			<div class="container">
				<h2>Cadastro de Cargos</h2>
				<p>Cadastro de todos os cargos do sistema. Todos os cargos são utilizados no cadastro dos funcionários.</p>
				<p>
					<a class="btn btn-primary btn-lg" href="#" role="button">Veja a documentação &raquo;</a>
				</p>
			</div>
		</div>

		<table class="table">
			<tr>
				<th style="width: 10%">Id</th>
				<th style="width: 80%">Descrição</th>
				<th style="width: 80%">Salário Base</th>
				<th style="width: 80%">Insalubridade</th>
				<th style="width: 10%" class="button-column">Editar</th>
				<th style="width: 10%" class="button-column">Excluir</th>
			</tr>

			<jsp:useBean id="dao" class="br.edu.unifeob.app.daos.CargoDAO" />

			<c:forEach var="cargo" items="${dao.lista}">
				<tr>
					<td>${cargo.id}</td>
					<td>${cargo.descricao}</td>
					<td>${cargo.salarioBase}</td>
					<td>${cargo.nivelDeInsalubridade}</td>
					<td class="button-column">
						<form action="${pageContext.request.contextPath}/EditarCargo">
							<button type="submit" class="btn btn-default btn-lg">
								<span class="glyphicon glyphicon-edit"></span>
							</button>
							<input type="hidden" name="id" value="${cargo.id}" />
						</form>
					</td>
					<td class="button-column">
						<form action="${pageContext.request.contextPath}/ExcluirCargo">
							<button type="submit" class="btn btn-default btn-lg">
								<span class="glyphicon glyphicon-remove-circle"></span>
							</button>
							<input type="hidden" name="id" value="${cargo.id}" />
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>

		<a href="${pageContext.request.contextPath}/paginas/cargos/cadastroDeCargos.jsp" class="btn btn-primary btn-lg active">Novo</a>

	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap/dist/js/bootstrap.min.js"></script>

</body>

</body>
</html>