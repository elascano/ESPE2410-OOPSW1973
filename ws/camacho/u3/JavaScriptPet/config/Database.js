import mongoose from "mongoose";

const connectDB = async () => {
    try {
        await mongoose.connect("mongodb+srv://0000mama:0000mama@cluster0.0nmcc.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
        console.log("✅ Conectado a MongoDB");
    } catch (error) {
        console.error("❌ Error al conectar a MongoDB:", error.message);
        console.error("Detalles:", error);
        process.exit(1); // Salir del proceso en caso de error
    }
};

export default connectDB;
