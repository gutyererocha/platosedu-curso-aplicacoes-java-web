<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Página de Resposta</title>
	</head>
	<body>
		<jsp:useBean id="usuario" scope="session" class="meupacote.UsuarioBean" />
		<jsp:setProperty name="usuario" property="*" />
		
		<h1>Olá, <jsp:getProperty name="usuario" property="usuario" /> seja bem vindo!</h1>
	</body>
</html>