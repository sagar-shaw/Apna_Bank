<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--          branch details-->
	<form action="createAccount" , method="Post">
		<label for="Accounttype"><b>Account type</b></label> <select
			name="accountType">
			<option value="1">Savings Account</option>
			<option value="2">Current Account</option>
		</select> <br>
		<br> <label for="branch"><b>Branch</b></label> <select
			name="ifsccode">
			<option value="IFSC111">Bangalore</option>
			<option value="IFSC112">kolkata</option>
			<option value="IFSC113">Delhi</option>
			<option value="IFSC114">Pune</option>
			<option value="IFSC111">Mumbai</option>
		</select> <input type="submit" value="Submit">
	</form>
</body>
</html>