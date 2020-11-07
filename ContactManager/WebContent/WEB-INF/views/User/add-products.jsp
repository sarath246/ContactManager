<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add products</title>
<style>
body {
	background-image: url('https://cdn.crunchify.com/bg.png');
}
            .error {
                color: red
            }
        </style>
</head>
<body>
<a href="userhome">Home</a>
<div align="center">
<h2>Add your selling product</h2>
<br><br><br>
<form:form action="procesForm" modelAttribute="uploadProduct">
	<table style="height: 50%;">
		<tr>
			<td>Title</td>
				<td>
				<form:input path="title"/>
				<form:errors path="title" cssClass="error" />
				</td>
		</tr>
		<tr>
			<td><br>Upload image</td>
			<td><br><input type="file" ></td>
		</tr>
		<tr>
			<td><br>Price</td>
			<td><br><form:input path="price"/>
					<form:errors path="price" cssClass="error" />
			</td>
		</tr>
		<tr> 
			<td><br>Stock</td>
			<td><br><form:input type="number" path="stock"/>
					<form:errors path="stock" cssClass="error" />
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><br><br>
        		<input type="submit" value="Cancel">
        		&nbsp;&nbsp;&nbsp;&nbsp;
        		<input type="submit" value="Submit">
			</td>
		</tr>
	</table>
</form:form>
</div>
</body>
</html>