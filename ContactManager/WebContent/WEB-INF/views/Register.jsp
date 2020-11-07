<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<style type="text/css">
body {
	background-image: url('https://cdn.crunchify.com/bg.png');
}
button {
	margin: 5px 5px 5px 5px;
	padding: 10px;
}
</style>
</head>
<body>
<div align="center">
<h2>Registration</h2>
<br><br>
<form:form action="saved" method="post" modelAttribute="registration">
<table style="width:24%;height: 64%;">
	<tr>
		<td>First Name</td>
		<td><form:input path="fname" placeholder="First name here..."/></td>
	</tr>
	<tr>
		<td><br>Last Name</td>
		<td><br><form:input path="lname" placeholder="Last name here..."/></td>
	</tr>
	<tr>
		<td><br>E-mail</td>
		<td><br><form:input path="email" placeholder="example@gmail.com"/></td>
	</tr>
	<tr>
		<td><br>Phone</td>
		<td><br><form:input path="phone" placeholder="Contact here..."/></td>
	</tr>
	<tr>
		<td><br>Gender</td>
		<td><br>
		<form:select path="gender" items="${registration.genderOptions}"></form:select>
		</td>
	</tr>
	<tr>
		<td><br>Use for</td>
		<td><br><form:radiobutton path="use" name="person" value="personal"/>Personal 
				<form:radiobutton path="use" name="busines" value="business"/> Business 
		</td>
	</tr>
	<tr>
		<td><br>Address</td>
		<td><br><form:input path="address" placeholder="Address here..."/></td>
	</tr>
	<tr>
		<td><br>Username</td>
		<td><br><form:input path="username" placeholder="Username here..."/></td>
	</tr>
	<tr>
		<td><br>Password</td>
		<td><br><form:input type="password" path="password" placeholder="Password here..."/></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><br><br><input type="submit" name="button" value="Register"></td>
	</tr>
</table>
</form:form>
</div>
</body>
</html>