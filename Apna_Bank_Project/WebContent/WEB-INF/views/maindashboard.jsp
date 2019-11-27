<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href='https://fonts.googleapis.com/css?family=Share+Tech+Mono'
	rel='stylesheet' type='text/css'>

<script src="resources\js\maindashboard.js"></script>
<link rel="stylesheet" href="resources\css\maindashboard.css">
<link rel="stylesheet" href="resources\css\card.css">

<style>

		@CHARSET "ISO-8859-1";

/* body {
    background-image: url('card4.jpg');
    background-repeat: no-repeat;
    background-size:80% 80%;
    background-position: center;
  } */
.accno {
	background: rgba(255, 255, 255, 0.4);
	border: none;
	text-align: center;
	font-size: 40px;
	font-family: Share Tech Mono;
	color: transparent;
	text-shadow: -2px -2px 2px rgba(255, 255, 255, 1), 1px 1px 1px
		rgba(0, 0, 0, 0.9), 2px -2px 4px rgba(255, 255, 255, 1), -2px -2px 2px
		rgba(0, 0, 0, 0.9), -2px 2px 1px rgba(0, 0, 0, 0.9);
	-webkit-text-stroke: 2px rgba(0, 0, 0, 0.4);
	/* position: relative; */
	display: block;
	outline: none;
	width: 500px;
	height: 40px;
	top: 250px;
	margin: 0 auto;
	padding: 10px;
	color: #333;
	-webkit-box-shadow: 0 2px 10px 1px rgba(0, 0, 0, 0.5);
	box-shadow: 0 2px 10px 1px rgba(0, 0, 0, 0.5);
}

::-webkit-input-placeholder {
	color: #666;
}

:-moz-placeholder {
	color: #666;
}

::-moz-placeholder {
	color: #666;
}

:-ms-input-placeholder {
	color: #666;
}

.validlabel1 {
	font-size: 30px;
	padding-right: 200px;
	margin: 0%;
}

.validlabel2 {
	font-size: 20px;
	margin: 0%;
	color: aliceblue
}

.validfromtext {
	background: rgba(255, 255, 255, 0.4);
	border: none;
	text-align: center;
	font-size: 15px;
	/* position: relative; */
	display: block;
	outline: none;
	width: 200px;
	height: 30px;
	top: 250px;
	/* margin: -2%; */
	/* padding: 10px;  */
	/* margin-left: 20px; */
	color: #333;
	-webkit-box-shadow: 0 2px 10px 1px rgba(0, 0, 0, 0.5);
	box-shadow: 0 2px 10px 1px rgba(0, 0, 0, 0.5);
}

::-webkit-input-placeholder {
	color: #666;
}

:-moz-placeholder {
	color: #666;
}

::-moz-placeholder {
	color: #666;
}

:-ms-input-placeholder {
	color: #666;
}

input[type=text] {
	/* background: color #000; */
	opacity: 0.5;
	color: #b08f26;
	border: none;
	background: #000;
	/* color:#fff; */
	/* width:191px;
	height:122px; */
	/* for IE */
	filter: alpha(opacity = 60);
	/* CSS3 standard */
	opacity: 0.6;
}

.textdeco {
	text-align: center;
	height: 50px;
	width: 100px;
	font-size: 40px;
	font-family: Share Tech Mono;
	color: transparent;
	text-shadow: -2px -2px 2px rgba(255, 255, 255, 1), 1px 1px 1px
		rgba(0, 0, 0, 0.9), 2px -2px 4px rgba(255, 255, 255, 1), -2px -2px 2px
		rgba(0, 0, 0, 0.9), -2px 2px 1px rgba(0, 0, 0, 0.9);
	-webkit-text-stroke: 2px rgba(0, 0, 0, 0.4);
}

.textdeco1 {
	text-align: center;
	height: 50px;
	width: 200px;
	font-size: 40px;
	font-family: Share Tech Mono;
	color: transparent;
	text-shadow: -2px -2px 2px rgba(255, 255, 255, 1), 1px 1px 1px
		rgba(0, 0, 0, 0.9), 2px -2px 4px rgba(255, 255, 255, 1), -2px -2px 2px
		rgba(0, 0, 0, 0.9), -2px 2px 1px rgba(0, 0, 0, 0.9);
	-webkit-text-stroke: 2px rgba(0, 0, 0, 0.4);
}

.textdeco2 {
	text-align: center;
	height: 50px;
	width: 200px;
	font-size: 40px;
	font-family: Share Tech Mono;
	color: transparent;
	text-shadow: -2px -2px 2px rgba(255, 255, 255, 1), 1px 1px 1px
		rgba(0, 0, 0, 0.9), 2px -2px 4px rgba(255, 255, 255, 1), -2px -2px 2px
		rgba(0, 0, 0, 0.9), -2px 2px 1px rgba(0, 0, 0, 0.9);
	-webkit-text-stroke: 2px rgba(0, 0, 0, 0.4);
}

.textdeco3 {
	text-align: center;
	height: 50px;
	width: 500px;
	font-size: 50px;
	font-family: Share Tech Mono;
	color: transparent;
	text-shadow: -2px -2px 2px rgba(255, 255, 255, 1), 1px 1px 1px
		rgba(0, 0, 0, 0.9), 2px -2px 4px rgba(255, 255, 255, 1), -2px -2px 2px
		rgba(0, 0, 0, 0.9), -2px 2px 1px rgba(0, 0, 0, 0.9);
	-webkit-text-stroke: 2px rgba(0, 0, 0, 0.4);
}

/* flip related stylings */
.flip-box {
	background-color: transparent;
	width: 500px;
	height: 500px;
	border: 1px solid #f1f1f1;
	perspective: 1000px;
}

.flip-box-inner {
	position: relative;
	width: 150%;
	height: 100%;
	text-align: center;
	transition: transform 0.3s;
	transform-style: preserve-3d;
}

.flip-box:hover .flip-box-inner {
	transform: rotateY(180deg);
}

.flip-box-front, .flip-box-back {
	position: absolute;
	width: 100%;
	height: 100%;
	backface-visibility: hidden;
	background-position: center;
}

.flip-box-front {
	/* background-color: black; */
	background-image: url('resources/images/card.JPG');
	background-size: 100% 100%;
	background-repeat: no-repeat;
	color: black;
	background-position: center;
}

.flip-box-back {
	background-color: #555;
	color: white;
	background-image: url('resources/images/black.JPG');
	background-size: 100% 100%;
	background-repeat: no-repeat;
	transform: rotateY(180deg);
	background-position: center;
}
		
		
</style>



<title>User Dashboard</title>
</head>
<body class="w3-light-grey" onload="StartTimers();"
	onmousemove="ResetTimers();">

	<!-- Top container -->
	<div class="w3-bar w3-top w3-white w3-large"
		style="z-index: 5; height: 60px;">

		<button
			class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey"
			onclick="w3_open();">
			<i class="fa fa-bars"></i> Menu
		</button>
		<span class="w3-bar-item w3-left"> <img
			src="resources\images\ApnaBank.png" style="width: 95px" style="height: 60px">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
		</span>
		<header class="w3-container w3-left w3-third"
			style="padding-top:0px; width:1000px;height:60px">

		<div class="w3-row-padding w3-margin-bottom ">
			<center>
				<div class="w3-quarter">
					<div class="w3-container  w3-button w3-bar-item "
						style="width: 330px; color: white; background-color: black;"
						onclick="openCity(event, 'accountStatement')">

						<a href="#" style="text-decoration: none;">
							<h6>Account Statement</h6>
						</a>

					</div>
				</div>
			</center>
			<div class="w3-quarter">
				<div class="w3-container w3-button w3-bar-item "
					style="width: 330px; background-color: rgb(233, 34, 27); color: black;"
					onclick="openCity(event, 'fundsTransfer')">

					<a href="#" style="text-decoration: none;">
						<h6>Funds Transfer</h6>
					</a>
				</div>
				
				
				
				<script>

				/**
				 * 
				 */



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

				// <!-- Tab Content for displaying code in the same block without refresing the whole window -->

				    function openCity(evt, cityName) {
				      var i, tabcontent, tablinks;
				      tabcontent = document.getElementsByClassName("tabcontent");
				      for (i = 0; i < tabcontent.length; i++) {
				        tabcontent[i].style.display = "none";
				      }
				      tablinks = document.getElementsByClassName("tablinks");
				      for (i = 0; i < tablinks.length; i++) {
				        tablinks[i].className = tablinks[i].className.replace(" active", "");
				      }
				      document.getElementById(cityName).style.display = "block";
				      evt.currentTarget.className += " active";
				    }


				        function testpass(){
				          
				        var firstnumber=document.form_action.password1.value;
				        var secondnumber=document.form_action.password2.value;
				        if(firstnumber == secondnumber)
				        {
				          alert("Password Changed Successfully");
				         // return myFunction();
				        }
				        else
				        {
				            alert("Password entered/re-entered Incorrectly!");
				            return document.getElementById("passform").reset(); 
				        }
				       
				        }
				       



				        function testacc(){
				          
				          var firstnumber1=document.beneficiary.accountNo1.value;
				        var secondnumber2=document.beneficiary.accountNo2.value;
				         
				          if(firstnumber1 == secondnumber2)
				          {
				            alert("Beneficiary Added Successfully");
				           // return myFunction();
				          }
				          else
				          {
				              alert("Account Number entered/re-entered Incorrectly!");
				              return document.getElementById("beneform").reset(); 
				          }
				         
				          }


				        function userID()
				        {
				          alert("ID changed Successfully");
				        }

				        // <!-- snackbar -->
				       
				                function myFunction() {
				                  var x = document.getElementById("snackbar");
				                  x.className = "show";
				                  setTimeout(function(){ x.className = x.className.replace("show", ""); }, 6000);
				               
				                }
				              // Set timeout variables.
				var timoutWarning = 300000; // Display warning in 14 Mins.
				var timoutNow = 200000; // Timeout in 15 mins.
				var logoutUrl = 'loggedout.jsp'; // URL to logout page.

				var warningTimer;
				var timeoutTimer;

				// Start timers.
				function StartTimers() {
				    warningTimer = setTimeout("IdleWarning()", timoutWarning);
				    timeoutTimer = setTimeout("IdleTimeout()", timoutNow);
				}

				// Reset timers.
				function ResetTimers() {
				    clearTimeout(warningTimer);
				    clearTimeout(timeoutTimer);
				    StartTimers();
				    $("#timeout").dialog('close');
				}

				// Show idle timeout warning dialog.
				function IdleWarning() {
				    $("#timeout").dialog({
				        modal: true
				    });
				}

				// Logout the user.
				function IdleTimeout() {
				    window.location = logoutUrl;
				}
				        
				function preventBack(){window.history.forward();}
				    setTimeout("preventBack()", 0);
				    window.onunload=function(){null};
				</script>
				
				
				
			</div>
			<div class="w3-quarter">
				<div class="w3-container w3-button w3-bar-item"
					style="width: 330px; background-color: rgb(243, 129, 22);"
					onclick="openCity(event, 'userProfile')">

					<a href="#" style="text-decoration: none;">
						<h6>User Profile</h6>
					</a>


				</div>
			</div>
			<div class="w3-quarter">
				<div class="w3-container w3-button w3-bar-item  "
					style="width: 330px; background-color: rgb(243, 203, 22);">

					<a href="#footer" style="text-decoration: none;">
						<h6>Help</h6>
					</a>
				</div>
			</div>


		</div>
		</header>
	</div>


	<!-- Sidebar/menu -->
	<nav class="w3-sidebar w3-collapse w3-white w3-animate-left"
		style="z-index:3;width:300px;" id="mySidebar">
	<br>
	<div class="w3-container w3-row w3-black">
		<div class="w3-col s4">
			<img src="resources\images\cat.jpg" class="w3-circle w3-margin-right"
				style="width: 95px; padding-top: 5px;">
		</div>
		<div class="w3-col s8 w3-bar ">
			&emsp; <span>Welcome, <br>&emsp;<strong>User</strong></span><br>

			<div class="w3-dropdown-hover ">
				<a href="#" class="w3-bar-item w3-button w3-hover-orange"><i
					class="fa fa-user"></i></a>
				<div
					class=" w3-border w3-dropdown-content w3-card-4 w3-bar-block w3-hover-grey"
					style="width: 200px">
					<a href="#" class="w3-bar-item w3-button w3-hover-orange "
						onclick="openCity(event, 'personalInfo')">Personal Information</a>
					<a href="#" class="w3-bar-item w3-button w3-hover-orange"
						onclick="openCity(event, 'accountDetails')">Account Details</a> <a
						href="#" class="w3-bar-item w3-button w3-hover-orange"
						onclick="openCity(event, 'changeId')">Change UserId</a> <a
						href="#" class="w3-bar-item w3-button w3-hover-orange"
						onclick="openCity(event, 'changePassword')">Change Password</a>
				</div>
			</div>
			<!-- <a href="#" class="w3-bar-item w3-button w3-hover-orange"><i class="fa fa-cog"></i></a> -->
			<a href="#" class="w3-bar-item w3-button w3-hover-orange"><i
				class="fa fa-sign-out"></i></a><br>
			<br>
			<br>
		</div>
	</div>

	<div class="w3-container " style="background-color: rgb(243, 129, 22);">



		<h5>Quick Links</h5>
	</div>
	<br>
	<div class="w3-bar-block ">
		<a href="#"
			class="w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black"
			onclick="w3_close()" title="close menu"><i
			class="fa fa-remove fa-fw"></i> Close Menu</a> 
			<a href="#"
			class="w3-bar-item w3-button w3-padding w3-hover-black "
			onclick="openCity(event, 'accountDetails')"><i
			class="fa fa-bank fa-fw"></i> Account Details</a>
			 
			 
			 
			 <form action="summary" method="POST"><input type="submit" value=" Account Summary"></form>
			 
			 
			<a href="summary"
			class="w3-bar-item w3-button w3-padding w3-hover-black"
			onclick="openCity(event, 'accountStatement')"></a>
			<i
			class="fa fa-list-alt fa-fw"></i> Account Statement <a href="#"
			class="w3-bar-item w3-button w3-padding w3-hover-black"
			onclick="openCity(event, 'fundsTransfer')"><i
			class="fa fa-exchange fa-fw"></i> Fund Transfer</a> <a href="#"
			class="w3-bar-item w3-button w3-padding w3-hover-black"
			onclick="openCity(event, 'addBeneficiary')"><i
			class="	fa fa-user-plus fa-fw"></i> Add Beneficiary</a> <br>
		<br>

	</div>

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
	<div class="w3-overlay  w3-animate-opacity" onclick="w3_close()"
		style="cursor: pointer" title="close side menu" id="myOverlay"></div>

	<!-- !PAGE CONTENT! -->

	<div class="w3-main" style="margin-left: 300px; margin-top: 43px;">
		<br>
		<div>
			<marquee>
				<p class="fa fa-warning" style="font-size: 15px; color: red;"
					style="color:red">Please Notify any unauthorized electronic
					transaction on 1-800-425-3801. Longer the time taken to notify,
					Higher the loss.</p>
			</marquee>
		</div>
		<div class="w3-container w3-third img" style="background-image: url(resources\images\2.jpg); background-size: cover; opacity: 0.9; width: 1000px; height: 1200px">
			<div id="accountStatement" class="tabcontent">
				<h3>Account Statement</h3>
				<p>Account Statement code here</p>
			</div>

			<div id="fundsTransfer" class="tabcontent">
				<center>
					<h3>Funds Transfer</h3>
					<input type="radio" name="fundsTransfer" value="neft"
						onclick="openCity(event, 'neft')"> NEFT &emsp;&emsp; <input
						type="radio" name="fundsTransfer" value="imps"
						onclick="openCity(event, 'imps')"> IMPS &emsp;&emsp; <input
						type="radio" name="fundsTransfer" value="rtgs"
						onclick="openCity(event, 'rtgs')"> RTGS
			</div>
			</center>

			<div id="userProfile" class="tabcontent">
				<center>
					<h3>User Profile</h3>
					<br>
					<br> <input type="radio" name="userProfile"
						value="personalInfo" onclick="openCity(event, 'personalInfo')">
					Personal Information &emsp;&emsp; <input type="radio"
						name="userProfile" value="accountDetails"
						onclick="openCity(event, 'accountDetails')"> Account
					Details &emsp;&emsp; <input type="radio" name="userProfile"
						value="cardDetails" onclick="openCity(event, 'cardDetails')">
					Card Details
				</center>
			</div>

			<div id="changeDetails" class="tabcontent">

				<center>
					<h3>Change UserId or Password</h3>
					<br>
					<br> <input type="radio" name="changeDetails" value="changeId"
						onclick="openCity(event, 'changeId')"> Change ID
					&emsp;&emsp; <input type="radio" name="changeDetails"
						value="changePassword" onclick="openCity(event, 'changePassword')">
					Change Password

				</center>
			</div>

				<div id="accountSummary" action="summary" style="width:100%;" class="tabcontent">
				<h3>Account Summary</h3>
				Account No : ${details.accountNo}
			<br>Balance : ${details.balance}
	<br> Recent Transaction :
	<div>
	<table border="1px">

			<th>TransactionId</th>
			<th>Account No</th>
			<th>Recipent Account No</th>
			<th>Transaction Time</th>
			<th>Amount</th>
			<th>Status</th>
		</tr>
		<c:forEach var="list" items="${transactionlist}" begin="1" end="5">
			<tr>
				<td>
					<p>${list.transactionId}</p>
				</td>
				<td>
					<p>${list.accountDetails.accountNo}</p>
				</td>
				<td><p>${list.recipentAccountNo}</p></td>
				<td><p>${list.transactionTime}</p></td>
				<td>
					<p>${list.amount}</p>
				</td>
				<td>
					<p>${list.status}</p>
				</td>
			</tr>
		</c:forEach>
		</table>
		<div>
		<input type="text" value="Account Summary">
	</div>
			
			
			<!-- ADD PAYEE FORM -->
			<div id="addBeneficiary" class="tabcontent  grad1">
				<form name="beneficiary" class="modal-content grad2" id="beneform"
					method="POST">
					<div class="container ">
						<center>
							<h1>Add New Beneficiary</h1>
							<hr>
						</center>
						<label for="beneficiaryName"><b>Beneficiary Name - </b></label> <input
							type="text" name="beneficiaryName" required>
						<hr>

						<label for="accountNo1"><b>Beneficiary Account Number
								- </b></label> <input type="number" name="accountNo1" required>
						<hr>

						<label for="accountNo2"><b>Re-Enter Account Number - </b></label>
						<input type="number" name="accountNo2" required>
						<hr>

						<label for="nickname"><b>Nickname - </b></label> <input
							type="text" name="nickname" required>
						<hr>

						<input type="checkbox"> Save Beneficiary

						<div class="clearfix">

							<br>
							<br>
							<center>
								<button type="submit" onclick="testacc()"
									style="width: 200px; height: 30px; color: rgb(3, 66, 3);"
									class="proceed" value="Save As Beneficiary">Save As
									Beneficiary</button>
							</center>
						</div>

					</div>
				</form>
			</div>

			<div id="personalInfo" class="tabcontent">
				<h3>Personal Information</h3>
			</div>

			<div id="cardDetails" class="tabcontent">
				<h3>Card Details</h3>
				<!--     </div>   -->


				<!-- card code -->

				<div class="flip-box">
					<div class="flip-box-inner">

						<div class="flip-box-front"
							style="background-image: url('resources\images\card4.jpg');">

							<br>
							<br>
							<br>
							<br>
							<br>
							<div>
								<input class="accno" type="text" name="accno" readonly
									value="1234 1234 1234 1234" height="10px" width="20px" required><br>
								<br>
							</div>

							<div style="float: left">

								<div>

									<label class="validlabel2" for="validfrom">Valid From</label> <input
										class="textdeco1" type="text" readonly name="validthru"
										value="10/17" required>
								</div>
								<label class="validlabel2" for="validthru">Valid Thru</label> <input
									class="textdeco2" type="text" readonly name="validthru"
									value="10/21" required>


							</div>

							<div>
								<input class="textdeco3" type="text" name="accholdername"
									value="Tom Alex" required>
							</div>

						</div>

						<div class="flip-box-back">
							<br>
							<br>
							<br>
							<br> <br>
							<br>
							<br>
							<br>

							<center>
								<label class="validlabel2" for="cvv">CVV</label> <input
									class="textdeco" type="text" name="cvv" readonly value="123"
									required><br>
								<br>
							</center>
							<em>Not valid for payment in foreign exchange in Nepal and
								Bhutan</em>
							<pre>
                <p>This card is the property of Apna Bank Ltd., 
                  to whom it must be returned upon request, or if found. 
                The use of this card is governed by APNA Bank's Terms 
                and Conditions Governing Card Facilities.</p>
							</pre>
						</div>
					</div>



				</div>


				<!-- CHANGE ID FORMa -->
				<div id="changeId" class="tabcontent grad1">
					<form name="changeIDForm" class="modal-content " id="idform"
						action="" method="POST">
						<div class="container ">
							<center>
								<h1>Set New User ID</h1>
								<hr>
							</center>
							<label for="userID"><b>Enter Existing User ID - </b></label> <input
								type="text" name="oldUserID" required> <label
								for="userID"><b>Enter New User ID - </b></label> <input
								type="text" name="newUserID" required>


							<center>
								<button onclick="userID()"
									style="width: 200px; height: 30px; color: rgb(3, 66, 3);"
									value="Submit">Submit</button>
							</center>

						</div>
						<!-- <div id="snackbar" >User ID Changed Successfully</div> -->
					</form>
				</div>

				<!-- CHANGE PASSWORD FORM -->

				<div id="changePassword" class="tabcontent grad1">
					<form name="form_action" class="modal-content" id="passform"
						action="">
						<div class="container ">
							<center>
								<h1>Set New Password</h1>
								<hr>
							</center>
							<label for="password1"><b>Enter New Login Password -
							</b></label> <input type="password" name="password1" required> <label
								for="password2"><b>Re-Enter Password - </b></label> <input
								type="password" name="password2" required>


							<center>
								<button onclick="testpass()" formmethod="POST"
									style="width: 200px; height: 30px; color: rgb(3, 66, 3);"
									value="Submit">Submit</button>
							</center>

						</div>


					</form>
				</div>
				<!-- ACCOUNT DETAILS FORM -->

				<div id="accountDetails" class="tabcontent grad1">
					<form name="accountDetails" class="modal-content grad2"
						id="accountDetails" method="POST">
						<div class="container">
							<center>
								<h1>Account Details</h1>
								<hr>
							</center>
							<label for="accountNo"><b>Account Number - </b></label> <input
								type="number" name="accountNo"> <label for="accountType"><b>Account
									Type - </b></label> <input type="text" name="accountType" required>

							<label for="openingDate"><b>Account Opening Date - </b></label> <input
								type="text" name="openingDate" required> <label
								for="ifscCode"><b>IFSC Code - </b></label> <input type="text"
								name="ifscCode" required>

						</div>
					</form>
				</div>

				<!-- NEFT FORM -->
				<div id="neft" class="tabcontent">
					<h3>NEFT</h3>
				</div>

				<!-- IMPS FORM -->
				<div id="imps" class="tabcontent">
					<h3>IMPS</h3>
				</div>

				<!-- RTGS FORM -->
				<div id="rtgs" class="tabcontent">
					<h3>RTGS</h3>
				</div>
				<br>
				<br>
				<br>
				<br>
				<br>
			</div>


			<br><br><br><br><br><br><br><br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br> <br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br> <br>
			<br>
			<br>
			<br>
			<br>

			<!-- end block -->

			<div class="w3-container w3-dark-grey w3-padding-32">
				<div class="w3-row">
					<div class="w3-container w3-third">
						<h5 class="w3-bottombar w3-border-black">Help</h5>
						24*7 Online Customer Service
						<ul>
							<li>1-800-425-3801</li>
							<li>apnabank@lntinfotech.com</li>
						</ul>
					</div>
					<div class="w3-container w3-third">
						<h5 class="w3-bottombar w3-border-red">Branches</h5>
						<ul>
							<li>Pune</li>
							<li>Mumbai</li>
							<li>Bangalore</li>
							<li>Chennai</li>
						</ul>
					</div>
					<div class="w3-container w3-third">
						<h5 class="w3-bottombar w3-border-orange">Follow Us</h5>
						<a href="#" class="w3-bar-item w3-button"><i
							class="fa fa-facebook"></i> Facebook link</a> <a href="#"
							class="w3-bar-item w3-button"><i class="fa fa-twitter"></i>
							Twitter link</a> <a href="#" class="w3-bar-item w3-button"><i
							class="fa fa-instagram"></i> Instagram link</a>

					</div>
				</div>
			</div>


<script>

/**
 * 
 */



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

// <!-- Tab Content for displaying code in the same block without refresing the whole window -->

    function openCity(evt, cityName) {
      var i, tabcontent, tablinks;
      tabcontent = document.getElementsByClassName("tabcontent");
      for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
      }
      tablinks = document.getElementsByClassName("tablinks");
      for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
      }
      document.getElementById(cityName).style.display = "block";
      evt.currentTarget.className += " active";
    }


        function testpass(){
          
        var firstnumber=document.form_action.password1.value;
        var secondnumber=document.form_action.password2.value;
        if(firstnumber == secondnumber)
        {
          alert("Password Changed Successfully");
         // return myFunction();
        }
        else
        {
            alert("Password entered/re-entered Incorrectly!");
            return document.getElementById("passform").reset(); 
        }
       
        }
       



        function testacc(){
          
          var firstnumber1=document.beneficiary.accountNo1.value;
        var secondnumber2=document.beneficiary.accountNo2.value;
         
          if(firstnumber1 == secondnumber2)
          {
            alert("Beneficiary Added Successfully");
           // return myFunction();
          }
          else
          {
              alert("Account Number entered/re-entered Incorrectly!");
              return document.getElementById("beneform").reset(); 
          }
         
          }


        function userID()
        {
          alert("ID changed Successfully");
        }

        // <!-- snackbar -->
       
                function myFunction() {
                  var x = document.getElementById("snackbar");
                  x.className = "show";
                  setTimeout(function(){ x.className = x.className.replace("show", ""); }, 6000);
               
                }
              // Set timeout variables.
var timoutWarning = 300000; // Display warning in 14 Mins.
var timoutNow = 200000; // Timeout in 15 mins.
var logoutUrl = 'loggedout.jsp'; // URL to logout page.

var warningTimer;
var timeoutTimer;

// Start timers.
function StartTimers() {
    warningTimer = setTimeout("IdleWarning()", timoutWarning);
    timeoutTimer = setTimeout("IdleTimeout()", timoutNow);
}

// Reset timers.
function ResetTimers() {
    clearTimeout(warningTimer);
    clearTimeout(timeoutTimer);
    StartTimers();
    $("#timeout").dialog('close');
}

// Show idle timeout warning dialog.
function IdleWarning() {
    $("#timeout").dialog({
        modal: true
    });
}

// Logout the user.
function IdleTimeout() {
    window.location = logoutUrl;
}
        
function preventBack(){window.history.forward();}
    setTimeout("preventBack()", 0);
    window.onunload=function(){null};

</script>



			<!-- Footer -->
			<a name="footer"></a>
			<footer class="w3-container w3-padding-16 w3-light-grey">

			<p>
				Apna Bank Footer<a href="home.jsp">Go to Apna Bank's Home Page</a>
			</p>
			</footer>

			<!-- End page content -->
		</div>
</body>
</html>