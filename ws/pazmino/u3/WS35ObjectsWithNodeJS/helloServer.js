const http = require('node:http');
const hostname = '127.0.0.1';
const port = 3015;
const server = http.createServer((req,res) => {
    res.statusCode = 200;
    res.setHeader('Content-Type', 'text/plain'); // text/html 
    res.end('Hello, <b>Web Developers!</b> from <i>Brandon Pazmino</i>');    
});
server.listen(port,hostname, ( ) => {
    console.log(`Server running at http://${hostname}:${port}/`);
});
