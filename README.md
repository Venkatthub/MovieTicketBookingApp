# MovieTicketBookingApp

#Endpoints for api calls

To get list of available seats 
GET http://localhost:8080/my-ticket/movies/{moviename}/{screenname}/available-seats

To get details of the user booked tickets
GET http://localhost:8080/my-ticket/users/{userEmail}/tickets

To book a ticket for a movie
POST http://localhost:8080/my-ticket/confirm-booking/{movieName}/{screenname}
