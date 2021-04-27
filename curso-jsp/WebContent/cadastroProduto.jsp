<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Produtos</title>


<link rel="stylesheet" href="resources/css/cadastro.css">
<link rel="stylesheet" href="resources/css/style.css">


</head>
<body>
<a href="acessoLiberado.jsp">Início</a>
<a href="index.jsp">Sair</a>
	<center>
		<h1>Cadastro de Produtos</h1>
		<h3 style="color: purple;">${msg}</h3>
	</center>



	<form action="salvarProduto" method="post" id="formProduto" onsubmit="return validarCampos() ? true : false">
		<ul class="form-style-1">
			<li>
				<table>
					<tr>
						<td>Código:</td>
						<td><input type="text" readonly="readonly" id="id" name="id"
							value="${produto.id}" class="field-long"></td>
					</tr>


					<tr>
						<td>Nome:</td>
						<td><input type="text" id="nome" name="nome"
							value="${produto.nome}"></td>
					</tr>

					<tr>
						<td>Quantidade:</td>
						<td><input type="text" id="quantidade" name="quantidade"
							value="${produto.quantidade}"></td>
					</tr>

					<tr>
						<td>Valor:</td>
						<td><input type="text" id="valor" name="valor"
							value="${produto.valor}"></td>
					</tr>

					<tr>
						<td></td>
						<td><input type="submit" value="Salvar"><input
							type="submit" value="Cancelar"
							onclick="document.getElementById('formProduto').action = 'salvarProduto?acao=reset'"></td>
				</table>
		</ul>

	</form>

	<form>

		<div>
			<table class="tbl-header">

				<tr>
					<th>Id</th>
					<th>Nome</th>
					<th>Quantidade</th>
					<th>Valor</th>
					<th>Delete</th>
					<th>Editar</th>
				</tr>

				<c:forEach items="${produtos}" var="produto">
					<tr>

						<td style="width: 150px"><c:out value="${produto.id}">
							</c:out></td>
						<td style="width: 150px"><c:out value="${produto.nome}">
							</c:out></td>
						<td style="width: 150px"><c:out value="${produto.quantidade}">
							</c:out></td>
						<td style="width: 150px"><c:out value="${produto.valor}">
							</c:out></td>
						<td><a href="salvarProduto?acao=delete&produto=${produto.id}"><img
								alt="Excluir" src="resources/img/lixeira.png" width="20px"
								height="20px" alt="Excluir" title="Exluir"></a></td>
						<td><a href="salvarProduto?acao=editar&produto=${produto.id}"><img
								alt="Excluir" src="resources/img/editar.png" width="20px"
								height="20px" alt="Editar" title="Editar"></a></td>
					</tr>

				</c:forEach>

			</table>
		</div>
	<script type="text/javascript">
	function validarCampos() {
		if (document.getElementById("nome").value == ''){
			alert('Informe o nome:')
			return false;
		}
		else if (document.getElementById("quantidade").value == ''){
			alert('Informe a quantidade:')
			return false;
		}
		else if (document.getElementById("valor").value == ''){
			alert('Informe o valor:')
			return false;
		}
		
		return true;
	}
	</script>		
	</form>

</body>
</html>