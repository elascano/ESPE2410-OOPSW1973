import { connectToDatabase } from "../utils/MongoDBManager.js";

// Obtener todos los parques
export async function getAllParks() {
    try {
        const db = await connectToDatabase();
        const parkCollection = db.collection("parks");
        return await parkCollection.find({}).toArray();
    } catch (error) {
        console.error("Error in getAllParks:", error);
        throw error;
    }
}

// Obtener un parque por ID (ID como string, por ejemplo "park1")
export async function getParkById(id) {
    try {
        const db = await connectToDatabase();
        const parkCollection = db.collection("parks");
        return await parkCollection.findOne({ _id: id });
    } catch (error) {
        console.error("Error in getParkById:", error);
        throw error;
    }
}

// Crear un nuevo parque con ID simple (ej: "park1", "park2", etc.)
export async function createPark(parkData) {
    try {
        const db = await connectToDatabase();
        const parkCollection = db.collection("parks");

        // Generar el ID en base a la cantidad actual de documentos
        const parkId = await generateParkId(parkCollection);
        const parkWithId = { ...parkData, _id: parkId };

        const result = await parkCollection.insertOne(parkWithId);
        if (result.acknowledged) {
            return parkWithId;  // Retornamos el objeto insertado
        } else {
            throw new Error("Insert operation was not acknowledged");
        }
    } catch (error) {
        console.error("Error in createPark:", error);
        throw error;
    }
}

// Actualizar un parque por ID (ID como string)
export async function updatePark(id, parkData) {
    try {
        const db = await connectToDatabase();
        const parkCollection = db.collection("parks");
        const result = await parkCollection.updateOne(
            { _id: id },
            { $set: parkData }
        );
        return result.modifiedCount > 0 ? { ...parkData, _id: id } : null;
    } catch (error) {
        console.error("Error in updatePark:", error);
        throw error;
    }
}

// Eliminar un parque por ID (ID como string)
export async function deletePark(id) {
    try {
        const db = await connectToDatabase();
        const parkCollection = db.collection("parks");
        const result = await parkCollection.deleteOne({ _id: id });
        return result.deletedCount > 0;
    } catch (error) {
        console.error("Error in deletePark:", error);
        throw error;
    }
}

// Función auxiliar para generar un ID en el formato "park1", "park2", etc.
// Se cuenta la cantidad de documentos en la colección y se suma 1.
async function generateParkId(parkCollection) {
    try {
        const count = await parkCollection.countDocuments();
        return `park${count + 1}`;
    } catch (error) {
        console.error("Error generating park ID:", error);
        throw error;
    }
}
