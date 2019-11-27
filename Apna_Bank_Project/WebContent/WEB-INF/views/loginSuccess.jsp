<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>
			Login Success <br /> ${User.userId}<br>
			${User.accountDetails.accountNo}
		</h1>

		<br>
		<br>
		<form action="summary" method="post">
			<input type="submit" value="Display Account summary">
		</form>
		<br>
		<br>
		<form action="display" method="post">
			<input type="submit" value="Display Account statement">
		</form>

	</center>
</body>
</html>