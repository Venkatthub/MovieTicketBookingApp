<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
.container {
	height: 130%;
	top: 25%;
	position: static;
}

.left {
	left: 2em;
	box-shadow: 2ex;
	position: fixed;
}

.right {
	background-color: black;
	right: 0;
	width: 85%;
	position: absolute;
	color: white;
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
				<td><h4>${movie}</h4></td>
			</tr>
		</table>
		<h1>Select seat</h1>
		<input type="submit" value="Book" /> <a href="/home/${userName}"><button>Back</button></a>
		<button onclick="">show available</button>
		<h2>Seats selected</h2>
	</div>

	<div class="container right">

		<div
			style="background-color: whitesmoke; color: black; text-align: center; size: 10px;">
			<p style="font-size: 40px">Screen this way</p>
		</div>

		<div class="seats onleft">
			<button value="A1" class="seat">A1</button>
			<button value="A2" class="seat">A2</button>
			<button value="A3" class="seat">A3</button>
			<button value="A4" class="seat">A4</button>
			<button value="A5" class="seat">A5</button>
			<br> <br>
			<button value="B1" class="seat">B1</button>
			<button value="B2" class="seat">B2</button>
			<button value="B3" class="seat">B3</button>
			<button value="B4" class="seat">B4</button>
			<button value="B5" class="seat">B5</button>
			<br> <br>
			<button value="C1" class="seat">C1</button>
			<button value="C2" class="seat">C2</button>
			<button value="C3" class="seat">C3</button>
			<button value="C4" class="seat">C4</button>
			<button value="C5" class="seat">C5</button>
			<br> <br> <br> <br> <br>
			<button value="D1" class="seat">D1</button>
			<button value="D2" class="seat">D2</button>
			<button value="D3" class="seat">D3</button>
			<button value="D4" class="seat">D4</button>
			<button value="D5" class="seat">D5</button>
			<br> <br>
			<button value="E1" class="seat">E1</button>
			<button value="E2" class="seat">E2</button>
			<button value="E3" class="seat">E3</button>
			<button value="E4" class="seat">E4</button>
			<button value="E5" class="seat">E5</button>
			<br> <br>
			<button value="F1" class="seat">F1</button>
			<button value="F2" class="seat">F2</button>
			<button value="F3" class="seat">F3</button>
			<button value="F4" class="seat">F4</button>
			<button value="F5" class="seat">F5</button>

		</div>
		<div class="seats onright">
			<button value="A6" class="seat">A6</button>
			<button value="A7" class="seat">A7</button>
			<button value="A8" class="seat">A8</button>
			<button value="A9" class="seat">A9</button>
			<button value="A10" class="seat">A10</button>
			<br> <br>
			<button value="B6" class="seat">B6</button>
			<button value="B6" class="seat">B7</button>
			<button value="B6" class="seat">B8</button>
			<button value="B6" class="seat">B9</button>
			<button value="B6" class="seat">B10</button>
			<br> <br>
			<button value="C6" class="seat">C6</button>
			<button value="C7" class="seat">C7</button>
			<button value="C8" class="seat">C8</button>
			<button value="C9" class="seat">C9</button>
			<button value="C10" class="seat">C10</button>
			<br> <br> <br> <br> <br>
			<button value="D6" class="seat">D6</button>
			<button value="D7" class="seat">D7</button>
			<button value="D8" class="seat">D8</button>
			<button value="D9" class="seat">D9</button>
			<button value="D10" class="seat">D10</button>
			<br> <br>
			<button value="E6" class="seat">E6</button>
			<button value="E7" class="seat">E7</button>
			<button value="E8" class="seat">E8</button>
			<button value="E9" class="seat">E9</button>
			<button value="E10" class="seat">E10</button>
			<br> <br>
			<button value="F6" class="seat">F6</button>
			<button value="F7" class="seat">F7</button>
			<button value="F8" class="seat">F8</button>
			<button value="F9" class="seat">F9</button>
			<button value="F10" class="seat">F10</button>
		</div>
	</div>
</body>
<script type="text/javascript">

function showSeats(){

}
	
</script>

</html>