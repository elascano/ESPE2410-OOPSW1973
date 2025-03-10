const mongoose = require("mongoose");

const mongoURI = "mongodb+srv://dspaucar:dspaucar@cluster0.lx1js.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

const connectDB = async () => {
    try {
        await mongoose.connect(mongoURI); 
        console.log("MongoDB conectado correctamente");
    } catch (error) {
        console.error(" Error conectando a MongoDB:", error);
        process.exit(1);
    }
};

module.exports = connectDB;
