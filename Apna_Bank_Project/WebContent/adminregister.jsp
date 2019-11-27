<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="resources/css/adminregister.css">
<title>Admin Register Page</title>
</head>
<body>
	<form action="">
		<div class="container">
			<h1>Register</h1>
			<hr>

			<label for="fname"><b>First Name</b></label> <input type="text"
				placeholder="First Name" name="firstName" value="Tom" required>
			<br> <label for="mname"><b>Middle Name</b></label> <input
				type="text" placeholder="Middle Name" name="middleName" value="Adam"
				required> <br> <label for="fname"><b>Last
					Name</b></label> <input type="text" placeholder="Last Name" name="lastName"
				value="Alex" required> <br> <label for="username"><b>Username</b></label>
			<input type="text" placeholder="Enter Your Username" name="userName"
				value="tomanne123" required> <br> <label for="password"><b>Password</b></label>
			<input type="password" placeholder="Enter Your Password"
				name="password" value="tom123" required> <br> <label
				for="profilepassword"><b>Confirm Password</b></label> <input
				type="password" placeholder="Confirm Your Password"
				name="profilePassword" value="tom123" required> <br>


			<button type="submit" class="registerbtn">
				<b>Register</b>
			</button>
		</div>
	</form>

</body>
</html>