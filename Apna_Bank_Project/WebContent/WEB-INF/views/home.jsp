<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>APNA BANK</title>
<link rel="stylesheet" href="resources\css\home.css">
<!-- <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"> -->
<script src=".\home.js"></script>
<script src=".\home1.js"></script>
<title>Home Page APNA BANK</title>
</head>
<body>
	<ul>
		<!-- Logo in the nav bar -->
		<li>
			<div class="logo-image">
				<img src="resources\images\ApnaBank.png" class="img-fluid">
			</div>
		</li>


		<!-- Navigation Bar -->

		<li><a href="#home">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				Home</a></li>
		<li><a href="#about">About</a></li>
		<li><a href="#address">Address</a></li>
		<li><a href="#contact">Contact</a></li>
		<li><a href="admin.jsp">Admin</a></li>

	</ul>


	<img src="resources\images\Logo.jpg" heigth=auto, width=100%>



	<div class="row">
		<div class="column" style="background-color: #aaa;">
			<h2>Column 1</h2>
			<p>Bank offers..</p>
		</div>
		<div class="column" style="background-color: #bbb;">
			<h2>Column 2</h2>
			<p>Bank offers..</p>
		</div>



		<!-- For login, registartion and apply for internet banking -->
		<div class="column" style="background-color: #aaa;">
			<center>
				<br>
				<br>
				 <a href=".\userlogin.jsp">
					<button class="btn login">
						<b>Login </b>
					</button>
					
				</a>


				
					
				<br>
				<br> <a href=".\opensavingsacc.jsp">
					<button class="btn intbnk">
						<b>Create new bank account</b>
					</button>
					<br>
				<br>
				</a> <a href=".\register.jsp">
					<button class="btn reg">
						<b>Register </b>
					</button>
					<br>
				<br>
				</a>



			
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



<script>

function openForm() {
	  document.getElementById("myForm").style.display = "block";
	}

	function closeForm() {
	  document.getElementById("myForm").style.display = "none";
	}


</script>




			</center>
		</div>
	</div>


	<!-- Footer: contact, address, social tags -->
	<br>
	<br>
	<div class="row">
		<div class="column2" style="background-color: rgb(212, 168, 168);">
			<a name="contact"></a>
			<h2>Contact us</h2>

			<p>Phone Number: +918888888888</p>
			<p>Email: support@apnabank.com</p>

		</div>
		<div class="column2" style="background-color: rgb(185, 143, 143);">
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