<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View users</title>
</head>
<body>
<div align="center">
<h2>Users Registration</h2>
<br><br><br>
<form action="" method="post">
	<table border="1">
		<tr>
			<th>Sl.No</th>
			<th>Fname</th>
			<th>Lname</th>
			<th>E-mail</th>
			<th>Address</th>
		   	<th>Contact</th>
		   	<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${listRegisters}" var="register" varStatus="status">
		<tr>
			<td>${status.index + 1}</td>
					<td>${register.fname}</td>
					<td>${register.lname}</td>
					<td>${register.email}</td>
					<td>${register.address}</td>
					<td>${register.phone}</td>
					<td><a href="" class="btn btn-success">Accept</a></td>
					<td><a href="">Reject</a></td>
		</tr>
		</c:forEach>
	</table>
</form>
</div>
</body>
</html>