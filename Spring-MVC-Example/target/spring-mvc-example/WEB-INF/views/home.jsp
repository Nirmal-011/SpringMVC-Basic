<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Hello World !</h1>
<p>The time on the server is ${serverTime}.</p>
<form action="user" method="post">
	<input type="text" name="UserName"><br>
	<input type="submit" value="Login"> 
</form>
</body>
</html>