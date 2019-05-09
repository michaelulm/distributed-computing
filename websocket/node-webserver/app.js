var http = require("http");

http.createServer(function (request, response) {

   // Send the HTTP header  with Status Code 200 (OK)
   response.writeHead(200, {'Content-Type': 'text/plain'});
   
   // Send the response body as "Hello World"
   response.end('Hello World\n');
}).listen(8081);

// Console will print the message
console.log('Server running at http://127.0.0.1:8081/');

// additional information take a look on https://www.tutorialspoint.com/nodejs/nodejs_first_application.htm 
// or (for students) take a look on the Slides from last semester