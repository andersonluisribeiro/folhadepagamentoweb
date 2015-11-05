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
				<h2>Cadastro de Tabelas de IRRF</h2>
				<p>Cadastro de todas as tabelas de IRRF do sistema. Todas as tabelas são utilizadas na folha de pagamento.</p>
				<p>
					<a class="btn btn-primary btn-lg" href="#" role="button">Veja a documentação &raquo;</a>
				</p>
			</div>
		</div>

		<form role="form" action="${pageContext.request.contextPath}/CadastrarTabelaDeIrrf" method="post">
			<div class="form-group">
				<label for="id">ID</label> <input type="text" class="form-control" name="id" id="id" placeholder="Código da tabela">
			</div>
			<div class="form-group">
				<label for="anoDeVigencia">Ano de vigência</label> <input type="text" class="form-control" name="anoDeVigencia" id="anoDeVigencia" placeholder="Ano de vigência da tabela">
			</div>
			<div class="form-group">
				<label for="valorPorDependente">Valor por dependente</label> <input type="text" class="form-control" name="valorPorDependente" id="valorPorDependente" placeholder="Valor por dependente da tabela">
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