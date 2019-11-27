<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/banktype.css">
<title>Bank Details</title>
</head>
<body>
	<div class="container">
		<form action="createAccount" method="POST"
			onsubmit="return checkCheckBox(this)">
			<h1 align="center">
				<u>Choose Your Bank Details</u>
			</h1>
			<table align="center" cellpadding="10">
				<tr>
					<td><b>Bank Details:</b></td>
				</tr>
				<tr>
					<td><b>Account type:</b>
					<td> <select name="type">
				<option value="1">Savings Account</option>
				<option value="2">Current Account</option>
				</select> <br></td>
					</td>
				</tr>
				<tr>
					<td><b>Branch:</b>
					<td><select name="ifsccode">
			<option value="IFSC111">Bangalore</option>
			<option value="IFSC112">kolkata</option>
			<option value="IFSC113">Delhi</option>
			<option value="IFSC114">Pune</option>
			<option value="IFSC111">Mumbai</option>
		</select></td>
					</td>
				</tr>

				<tr>
					<td><input type="submit" value="Submit" name="submit"
						class="submit" /> <input type="reset" Value="Reset" value="reset" /></td>
				</tr>

			</table>
		</form>
	</div>

</body>
</html>