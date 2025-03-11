const { MongoClient } = require('mongodb');
const readline = require('readline-sync');

// MongoDB Atlas connection string
const uri = "mongodb+srv://ltipan:ltipan@cluster0.lacr0.mongodb.net/?retryWrites=true&w=majority";

async function main() {
    const client = new MongoClient(uri, { useUnifiedTopology: true });

    try {
        // Conectar a MongoDB
        await client.connect();
        console.log("Connected to MongoDB Atlas!");

        const db = client.db("clothingStore");
        const collection = db.collection("clothes");

        // Pedir los datos al usuario
        console.log("=== Clothing Item Entry ===");

        const id = parseInt(readline.question("Enter the clothing item ID: "), 10);
        const name = readline.question("Enter the clothing item name: ");
        const price = parseFloat(readline.question("Enter the clothing item price: "));

        console.log(`Received data - ID: ${id}, Name: ${name}, Price: ${price}`);

        const clothingItem = {
            _id: id,
            name: name,
            price: price,
        };

        // Insertar en MongoDB
        await collection.insertOne(clothingItem);
        console.log("Clothing item successfully saved to MongoDB!");

    } catch (err) {
        if (err && err.code === 11000) {
            console.error("Error: Duplicate ID. The item ID already exists.");
        } else {
            console.error("Error:", err.message);
        }
    } finally {
        // Cerrar conexión
        await client.close();
        console.log("Disconnected from MongoDB.");
    }
}

// Ejecutar la función principal
main().catch(console.error);
