<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Manager</title>
</head>
<body>
	<h2>Contact Manager Application</h2>
	<div align="center">
	
	<a href="new">New Contact</a>

		<table border="1" >
			<tr>
				<th>No</th>
				<th>Name</th>
				<th>Email</th>
				<th>Address</th>
				<th>Phone</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${listContact}" var="contact" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${contact.name}</td>
					<td>${contact.email}</td>
					<td>${contact.address}</td>
					<td>${contact.phone}</td>
					<td><a href="delete?id=${contact.id}">Delete</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="edit?id=${contact.id}">Edit</a></td>
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>