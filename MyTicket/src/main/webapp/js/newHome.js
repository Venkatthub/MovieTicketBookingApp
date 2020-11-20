/**
 * 
 */

let myData = JSON.parse(`[
            {
            "name": "Mr. Bean",
            "description": "A powerpacked comedy genere made for family audience !",
            "director": "John Birkin",
            "screen":"screen-a"
        },
        {
            "name": "Harry Potter",
            "description": "An orphaned boy enrolls in a school of wizardry, where he learns the truth about himself, his family and the terrible evil that haunts the magical world.",
            "director": "Chris Columbus",
            "screen":"screen-b"
        },
        {
            "name": "Soorarai Pootru",
            "description": "Based on a true story, Soorarai Pottru talks about Maara, the son of a teacher who sets out to fulfill the common man\`s flying dream by making a low-cost airline.",
            "director": "Sudha Kongara",
            "screen":"screen-c"
        },{
            "name": "Master",
            "description": "A commercial tamil movie for family audience",
            "director": "Lokesh Kanagaraj",
            "screen":"screen-d"
        }]`);

for (const key in myData) {
	document.getElementById(`${key}`).previousElementSibling.innerText = myData[key].name;
	document.getElementById(`${key}`).innerText += myData[key].description;
	document.getElementById(`${key}`).nextElementSibling.innerText += myData[key].director;
	setMovie(myData[key]);
}

function setMovie(movie) {

	console.log(movie);

	let movieName = movie.name;
	let screenName = movie.screen;

	let url = new URL("http://localhost:8080/");

	if (screenName === 'screen-a') {

		url.pathname = `/movies/screen-a`;

	} else if (screenName === 'screen-b') {

		url.pathname = `/movies/screen-b`;

	} else if (screenName === 'screen-c') {

		url.pathname = `/movies/screen-c`;

	} else if (screenName === 'screen-d') {

		url.pathname = `/movies/screen-d`;
	}

	console.log(url);

	fetch(url, {
		method: 'POST',
		body: movieName
	}).then(Response => console.log(Response)).catch(error => console.log(error));

}
