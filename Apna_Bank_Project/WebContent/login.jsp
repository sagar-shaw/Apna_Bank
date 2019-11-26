<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Sign In</h1>
<form action="login" method="POST">
User ID:<input type="text" name="userId">  <a href="forgotUserId.jsp">forgot userId!</a>
<br>
<br>
Password:<input type="password" name="password"> <a href="forgotPassword.jsp">forgot password!</a>
<br>
<br>
<input type="submit" value="login">

</form>
</center>
</body>
</html>