<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JSP Page</title>
	</head>
	<body>
		<form action="CalcSer" method="post">
			<input type="text" name="txtnum1" value="<% if(request.getParameter("q")!=null) out.print(request.getParameter("q")); %>"/>
			<br><br>
			<input type="submit" name="btnsubmit" value="1" />
			<input type="submit" name="btnsubmit" value="2" />
			<input type="submit" name="btnsubmit" value="3" />
			<input type="submit" name="btnsubmit" value="4" />
			<br><br>
			<input type="submit" name="btnsubmit" value="+" />
			<input type="submit" name="btnsubmit" value="-" />
			<input type="submit" name="btnsubmit" value="*" />
			<input type="submit" name="btnsubmit" value="=" />
		</form>
	</body>
</html>