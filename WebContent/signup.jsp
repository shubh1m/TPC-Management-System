<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Signup page</title>
	<%@include file="_includes/scripts.jsp" %>	
</head>
<body>
 	<%@include file="_includes/navbar.jsp" %>
	<br/><br/><br/><br/>
	<div class="page-header">
		<h1>!! Sign Up if you are a recruiter !!</h1>
	</div>
	<br/><br/>
	<form method="post" action="SignupServlet">
		Name: <input name="name" type="text"/><br/>
		UserID: <input name="userid" type="text"/><br/>
		Email: <input name="email" type="text"/><br/>
		Contact: <input name="phone" type="text"/><br/>
		Password: <input name="passwd" type="password"/><br/>
		Confirm password <input name="cpasswd" type="password"/><br/><br/>
		<input type="submit" value="Submit">
	</form>
</body>
</html>

<!-- 
		Base Salary: <input name="jsalary" type="text"/><br/>
		Min. CPI: <input name="jmincpi" type="text"/><br/>
		Branch preffered: <input name="jbranch" type="text"/><br/>
		Date of visit: <input name="jdov" type="text"/><br/> -->