<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de usu�rio</title>


<link rel="stylesheet" href="resources/css/cadastro.css">
<link rel="stylesheet" href="resources/css/style.css">

<!-- Adicionando JQuery -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"
	integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
	crossorigin="anonymous"></script>

</head>
<body>
	<a href="acessoLiberado.jsp">Inicio</a>
	<a href="index.jsp">Sair</a>
	<center>
		<h1>Cadastro de usu�rio</h1>
		<h3 style="color: purple;">${msg}</h3>
	</center>



	<form action="salvarUsuario" method="post" id="formUser"
		onsubmit="return validarCampos() ? true : false;">
		<ul class="form-style-1">
			<li>
				<table>
					<tr>
						<td>C�digo:</td>
						<td><input type="text" id="id" name="id" value="${user.id}"
							class="field-long" readonly="readonly"></td>
					</tr>


					<tr>
						<td>Login:</td>
						<td><input type="text" id="login" name="login"
							value="${user.login}"></td>
					</tr>

					<tr>
						<td>Senha:</td>
						<td><input type="password" id="senha" name="senha"
							value="${user.senha}"></td>
					</tr>

					<tr>
						<td>Nome:</td>
						<td><input type="text" id="nome" name="nome"
							value="${user.nome}"></td>
					</tr>

					<tr>
						<td>Fone:</td>
						<td><input type="text" id="fone" name="fone"
							value="${user.fone}"></td>
					</tr>

					<tr>
						<td>Cep:</td>
						<td><input type="text" id="cep" name="cep"
							onblur="consultaCep();" value="${user.cep}"></td>
					</tr>

					<tr>
						<td>Rua:</td>
						<td><input type="text" id="rua" name="rua"
							value="${user.rua}"></td>
					</tr>

					<tr>
						<td>Bairro:</td>
						<td><input type="text" id="bairro" name="bairro"
							value="${user.bairro}"></td>
					</tr>

					<tr>
						<td>Cidade:</td>
						<td><input type="text" id="cidade" name="cidade"
							value="${user.cidade}"></td>
					</tr>

					<tr>
						<td>Estado:</td>
						<td><input type="text" id="estado" name="estado"
							value="${user.estado}"></td>
					</tr>

					<tr>
						<td>IBGE:</td>
						<td><input type="text" id="ibge" name="ibge"
							value="${user.ibge}"></td>
					</tr>

					<tr>
						<td></td>
						<td><input type="submit" value="Salvar"><input
							type="submit" value="Cancelar"
							onclick="document.getElementById('formUser').action = 'salvarUsuario?acao=reset'"></td>
				</table>
		</ul>

	</form>



	<form>

		<div>
			<table class="tbl-header">

				<tr>
					<th>Id</th>
					<th>Login</th>
					<th>Nome</th>
					<th>Fone</th>
					<th>Delete</th>
					<th>Editar</th>
				</tr>

				<c:forEach items="${usuarios}" var="user">
					<tr>

						<td style="width: 150px"><c:out value="${user.id}">
							</c:out></td>
						<td style="width: 150px"><c:out value="${user.login}">
							</c:out></td>
						<td style="width: 150px"><c:out value="${user.nome}">
							</c:out></td>
						<td style="width: 150px"><c:out value="${user.fone}">
							</c:out></td>
						<td><a href="salvarUsuario?acao=delete&user=${user.id}"><img
								alt="Excluir" src="resources/img/lixeira.png" width="20px"
								height="20px" alt="Excluir" title="Exluir"></a></td>
						<td><a href="salvarUsuario?acao=editar&user=${user.id}"><img
								alt="Excluir" src="resources/img/editar.png" width="20px"
								height="20px" alt="Editar" title="Editar"></a></td>
					</tr>

				</c:forEach>

			</table>
		</div>
		<script type="text/javascript">
			function validarCampos() {
				if (document.getElementById("login").value == '') {
					alert('Informe o login:')
					return false;
				} else if (document.getElementById("senha").value == '') {
					alert('Informe a senha:')
					return false;
				} else if (document.getElementById("nome").value == '') {
					alert('Informe o nome:')
					return false;
				} else if (document.getElementById("fone").value == '') {
					alert('Informe o fone:')
					return false;
				}

				return true;
			}

			function consultaCep() {
				var cep = $("#cep").val();

				//Consulta o webservice viacep.com.br/
				$.getJSON("https://viacep.com.br/ws/" + cep
						+ "/json/?callback=?", function(dados) {

					if (!("erro" in dados)) {

						//Atualiza os campos com os valores da consulta.
						$("#rua").val(dados.logradouro);
						$("#bairro").val(dados.bairro);
						$("#cidade").val(dados.localidade);
						$("#estado").val(dados.uf);
						$("#ibge").val(dados.ibge);
					} //end if.
					else {
						//CEP pesquisado n�o foi encontrado.
						$("#cep").val('');
						$("#rua").val('');
						$("#bairro").val('');
						$("#cidade").val('');
						$("#estado").val('');
						$("#ibge").val('');
						alert("CEP n�o encontrado.");
					}
				});

			}
		</script>
	</form>
</body>
</html>