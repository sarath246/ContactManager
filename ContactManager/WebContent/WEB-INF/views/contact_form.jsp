<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact form</title>
</head>
<body>
<div align="center">
<h2>New/Edit Contact</h2>

<form:form action="save" method="post" modelAttribute="contact">
<table>
<form:hidden path="id"/>
<tr>
<td>Name</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>E-mail</td>
<td><form:input path="email"/></td>
</tr>
<tr>
<td>Address</td>
<td><form:input path="address"/></td>
</tr>
<tr>
<td>Phone</td>
<td><form:input path="phone"/></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Save"></td>
</tr>

</table>
</form:form>
</div>
</body>
</html>