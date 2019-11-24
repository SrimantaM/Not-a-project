<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login-Signup page</title>
<script> 
          
            // Function to check Whether both passwords 
            // is same or not. 
            function checkPassword(form) { 
                password1 = form.password.value; 
                password2 = form.cpassword.value; 
  
                // If password not entered 
                if (password1 == '') 
                    alert ("Please enter Password"); 
                      
                // If confirm password not entered 
                else if (password2 == '') 
                    alert ("Please enter confirm password"); 
                      
                // If Not same return False.     
                else if (password1 != password2) { 
                    alert ("\nPassword did not match: Please try again...") 
                    return false; 
                } 
  
      } 
        </script>
</head>

<body>
	<center>
		<u><b>
				<h1>Register Form</h1></u>
		<form method="post" action="registration.lti">
			<!-- onSubmit = "return checkPassword(this)" -->
			<table style="with: 50%">
				<tr>
					<td>First Name :</td>
					<td><input type="text" name="firstName" /></td>
				</tr>
				<tr>
					<td>Last Name :</td>
					<td><input type="text" name="lastName" /></td>
				</tr>
				<tr>
					<td>Email :</td>
					<td><input type="email" name="email" /></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Confirm Password :</td>
					<td><input type="password" name="cpassword" /></td>
				</tr>
				<tr>
					<td>Contact No :</td>
					<td><input type="text" name="contact" /></td>
				</tr>
			</table>
			<input type="submit" value="Signup" /> <input type="reset"
				value="Cancel" />
	</center>
	</form>
</body>
</html>