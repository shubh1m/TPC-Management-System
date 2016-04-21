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
	            <% if(session.getAttribute("UserID") == null){ %>
		            <li class="nav navbar-nav navbar-right">
		         	   	<ul class="nav navbar-nav navbar-right">
							<li><a href="signup.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					  		<li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
						</ul>
					</li>
				<% } else{ %>
					<li><a href="my_account.jsp">My Account</a></li>
	            	<li><a href="logout.jsp">Log Out</a></li>
					<p class="navbar-text navbar-right">Signed in as <a href="my_account.jsp" class="navbar-link"><strong>
						<% out.print(session.getAttribute("UserID")); %>
					</strong></a></p>
	           	<% } %>
	     	</ul>
	   	</div>
	</div>
</div>