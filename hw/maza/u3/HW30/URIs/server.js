const express = require('express');
const condominioRoutes = require('../URIs/routes/CondominioRoutes');

const app = express();
app.use(express.json()); // Middleware para parsear JSON en el body

app.use(condominioRoutes);  

const PORT = 3001;
app.listen(PORT, () => {
    console.log(`Servidor corriendo en http://localhost:${PORT}`);
});
