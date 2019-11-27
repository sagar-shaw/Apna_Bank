<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Card Details</title>
<link rel="stylesheet" href="resources/css/card.css">
<!-- <link href='https://fonts.googleapis.com/css?family=Signika:400' rel='stylesheet' type='text/css'> -->
<link href='https://fonts.googleapis.com/css?family=Share+Tech+Mono'
	rel='stylesheet' type='text/css'>

<meta name="viewport" content="width=device-width, initial-scale=1">


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
	background-color: black;
	background-image: url('resources/images/card4.JPG');
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
</head>
<body>

	<div class="flip-box">
		<div class="flip-box-inner">

			<div class="flip-box-front">

				<br>
				<br>
				<br>
				<br>
				<br>
				<div>
					<input class="accno" type="text" name="accno"
						value="1234 1234 1234 1234" height="10px" width="20px" required><br>
					<br>
				</div>

				<div style="float: left">

					<div style="float: left">

						<label class="validlabel2" for="validfrom">Valid From</label>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
							class="textdeco1" type="text" name="validthru" value="10/17"
							required><br>
						<br>
					</div>
					<label class="validlabel2" for="validthru">Valid Thru</label>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input class="textdeco2"
						type="text" name="validthru" value="10/21" required><br>
					<br>
					<br>


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
						class="textdeco" type="text" name="cvv" value="123" required><br>
					<br>
				</center>
				<em>Not valid for payment in foreign exchange in Nepal and
					Bhutan</em>
				<pre>
    <p>This card is the property of Apna Bank Ltd., to whom it must be returned upon request, or if found. 
    The use of this card is governed by APNA Bank's Terms and Conditions Governing Card Facilities.</p>
				</pre>
			</div>
		</div>
</body>
</html>