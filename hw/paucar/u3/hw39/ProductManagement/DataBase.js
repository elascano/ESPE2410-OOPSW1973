const mongoose = require("mongoose");

async function conectarDB() {
    try {
        await mongoose.connect("mongodb+srv://dspaucar:dspaucar@cluster0.lx1js.mongodb.net/oop", {
            useNewUrlParser: true,
            useUnifiedTopology: true
        });
        console.log("Conectado a MongoDB Atlas (Base: oop)");
    } catch (error) {
        console.error("Error al conectar a MongoDB Atlas:", error);
        process.exit(1); 
    }
}

module.exports = conectarDB;

