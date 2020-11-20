<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>myTicket - Home - ${user}</title>
</head>
<style>
body {
	background-color: whitesmoke;
}

.movies {
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
	transition: 0.3s;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
	width: 50%;
	box-sizing: 20%;
}

.left {
	margin-top: 20px;
	left: 0;
}

.right {
	margin-top: 20px;
	right: 0;
	position: absolute;
}

.movies:hover {
	box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);
}

.container {
	padding: 2px 16px;
	background-color: whitesmoke;
	opacity: 0.8;
}

.container:hover {
	opacity: 1;
}

input {
	background-color: #34495E;
	border: 0px;
	font-weight: bold;
	color: white;
	border-radius: 14px;
	padding: 8px;
}

input:hover {
	cursor: pointer;
}

p {
	font-family: sans-serif;
}

h3 {
	font-family: cursive;
}
</style>
<body>

	<%@ include file="/WEB-INF/Views/header.html"%>

	<div class="movies right">

		<img src="">
		<div class="container">
			<h3></h3>
			<p class="dire" id="3">Description :</p>
			<p class="director">Director :</p>
			<form action="/movies-myticket/book-ticket" method="GET">
				<input type="hidden" value="screen-d" name="screen"> <input
					type="submit" value="Book">
			</form>
			<br>
		</div>
	</div>

	<div class="movies left">

		<img src="" alt="Avatar" style="width: 100%">
		<div class="container">
			<h3></h3>
			<p class="desc" id="0">Description :</p>
			<p class="director">Director :</p>
			<form action="/movies-myticket/book-ticket" method="GET">
				<input type="hidden" value="screen-a" name="screen"> <input
					type="submit" value="Book">
			</form>
			<br>

		</div>
	</div>

	<div class="movies right">

		<img src="">
		<div class="container">
			<h3></h3>
			<p class="dire" id="2">Description :</p>
			<p class="director">Director :</p>
			<form action="/movies-myticket/book-ticket" method="GET">
				<input type="hidden" value="screen-c" name="screen"> <input
					type="submit" value="Book">
			</form>
			<br>
		</div>
	</div>



	<div class="movies left">

		<img src="">
		<div class="container">
			<h3></h3>
			<p class="dire" id="1">Description :</p>
			<p class="director">Director :</p>
			<form action="/movies-myticket/book-ticket" method="GET">
				<input type="hidden" value="screen-b" name="screen"> <input
					type="submit" value="Book">
			</form>
			<br>
		</div>
	</div>



	<script src="/js/newHome.js"></script>

</body>

</html>