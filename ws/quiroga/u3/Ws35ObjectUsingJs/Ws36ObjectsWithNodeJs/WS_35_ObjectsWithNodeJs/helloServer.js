const http = require('node:http');
const hostname = '127.0.0.1';
const port = 3018;
const server = http.createServer((req,res)=> {
    res.statusCode = 200;
    res.setHeader('Content-Type', 'text/html');
    res.end('Hello, <b>OOP Developers!</b> from <i>Esteban Quiroga</i>');
});
server.listen(port, hostname,() => {
    console.log(`Server running at http://${hostname}:${port}/`);
})