<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" action="validateLogin" modelAttribute="userbean">
<form:label path="email">Email</form:label>
<form:input path="email"/><br>
<form:label path="password">Password</form:label>
<form:password path="password"/><br>
<input type="submit" value="Login">
</form:form>
</body>
</html>