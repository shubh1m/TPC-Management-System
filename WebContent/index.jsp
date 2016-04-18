<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Welcome to LNMIIT, Jaipur</title>
	<link href="assets/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css" rel="stylesheet">
    <link href="assets/css/style.css" rel="stylesheet">
</head>
<body data-spy="scroll" data-target="#topnav">
	Home page of TPC
	<br/><br/>
	<div class="navbar navbar-inverse navbar-fixed-top" id="topnav">
	    <div class="container-fluid">
	        <div class="navbar-header">
	            <a class="navbar-brand" href="#"><img src="assets/images/logo.png" alt="LNMIIT" height="18px" /></a>
	        </div>
	        <div class="navbar-collapse collapse">
	            <ul class="nav navbar-nav">
	                <li class="active"><a href="index.jsp">Home</a></li>
	               	<li class="dropdown">
	               		<a class="dropdown-toggle" data-toggle="dropdown" href="signup.jsp">Sign Up for Job
				        <span class="caret"></span></a>
				        <ul class="dropdown-menu">
				          <li><a href="signup_forintern.jsp">Sign Up for Intern</a></li>
				        </ul>
	                <li><a href="login.jsp">Login</a></li>
	                <li><a href="contact.jsp">Contact</a></li>
	                <li><a href="logoutprocess.jsp">Log Out</a></li>
	                <ul class="nav navbar-nav navbar-right">
				      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
				    </ul>
	            </ul>
	        </div>
	        <!--/.navbar-collapse -->
	    </div>
	</div>
	<div class="jumbotron" id="home">
    	Training and Placement Cell, The LNMIIT
    	<br/>
    	<div class="container">
	        <div class="media">
	            <div class="media-body">
	                <div class="col-md-11" >
	                    <h1 style="color: #E0E0E0; text-shadow: 4px 4px black;" class="title">LNMIIT <span>Jaipur</span></h1>
	
	                    <h2 style="color: #E0E0E0; text-shadow: 2px 2px black;"><strong>Training and Placement Cell</strong> </h2>
	
	                    <p><a href="signup.jsp"class="btn btn-success btn-lg"><strong style=" text-shadow: 1px 1px black;">Register</strong><i class="icon icon-angle-right"></i></a></p>
	                </div>
	            </div>
	        </div>
	   	</div>
	</div>
	   	
	<script src="assets/js/jquery.js"></script>
	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>