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


<%! String msg="abc";%>
<% msg=request.getParameter("msg");%>


	<form action="accountTransactions" method="POST">
	Enter Account No : &nbsp <input type="number" name="accountNo">
	<br>
	<input type="submit" value="Search">
	<%  if(msg.equals("success")){ %>
	<table border="1px">
		<tr>
			<th>TransactionId</th>
			<th>Account No</th>
			<th>Recipent Account No</th>
			<th>Transaction Time</th>
			<th>Amount</th>
			<th>Status</th>
		</tr>
		<c:forEach var="list" items="${transactionList}" begin="1" end="100">
			<tr>
				<td>
					<p>${list.transactionId}</p>
				</td>
				<td>
					<p>${list.accountDetails.accountNo}</p>
				</td>
				<td><p>${list.recipentAccountNo}</p></td>
				<td><p>${list.transactionTime}</p></td>
				<td>
					<p>${list.amount}</p>
				</td>
				<td>
					<p>${list.status}</p>
				</td>
			</tr>
		</c:forEach>
	</table>
	<% } else if(msg.equals("failure")){ %>
		<h3 style="colour:red"> No transactions</h3> 
	<% } %>

</body>
</html>


