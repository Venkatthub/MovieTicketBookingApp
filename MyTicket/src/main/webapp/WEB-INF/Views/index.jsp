<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
<meta charset="ISO-8859-1">
<title>myTicket</title>
<style>
p {
	top: 0;
	margin: -2px;
	text-align: center;
	font-size: 100px;
	font-family: cursive;
	color: darkblue;
}

.container {
	height: 100%;
	width: 50%;
	position: fixed;
	top: 22%;
	padding-top: 20%;
}

.left {
	left: 0;
	background-color: teal;
	align-content: center;
}

.right {
	right: 0;
	background-color: goldenrod;
	align-content: center;
}

.centered {
	position: absolute;
	top: 20%;
	left: 40%;
	transform: translate(-30%, -30%);
	text-align: center;
}

button {
	text-align: center;
	background-color: black;
	padding: 50px;
	border: 0ch;
	color: aliceblue;
	font-size: x-large;
	font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS',
		sans-serif;
}
</style>
</head>
<body>

	<p>myTicket</p>

	<div class="container left">

		<div class="centered">
			<a href="/login"><button id="login">Existing User</button></a>
		</div>

	</div>
	<div class="container right">

		<div class="centered">

			<a href="/sign-up"><button id="sign-up">New User</button></a>

		</div>

	</div>

</body>
</html>