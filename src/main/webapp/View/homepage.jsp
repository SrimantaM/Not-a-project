<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
footer {
	font-color: white;
	position: absolute;
	bottom: 0;
	height: 40px;
	margin-top: 40px;
	width: 100%;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #36b4c7;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #146f7d;
}

.active {
	background-color: #146f7d;
}

th, td {
	padding: 15px;
	text-align: left;
}

.button1 {
	font-face: 'Comic Sans MS';
	font-size: larger;
	background-color: #36b4c7;
	color: white;
	border: 2px solid #146f7d;
	border-radius: 2px;
}

p {
	font-face: 'Comic Sans MS';
	font-size: larger;
}

.dropdown {
	float: left;
	overflow: hidden;
}

.dropdown .dropbtn {
	font-size: 16px;
	border: none;
	outline: none;
	color: white;
	padding: 14px 16px;
	background-color: inherit;
	font-family: inherit;
	margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
	background-color: #146f7d;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	float: none;
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

.dropdown-content a:hover {
	background-color: #ddd;
}

.dropdown:hover .dropdown-content {
	display: block;
}

footer {
	background-color: #777;
	padding: 10px;
	text-align: center;
	color: white;
	margin-bottom: 0px;
}
</style>
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">








</head>
<body>





	<ul>
		<li><a href="#about">About </a></li>
		<li><a href="#myDashboard">My Dashboard </a></li>
		<li><a href="#contact">Contact Us</a></li>
		<li style="float: right">
			<div class="dropdown">
				<button class="dropbtn">
					<a class="active" href="#about"><img src="profile1.png"
						height="15" width="15">&nbsp Username</a>
				</button>
				<div class="dropdown-content">
					<a href="#">Logout</a> <a href="#">Sign up</a> <a href="#">Link
						3</a>
				</div>
			</div>
		</li>
	</ul>


	<center>

		<form>
			<table>

				<tr>
					<td><p>Source:</p></td>
					<td><input type="text" name="source"></td>
					<td><p>
							<i class="fa fa-long-arrow-right" style="font-size: 28px"></i>&nbsp
							Destination:
						</p></td>
					<td><input type="text" name="destination"></td>
				</tr>
				<br />
				<tr>
					<td><p>Date of Journey:</p></td>
					<td><input type="date" name="doj"></td>
					<td><p>Date of Return:</p></td>
					<td><input type="date" name="dor"></td>
				</tr>


				<table>
					<br />

					<br />
					<input type="submit" value="Search Bus" class="button1" style="">
					<br />


					</form>



					</center>



					<footer>

						<p>
							<a href="">Copyright information</a> | <a href="">T&C</a> | <a
								href="">Privacy policy</a> | <a href="">FAQs</a>
						</p>
					</footer>
</body>
</html>