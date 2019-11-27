<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href='https://fonts.googleapis.com/css?family=Ubuntu:500'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="resources/css/adminlogin.css">
<title>Admin Login Page</title>
</head>
<body>
<body>
	<form action="admindashboard.jsp">
		<div class="login">
			<div class="login-header">
				<h1>Login</h1>
			</div>
			<div class="login-form">
				<h3>Username:</h3>
				<input type="text" placeholder="Username" /><br>
				<h3>Password:</h3>
				<input type="password" placeholder="Password" /> <br>
				<br>
				<br>
				<a href="admindashboard.jsp"> <input type="button" value="Login"
					class="login-button" /></a> <br> <a href="adminregister.jsp">
					<input type="button" class="button" value="Register">
				</a> <br>

			</div>
		</div>
	</form>
</body>
</html>