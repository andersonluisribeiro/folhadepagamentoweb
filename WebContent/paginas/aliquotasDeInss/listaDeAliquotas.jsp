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
				<h2>Cadastro de Aliquotas de INSS</h2>
				<p>Cadastro de todas as aliquitas de INSS. Todas as alíquotas são utilizadas no lançamento da folha.</p>
				<p>
					<a class="btn btn-primary btn-lg" href="#" role="button">Veja a documentação &raquo;</a>
				</p>
			</div>
		</div>

		<table class="table">
			<tr>
				<th style="width: 10%">Id</th>
				<th style="width: 20%">Salário Inicial</th>
				<th style="width: 20%">Salário Final</th>
				<th style="width: 15%">Valor</th>
				<th style="width: 15%">Valor Fixo</th>
				<th style="width: 10%" class="button-column">Editar</th>
				<th style="width: 10%" class="button-column">Excluir</th>
			</tr>

			<jsp:useBean id="dao" class="br.edu.unifeob.app.daos.AliquotaDeInssDAO" />

			<c:forEach var="aliquota" items="${dao.lista}">
				<tr>
					<td>${aliquota.id}</td>
					<td>${aliquota.salarioInicial}</td>
					<td>${aliquota.salarioFinal}</td>
					<td>${aliquota.valor}</td>
					<td>${aliquota.valorFixo}</td>
					<td class="button-column">
						<a class="btn btn-default btn-lg" href="${pageContext.request.contextPath}/EditarAliquotaDeInss?id=${aliquota.id}"><span class="glyphicon glyphicon-edit"></span></a>
					</td>
					<td class="button-column">						
						<form action="${pageContext.request.contextPath}/ExcluirAliquotaDeInss">
							<button type="submit" class="btn btn-default btn-lg">
								<span class="glyphicon glyphicon-remove-circle"></span>
							</button>
							<input type="hidden" name="id" value="${aliquota.id}" />
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>

		<a href="${pageContext.request.contextPath}/paginas/aliquotasDeInss/cadastroDeAliquotas.jsp" class="btn btn-primary btn-lg active">Nova</a>

	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap/dist/js/bootstrap.min.js"></script>

</body>

</body>
</html>