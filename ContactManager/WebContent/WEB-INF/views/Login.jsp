<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
body {
	background-image: url('https://cdn.crunchify.com/bg.png');
}
</style>
</head>
<body>
<a href="">Back</a>
<div align="center">
<h2>Login here</h2>
<br><br>
<form:form action="userhome" method="post" modelAttribute="loginnow">
<table>
	<tr>
	<td>Username</td>
	<td><input type="text" name=""/></td>
	</tr>
	<tr>
	<td>Password</td>
	<td><input type="text" name=""/></td>
	</tr>
	<tr>
	<td colspan="2" align="center"><br><br><input type="submit" name="" value="Login"></td>
	</tr>
</table>
</form:form>
</div>
</body>
</html>