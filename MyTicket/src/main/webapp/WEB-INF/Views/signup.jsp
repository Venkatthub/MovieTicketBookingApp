<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>myTicket - Sign up</title>
<style>
.container {
	height: 100%;
	width: 50%;
	position: fixed;
	top: 0;
	padding-top: 20%;
}

.left {
	left: 0;
	background-image: url("images/ironman.jpg");
	background-size: contain;
}

.right {
	right: 0;
	background-color: inherit;
	align-content: center;
}

.centered {
	position: absolute;
	top: 20%;
	left: 40%;
	transform: translate(-30%, -30%);
	text-align: center;
}

form {
	font-size: 50px;
	padding: 30px;
}

input {
	font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande',
		'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
	padding: 10px;
	font-size: large;
	border: 0px;
}

p {
	font-size: 50px;
	font-family: cursive;
	color: darkblue;
}
</style>
</head>
<body>

	<div class="container left">

		<div class="left-login"></div>

	</div>
	<div class="container right">



		<div class="centered">

			<p>myTicket</p>

			<form action="/sign-up/user" id="sign-up-form" method="post">
				<table>
					<tr>
						<td><input
							style="border-bottom: 2px solid; border-bottom-color: silver;"
							id="sign-up-form-userName" type="text" name="userName"
							required="required" placeholder="Username" /></td>
					</tr>
					<tr>
						<td><input
							style="border-bottom: 2px solid; border-bottom-color: silver;"
							id="sign-up-form-email" type="text" name="userMail"
							required="required" placeholder="Email" /></td>
						<td><label id='sign-up-form-email-label' for="userMail"
							style="color: red; visibility: hidden; font-size: large;">Invalid
								Email ID</label></td>
					</tr>
					<tr>
						<td><input
							style="border-bottom: 2px solid; border-bottom-color: silver;"
							id="sign-up-form-password" type="password" name="password"
							required="required" placeholder="Password" /></td>
					</tr>
					<tr>
						<td><input
							style="border-bottom: 2px solid; border-bottom-color: silver;"
							id="sign-up-form-retyped" type="password" name="retype-password"
							required="required" placeholder="Re-Enter Password" /></td>
						<td><label id='sign-up-form-retyped-label'
							for="retype-password"
							style="color: red; visibility: hidden; font-size: large;">Password
								dosen't match</label></td>
					</tr>
					<tr>
						<td><input
							style="background-color: #34495E; color: whitesmoke; border-radius: 10%; padding: 8px;"
							type="submit" value="SignUp" /></td>
					</tr>
					<tr>
						<td
							style="font-size: large; font-family: Lucida Sans ', ' Lucida Sans Regular ', ' Lucida Grande ', ' Lucida Sans Unicode ', Geneva, Verdana, sans-serif;">Already
							have a account? <a href="/login">Login</a>
						</td>
					</tr>
				</table>
			</form>

		</div>

	</div>

	<script src="/js/signUp.js"></script>

</body>
</html>