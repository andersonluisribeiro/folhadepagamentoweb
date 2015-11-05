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
				<h2>Cadastro de Empregados</h2>
				<p>Cadastro de todos os empregados do sistema. Todos os empregados são utilizados no lançamento da folha.</p>
				<p>
					<a class="btn btn-primary btn-lg" href="#" role="button">Veja a documentação &raquo;</a>
				</p>
			</div>
		</div>

		<form role="form" action="${pageContext.request.contextPath}/AlterarEmpregado" method="post">

			<div class="row">
				<div class="col-md-4">
					<label for="id">ID</label> <input type="text" class="form-control" name="id" id="id" placeholder="Código do empregado" value="${empregado.id}">
				</div>
				<div class="col-md-4">
					<label for="matricula">Matrícula</label> <input type="text" class="form-control" name="matricula" id="matricula" placeholder="Matrícula do empregado" value="${empregado.matricula}">
				</div>				
				<div class="col-md-4">
					<label for="cpf">CPF</label> <input type="text" class="form-control" name="cpf" id="cpf" placeholder="CPF do empregado" value="${empregado.cpf}">
				</div>				
			</div>
			<br>
			<div class="row">
				<div class="col-md-6">
					<label for="cargo">Cargo</label> <select id="cargoId" name="cargoId" class="form-control">
						<option>Selecione</option>
						<jsp:useBean id="dao" class="br.edu.unifeob.app.daos.CargoDAO" />
						<c:forEach var="cargo" items="${dao.lista}">
							<option <c:if test="${cargo.id eq empregado.cargo.id}">selected</c:if> value="${cargo.id}">${cargo.descricao}</option>s
						</c:forEach>
					</select>
				</div>
				<div class="col-md-6">
					<label for="quantidadeDeDependentes">Quantidade de dependentes</label> <input type="text" class="form-control" name="quantidadeDeDependentes" id="quantidadeDeDependentes" placeholder="Quantidade de dependentes" value="${empregado.quantidadeDeDependentes}" >
				</div>
			</div>
			<br>
			<div class="form-group">
				<label for="nome">Nome</label> <input type="text" class="form-control" name="nome" id="nome" placeholder="Nome do empregado" value="${empregado.nome}">
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