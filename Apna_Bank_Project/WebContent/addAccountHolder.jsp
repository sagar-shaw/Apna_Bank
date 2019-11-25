<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Open Savings Account</title>
</head>
    <body>
    <form action="add" method="POST" >
            <h1>Open Savings account</h1>
            <p>Please fill in this form carefully</p>
            <hr>
        
            <label for="title"><b>Title</b></label>
          
            <input type="text"  name="title" >
            <br>
            <br>

            <label for="firstname"><b>First Name</b></label>
         
            <input type="text"  name="firstName" required>
            <br>  <br>

            
            <label for="middlename"><b>Middle Name</b></label>
           
            <input type="text"  name="middleName" >
            <br>  <br>

            <label for="lastname"><b>Last Name</b></label>
           
            <input type="text"  name="lastName" required >
            <br>  <br>

            
            <label for="dob"><b>Date Of Birth</b></label>
          
            <input type="text"  name="dateOfBirth" >
            <br>  <br>

            
            <label for="gender"><b>Gender</b></label>
            
            <input type="text"  name="gender" >
            <br>  <br>

            <label for="email"><b>Email</b></label>
          
            <input type="email"  name="emailId" >
            <br>  <br>

            <label for="phno"><b>Phone number</b></label>
           
            <input type="number" name="mobileNo" >
            <br>  <br>

            <label for="adharno"><b>Adhaar Card Number</b></label>
            
            <input type="text"  name="adhaarCardNo" >
            <br>  <br>

            <label for="panno"><b>PAN Card Number</b></label>
            
            <input type="text"  name="panCardNo" >
            <br>  <br>
            
            <h3>Residential Address<br>
			Plot No :<input type="text"  name="residentialAddress.plotNo" >
            <br>  <br>
            Street :<input type="text"  name="residentialAddress.street" >
            <br>  <br>
            City :<input type="text"  name="residentialAddress.city" >
            <br>  <br>
            District :<input type="text"  name="residentialAddress.district" >
            <br>  <br>
            State :<input type="text"  name="residentialAddress.state" >
            <br>  <br>
            Zip code :<input type="text"  name="residentialAddress.zip" >
          
            <br>  <br>
            <h3>Permanent Address<br>
			Plot No :<input type="text"  name="permanentAddress.plotNo" >
            <br>  <br>
            Street :<input type="text"  name="permanentAddress.street" >
            <br>  <br>
            City :<input type="text"  name="permanentAddress.city" >
            <br>  <br>
            District :<input type="text"  name="permanentAddress.district" >
            <br>  <br>
            State :<input type="text"  name="permanentAddress.state" >
            <br>  <br>
            Zip code :<input type="text"  name="permanentAddress.zip" >
          
            <br>  <br>

            <label for="occupation"><b>Occupation</b></label>
            
            <input type="text"  name="occupation" >
            <br>  <br>

            <label for="nationality"><b>Nationality</b></label>
         
            <input type="text"  name="nationality" >
            <br>  <br>

<!--             <input type="number"  name="accno" required> -->
<!--             <br>  <br> -->

<!--             <label for="docid"><b>Document Id</b></label> -->
            
<!--             <input type="number"  name="docid" required> -->
<!--             <br>  <br> -->

            <input type="submit" value="Submit">
 </form>
            
    <br><br><br><br>        
            
  <!--          branch details-->
<form action ="createAccount", method="Post">
   <label for="Accounttype"><b>Account type</b></label>
  <select name="type">
  <option value="1">Savings Account</option>
  <option value="2">Current Account</option>
  </select>
<br><br>
  <label for="branch"><b>Branch</b></label>
  <select name="ifsccode">
  <option value="IFSC111">Bangalore</option>
  <option value="IFSC112">kolkata</option>
  <option value="IFSC113">Delhi</option>
  <option value="IFSC114">Pune</option>
  <option value="IFSC111">Mumbai</option>
</select>
 <input type="submit" value="Submit">
</form>

<br><br>
//documents
<form method="POST" action="documentUpload" enctype="multipart/form-data">
		Upload your Aadhar Card: <input type="file" name="file"><br /> 
		Enter Aadhar Card number: <input type="text" name="fileName"><br /> <br /> 
		Upload your PAN Card: <input type="file" name="file"><br /> 
		Enter PAN number: <input type="text" name="fileName"><br /> <br />
		Upload your passport photograph: <input type="file" name="file"><br /> 
		<input type="submit" value="Upload"> Press here to upload the file!
	</form>

</body>
</html>