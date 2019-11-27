<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="resources\css\register.css">

<!-- <script src="D:\Banking Templates\JSP Pages\register.js"></script>   -->

<link rel="stylesheet" href=".\register.css">
<script src=".\register.js"></script>

<title>Registration Page</title>
</head>
<%! String msg; %>
<% msg= request.getParameter("message"); %>
<body onload="StartTimers();" onmousemove="ResetTimers();">
	<form action="register" method="POST">
		<div class="container">
			<h1>Register</h1>
			<hr>
			<label for="accountno"><b>Account Number</b></label> 
			<input type="number" placeholder="Enter Your Account Number" name="accountDetails.accountNo"  required> <br>
			<label for="userid"><b>User Id</b></label>
			<input type="text" placeholder="Enter Your Userid" name="userId"  required> <br> 
			<label for="password"><b>Password</b></label>
			<input type="password" placeholder="Enter Your Password" name="password"required> <br> 
			<label for="profilepassword"><b>Profile Password</b></label> 
			<input type="password" placeholder="Enter Your Profile Password" name="profilePassword"  required> <br>
			<input type="submit" class="registerbtn" value="Register">
		</div>
	</form>
	<%if(msg!=null){%>
	<center><h3 style="color:red"><%= msg%></center>
	<% } %>
	<div id="timeout">
		<h1>Session Timeout in 3 mins</h1>
	</div>
<script>
  // Set timeout variables.
var timoutWarning = 300000; // Display warning in 4.5 Mins.
var timoutNow = 250000; // Timeout in 5 mins.
var logoutUrl = 'loggedout.jsp'; // URL to logout page.

var warningTimer;
var timeoutTimer;

// Start timers.
function StartTimers() {
    warningTimer = setTimeout("IdleWarning()", timoutWarning);
    timeoutTimer = setTimeout("IdleTimeout()", timoutNow);
}

// Reset timers.
function ResetTimers() {
    clearTimeout(warningTimer);
    clearTimeout(timeoutTimer);
    StartTimers();
    $("#timeout").dialog('close');
}

// Show idle timeout warning dialog.
function IdleWarning() {
    $("#timeout").dialog({
        modal: true
    });
}

// Logout the user.
function IdleTimeout() {
    window.location = logoutUrl;
}
   
</script>

</body>
</html>