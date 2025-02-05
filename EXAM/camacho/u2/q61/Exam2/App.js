const mongoose = require('mongoose');
const { createFurniture } = require('./controller'); // Importamos el controlador

// Conexión a MongoDB (reemplaza <db_password> por tu contraseña real)
const dbURI = 'mongodb+srv://mmcamacho3:miContraseña123@cluster0.bcrzi.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0';

// Conectar a la base de datos
mongoose.connect(dbURI, { useNewUrlParser: true, useUnifiedTopology: true })
  .then(() => console.log('Conectado a MongoDB'))
  .catch(err => console.log('Error al conectar a MongoDB:', err));

// Crear un mueble con los datos de ejemplo
const newFurniture = {
  id: '12345',
  name: 'Silla de oficina',
  price: 120.00,
  color: 'Negro'
};

// Usamos el controlador para crear el mueble
createFurniture(newFurniture)
  .then(furniture => {
    console.log('Mueble creado:', furniture);
    mongoose.connection.close(); // Cerramos la conexión después de guardar
  })
  .catch(err => console.log('Error al crear mueble:', err));
