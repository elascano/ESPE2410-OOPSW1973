const mongoose = require('mongoose');

// Definición del esquema de Furniture en MongoDB
const furnitureSchema = new mongoose.Schema({
  id: { type: String, required: true },
  name: { type: String, required: true },
  price: { type: Number, required: true },
  color: { type: String, required: true }
});

// Creamos el modelo Furniture que interactúa con MongoDB
const Furniture = mongoose.model('Furniture', furnitureSchema);

module.exports = Furniture;
