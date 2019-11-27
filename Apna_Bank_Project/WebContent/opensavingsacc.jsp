<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="resources\css\opensavingsacc.css">
<script src="resources\css\opensavingsacc.js"></script>
<script src="resources\js\agree.js"></script>


<title>Open your account</title>
</head>
<body>

	<div class="container">

		<form action="add" method="POST" onsubmit="return checkCheckBox(this)">
			<h1 align="center">Open Bank Account</h1>
			<table align="center" cellpadding="10">
				<tr>
					<td><b>Enter Title:</b>
					<td><input type="text" placeholder="Title" name="title" value="Ms" required><br></td>
					</td>
				</tr>
				<tr>
					<td><b>Enter FirstName:</b>
					<td><input type="text" placeholder="First Name" name="firstName" value="Tom" required><br></td>
					</td>
				</tr>

				<tr>
					<td><b>Enter MiddleName:</b>
					<td><input type="text" placeholder="Middle Name" name="middleName" value="Alex" ><br></td>
					</td>
				</tr>

				<tr>
					<td><b>Enter LastName:</b>
					<td><input type="text" placeholder="Last Name" name="lastName" value="Cruise" required><br></td>
					</td>
				</tr>

				<td><b>Date-Of-Birth :</b>
				<td><input type="date" name="dateOfBirth" required><br></td></td>
				</tr>

				<tr>
					<td><b>Gender:</b>
					<td><input type="radio" name="gender" value="Male">Male
						<input type="radio" name="gender" value="Female">Female
						<input type="radio" name="gender" value="Other">Other<br></td>
				</tr>
				<tr>
					<td><b>Email Id:</b>
					<td><input type="text" placeholder="Enter E-mailId" name="emailId" required></td>
					<br>
					</td>
				</tr>

				<tr>
					<td><b>Mobile Number:</b>
					<td><input type="number" placeholder="Enter MobileNumber" name="mobileNo" required></td>
					<br>
					</td>
				</tr>
				<tr>
					<td><b>Adhaar Card Number:</b>
					<td><input type="number" placeholder="Enter AdharCard Number" name="adhaarCardNo" required></td>
					<br>
					</td>
				</tr>
				<tr>
					<td><b>PAN Card Number:</b>
					<td><input type="text" placeholder="Enter PAN Card Number" name="panCardNo" required></td>
					<br>
					</td>
				</tr>
				


				<tr>

					<td>
						<p>
							<b>Residential address</b>
						</p>
					</td>
				</tr>
				<tr>
					<td><b>Plot No. :
							<td>
							<input type="text" name="residentialAddress.plotNo" >
						</td>
				</tr>
				<tr>
					<td><b>Street :
							<td>
							<input type="text" name="residentialAddress.street" required>
						</td>
				</tr>
				<tr>
					<td><b>City:
							<td><input type="text" name="residentialAddress.city" value="pune" required>
						</td>
				</tr>
				<tr>
					<td><b>City:
							<td><input type="text" name="residentialAddress.district" value="pune" required>
						</td>
				</tr>
				<tr>
					<td><b>State :</b>
					<td><input type="text" name="residentialAddress.state" required></td>
					<br>
					</td>

				</tr>

				<tr>
					<td><b>Zip Code:</b>
					<td><input type="number" placeholder="Enter Pincode"
						name="residentialAddress.zip" required><br></td>
					</td>
				</tr>
				
                 <tr>
                    <td>
                
                <input type="checkbox" name="restoo" onclick="ResidentialAddress(this.form)">
<em>Check this box if Residential Address and Permanent Address are the same.</em>
                </td>  
                </tr>

<script>
function ResidentialAddress(r) {
	  if(r.restoo.checked == true) {
	    r.(permanentAddress.plotNo).value = r.(residentialAddress.plotNo).value;
	    r.permanentAddress.street.value = r.residentialAddress.street.value;
	    r.permanentAddress.city.value = r.residentialAddress.city.value;
	    r.permanentAddress.state.value = r.residentialAddress.state.value;
	    r.permanentAddress.zip.value = r.residentialAddress.zip.value;
	   
	  }
	}


</script>


<script>
function checkCheckBox(f){
	if (f.agree.checked == false )
	{
	alert('Please check the box to continue.');
	return false;
	}else
	return true;
	}


</script>
			<tr>

					<td>
						<p>
							<b>Permanent address</b>
						</p>
					</td>
				</tr>
				<tr>
					<td><b>Plot No. :
							<td>
							<input type="text" name="permanentAddress.plotNo" >
						</td>
				</tr>
				<tr>
					<td><b>Street :
							<td>
							<input type="text" name="permanentAddress.street" required>
						</td>
				</tr>
				<tr>
					<td><b>City:
							<td><input type="text" name="permanentAddress.city" value="pune" required>
						</td>
				</tr>
				<tr>
					<td><b>District:
							<td><input type="text" name="permanentAddress.district" value="pune" required>
						</td>
				</tr>
				<tr>
					<td><b>State :</b>
					<td><input type="text" name="permanentAddress.state" required></td>
					<br>
					</td>

				</tr>
				<tr>
					<td><b>Zip Code:</b>
					<td><input type="number" placeholder="Enter Pincode"
						name="permanentAddress.zip" required><br></td>
					</td>
				</tr>
				<tr>
					<td><b>Occupation:
							<td><input type="text" name="occupation" value="Private Company"></td>
				</tr>
				<tr>
					<td><b>Nationality:
							<td><input type="text" name="nationality"
								value="Indian"></td>
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