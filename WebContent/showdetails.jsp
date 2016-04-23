<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="tpc.Connect" %>

<div align="center">
<h3><strong>Profile</strong></h3>
	<table id="tb01" border="1" style="width: 50%">
		<tr>
			<th>Name</th>
			<th>User ID</th>
			<th>Email ID</th>
			<th>Contact</th>
		</tr>
		<%
		Connect co = new Connect();
		Connection c = co.Conn();
		String id = ht.getAttribute("UserID").toString();
		PreparedStatement pstmt = null;
		String str = "SELECT * FROM signup WHERE RecruiterID = ?";
		pstmt = c.prepareStatement(str);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		System.out.println("Personal Profile");
		while(rs.next()){
		%>
			<tr>
				<td><%= rs.getString(1) %></td>
				<td><%= rs.getString(2) %></td>
				<td><%= rs.getString(3) %></td>
				<td><%= rs.getString(4) %></td>
			</tr>
		<% } %>
	</table>
	
	<h3><strong>Job Details</strong></h3>
	<br/>
	<table id="tb01" border="1" style="width: 50%">
		<tr>
			<th>Base Salary(in lakhs)</th>
			<th>Min. CPI</th>
			<th>Branch Preffered</th>
			<th>Date of Visit</th>
		</tr>
		<%
		str = "SELECT * FROM For_Job WHERE RecruiterID = ?";
		pstmt = c.prepareStatement(str);
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		System.out.println("Job Details");
		while(rs.next()){
		%>
			<tr>
				<td><%= rs.getString(2) %></td>
				<td><%= rs.getString(3) %></td>
				<td><%= rs.getString(4) %></td>
				<td><%= rs.getString(5) %></td>
			</tr>
		<% } %>
	</table>
	
	<h3><strong>Internship Details</strong></h3>
	<table id="tb01" border="1" style="width: 80%">
		<tr>
			<th>Domain</th>
			<th>Stipend</th>
			<th>Year Preffered</th>
			<th>Link to Website</th>
		</tr>
		<%
		str = "SELECT * FROM For_Intern WHERE RecruiterID = ?";
		pstmt = c.prepareStatement(str);
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		System.out.println("Intern Details");
		while(rs.next()){
		%>
			<tr>
				<td><%= rs.getString(2) %></td>
				<td><%= rs.getString(3) %></td>
				<td><%= rs.getString(4) %></td>
				<td><%= rs.getString(5) %></td>
			</tr>
		<% } %>
	</table>
</div>