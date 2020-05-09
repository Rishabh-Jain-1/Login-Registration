<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h2>Register Here</h2>
	${error }
	<form:form method="POST" action="/submitForm"
		modelAttribute="userbean">
		<form:label path="firstName">First Name</form:label>
		<form:input path="firstName" /><br>
		
		<form:label path="lastName">Last Name</form:label>
		<form:input path="lastName" /><br>
		
		<form:label path="email">Email</form:label>
		<form:input path="email" /><br>
		
		<form:label path="password">password</form:label>
		<form:password path="password" /><br>
		
		<form:label path="gender">Gender: </form:label>
		Male<form:radiobutton path="gender" value="male" />
		Female<form:radiobutton path="gender" value="male" /><br>


		<input type="submit" value="Submit" />
	</form:form>


</body>
</html>