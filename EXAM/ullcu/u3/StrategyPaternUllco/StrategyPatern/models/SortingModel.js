const { MongoClient } = require('mongodb');

// URL de conexión a MongoDB
const uri = "mongodb+srv://daullcu:daullcu@cluster0.dxj9m.mongodb.net/";

// Nombre de la base de datos y colección
const dbName = "strategyLastName";
const collectionName = "arrayFirstName";

// Creamos una instancia de MongoClient
const client = new MongoClient(uri);

class SortingModel {
    constructor() {
        this.db = null;
        this.isConnected = false;
    }

    // Método para conectar a la base de datos
    async connectToDb() {
        try {
            if (!this.isConnected) {
                await client.connect();
                this.db = client.db(dbName);
                this.isConnected = true;
                console.log("✅ Conectado a la base de datos MongoDB");
            }
        } catch (error) {
            console.error("❌ Error de conexión a MongoDB:", error);
            throw new Error("No se pudo conectar a la base de datos");
        }
    }

    // Método para guardar el resultado de la ordenación
    async saveSortingResult(unsorted, algorithm, sorted) {
        try {
            // Validar conexión
            if (!this.isConnected) {
                await this.connectToDb();
            }

            // Validar que los datos sean correctos
            if (!Array.isArray(unsorted) || !Array.isArray(sorted)) {
                throw new Error("Los datos de entrada no son arrays válidos.");
            }

            const collection = this.db.collection(collectionName);
            await collection.insertOne({
                unsorted: unsorted.join(", "),
                size: unsorted.length,
                "sort algorithm": algorithm,
                sorted: sorted.join(", "),
                timestamp: new Date()
            });

            console.log("✅ Resultado guardado en la base de datos");
        } catch (error) {
            console.error("❌ Error al guardar en la base de datos:", error);
        }
    }

    // Método para cerrar la conexión (opcional)
    async closeConnection() {
        try {
            await client.close();
            this.isConnected = false;
            console.log("🔒 Conexión cerrada con MongoDB");
        } catch (error) {
            console.error("❌ Error al cerrar la conexión:", error);
        }
    }
}

module.exports = SortingModel;
