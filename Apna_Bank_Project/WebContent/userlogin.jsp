<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="resources\css\home.css">
<!-- <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"> -->

<style>
body{
background-image: linear-gradient(black, red, orange);
	height: 800px;
}

</style>


<title>User Login Page</title>
</head>
<body>
<%! int attempts=3; %>
<% if(request.getParameter("attempts")!=null){attempts=Integer.parseInt(request.getParameter("attempts"));}%>
<% if(attempts>=1)
{ %>
<center>
				<div  id="myForm">
				<center>
					<form action="login" class="form-container" id="form1" method="POST">

						<label for="email"><b>Username</b></label>
						<input type="text" placeholder="Enter Username" name="userId" id="uname" required>

						<label for="psw"><b>Password</b></label> 
						<input type="password" placeholder="Enter Password" name="password" id="pass" required>


						<input type="submit" class="login" value="Login" onclick="myFunction()">
						<input type="text" name="attempts" value="<%= (attempts) %>" hidden readonly>
					</form>
					<h3><a href="forgotPassword.jsp" style="color:blue" >Forgot Password</a>&nbsp&nbsp&nbsp
					<a href="forgotUserId.jsp" style="color:blue">Forgot username</a><h3>
					</center>
					<br><br>
					<center><h3 style="color:black"><%=attempts %>&nbspAttempts left..</center>
				</div>
<%} else{ %>	<center><h3 style="color:red">No login attempts left <br><a href="home.jsp" style="color:blue">Go To Homepage</a></center> <%} %>
				

</body>
</html>