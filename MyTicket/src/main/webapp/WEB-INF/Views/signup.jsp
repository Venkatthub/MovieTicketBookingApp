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
	background-image: url("images/login-page-image.jpg");
	background-size: cover;
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
						<td><input style="background-color: transparent;"
							type="submit" value="SignUp" /></td>
					</tr>
				</table>
			</form>


		</div>

	</div>

</body>
<script type="text/javascript">
	let mailRegex = /^([a-z \d \.-]+)@([a-z]{2,20}).([a-z]{2,5})([a-z]{2,5})?/;
	let user = document.getElementById('sign-up-form-userName');
	let email = document.getElementById('sign-up-form-email');
	let password = document.getElementById('sign-up-form-password');
	let retypedPassword = document.getElementById('sign-up-form-retyped');

	document.getElementById("sign-up-form").addEventListener("submit",
			signUpUser);

	function signUpUser(event) {

		if ((retypedPassword.value === password.value)
				&& (validateEmail(email.value))) {
			return;

		} else {

			event.preventDefault();

			if (retypedPassword.value !== password.value) {
				retypedPassword.style.border = 'solid 1px red';
				document.getElementById('sign-up-form-retyped-label').style.visibility = 'visible';

			}

			if (!validateEmail(email.value)) {

				email.style.border = 'solid 1px red';
				document.getElementById('sign-up-form-email-label').style.visibility = 'visible';

			}
		}
	}

	function validateEmail(email) {

		if (mailRegex.test(email)) {

			return true;

		}

		return false;

	}
</script>
</html>