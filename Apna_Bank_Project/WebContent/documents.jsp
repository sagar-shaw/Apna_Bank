<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<!--  <body>

	<form method="POST" action="documentUpload" enctype="multipart/form-data">
		Upload your Aadhar Card: <input type="file" name="file"><br /> 
		Enter Aadhar Card number: <input type="text" name="fileName"><br /> <br /> 
		Upload your PAN Card: <input type="file" name="file"><br /> 
		Enter PAN number: <input type="text" name="fileName"><br /> <br />
		Upload your passport photograph: <input type="file" name="file"><br /> 
		Enter your firstName: <input type="text" name="fileName"><br /> <br />
		<input type="submit" value="Upload"> Press here to upload the file!
	</form>
	

</body>-->
<body>

	<form method="POST" action="documentUpload" enctype="multipart/form-data">
		File1 to upload: <input type="file" name="file"><br /> 
		Name1: <input type="text" name="names"><br /> <br /> 
		File2 to upload: <input type="file" name="file"><br /> 
		<!--Name2: <input type="text" name="name"><br /> <br /> -->
		<input type="submit" value="Upload"> Press here to upload the file!
	</form>
	
</body>

</html>