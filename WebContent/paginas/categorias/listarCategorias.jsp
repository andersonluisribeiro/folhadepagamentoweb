<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Editar</th>
			<th>Excluir</th>
		</tr>
		
		<jsp:useBean id="dao" class="br.edu.unifeob.app.daos.CategoriaDAO"/>
		
		<c:forEach items="${dao.lista}" var="categoria">
			<tr>
				<td>${categoria.id}</td>
				<td>${categoria.nome}</td>
				<td><a href="${pageContext.request.contextPath}/EditarCategoria?id=${categoria.id}">Editar</a></td>
				<td><a href="${pageContext.request.contextPath}/ExcluirCategoria?id=${categoria.id}">Excluir</a></td>
				<td></td>
			</tr>		
		</c:forEach>
		
		
	</table>
</body>
</html>