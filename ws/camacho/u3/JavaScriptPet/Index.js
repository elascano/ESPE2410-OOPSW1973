import express from 'express';
import { fileURLToPath } from 'url';
import { dirname, join } from 'path';
import connectDB from './config/Database.js';
import animalRoutes from './routes/AnimalRoutes.js';

const app = express();
connectDB();

const __filename = fileURLToPath(import.meta.url);
const __dirname = dirname(__filename);

app.use(express.json());
app.use(express.static(join(__dirname, 'view')));

app.use('/api/animals', animalRoutes); // ✅ Corregido "/api/animals" (antes tenía "/api/animales")

app.get('/', (req, res) => {
    res.sendFile(join(__dirname, 'view', 'index.html'));
});

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => console.log(`🚀 Servidor corriendo en http://localhost:${PORT}`));