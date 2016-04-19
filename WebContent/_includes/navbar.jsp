<div class="navbar navbar-inverse navbar-fixed-top" id="topnav">
	<div class="container-fluid">
        <div class="navbar-header">
	        <a class="navbar-brand" href="index.jsp"><img src="assets/images/logo.png" alt="LNMIIT" height="18px" /></a>
        </div>
	    <div class="navbar-collapse collapse">
	        <ul class="nav navbar-nav">
	          	<li class="active"><a href="index.jsp">Home</a></li>
	          	<li><a href="about_us.jsp">About Us</a></li>
	          	<li><a href="life.jsp">Life @LNMIIT</a></li>
	          	<li><a href="contact.jsp">Contact</a></li>
	            <% if(session.getAttribute("RecruiterID") == null){ %>
		            <li>
		         	   	<ul class="nav navbar-nav navbar-right">
							<li><a href="signup.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					  		<li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
						</ul>
					</li>
				<% } else{ %>
	            	<li><a href="logout.jsp">Log Out</a></li>
	           	<% } %>
	     	</ul>
	   	</div>
	    <!--/.navbar-collapse  data-spy="scroll" -->
	</div>
</div>


<!-- 
<ul class="nav navbar-nav">
	          	<li class="active"><a href="index.jsp">Home</a></li>
	          	<li class="dropdown">
	               	<a class="dropdown-toggle" data-toggle="dropdown" href="#">Sign Up
				       	<span class="caret"></span>
					</a>
				    <ul class="dropdown-menu">
			       		<li><a href="signup.jsp">Sign Up for Job</a></li>
			        	<li><a href="signupintern.jsp">Sign Up for Intern</a></li>
			        </ul>
			    </li>
                <li><a href="login.jsp">Login</a></li>
	            <li><a href="contact.jsp">Contact</a></li>
	            <li><a href="logoutprocess.jsp">Log Out</a></li>
	            <li>
	            <ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				  	<li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</ul>
				</li>
	     	</ul>

 -->