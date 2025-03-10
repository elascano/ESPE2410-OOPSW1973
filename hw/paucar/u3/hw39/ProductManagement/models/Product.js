const mongoose = require("mongoose");

const ProductSchema = new mongoose.Schema({
    nombre: { type: String, required: true },
    codigo: { type: String, required: true, unique: true },
    cantidad: { type: Number, required: true },
    precio: { type: Number, required: true }
});

module.exports = mongoose.model("Product", ProductSchema, "products"); 
