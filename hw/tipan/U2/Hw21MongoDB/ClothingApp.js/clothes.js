const { MongoClient } = require('mongodb');
const readline = require('readline-sync');

// MongoDB Atlas connection string
const uri = "mongodb+srv://ltipan:ltipan@cluster0.lacr0.mongodb.net/?retryWrites=true&w=majority";

// Función principal
async function main() {
    const client = new MongoClient(uri, { useUnifiedTopology: true });

    try {
        // Conexión a MongoDB
        await client.connect();
        console.log("Connected to MongoDB Atlas!");

        const db = client.db("clothingStore");
        const collection = db.collection("clothes");

        // Pedir los datos al usuario
        console.log("=== Clothing Item Entry ===");

        // Asegúrate de que readline-sync espera la entrada del usuario
        const id = readline.questionInt("Enter the clothing item ID: ");
        const name = readline.question("Enter the clothing item name: ");
        const price = readline.questionFloat("Enter the clothing item price: ");

        console.log(`Received data - ID: ${id}, Name: ${name}, Price: ${price}`);

        // Crear el documento
        const clothingItem = {
            _id: id,
            name: name,
            price: price,
        };

        // Insertar el documento en MongoDB
        await collection.insertOne(clothingItem);
        console.log("Clothing item successfully saved to MongoDB!");

    } catch (err) {
        if (err.code === 11000) {
            console.error("Error: Duplicate ID. The item ID already exists.");
        } else {
            console.error("Error:", err.message);
        }
    } finally {
        // Cerrar la conexión
        await client.close();
        console.log("Disconnected from MongoDB.");
    }
}

// Ejecutar la función principal
main().catch(console.error);
