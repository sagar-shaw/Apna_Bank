<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<meta name="viewport" charset="ISO-8859-1" content="width=device-width, initial-scale=1">
     	<title>APNA BANK</title>
        <link rel="stylesheet" href="./home1.css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <script src="Scripts/script.js"></script>
</head>



<body>
<ul>
                        <!-- Logo in the nav bar -->
                          <li>  <div class="logo-image">
                                  <img src="Images/Logo1.ico" class="img-fluid">
                            </div></li>
            

                              <!-- Navigation Bar -->

                  <li><a href="#home">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      Home</a>
                    </li>
                  <li><a href="#about">About</a></li>
                  <li><a href="#address">Address</a></li>
                  <li><a href="#contact">Contact</a></li>
                  <li><a href="#admin">Admin</a></li>
                
                </ul>

               
                <!-- Images for image slider -->

                    <div class="slideshow-container">

                      <div class="mySlides fade">
                        <div class="numbertext">1 / 3</div>
                        <img src="Images\Logo.jpg" style="width:100%">
                      </div>
                      
                      <div class="mySlides fade">
                        <div class="numbertext">2 / 3</div>
                        <img src="Images\Logo.jpg" style="width:100%">
                      </div>
                      
                      <div class="mySlides fade">
                        <div class="numbertext">3 / 3</div>
                        <img src="Images\Logo.jpg" style="width:100%">
                      </div>
                      
                      </div>
                      <br>
                      
                      <div style="text-align:center">
                        <span class="dot"></span> 
                        <span class="dot"></span> 
                        <span class="dot"></span> 
                      </div>
                      


                      <!-- Script for image slider -->

                      <script>
                        var slideIndex = 0;
                        showSlides();
                        
                        function showSlides() {
                          var i;
                          var slides = document.getElementsByClassName("mySlides");
                          var dots = document.getElementsByClassName("dot");
                          for (i = 0; i < slides.length; i++) {
                            slides[i].style.display = "none";  
                          }
                          slideIndex++;
                          if (slideIndex > slides.length) {slideIndex = 1}    
                          for (i = 0; i < dots.length; i++) {
                            dots[i].className = dots[i].className.replace(" active", "");
                          }
                          slides[slideIndex-1].style.display = "block";  
                          dots[slideIndex-1].className += " active";
                          setTimeout(showSlides, 2000); // Change image every 2 seconds
                        }
                        </script>

<!-- 2nd layer of the home page -->

<div class="row">
  <div class="column" style="background-color:#aaa;">
    <h2>Column 1</h2>
    <p>Bank offers..</p>
  </div>
  <div class="column" style="background-color:#bbb;">
    <h2>Column 2</h2>
    <p>Bank offers..</p>
  </div>



  <!-- For login, registartion and apply for internet banking -->
  <div class="column" style="background-color:#aaa;">
    <center>
      <br><br>
    <button class="btn intbnk"><b>Create new bank account</b></button><br><br>
    <a href="D:\Banking Templates\HTML Pages\register.html">
    <button class="btn reg" ><b>Register for internet banking</b></button><br><br>
  </a>
    <button class="btn login"onclick="openForm()"><b>Login</b></button><br><br>

<!-- pop-up login form -->

<div class="form-popup" id="myForm">
  <centre></centre>
    <form action="" class="form-container">
  
      <label for="email"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="username" required>
  
      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="psw" required>
  
      <button type="submit" class="login">Login</button>
      <button type="submit" class="forgot">Forgot username/password</button>
      <button type="button" class="btn cancel" onclick="closeForm()">Close</button>
    </form>
  </centre>
  </div>




  </center>
  </div>
</div>


<!-- Footer: contact, address, social tags -->
<br><br>
<div class="row">
    <div class="column2" style="background-color:rgb(212, 168, 168);">
      <a name="contact"></a>
      <h2 >Contact us</h2>
     
      <p>Phone Number: +918888888888</p>
      <p>Email: support@apnabank.com</p>
   
    </div>
    <div class="column2" style="background-color:rgb(185, 143, 143);">
        <a name="address"></a>
      <h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Address</h2>
      <pre>
        Ambe Prerna Cooperative Society,
        Savali, Ghansoli,
        Mumbai,Maharashtra 400701
      </pre>
    </div>

</body>
</html>