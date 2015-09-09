<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
	
	<jsp:include page="menu.jsp"></jsp:include>

    <div class="container">

      <div class="starter-template">
        <h1>Sistema de Folha de Pagamento</h1>
        <p class="lead">Olá alunos do curso de ADS, sejam bem vindos ao sistema de folha de pagamento Online. <br> Vocês são os primeiros alunos do curso a ver Java Web no segundo semestre!</p>
      </div>
	
	  <img class="img-responsive center-block" src="${pageContext.request.contextPath}/images/meme.png"/> 
		
    </div>
   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap/dist/js/bootstrap.min.js"></script> 
       
  </body>

</body>
</html>