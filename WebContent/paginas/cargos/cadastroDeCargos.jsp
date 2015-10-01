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

		<form role="form" action="${pageContext.request.contextPath}/CadastrarCargo" method="post">
			<div class="form-group">
				<label for="id">ID</label> <input type="text" class="form-control" name="id" id="id" placeholder="Código do Cargo">
			</div>
			<div class="form-group">
				<label for="descricao">Descrição</label> <input type="text" class="form-control" name="descricao" id="descricao" placeholder="Descrição do cargo">
			</div>			
			<div class="form-group">
				<label for="descricao">Salário base</label> <input type="text" class="form-control" name="salarioBase" id="salarioBase" placeholder="Salário base do cargo">
			</div>
			<div class="form-group">
				<label for="descricao">Nível de insalubridade</label> <input type="text" class="form-control" name="nivelDeInsalubridade" id="nivelDeInsalubridade" placeholder="Nível de insalubridade do cargo">
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