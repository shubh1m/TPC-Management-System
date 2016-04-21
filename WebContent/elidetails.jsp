<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    <%@page import="java.util.*" %>
    <%@page import="tpc.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<% Connect c = new Connect();
	Connection co = c.Conn();
	Statement stmt = co.createStatement();
	String str = "select Job_Name, signup.EmailID, Contact, Base_Salary, Date_of_Visit from signup JOIN For_Job ON signup.RecruiterID = For_Job.RecruiterID JOIN student on student.Branch = For_Job.Branch_Preffered WHERE student.CGPA >= For_Job.Min_CPI";
	ResultSet rs = stmt.executeQuery(str);
	%>
	<table id="tb01" border="1" style="width: 100%" style="backgroung-color:#E6E6FA">
	<tr>
		<th>NAME</th>
		<th>EMAIL ID</th>
		<th>PHONE NUMBER</th>
		<th>Base Salary</th>
		<th>Date Of Visit</th>
		</TR>
		<%while(rs.next()){ %>
		<tr>
			<td><%=rs.getString(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=rs.getFloat(4) %></td>
			<td><%=rs.getString(5) %></td>
		</tr>
		<%}
			rs.close();
			stmt.close();
			co.close();
		%>
	</TABLE>
</body>
</html>
