const express = require("express");
const mongoose = require("mongoose");
const bodyParser = require("body-parser");
const cors = require("cors");

// Configuración del servidor
const app = express();
const PORT = 5000;

// Middleware
app.use(cors());
app.use(bodyParser.json());

// Conexión a MongoDB
mongoose.connect("mongodb://127.0.0.1:27017/formularioDB", {
    useNewUrlParser: true,
    useUnifiedTopology: true,
}).then(() => console.log("Conexión exitosa a MongoDB"))
  .catch((err) => console.error("Error al conectar a MongoDB:", err));

// Esquema de datos
const FormDataSchema = new mongoose.Schema({
    name: String,
    email: String,
    age: Number,
});

const FormData = mongoose.model("FormData", FormDataSchema);

// Ruta para guardar datos
app.post("/submit", async (req, res) => {
    try {
        const newFormData = new FormData(req.body);
        await newFormData.save();
        res.status(201).json({ message: "Datos guardados correctamente" });
    } catch (error) {
        res.status(500).json({ error: "Error al guardar los datos" });
    }
});

// Iniciar servidor
app.listen(PORT, () => {
    console.log(`Servidor corriendo en http://localhost:${PORT}`);
});
