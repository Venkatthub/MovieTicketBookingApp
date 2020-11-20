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
	margin: -8px;
	text-align: center;
	font-size: 100px;
	font-family: cursive;
	color: whitesmoke;
	background-color: #163A5F;
}

.container {
	height: 100%;
	width: 50%;
	position: fixed;
	top: 19%;
	padding-top: 0%;
}

.left {
	left: 0;
	background-image: url("images/left.jpg");
	background-size: 770px;
}

.right {
	right: 0;
	background-image: url("images/right.jpg");
	background-size: 700px;
}

.centered {
	position: absolute;
	top: 40%;
	left: 40%;
	transform: translate(-30%, -30%);
	text-align: center;
}

button {
	text-align: center;
	background-color: #34495E;
	padding: 50px;
	border: 0ch;
	color: aliceblue;
	font-size: x-large;
	font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS',
		sans-serif;
	margin-top: 250px;
}

button:hover {
	cursor: pointer;
	box-shadow: 0 15px 30px 0 rgba(0, 0, 0, 0.2);
	transition: 0.3s;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
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