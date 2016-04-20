<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Welcome to LNMIIT, Jaipur</title>
	<%@include file="_includes/scripts.jsp" %>
</head>
<body>
	<%@include file="_includes/navbar.jsp" %>
	<br/><br/><br/>
	<div align="center">
		<form method="post" action="CLogin">
			<h3><strong>Login</strong></h3>
			<br/><br/>
			Username: <input name="username" type="text"/><br/>
			Password: <input name="password" type="password"/><br/><br/>
			<input type="radio" name="type" value="1">Student
			<input type="radio" name="type" value="2">Admin
			<input type="radio" name="type" value="3">Recruiter
			<br/>
			<input type="submit" value="Submit"/>
		</form>
		<br/><br/>
		<a href="./signup.jsp">Sign Up for JOB</a>
		<br/>
		<a href="./signupintern.jsp">Sign Up for intern</a>
	</div>
</body>
</html>