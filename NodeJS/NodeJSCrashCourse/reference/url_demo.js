const url = require('url');

const myUrl = new URL('http://mywebsite.com:8000/hello.html?id=100&status=active');

//Serialization essentially flattens your data into a string to be sent over a connection
//where someone will deserialzie it back into the original format to reconstruct an object

//Serialzied URL
console.log(myUrl.href);
console.log(myUrl.toString);
//Host (root domain)
console.log(myUrl.host);
//Hostname (does not get port)
console.log(myUrl.hostname);
//Pathname
console.log(myUrl.pathname);
//Serialized query
console.log(myUrl.search);
//Params object
console.log(myUrl.searchParams);
//Add param
myUrl.searchParams.append('abc', '123');
console.log(myUrl.searchParams);
//Loop through params
myUrl.searchParams.forEach((value, name)  => {
    console.log(`${name}: ${value}`);
})