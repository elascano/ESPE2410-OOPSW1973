const readline = require('readline');
const { MongoClient } = require('mongodb');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


function preguntar(pregunta) {
    return new Promise((resolve, reject) => {
        rl.question(pregunta, (respuesta) => {
            resolve(respuesta);
        });
    });
}

const uri = "mongodb+srv://dspaucar:dspaucar@cluster0.lx1js.mongodb.net/?retryWrites=true&w=majority";

async function insertarAutomovil() {
    const client = new MongoClient(uri);

    try {
        
        await client.connect();
        const database = client.db('oop');
        const collection = database.collection('cars');

   
        const id = await preguntar("Introduce el ID del automovil: ");
        const marca = await preguntar("Introduce la marca del automovil: ");
        const modelo = await preguntar("Introduce el modelo del automovil: ");
        const precio = await preguntar("Introduce el precio del automovil: ");
        const color = await preguntar("Introduce el color del automovil: ");

       
        const document = {
            id: id,
            marca: marca,
            modelo: modelo,
            precio: parseFloat(precio), 
            color: color
        };

       
        const result = await collection.insertOne(document);
        console.log(`Automovil insertado con el ID: ${result.insertedId}`);

        rl.close();

    } catch (error) {
        console.error("Error al conectar con MongoDB:", error);
    } finally {
        await client.close(); 
    }
}


insertarAutomovil();
