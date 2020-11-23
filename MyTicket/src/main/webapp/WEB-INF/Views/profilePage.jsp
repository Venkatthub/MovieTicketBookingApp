<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>my Ticket - ${userEmail}/Profile</title>
</head>
<body>
	<%@ include file="/WEB-INF/Views/header.html"%>

	<br>
	<a href="/home/${userName}"><button>Back</button></a>
	<br>
	<div class="container right">
		<br>
		<p class="userDetails" id="userName">Name : ${userName}</p>

		<p class="userDetails" id="user">Email : ${userEmail}</p>

		<p class="userDetails" id="password">password : ${password}</p>
	</div>

	<div class="container left">

		<button id="showtickets" onclick="showTicketDetails()">Ticket
			Details</button>

		<ul id="putTicket">

		</ul>

	</div>

</body>

<script type="text/javascript">

const urls=["http://localhost:8080/","https://month-2.el.r.appspot.com/","https://month-2.appspot.com/"];
	
const urlSearch=new URL(urls[2]);
	
	function showTicketDetails() {
		
		let userEmail=document.getElementById('user').innerText;
		
		urlSearch.pathname = `/my-ticket/users/${userEmail}/tickets`;
		
		console.log(urlSearch);
		
		fetch(urlSearch).then(response => response.json()).then(response=>
		
		response.forEach((value)=>{
			
			let nodeElement=document.createElement('LI');
			
			nodeElement.innerHTML="<p>Movie : "+value.movie+"<br>Seats : "+value.Seats+"<br>Screen : "+value.Screen+"<br>Date : "+value.Date+"<br>Cost : "+value.Cost+"<br><a href=\"\">Cancel Ticket</a>";
	
			document.getElementById("putTicket").appendChild(nodeElement);
			
			
	
		})
		).catch(error => console.log(error));
		
		document.getElementById('showtickets').style.visibility='hidden';
		
		
	}
</script>
</html>