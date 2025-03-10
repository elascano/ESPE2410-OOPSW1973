const mongoose = require("mongoose");

const ProductSchema = new mongoose.Schema({
    nombre: String,
    codigo: String,
    cantidad: Number,
    precio: Number
});

module.exports = mongoose.model("Product", ProductSchema, "products");
