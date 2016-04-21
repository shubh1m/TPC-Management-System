<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    <%@page import="java.util.*" %>
    <%@page import="org.tpc.opps.Conn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<% Conn c = new Conn();
	Connection co = c.con();
	Statement stmt = co.createStatement();
	ResultSet rs = stmt.executeQuery("select name,email,phone,domain,stipend,yearPreffered,link from recruiter Join intern on recruiter.userid=intern.userid ");
	%>
	<TABLE id="tb01" border="1" style="width: 100%" style="backgroung-color:#E6E6FA">
	<TR>
		<TH>NAME</TH>
		<th>EMAIL ID</th>
		<th>PHONE NUMBER</th>
		<th>Domain</th>
		<th>Stipend</th>
		<th>Year Preffered</th>
		<th>Link of Website</th>
		</TR>
		<%while(rs.next()){ %>
		<tr>
			<td><%=rs.getString(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=rs.getString(4) %></td>
			<td><%=rs.getFloat(5) %></td>
			<td><%=rs.getString(6) %></td>
			<td><%=rs.getString(7)%></td>
		</tr>
		<%} %>
	</TABLE>
</body>
</html>