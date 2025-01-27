import express from 'express';
import { MongoClient } from 'mongodb';
import cors from 'cors';
import path from 'path';  // Para manejar rutas de archivos
import { fileURLToPath } from 'url'; // Importar la función para obtener el path

const app = express();
const port = 3001;

// Obtener el directorio actual usando `import.meta.url`
const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

// Configurar CORS
app.use(cors());

// Servir archivos estáticos (como HTML, CSS, JS)
app.use(express.static(path.join(__dirname, 'public')));  // Servir la carpeta "public"

// Configuración de MongoDB
const uri = "mongodb+srv://jmaza:jmaza@cluster0.y11rj.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
const client = new MongoClient(uri);
const database = client.db("parks");
const collection = database.collection("parks");

// Ruta raíz que servirá el archivo index.html
app.get("/", (req, res) => {
  res.sendFile(path.join(__dirname, 'public', 'index.html'));
});

// Ruta para buscar un parque por ID
app.get("/api/park/:id", async (req, res) => {
  try {
    const id = req.params.id; // Aquí el id será un string

    // Buscar el parque por su ID de tipo string
    const park = await collection.findOne({ _id: id });

    if (!park) {
      return res.status(404).json({ error: "Park not found" });
    }

    res.json(park);
  } catch (error) {
    console.error(error);  // Log para debug
    res.status(500).json({ error: "Error fetching park data" });
  }
});

// Iniciar el servidor
app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});
