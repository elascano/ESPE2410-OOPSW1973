const { MongoClient } = require('mongodb');

async function main() {
    const uri = "mongodb+srv://jmaza:jmaza@cluster0.y11rj.mongodb.net/?retryWrites=true&w=majority";

    const client = new MongoClient(uri);

    try {
        await client.connect();

        const database = client.db("oop");
        const collection = database.collection("students");
        const filtro = { name: "jardel" };
        const actualizacion = {
            $set: {
                name: "Jardel",
                GPA: 19.99, 
                id: "L00224583", 
                ageInYears: 20  
            }
        };

        const resultado = await collection.updateOne(filtro, actualizacion);

        if (resultado.matchedCount > 0) {
            console.log(`Documento actualizado. Campos modificados: ${resultado.modifiedCount}`);
        } else {
            console.log("No se encontró ningún documento que coincida con el filtro.");
        }
    } catch (error) {
        console.error("Ocurrió un error:", error);
    } finally {
        await client.close();
    }
}

main().catch(console.error);
