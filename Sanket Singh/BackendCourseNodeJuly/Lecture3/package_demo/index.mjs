import open from "open";
import fetch from "node-fetch";
const header = {
	'user-agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36'
};
const response = await fetch("https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByDistrict?district_id=149&date=01-08-2021", {
    headers: header,
});

const data = await response.json();

data.sessions.forEach(element => {
    console.log(element.name, element.vaccine);
});

// response
// .then(res => res.json())
// .then(json => console.log(json));
// open("https://www.netflix.com", {app: {name: 'google chrome', arguments: ['--incognito']}});




/** 
 * 
 * 
 * Try to fetch data of all districts of a state
 * for each state filter the centers which has vaccine of user choice
 * filter each data point based on whther user wants free or paid vaccination
 * send an email to the user periodically
*/