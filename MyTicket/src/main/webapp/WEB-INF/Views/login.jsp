<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>myTicket - Login</title>

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
	background-image: url("images/sign-up-page-image.jpg");
	background-size: 11in;
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

			<h3
				style="font-family: cursive; color: green; font-style: oblique; font-weight: lighter;">${message}</h3>

			<form action="/users" method="post">
				<table>
					<tr>
						<td><input
							style="border-bottom: 2px solid; border-bottom-color: silver;"
							type="text" name="userEmail" required="required"
							placeholder="Email" /></td>
					</tr>
					<tr>
						<td><input
							style="border-bottom: 2px solid; border-bottom-color: silver;"
							type="password" name="userPassword" required="required"
							placeholder="Password" /></td>
					</tr>
					<tr>
						<td><input
							style="background-color: #34495E; color: whitesmoke; border-radius: 10%; padding: 8px;"
							type="submit" value="login" /></td>
					</tr>
					<tr>
						<td
							style="font-size: large; font-family: Lucida Sans ', ' Lucida Sans Regular ', ' Lucida Grande ', ' Lucida Sans Unicode ', Geneva, Verdana, sans-serif;"
							colspan="2">Don't have an account? <a href="/signup">Sign
								up</a></td>
					</tr>
				</table>
			</form>


		</div>

	</div>

</body>
</html>