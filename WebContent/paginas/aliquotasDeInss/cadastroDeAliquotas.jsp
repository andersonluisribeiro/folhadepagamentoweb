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

		<form role="form" action="${pageContext.request.contextPath}/CadastrarAliquotaDeInss" method="post">
			<div class="row">
				<div class="col-md-6">
					<label for="id">ID</label> <input type="text" class="form-control" name="id" id="id" placeholder="Código da alíquota">
				</div>
				<div class="col-md-6">
					<label for="tabela">Tabela</label> <select class="form-control" id="tabela" name="tabela">
						<option>Selecione</option>
						<jsp:useBean id="dao" class="br.edu.unifeob.app.daos.TabelaDeInssDAO" />
						<c:forEach var="tabela" items="${dao.lista}">
							<option value="${tabela.id}">${tabela.anoDeVigencia}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<br>
			
			<div class="row">
				<div class="col-md-6">
					<label for="salarioInicial">Salário Inicial</label> <input type="text" class="form-control" name="salarioInicial" id="salarioInicial" placeholder="Salário inicial da alíquota">
				</div>
				<div class="col-md-6">
					<label for="salarioFinal">Salário Final</label> <input type="text" class="form-control" name="salarioFinal" id="salarioFinal" placeholder="Salário final da alíquota">
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-md-6">
					<label for="valor">Valor</label> <input type="text" class="form-control" name="valor" id="valor" placeholder="Valor da alíquota">
				</div>
				<div class="col-md-6">
					<label for="valorFixo">Valor fixo</label> <input type="text" class="form-control" name="valorFixo" id="valorFixo" placeholder="Valor fixo da alíquota">
				</div>
			</div>
			<br>
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