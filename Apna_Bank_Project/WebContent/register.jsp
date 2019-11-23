<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="D:\Banking Templates\CSS Pages\registercss.css">
            
           <!-- <script src="D:\Banking Templates\JSP Pages\register.js"></script>   --> 
           
           <link rel="stylesheet" href=".\register.css">
           
            <title>Registration Page</title>
</head>

    <body>
           <form action="register" method="POST" >
                <div class="container">
                  <h1>Register</h1>
                  <hr>
              
                  <label for="accountno"><b>Account Number</b></label>
                  <input type="number" placeholder="Enter Your Account Number" name="accountDetails.accountNo" value="1234567891011121" required>
                  <br>
                  
                  <label for="userid"><b>User Id</b></label>
                  <input type="text" placeholder="Enter Your Userid" name="userId" value="tomanne123" required>
                  <br>
                 
              
                  <label for="password"><b>Password</b></label>
                  <input type="password" placeholder="Enter Your Password" name="password" value="tom123" required>
                <br>
                                	
                  <label for="profilepassword"><b>Profile Password</b></label>
                  <input type="password" placeholder="Enter Your Profile Password" name="profilePassword" value="tom234" required>
				<br>
				
                
                <input type="submit" value="Submit">
                </div>
                
               <!--  <div class="container signin">
                  <p>Already have an account? <a href="#">Sign in</a>.</p>
                </div> -->
              </form>
</body>
</html>