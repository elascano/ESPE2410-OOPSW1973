const { MongoClient } = require('mongodb');

// URL de conexión a MongoDB
const uri = "mongodb+srv://daullcu:daullcu@cluster0.dxj9m.mongodb.net/";

// Nombre de la base de datos y colección
const dbName = "UllcoStrategy";
const collectionName = "UllcoArrayFirst";

// Creamos una instancia de MongoClient
const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

class SortingModel {
    constructor() {
        // Iniciamos la conexión cuando se crea una instancia de SortingModel
        this.connectToDb();
    }

    // Método para conectar a la base de datos
    async connectToDb() {
        if (!this.db) {
            try {
                await client.connect();
                this.db = client.db(dbName);
                console.log("Conectado a la base de datos MongoDB");
            } catch (error) {
                console.error("Error de conexión a MongoDB:", error);
            }
        }
    }

    // Método para guardar el resultado de la ordenación
    async saveSortingResult(unsorted, algorithm, sorted) {
        // Nos aseguramos de que la conexión esté abierta antes de insertar
        if (!this.db) {
            await this.connectToDb();
        }

        const collection = this.db.collection(collectionName);
        await collection.insertOne({
            unsorted: unsorted.join(", "),
            size: unsorted.length,
            "sort algorithm": algorithm,
            sorted: sorted.join(", ")
        });

        console.log("Resultado guardado en la base de datos");
    }

    // Método para cerrar la conexión (por si la necesitas en el futuro)
    async closeConnection() {
        await client.close();
        console.log("Conexión cerrada");
    }
}

module.exports = SortingModel;
