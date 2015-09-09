<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/bootstrap/starter-template.css" rel="stylesheet">
</head>
<body>

	<jsp:include page="menu.jsp"></jsp:include>

	<div class="container">

		<div class="jumbotron">
			<div class="container">
				<h2>Cadastro de Cargos</h2>
				<p>Cadastro de todos os cargos do sistema. Todos os cargos são
					utilizados no cadastro dos funcionários.</p>
				<p>
					<a class="btn btn-primary btn-lg" href="#" role="button">Veja a
						documentação &raquo;</a>
				</p>
			</div>
		</div>

		<table class="table">
			<tr>
				<th style="width: 10%">Id</th>
				<th style="width: 80%">Nome</th>
				<th style="width: 10%" class="button-column">Editar</th>
				<th style="width: 10%" class="button-column">Excluir</th>
			</tr>
			<tr>
				<td>1</td>
				<td>Analista de Sistemas Júnior</td>
				<td class="button-column">
					<form action="edit">
						<button type="submit" class="btn btn-default btn-lg">
							<span class="glyphicon glyphicon-edit"></span>
						</button>
						<input type="hidden" name="id" value="1" />
					</form>
				</td>
				<td class="button-column">
					<form action="delete">
						<button type="submit" class="btn btn-default btn-lg">
							<span class="glyphicon glyphicon-remove-circle"></span>
						</button>
						<input type="hidden" name="id" value="2" />
					</form>
				</td>
			</tr>
			<tr>
				<td>1</td>
				<td>Analista de Sistemas Sênior</td>
				<td class="button-column">
					<form action="edit">
						<button type="submit" class="btn btn-default btn-lg">
							<span class="glyphicon glyphicon-edit"></span>
						</button>
						<input type="hidden" name="id" value="1" />
					</form>
				</td>
				<td class="button-column">
					<form action="delete">
						<button type="submit" class="btn btn-default btn-lg">
							<span class="glyphicon glyphicon-remove-circle"></span>
						</button>
						<input type="hidden" name="id" value="2" />
					</form>
				</td>
			</tr>

		</table>

	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap/dist/js/bootstrap.min.js"></script>

</body>

</body>
</html>