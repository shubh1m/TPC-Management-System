<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.io.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>My Account</title>
	<%@include file="_includes/scripts.jsp" %>	
</head>
<body>
 	<%@include file="_includes/navbar.jsp" %>
	<br/><br/><br/><br/>
	<h1>My Account</h1>
	<br/>
	<% HttpSession ht = request.getSession();
		String tp = ht.getAttribute("Type").toString();
		if(tp.equals("3")) {
	%>
	<div>
	  <ul class="nav nav-tabs navbar-inverse" role="tablist">
	    <li role="presentation"><a href="#job" aria-controls="job" role="tab" data-toggle="tab">Apply for Job</a></li>
	    <li role="presentation"><a href="#intern" aria-controls="intern" role="tab" data-toggle="tab">Apply for Intern</a></li>
	    <li role="presentation"><a href="#details" aria-controls="settings" role="tab" data-toggle="tab">Edit details</a></li>
	    <li role="presentation"><a href="#view" aria-controls="view" role="tab" data-toggle="tab">View details</a></li>
	  </ul>
	  
	  <br/><br/><br/><br/>
	  
	  <div class="tab-content">
	    <div role="tabpanel" class="tab-pane" id="job">
	    	
	    	<form method="post" action="ForJobServlet" class="form-horizontal" name="forjob">
		    	<div class="form-group">
			      <label class="control-label col-sm-2">Base Salary: </label>
			      <div class="col-sm-3">
			        <input type="text" class="form-control" name="salary" placeholder="in lakhs">
			      </div>
			    </div>
				
				<div class="form-group">
			      <label class="control-label col-sm-2">Min. CPI: </label>
			      <div class="col-sm-3">
			        <input type="text" class="form-control" name="cpi" placeholder="out of 10">
			      </div>
			    </div>
				
				<div class="form-group">
			      <label class="control-label col-sm-2">Branch Preffered: </label>
			      <div class="col-sm-3">
			        <input type="text" class="form-control" name="branch">
			      </div>
			    </div>
			    
	    		<div class="form-group">
			      <label class="control-label col-sm-2">Date of Visit: </label>
			      <div class="col-sm-3">
			        <input type="text" class="form-control" name="date" placeholder="in DD/MM/YYYY format">
			      </div>
			    </div>
				
				<div class="form-group">        
			      <div class="col-sm-offset-2 col-sm-10">
			        <button type="submit" class="btn btn-default">Submit</button>
			      </div>
			    </div>
	    	</form>
	    </div>
	    
	    <div role="tabpanel" class="tab-pane" id="intern">
	    	<form method="post" action="ForInternServlet" class="form-horizontal" name="forintern">
		    	<div class="form-group">
			      <label class="control-label col-sm-2">Domain: </label>
			      <div class="col-sm-3">
			        <input type="text" class="form-control" name="domain" placeholder="">
			      </div>
			    </div>
				
				<div class="form-group">
			      <label class="control-label col-sm-2">Stipend: </label>
			      <div class="col-sm-3">
			        <input type="text" class="form-control" name="stipend" placeholder="in thousands">
			      </div>
			    </div>
				
				<div class="form-group">
			      <label class="control-label col-sm-2">Year Preffered: </label>
			      <div class="col-sm-3">
			        <input type="text" class="form-control" name="year">
			      </div>
			    </div>
			    
	    		<div class="form-group">
			      <label class="control-label col-sm-2">Link To Website: </label>
			      <div class="col-sm-3">
			        <input type="text" class="form-control" name="link" placeholder="">
			      </div>
			    </div>
				
				<div class="form-group">        
			      <div class="col-sm-offset-2 col-sm-10">
			        <button type="submit" class="btn btn-default">Submit</button>
			      </div>
			    </div>
	    	</form>
	    </div>
	    
	    <div role="tabpanel" class="tab-pane" id="details">
	    	<form method="post" action="EditDetailsServlet" class="form-horizontal" name="edit">
		    	<div class="form-group">
			      <label class="control-label col-sm-2">Company Name: </label>
			      <div class="col-sm-3">
			        <input type="text" class="form-control" name="name">
			      </div>
			    </div>
				
				<div class="form-group">
			      <label class="control-label col-sm-2">Email ID: </label>
			      <div class="col-sm-3">
			        <input type="text" class="form-control" name="email">
			      </div>
			    </div>
				
				<div class="form-group">
			      <label class="control-label col-sm-2">Contact: </label>
			      <div class="col-sm-3">
			        <input type="text" class="form-control" name="contact">
			      </div>
			    </div>
			    
	    		<div class="form-group">
			      <label class="control-label col-sm-2">Password: </label>
			      <div class="col-sm-3">
			        <input type="password" class="form-control" name="passwd">
			      </div>
			    </div>
				
				<div class="form-group">
			      <label class="control-label col-sm-2">Confirm Password: </label>
			      <div class="col-sm-3">
			        <input type="password" class="form-control" name="cpasswd">
			      </div>
			    </div>
				
				<div class="form-group">        
			      <div class="col-sm-offset-2 col-sm-10">
			        <button type="submit" class="btn btn-default">Submit</button>
			      </div>
			    </div>
	    	</form>
	    </div>
	    
	    <div role="tabpanel" class="tab-pane" id="view">
		
		</div>
	    
	  </div>
	</div>
	
	<% }else if(tp.equals("2")) {
	%>
		<form action="Studentservlet" method="post">
			<input type="submit" value="View your Information" name="yourInformation">
			<input type="submit" value="View Recruiter's Information" name="recpInformation">
			<input type="submit" value="View Internship Giving Companies" name="reciInformation">
			<input type="submit" value="View Eligible Companies" name="eligiblecomp">
			<input type="submit" value="log-out" name="logout">
		</form>
		
	<% } %>
</body>
</html>


<!-- 
<form action="Studentservlet" method="post" class="nav nav-tabs navbar-inverse" role="tablist">
			<ul class="nav nav-tabs navbar-inverse" role="tablist">
				<li role="presentation"><a href="#yourInf" aria-controls="yourInf" role="tab" data-toggle="tab">
					<input type="submit" value="View your Information" name="yourInformation" role="presentation">
				</a></li>
				<li role="presentation"><a href="#jobInf" aria-controls="jobInf" role="tab" data-toggle="tab">
					<input type="submit" value="View Recruiter's Information" name="recjInformation" role="presentation">
				</a></li>
				<li role="presentation"><a href="#internInf" aria-controls="internInf" role="tab" data-toggle="tab">
					<input type="submit" value="View Internship Giving Companies" name="reciInformation" role="presentation">
				</a></li>
				<li role="presentation"><a href="#eliCompanies" aria-controls="eliCompanies" role="tab" data-toggle="tab">
					<input type="submit" value="View Eligible Companies" name="eligiblecomp" role="presentation">
				</a></li>
				<li role="presentation"><a href="#logout" aria-controls="logout" role="tab" data-toggle="tab">
					<input type="submit" value="log-out" name="logout">
				</a></li>
			</ul>
		</form>
 -->