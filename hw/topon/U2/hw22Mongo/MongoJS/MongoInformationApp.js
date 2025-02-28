const { MongoClient } = require('mongodb');

// URI de conexión
const uri = "mongodb+srv://daullcu:daullcu@cluster0.dxj9m.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

// Función principal
async function main() {
    const client = new MongoClient(uri);

    try {
        // Conexión al cliente
        await client.connect();
        console.log("Conexión exitosa a la base de datos.");

        // Obtener la base de datos y la colección
        const database = client.db("oop");
        const collection = database.collection("students");

        // **Crear un documento**
        const newStudent = { name: "Alexander", age: 22, major: "Computer Science" };
        const createResult = await collection.insertOne(newStudent);
        console.log("Documento creado con ID:", createResult.insertedId);

        // **Leer documentos**
        const students = await collection.find({}).toArray();
        console.log("Documentos encontrados:");
        console.log(students);

        // **Actualizar un documento**
        const filter = { name: "Alexander" };
        const update = { $set: { name: "Jennifer", age: 23 } };
        const updateResult = await collection.updateOne(filter, update);
        console.log("Documentos actualizados:", updateResult.modifiedCount);

        // **Eliminar un documento**
        const deleteFilter = { name: "Jennifer" };
        const deleteResult = await collection.deleteOne(deleteFilter);
        console.log("Documentos eliminados:", deleteResult.deletedCount);

    } catch (err) {
        console.error("Error al conectar o interactuar con MongoDB:", err);
    } finally {
        // Cerrar conexión
        await client.close();
    }
}

// Ejecutar la función principal
main().catch(console.error);
    