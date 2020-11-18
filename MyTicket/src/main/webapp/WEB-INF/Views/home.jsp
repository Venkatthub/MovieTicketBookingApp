<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>myTicket - Home</title>
</head>
<body>

	<%@ include file="/WEB-INF/Views/header.html"%>

	<div class="movies">
		<img src="">
		<div class="movie name">
			<h3></h3>
			<div class="desc" id="0">Description :</div>
			<div class="director">Director :</div>
			<form action="/movies-myticket/book-ticket" method="GET">
				<input type="hidden" value="screen-a" name="screen"> <input
					type="submit" value="Book">
			</form>
		</div>

	</div>

	<div class="movies">

		<img src="">
		<div class="movie name">
			<h3></h3>
			<div class="dire" id="1">Description :</div>
			<div class="director">Director :</div>
			<form action="/movies-myticket/book-ticket" method="GET">
				<input type="hidden" value="screen-b" name="screen"> <input
					type="submit" value="Book">
			</form>
		</div>
	</div>

	<div class="movies">

		<img src="">
		<div class="movie name">
			<h3></h3>
			<div class="dire" id="2">Description :</div>
			<div class="director">Director :</div>
			<form action="/movies-myticket/book-ticket" method="GET">
				<input type="hidden" value="screen-c" name="screen"> <input
					type="submit" value="Book">
			</form>
		</div>
	</div>

	<div class="movies">

		<img src="">
		<div class="movie name">
			<h3></h3>
			<div class="dire" id="3">Description :</div>
			<div class="director">Director :</div>
			<form action="/movies-myticket/book-ticket" method="GET">
				<input type="hidden" value="screen-d" name="screen"> <input
					type="submit" value="Book">
			</form>
		</div>
	</div>

	<script src="/js/newHome.js"></script>

</body>

</html>