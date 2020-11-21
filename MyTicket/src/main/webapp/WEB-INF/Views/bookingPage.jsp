<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>my-Ticket - ${user}</title>
</head>
<script src="/js/jquery.js"></script>
<style>
.container {
	height: 100%;
	top: 25%;
	width: 100%;
}

.left {
	top: inherit;
	left: 0;
	box-shadow: 2ex;
	position: fixed;
	background-color: #F4D03F;
	width: inherit;
	height: 450px;
	left: 0;
}

.right {
	right: 0;
	width: inherit;
	position: absolute;
	color: white;
	margin-top: 4em;
	width: 80%;
}

.availableSeatsDisplay {
	top: inherit;
	right: 0;
	box-shadow: 2ex;
	position: relative;
	background-color: #239B56;
	width: inherit;
	text-align: center;
	font-family: sans-serif;
	font-size: medium;
	font-weight: bold;
	color: whitesmoke;
}

.confrimAndClear {
	border: 0px;
	padding: 12px;
	font-family: monospace;
	margin-left: 20px;
	margin-right: 20px;
	font-weight: bold;
	color: whitesmoke;
	background-color: #34495E;
	margin-top: 15px;
}

.confrimAndClear:hover {
	cursor: pointer;
	color: #34495E;
	background-color: whitesmoke;
}

.seats {
	width: 50%;
	position: static;
	top: 5%;
	padding-top: 10%;
}

.onleft {
	text-align: center;
	float: left;
	position: static;
}

.onright {
	text-align: center;
	float: right;
	position: relative;
}

.seat {
	font-size: 20px;
	text-align: center;
	padding: 10px;
	border: 0em;
	width: 80px;
	background-color: whitesmoke;
}

h4 {
	font-size: x-large;
	color: #34495E;
	font-family: sans-serif;
	margin-left: 20px;
	margin-right: 20px;
}

h2 {
	color: #34495E;
	font-family: monospace;
	margin-left: 20px;
	margin-right: 20px;
}

.seat {
	background-color: #8C8F8F;
	color: whitesmoke;
}

.seat:hover {
	background-color: #6DD363;
	cursor: pointer;
}
</style>
<body>
	<%@ include file="/WEB-INF/Views/header.html"%>


	<div class="container left">
		<div class="movie">
			<a href="/home/${user}"><button class="confrimAndClear">Back</button></a>
			<button class="confrimAndClear" id='showAvailable'>show
				available</button>
			<br>
		</div>
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

		<button class="confrimAndClear" onclick="bookTicket()">Confirm
			and Book</button>
		<button class="confrimAndClear" onclick="clearArray()">clear</button>

	</div>
	<div class='availableSeatsDisplay'></div>

	<div class="container right">


		<div style="color: green; font-size: 25px;">
			Seats :
			<div style="color: #8C8F8F;" id="seatsSelectedList"></div>
		</div>

		<br>

		<div
			style="background-color: gray; color: whitemsoke; font-family: monospace; size: 9px; width: auto; position: static;">
			<p style="font-size: 40px; text-align: center;">Screen this way</p>
		</div>

		<div class="seats onleft">
			<button id="A1" value="A1" class="seat">A1</button>
			<button id="A2" value="A2" class="seat">A2</button>
			<button id="A3" value="A3" class="seat">A3</button>
			<button id="A4" value="A4" class="seat">A4</button>
			<button id="A5" value="A5" class="seat">A5</button>
			<br> <br>
			<button id="B1" value="B1" class="seat">B1</button>
			<button id="B2" value="B2" class="seat">B2</button>
			<button id="B3" value="B3" class="seat">B3</button>
			<button id="B4" value="B4" class="seat">B4</button>
			<button id="B5" value="B5" class="seat">B5</button>
			<br> <br>
			<button id="C1" value="C1" class="seat">C1</button>
			<button id="C2" value="C2" class="seat">C2</button>
			<button id="C3" value="C3" class="seat">C3</button>
			<button id="C4" value="C4" class="seat">C4</button>
			<button id="C5" value="C5" class="seat">C5</button>
			<br> <br> <br> <br> <br>
			<button id="D1" value="D1" class="seat">D1</button>
			<button id="D2" value="D2" class="seat">D2</button>
			<button id="D3" value="D3" class="seat">D3</button>
			<button id="D4" value="D4" class="seat">D4</button>
			<button id="D5" value="D5" class="seat">D5</button>
			<br> <br>
			<button id="E1" value="E1" class="seat">E1</button>
			<button id="E2" value="E2" class="seat">E2</button>
			<button id="E3" value="E3" class="seat">E3</button>
			<button id="E4" value="E4" class="seat">E4</button>
			<button id="E5" value="E5" class="seat">E5</button>
			<br> <br>
			<button id="F1" value="F1" class="seat">F1</button>
			<button id="F2" value="F2" class="seat">F2</button>
			<button id="F3" value="F3" class="seat">F3</button>
			<button id="F4" value="F4" class="seat">F4</button>
			<button id="F5" value="F5" class="seat">F5</button>

		</div>
		<div class="seats onright">
			<button id="A6" value="A6" class="seat">A6</button>
			<button id="A7" value="A7" class="seat">A7</button>
			<button id="A8" value="A8" class="seat">A8</button>
			<button id="A9" value="A9" class="seat">A9</button>
			<button id="A10" value="A10" class="seat">A10</button>
			<br> <br>
			<button id="B6" value="B6" class="seat">B6</button>
			<button id="B7" value="B7" class="seat">B7</button>
			<button id="B8" value="B8" class="seat">B8</button>
			<button id="B9" value="B9" class="seat">B9</button>
			<button id="B10" value="B10" class="seat">B10</button>
			<br> <br>
			<button id="C6" value="C6" class="seat">C6</button>
			<button id="C7" value="C7" class="seat">C7</button>
			<button id="C8" value="C8" class="seat">C8</button>
			<button id="C9" value="C9" class="seat">C9</button>
			<button id="C10" value="C10" class="seat">C10</button>
			<br> <br> <br> <br> <br>
			<button id="D6" value="D6" class="seat">D6</button>
			<button id="D7" value="D7" class="seat">D7</button>
			<button id="D8" value="D8" class="seat">D8</button>
			<button id="D9" value="D9" class="seat">D9</button>
			<button id="D10" value="D10" class="seat">D10</button>
			<br> <br>
			<button id="E6" value="E6" class="seat">E6</button>
			<button id="E7" value="E7" class="seat">E7</button>
			<button id="E8" value="E8" class="seat">E8</button>
			<button id="E9" value="E9" class="seat">E9</button>
			<button id="E10" value="E10" class="seat">E10</button>
			<br> <br>
			<button id="F6" value="F6" class="seat">F6</button>
			<button id="F7" value="F7" class="seat">F7</button>
			<button id="F8" value="F8" class="seat">F8</button>
			<button id="F9" value="F9" class="seat">F9</button>
			<button id="F10" value="F10" class="seat">F10</button>
		</div>
	</div>

</body>

<script>

let seatsSelected = [];
let availableSeats=[];

const urls=["http://localhost:8080/","https://month-2.el.r.appspot.com/","https://month-2.appspot.com/"]

const screenName=document.getElementById("screenName").innerText.toLowerCase();
const movie =document.getElementById("movieName").innerText;

$('.seat').click(function () {
    
	let value = $(this).attr('value');
    
    if (!seatsSelected.includes(value)&& availableSeats.includes(value)) {

		seatsSelected.push(value);

		document.getElementById("seatsSelectedList").innerText += " " + value;

	} else {

		alert("Seat already booked !");

	}
});

$('#showAvailable').click(function (){

	availableSeats=[];

	const urlSearch = new URL(urls[2]);

	urlSearch.pathname = `/my-ticket/movies/${screenName}/available-seats`;

	console.log(urlSearch);
	
	$('.availableSeatsDisplay').empty();

	fetch(urlSearch).then(response => response.json()).then(response=>

		response.forEach((value) =>{
			availableSeats.push(value);
			
			$('.availableSeatsDisplay').append(value+"  ");
			
		
		})

	).catch(error => console.log(error));
	

});


function clearArray(){

seatsSelected=[];

$("#seatsSelectedList").empty();
		
	}

function bookTicket() {

	if(seatsSelected.length!==0){
		const urlToBookTikets=new URL(urls[2]);
		urlToBookTikets.pathname = `/my-ticket/confirm-booking/${email}/${movie}/${screenName}`;

		console.log(urlToBookTikets)

		let requestBody = JSON.stringify(seatsSelected);

		fetch(urlToBookTikets, {
			method: 'POST',
			headers: {
				'Accept': 'application/json',
				'Content-Type': 'application/json'
			},
			body: requestBody
		}).then(response => response.text()).then(response => alert(response)).catch(error => console.log(error));

		location.replace('https://month-2.appspot.com/home/venkat');

	} else {

		alert("Please select seats");
	}

}

</script>

</html>