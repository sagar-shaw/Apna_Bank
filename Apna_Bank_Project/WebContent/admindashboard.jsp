<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/admindashboard.css">
<title>Admin Dashboard</title>
</head>
<body>
<body class="w3-light-grey">

	<!-- Top container -->
	<div class="w3-bar w3-top w3-black w3-large" style="z-index: 4">
		<button
			class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey"
			onclick="w3_open();">
			<i class="fa fa-bars"></i>  Menu
		</button>
		<span class="w3-bar-item w3-right"><img
			src="resources/images/ApnaBank.png" style="width: 95px" style="height: 60px">
		</span>
	</div>

	<!-- Sidebar/menu -->
	<nav class="w3-sidebar w3-collapse w3-white w3-animate-left"
		style="z-index:3;width:300px;" id="mySidebar">
	<br>
	<div class="w3-container w3-row grad1">
		<div class="w3-col s4">
			<img src="resources/images/admin.png" class="w3-circle w3-margin-right"
				style="width: 95px; padding-top: 5px;">
		</div>
		<div class="w3-col s8 w3-bar">
			<span>Welcome, <strong>Administrator</strong></span><br> <a
				href="#" class="w3-bar-item w3-button w3-hover-black"><i
				class="fa fa-envelope"></i></a> <a href="#"
				class="w3-bar-item w3-button w3-hover-black"><i
				class="fa fa-cog"></i></a> <a href="#"
				class="w3-bar-item w3-button w3-hover-black"><i
				class="fa fa-sign-out"></i></a>
		</div>
	</div>
	<hr>
	<div class="w3-container">
		<h5>Quick Links</h5>
	</div>
	<div class="w3-bar-block">
		<a href="#"
			class="w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black"
			onclick="w3_close()" title="close menu"><i
			class="fa fa-remove fa-fw"></i>  Close Menu</a> <a href="#"
			class="w3-bar-item w3-button w3-padding w3-hover-black "><i
			class="fa fa-users fa-fw"></i>  Pending Requests</a> <a href="#"
			class="w3-bar-item w3-button w3-padding w3-hover-black"><i
			class="fa fa-history fa-fw"></i>  All Transactions</a> <a href="#"
			class="w3-bar-item w3-button w3-padding w3-hover-black"><i
			class="fa fa-sign-out fa-fw"></i> Log out</a>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<p>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="datetime"></span>
	</p>

	<script>
  var dt = new Date();
  document.getElementById("datetime").innerHTML = (("0"+dt.getDate()).slice(-2)) +"."+ (("0"+(dt.getMonth()+1)).slice(-2)) +"."+ (dt.getFullYear()) +" "+ (("0"+dt.getHours()).slice(-2)) +":"+ (("0"+dt.getMinutes()).slice(-2));
  </script> </nav>


	<!-- Overlay effect when opening sidebar on small screens -->
	<div class="w3-overlay w3-hide-large w3-animate-opacity"
		onclick="w3_close()" style="cursor: pointer" title="close side menu"
		id="myOverlay"></div>

	<!-- !PAGE CONTENT! -->
	<div class="w3-main" style="margin-left: 300px; margin-top: 43px;">

		<!-- Header -->
		<header class="w3-container" style="padding-top:22px">
		<h5>
			<b><i class="fa fa-dashboard"></i> Admin Dashboard</b>
		</h5>
		</header>


	</div>


	<!-- End page content -->
	</div>
	<div class="w3-container w3-third "
		style="background-image: url(resources/images/2.jpg); background-size: cover; opacity: 0.9; width: 1500px; height: 900px">
	</div>


	<script>
// Get the Sidebar
var mySidebar = document.getElementById("mySidebar");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidebar, and add overlay effect
function w3_open() {
  if (mySidebar.style.display === 'block') {
    mySidebar.style.display = 'none';
    overlayBg.style.display = "none";
  } else {
    mySidebar.style.display = 'block';
    overlayBg.style.display = "block";
  }
}

// Close the sidebar with the close button
function w3_close() {
  mySidebar.style.display = "none";
  overlayBg.style.display = "none";
}
</script>

</body>
</html>