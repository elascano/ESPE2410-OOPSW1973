const http = require('node:http'); // Instanciar http
const hostname = '127.0.0.1';
const port = 3003;

const server = http.createServer((req, res) => {
    res.statusCode = 200; // Corregido: statusCode en minúscula
    res.setHeader('Content-Type', 'text/html'); // Cambiado a 'text/html' para interpretar etiquetas HTML
    res.end('Hello, <b>Web Developers!</b> from <i>Robinson Bonilla</i>');
});

server.listen(port, hostname, () => {  
    console.log(`Server running at http://${hostname}:${port}/`);
});