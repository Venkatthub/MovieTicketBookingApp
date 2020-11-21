<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>myTicket - Home - ${user}</title>
</head>
<style>
.movie-cards {
	padding: 20px;
}

.movie-cards::after {
	content: "";
	display: block;
	clear: both;
}

.card {
	width: 46%;
	height: auto;
	box-shadow: 0 0 10px #c2c2c2;
	padding: 5px;
	margin: 0 20px 20px;
	position: relative;
	float: left;
	background-color: #E9E9E7;
}

.card:hover {
	box-shadow: 0 0 15px grey;
	color: whitesmoke;
	background-color: #34495E;
}

.card img {
	width: 100%;
	height: 350px;
}

.card-body {
	padding: 20px;
}

input {
	background-color: #F4D03F;
	border: 0px;
	font-weight: bold;
	border-radius: 12px;
	padding: 13px;
	color: #34495E;
	width: 40%;
}

input:hover {
	cursor: pointer;
}

p {
	font-family: sans-serif;
}

h3 {
	font-family: sans-serif;
	font-size: xx-large;
}
</style>
<body>

	<%@ include file="/WEB-INF/Views/header.html"%>

	<section class="movie-cards">

		<div class="card left">
			<img
				src="https://images.cinemaexpress.com/uploads/user/imagelibrary/2020/1/26/w600X390/Master.PNG"
				alt="card-image">
			<div class="card-body">
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

		<div class="card left">

			<img
				src="https://fanart.tv/fanart/movies/1268/moviethumb/mr-beans-holiday-548875d606c69.jpg"
				alt="card-image">
			<div class="card-body">
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

		<div class="card right">

			<img
				src="https://m.hindustantimes.com/rf/image_size_1200x900/HT/p2/2019/11/10/Pictures/_e739398e-03aa-11ea-8324-1e09595151a0.jpg"
				alt="card-image">
			<div class="card-body">
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



		<div class="card right">

			<img
				src="https://images.csmonitor.com/csmarchives/2011/07/poster.jpg?alias=standard_900x600nc"
				alt="card-image">
			<div class="card-body">
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
	</section>


	<script src="/js/newHome.js"></script>

</body>

</html>