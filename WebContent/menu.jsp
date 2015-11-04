<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Folha de Pagamento</a>
		</div>
		
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="${pageContext.request.contextPath}/paginas/empregados/listaDeEmpregados.jsp">Empregados</a></li>
				<li><a href="${pageContext.request.contextPath}/paginas/cargos/listaDeCargos.jsp">Cargos</a></li>
				<li><a href="${pageContext.request.contextPath}/paginas/salarioMinimo/listaDeSalarios.jsp">Salário Mínimo</a></li>
				<li><a href="${pageContext.request.contextPath}/paginas/tabelasDeInss/listaDeTabelas.jsp">Tabela de INSS</a></li>
				<li><a href="${pageContext.request.contextPath}/paginas/aliquotasDeInss/listaDeAliquotas.jsp">Alíquota de INSS</a></li>
				<li><a href="${pageContext.request.contextPath}/paginas/tabelasDeIrrf/listaDeTabelas.jsp">Tabela de IRRF</a></li>
				<li><a href="#contact">Folha</a></li>
			</ul>
		</div>
	</div>
</nav>
