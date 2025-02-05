const { MongoClient } = require('mongodb');

async function main() {
    
    const uri = "mongodb+srv://equiroga:equiroga@cluster0.ioba4.mongodb.net/?retryWrites=true&w=majority";

    
    const client = new MongoClient(uri);

    try {
        
        await client.connect();

        const database = client.db("oop");
        const collection = database.collection("students");

        const filtro = { nombre: "Juan" };

        const actualizacion = { $set: { "GPA": 15.3 } };

        const resultado = await collection.updateOne(filtro, actualizacion);

        console.log(`Documents modified: ${resultado.modifiedCount}`);
    } catch (error) {
        console.error("Something went wrong:", error);
    } finally {

        await client.close();
    }
}

main().catch(console.error);
