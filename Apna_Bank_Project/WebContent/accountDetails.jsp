<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="---- add----", method="Post">
   <label for="Account type"><b>Account type</b></label>
  <select name="Account type">
  <option value="savings">savings</option>
  <option value="current">current</option>
  </select>

  <label for="branch"><b>Branch</b></label>
  <select name="ifsccode">
  <option value="bangalore">Bangalore</option>
  <option value="kolkata">kolkata</option>
  <option value="delhi">Delhi</option>
  <option value="pune">Pune</option>
  <option value="mumbai">Mumbai</option>
  
</select>
</form>

</body>
</html>