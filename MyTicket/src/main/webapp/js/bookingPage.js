/**
 * Booking page file
 */

let seatsSelected = [];
	let availableSeats;
	
	const screenName=document.getElementById("screenName").innerText.toLowerCase();
	const movie=document.getElementById("movieName").innerText;
	
	function selectSeat(value) {

		if (!seatsSelected.includes(value)&&availableSeats.includes(value)) {

			seatsSelected.push(value);
			
			document.getElementById("seatsSelectedList").innerText +=" "+value;
	
		} else {

			alert("Seat already booked !");

		}

	}

	function addToDoc(childNode) {

		console.log(seatsSelected);

		document.getElementById("seatsSelectedList").appendChild(childNode);
	}
	
	function showAvailableSeats(){
		
		availableSeats=[];
		
		const urlSearch=new URL("http://localhost:8080/");
		
		urlSearch.pathname = `/my-ticket/movies/${movie}/${screenName}/available-seats`;
		
		console.log(urlSearch);
		
		fetch(urlSearch).then(response => response.json()).then(response=>
		
		response.forEach((value)=>{
			availableSeats.push(value);	
		})
		
		).catch(error => console.log(error));
		
		document.getElementById("putSeat").innerText="Available Seats :"+availableSeats.join(" | ");
	
	}
	
	
	function clearArray(){
		
		seatsSelected=[];
		
		document.getElementById("seatsSelectedList").innerText ="";
		
	}
	
	function bookTicket(){
		
		if(seatsSelected.length!==0){
		const urlToBookTikets=new URL("http://localhost:8080/");
		urlToBookTikets.pathname = `/my-ticket/confirm-booking/${movie}/${screenName}`;
		
		console.log(urlToBookTikets)
		
		let requestBody=JSON.stringify(seatsSelected);
		
		fetch(urlToBookTikets,{
			method:'POST',
			headers: {
			      'Accept': 'application/json',
			      'Content-Type': 'application/json'
			    },
			body:requestBody
		}).then(response => response.text()).then(response=>alert(response)).catch(error => console.log(error));
		
		location.replace('http://localhost:8080/home/venkat');
		
		}else{
			
			alert("Please select seats");
		}
		
	}