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
	Customer Id : &nbsp ${customer.customerId}<br><br>
	Account Number :&nbsp ${account.accountNo}<br><br>
	Customer Name : &nbsp ${customer.firstName} &nbsp${customer.middleName} &nbsp${customer.lastName}<br><br>
	Account Type : &nbsp ${account.accountType.typeName}<br><br>
	IFSC Code :&nbsp ${account.ifsccode}<br><br>
	Account Status : &nbsp ${account.status}<br><br>
	Account Balance :&nbsp ${account.balance}
</body>
</html>
