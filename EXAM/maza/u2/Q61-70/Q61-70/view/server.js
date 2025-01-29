import open from 'open'
import express from "express";
import cors from "cors";
import path from "path";
import { fileURLToPath } from "url";
import { fetchPark } from "../controller/ParkController.js";

const app = express();
const port = 3001;

// Obtener el directorio actual usando `import.meta.url`
const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

// Configurar CORS
app.use(cors());

// Servir archivos estáticos
app.use(express.static(path.join(__dirname, "public")));

// Ruta raíz que servirá el archivo index.html
app.get("/", (req, res) => {
    res.sendFile(path.join(__dirname, "public", "index.html"));
});

// Ruta para buscar un parque por ID
app.get("/api/park/:id", fetchPark);

// Iniciar el servidor
app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
    open(`http://localhost:${port}`)
});
