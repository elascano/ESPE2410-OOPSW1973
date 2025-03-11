const { MongoClient } = require('mongodb');


const uri = "mongodb+srv://ltipan:ltipan@cluster0.lacr0.mongodb.net/";

const dbName = "TipanStrategy";
const collectionName = "TipanSortedArray";

const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

class SortingModel {
    constructor() {
        
        this.connectToDb();
    }

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

    async saveSortingResult(unsorted, algorithm, sorted) {

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

 
    async closeConnection() {
        await client.close();
        console.log("Conexión cerrada");
    }
}

module.exports = SortingModel;
