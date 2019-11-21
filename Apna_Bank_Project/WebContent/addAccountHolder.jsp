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
          
            <input type="text"  name="title" required>
            <br>
            <br>

            <label for="firstname"><b>First Name</b></label>
         
            <input type="text"  name="firstName" required>
            <br>  <br>

            
            <label for="middlename"><b>Middle Name</b></label>
           
            <input type="text"  name="middleName" required>
            <br>  <br>

            <label for="lastname"><b>Last Name</b></label>
           
            <input type="text"  name="lastName" required>
            <br>  <br>

            
            <label for="dob"><b>Date Of Birth</b></label>
          
            <input type="text"  name="dateOfBirth" required>
            <br>  <br>

            
            <label for="gender"><b>Gender</b></label>
            
            <input type="text"  name="gender" required>
            <br>  <br>

            <label for="email"><b>Email</b></label>
          
            <input type="email"  name="emailId" required>
            <br>  <br>

            <label for="phno"><b>Phone number</b></label>
           
            <input type="number" name="mobileNo" required>
            <br>  <br>

            <label for="adharno"><b>Adhaar Card Number</b></label>
            
            <input type="text"  name="adhaarCardNo" required>
            <br>  <br>

            <label for="panno"><b>PAN Card Number</b></label>
            
            <input type="text"  name="panCardNo" required>
            <br>  <br>
            
            <h3>Residential Address<br>
			Plot No :<input type="text"  name="residentialAddress.plotNo" required>
            <br>  <br>
            Street :<input type="text"  name="residentialAddress.street" required>
            <br>  <br>
            City :<input type="text"  name="residentialAddress.city" required>
            <br>  <br>
            District :<input type="text"  name="residentialAddress.district" required>
            <br>  <br>
            State :<input type="text"  name="residentialAddress.state" required>
            <br>  <br>
            Zip code :<input type="text"  name="residentialAddress.zip" required>
          
            <br>  <br>
            <h3>Permanent Address<br>
			Plot No :<input type="text"  name="permanentAddress.plotNo" required>
            <br>  <br>
            Street :<input type="text"  name="permanentAddress.street" required>
            <br>  <br>
            City :<input type="text"  name="permanentAddress.city" required>
            <br>  <br>
            District :<input type="text"  name="permanentAddress.district" required>
            <br>  <br>
            State :<input type="text"  name="permanentAddress.state" required>
            <br>  <br>
            Zip code :<input type="text"  name="permanentAddress.zip" required>
          
            <br>  <br>

            <label for="occupation"><b>Occupation</b></label>
            
            <input type="text"  name="occupation" required>
            <br>  <br>

            <label for="nationality"><b>Nationality</b></label>
         
            <input type="text"  name="nationality" required>
            <br>  <br>
<!--             <input type="number"  name="accno" required> -->
<!--             <br>  <br> -->

<!--             <label for="docid"><b>Document Id</b></label> -->
            
<!--             <input type="number"  name="docid" required> -->
<!--             <br>  <br> -->

            <input type="submit" value="Submit">
            </form>
</body>
</html>