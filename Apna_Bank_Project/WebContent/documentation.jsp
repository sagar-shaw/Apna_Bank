<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources\css\documents.css">
<title>Documentation</title>
</head>
<body>
	<div class="container">

		<form action="documentUpload" method="POST" enctype="multipart/form-data" onsubmit="return checkCheckBox(this)"  >
			<h1 align="center">
				<u>Upload the required documents</u>
			</h1>
			<table align="center" cellpadding="10">



				<tr>
					<td><h2>Documentation:</h2>
					<td></td>
				</tr>

				<tr>
					<td><b>Upload Passport Photo</b>
					<td><input type="file" name="file" ></td>
					<!-- <input type="submit"> -->
					</td>
				</tr>

				<tr>
					<td><b>Upload your Aadhar Card</b>
					<td><input type="file" name="file"></td>

					<!-- <input type="submit"> -->
					</td>
				</tr>
				<tr>
					<td><b>Upload your PAN Card</b>
					<td><input type="file" name="file"></td>
					<!-- <input type="submit"> -->
					</td>
				</tr>


				<tr>
					<td><b>By submitting, I agree that all info entered was
							done accurately & truthfully.</b><br /> I accept: <input
						type="checkbox" value="0" name="agree"></td>
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