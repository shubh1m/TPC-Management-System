<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    <%@page import="java.util.*" %>
    <%@page import="tpc.Connect" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Placement Stats</title>
	<%@include file="_includes/scripts.jsp" %>	
</head>
<body>
 	<%@include file="_includes/navbar.jsp" %>
	<br/><br/><br/><br/>
	<div align="center">
		<h1>Placement Stats</h1>
		<% Connect c = new Connect();
		Connection co = c.Conn();
		Statement stmt = co.createStatement();
		String str = "SELECT * FROM stats";
		ResultSet rs = stmt.executeQuery(str);
		%>
		<table id="tb01" border="1" style="width: 80%">
		<tr>
			<th>Year</th>
			<th>Total Number Of Students</th>
			<th>No. of Companies Visited</th>
			<th>No. of Offers</th>
			<th>No. Of Student Placed</th>
			<th>Placement Ratio</th>
			<th>Average Package</th>
			<th>Minimum Package</th>
			<th>Maximum Package</th>
			</TR>
			<%while(rs.next()){ %>
			<tr>
				<td><%=rs.getString(1) %></td>
				<td><%=rs.getInt(2) %></td>
				<td><%=rs.getInt(3) %></td>
				<td><%=rs.getInt(4) %></td>
				<td><%=rs.getInt(5) %></td>
				<td><%=rs.getFloat(6) %></td>
				<td><%=rs.getFloat(7) %></td>
				<td><%=rs.getFloat(8) %></td>
				<td><%=rs.getFloat(9) %></td>
			</tr>
			<%}
				rs.close();
				stmt.close();
				co.close();
			%>
		</table>
	</div>
</body>
</html>