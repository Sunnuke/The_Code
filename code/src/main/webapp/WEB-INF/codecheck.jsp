<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Code</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<p style="color: red;"><c:out value="${error}"/></p>
	<h2>What is the Code?!</h2>
	<form action="/check" method="POST">
	<input name="code" type="text">
	<button type="submit">Try Code</button>
	</form>
</body>
</html>