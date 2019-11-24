<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="external.css">

<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<title>Login page</title>
</head>

<body>
	<center>
		<u><b>
				<ul>

					<li><a href="#about"> About </a></li>
					<li><a href="#myDashboard">My Dashboard </a></li>
					<li><a href="#contact">Contact Us</a></li>
					</span>

					<li style="float: right">
						<div class="dropdown">
							<button class="dropbtn">
								<a class="active" href="#about">&nbsp Username</a>
							</button>
							<div class="dropdown-content">
								<a href="#">Logout</a> <a href="#">Sign up</a> <a href="#">Profile</a>
							</div>
						</div>
					</li>
				</ul>
				<h1 class="heading">Login Form</h1></u>
		<div class="logo">
			<img src="bus logo.png">
		</div>
		<div class="enclose">

			<form action="login.lti" method="post">
				<table style="with: 70%" align="left">
					<tr>
						<td></td>
					</tr>
					<tr>
						<td>Email :</td>
						<td></td>
						<td><input type="email" name="email"
							placeholder="Enter email address" /></td>
					</tr>

				</table>
				<br /> <input type="submit" value="Sign-In" class="button_signin" />
			</form>
			<br /> <a href="ForgetPassword.jsp">Forgot Password ?</a><br>

			<table>
				<tr>
					<td></td>
					<td></td>
					<td>
						<form>
							<input type="reset" value="Cancel" class="button1" />
						</form>
					</td>
					<td></td>
					<td>
						<form action="registration.jsp">
							<input type="submit" name="Sign_up" value="Sign-up"
								class="button1" />
						</form>
					</td>
				</tr>
			</table>
			<br>
		</div>
		<br>

		<!-- ------------------------ -->

	</center>
	</b>

</body>
</html>