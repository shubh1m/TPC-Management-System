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
	ResultSet rs = stmt.executeQuery("SELECT Job_Name, EmailID, Contact, Domain, Stipend, YearPreffered, LinkToWebsite FROM signup JOIN For_Intern on signup.RecruiterID = For_Intern.RecruiterID");
	%>
	<table id="tb01" border="1" style="width: 100%" style="background-color:#E6E6FA">
	<tr>
		<TH>Name</TH>
		<th>Email ID</th>
		<th>Contact</th>
		<th>Domain</th>
		<th>Stipend</th>
		<th>Year Preffered</th>
		<th>Link to Website</th>
	</tr>
		<%while(rs.next()){ %>
		<tr>
			<td><%=rs.getString(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=rs.getString(4) %></td>
			<td><%=rs.getInt(5) %></td>
			<td><%=rs.getString(6) %></td>
			<td><%=rs.getString(7)%></td>
		</tr>
		<%} %>
	</table>
</body>
</html>