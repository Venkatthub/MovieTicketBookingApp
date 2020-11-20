<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>my-Ticket - ${user}</title>
</head>
<style>
.container {
	height: 100%;
	top: 25%;
	width: 100%;
}

.left {
	left: 2em;
	box-shadow: 2ex;
	position: fixed;
}

.right {
	background-color: black;
	right: 0;
	width: 80%;
	position: absolute;
	color: white;
	margin-top: 8em;
}

.seats {
	height: 100%;
	width: 50%;
	position: absolute;
	top: 5%;
	padding-top: 10%;
}

.onleft {
	left: 0;
	text-align: center;
}

.onright {
	right: 0;
	text-align: center;
	color: white;
}

body {
	background-color: whitesmoke;
}

.seat {
	font-size: 20px;
	text-align: center;
	padding: 10px;
	border: 0em;
	width: 80px;
	background-color: whitesmoke;
}
</style>
<body>
	<%@ include file="/WEB-INF/Views/header.html"%>

	<div class="movie"></div>

	<div class="container left">
		<table>
			<tr>
				<td><h4>Movie :</h4></td>
				<td><h4 id="movieName">${movie}</h4></td>
			</tr>
			<tr>
				<td><h4>Screen :</h4></td>
				<td><h4 id="screenName">${screen}</h4></td>
			</tr>
		</table>
		<h2>select seat</h2>

		<a href="/home/${user}"><button>Back</button></a> <br>

		<button onclick="showAvailableSeats()">show available</button>

		<h3>seats selected</h3>

		<br>

		<div style="margin-top: 5px; font-size: 30px;" id="seatsSelectedList"></div>

		<button onclick="bookTicket()">Confirm and Book</button>
		<button onclick="clearArray()">clear</button>

	</div>

	<div class="container right">

		<div
			style="background-color: whitesmoke; color: black; align-content: center; size: 10px;">
			<p style="font-size: 40px; text-align: center;">Screen this way</p>
		</div>

		<div class="seats onleft">
			<button onclick='selectSeat(this.value)' value="A1" class="seat">A1</button>
			<button onclick="selectSeat(this.value)" value="A2" class="seat">A2</button>
			<button onclick="selectSeat(this.value)" value="A3" class="seat">A3</button>
			<button onclick="selectSeat(this.value)" value="A4" class="seat">A4</button>
			<button onclick="selectSeat(this.value)" value="A5" class="seat">A5</button>
			<br> <br>
			<button onclick="selectSeat(this.value)" value="B1" class="seat">B1</button>
			<button onclick="selectSeat(this.value)" value="B2" class="seat">B2</button>
			<button onclick="selectSeat(this.value)" value="B3" class="seat">B3</button>
			<button onclick="selectSeat(this.value)" value="B4" class="seat">B4</button>
			<button onclick="selectSeat(this.value)" value="B5" class="seat">B5</button>
			<br> <br>
			<button onclick="selectSeat(this.value)" value="C1" class="seat">C1</button>
			<button onclick="selectSeat(this.value)" value="C2" class="seat">C2</button>
			<button onclick="selectSeat(this.value)" value="C3" class="seat">C3</button>
			<button onclick="selectSeat(this.value)" value="C4" class="seat">C4</button>
			<button onclick="selectSeat(this.value)" value="C5" class="seat">C5</button>
			<br> <br> <br> <br> <br>
			<button onclick="selectSeat(this.value)" value="D1" class="seat">D1</button>
			<button onclick="selectSeat(this.value)" value="D2" class="seat">D2</button>
			<button onclick="selectSeat(this.value)" value="D3" class="seat">D3</button>
			<button onclick="selectSeat(this.value)" value="D4" class="seat">D4</button>
			<button onclick="selectSeat(this.value)" value="D5" class="seat">D5</button>
			<br> <br>
			<button onclick="selectSeat(this.value)" value="E1" class="seat">E1</button>
			<button onclick="selectSeat(this.value)" value="E2" class="seat">E2</button>
			<button onclick="selectSeat(this.value)" value="E3" class="seat">E3</button>
			<button onclick="selectSeat(this.value)" value="E4" class="seat">E4</button>
			<button onclick="selectSeat(this.value)" value="E5" class="seat">E5</button>
			<br> <br>
			<button onclick="selectSeat(this.value)" value="F1" class="seat">F1</button>
			<button onclick="selectSeat(this.value)" value="F2" class="seat">F2</button>
			<button onclick="selectSeat(this.value)" value="F3" class="seat">F3</button>
			<button onclick="selectSeat(this.value)" value="F4" class="seat">F4</button>
			<button onclick="selectSeat(this.value)" value="F5" class="seat">F5</button>

		</div>
		<div class="seats onright">
			<button onclick="selectSeat(this.value)" value="A6" class="seat">A6</button>
			<button onclick="selectSeat(this.value)" value="A7" class="seat">A7</button>
			<button onclick="selectSeat(this.value)" value="A8" class="seat">A8</button>
			<button onclick="selectSeat(this.value)" value="A9" class="seat">A9</button>
			<button onclick="selectSeat(this.value)" value="A10" class="seat">A10</button>
			<br> <br>
			<button onclick="selectSeat(this.value)" value="B6" class="seat">B6</button>
			<button onclick="selectSeat(this.value)" value="B7" class="seat">B7</button>
			<button onclick="selectSeat(this.value)" value="B8" class="seat">B8</button>
			<button onclick="selectSeat(this.value)" value="B9" class="seat">B9</button>
			<button onclick="selectSeat(this.value)" value="B10" class="seat">B10</button>
			<br> <br>
			<button onclick="selectSeat(this.value)" value="C6" class="seat">C6</button>
			<button onclick="selectSeat(this.value)" value="C7" class="seat">C7</button>
			<button onclick="selectSeat(this.value)" value="C8" class="seat">C8</button>
			<button onclick="selectSeat(this.value)" value="C9" class="seat">C9</button>
			<button onclick="selectSeat(this.value)" value="C10" class="seat">C10</button>
			<br> <br> <br> <br> <br>
			<button onclick="selectSeat(this.value)" value="D6" class="seat">D6</button>
			<button onclick="selectSeat(this.value)" value="D7" class="seat">D7</button>
			<button onclick="selectSeat(this.value)" value="D8" class="seat">D8</button>
			<button onclick="selectSeat(this.value)" value="D9" class="seat">D9</button>
			<button onclick="selectSeat(this.value)" value="D10" class="seat">D10</button>
			<br> <br>
			<button onclick="selectSeat(this.value)" value="E6" class="seat">E6</button>
			<button onclick="selectSeat(this.value)" value="E7" class="seat">E7</button>
			<button onclick="selectSeat(this.value)" value="E8" class="seat">E8</button>
			<button onclick="selectSeat(this.value)" value="E9" class="seat">E9</button>
			<button onclick="selectSeat(this.value)" value="E10" class="seat">E10</button>
			<br> <br>
			<button onclick="selectSeat(this.value)" value="F6" class="seat">F6</button>
			<button onclick="selectSeat(this.value)" value="F7" class="seat">F7</button>
			<button onclick="selectSeat(this.value)" value="F8" class="seat">F8</button>
			<button onclick="selectSeat(this.value)" value="F9" class="seat">F9</button>
			<button onclick="selectSeat(this.value)" value="F10" class="seat">F10</button>
		</div>
		<p id="putSeat"
			style="text-align: center; margin-top: 70%; color: green;"></p>
	</div>

	<script src="/js/bookingPage.js"></script>

</body>

</html>