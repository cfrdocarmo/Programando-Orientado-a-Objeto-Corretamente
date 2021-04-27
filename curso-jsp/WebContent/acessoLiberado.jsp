<jsp:useBean id="calcula"  class="beans.BeanCursoJsp" type="beans.BeanCursoJsp" scope="page"/>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:setProperty property="*" name="calcula"/>
	
	<h3>Seja bem vindo ao Sistema em jsp</h3>
	
	
	<a href="salvarUsuario?acao=listarTodos"><img alt="Cadastrar Usuários" src="resources/img/user.jpg"
												  width="150px" height="150px" title="Cadastrar Usuários"	></a>
	
	<a href="salvarProduto?acao=listarTodos"><img alt="Cadastrar Produtos" src="resources/img/carrinhoCompras2.jpg"
												  width="150px" height="150px" title="Cadastrar Produtos"	></a>
												  
												  
	</body>	
</html>
