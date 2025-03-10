const express = require("express");
const Producto = require("../models/Product");
const router = express.Router();


router.post("/", async (req, res) => {
    try {
        const nuevoProducto = new Producto(req.body);
        await nuevoProducto.save();
        res.status(201).send({ mensaje: " Producto guardado con éxito" });
    } catch (error) {
        res.status(500).send({ error: " Error al guardar el producto" });
    }
});


router.get("/", async (req, res) => {
    try {
        const productos = await Producto.find();
        res.status(200).json(productos);
    } catch (error) {
        res.status(500).send({ error: " Error al obtener los productos" });
    }
});

module.exports = router;
