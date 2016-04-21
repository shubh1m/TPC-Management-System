<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.awt.List" %>
    <%@page import="java.util.*" %>
    <%@page import="java.sql.*"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Student details</title>
</head>
<body>
	<p>Username: ${UserID}</p> 
	<p>Name: ${name}</p>
	<p>Roll No : ${rollno}</p>
	<p>Date of Birth : ${dob}</p>
	<p>Branch : ${branch}</p>
	<p>CGPA : ${cgpa}</p>
	<p>Email Id: ${email}</p>

</body>
</html>
