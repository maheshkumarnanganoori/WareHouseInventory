<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="ISO-8859-1">
	    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	   	<title>Sign Up</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/views/styles/signup.css">
	</head>
	<body>
		<div class="signupbox">
			<form id="signupForm" action="${pageContext.request.contextPath}/user/signup" method="post">
				<h1 class="title">SignUp</h1>
				<label>First Name</label> 
				<input type="text" name="firstname" placeholder="Enter Your First Name" required>
				<label>LastName</label>
				<input type="text" name="lastname" placeholder="Enter Your Last Name" required>
				<label>Email</label>
				<input type="email" name="email" placeholder="Enter Your Email Address" required>
				<label>Password</label>
				<input type="password" name="password" placeholder="Create your password" id="password" required>
				<label>Confirm Password</label>
				<input type="password" name="confirmpassword" placeholder="Confirm password" id="confirmpassword" required>
				<br><br>
				<input type="radio" name="userType" id="isOwner" value="Owner" checked>
				<label for="isOwner">Owner</label>
				<input type="radio" name="userType" id="isWorker" value="Worker">
				<label for="isWorker">Worker</label>
				<br><br>
				<input class="signupButton" type="submit" name="signupbutton" value="SignUp">
			</form>
			<div id="status">
				<% if (request.getAttribute("status") != null) { %>
				<p><%= request.getAttribute("status") %></p>
				<% } %>
			</div>
		</div>
	
	</body>
</html>