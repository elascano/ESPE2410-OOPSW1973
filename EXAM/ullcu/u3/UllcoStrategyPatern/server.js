const express = require("express");
const bodyParser = require("body-parser");
const SortingController = require("./controllers/SortingController");
const app = express();
const port = 8000;  // Puerto local donde estará tu servidor

// Middleware para parsear el cuerpo de la solicitud
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

// Middleware para servir archivos estáticos desde la carpeta 'views'
app.use(express.static("views"));  // Servir archivos HTML, CSS, JS desde la carpeta 'views'

// Crear una instancia del controlador
const controller = new SortingController();
console.log(SortingController);

// Ruta para manejar la ordenación
app.post("/sort", (req, res) => controller.handleSort(req, res));

// Ruta para acceder a la página HTML (por ejemplo, "index.html")
app.get("/", (req, res) => {
    res.sendFile(__dirname + "/views/index.html");  // Asegúrate de que 'index.html' esté en la carpeta 'views'
});

// Iniciar el servidor
app.listen(port, () => console.log(`Server running on http://localhost:${port}`));
