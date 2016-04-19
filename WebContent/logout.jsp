<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Confirm logout</title>
	</head>
	<%@include file="_includes/scripts.jsp" %>
<body>
 	<%@include file="_includes/navbar.jsp" %>
	<div class="jumbotron">
		<form action="Logout" method="post">
			<input type="radio" name="clogout" value="yes">Yes </br>
			<input type="radio" name="clogout" value="no">No </br>
			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>