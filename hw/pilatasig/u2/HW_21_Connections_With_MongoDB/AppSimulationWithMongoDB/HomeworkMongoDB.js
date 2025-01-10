const { MongoClient } = require('mongodb');
const readline = require('readline');


const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


const url = 'mongodb+srv://dapilatasig:dapilatasig@cluster0.1qaby.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0';
const dbName = 'OOP_DP'; 


async function conectar() {
    try {
        const cliente = new MongoClient(url);
        await cliente.connect(); 
        console.log("Conexión exitosa a MongoDB");

        const db = cliente.db(dbName); 
        return { db, cliente }; 
    } catch (error) {
        console.error("Error al conectar a MongoDB:", error);
    }
}


function askQuestion(query) {
    return new Promise((resolve) => rl.question(query, resolve));
}


async function obtenerDatosMesa() {
    const name = await askQuestion('Ingrese el nombre de la mesa: ');
    const material = await askQuestion('Ingrese el material de la mesa: ');
    const color = await askQuestion('Ingrese el color de la mesa: ');
    const size = await askQuestion('Ingrese el tamaño de la mesa (ej. 120x60 cm): ');
    const price = await askQuestion('Ingrese el precio de la mesa: ');

    return {
        name,
        material,
        color,
        size,
        price: parseFloat(price), 
        CreationOnDate: new Date() 
    };
}

async function insertarMesaDecorativa() {
    const { db, cliente } = await conectar(); 
    const coleccion = db.collection('DecorativeTables'); 

    try {
        const nuevaMesa = await obtenerDatosMesa(); 
        const resultado = await coleccion.insertOne(nuevaMesa); 
        console.log(`Nueva mesa insertada con el ID: ${resultado.insertedId}`);
    } catch (error) {
        console.error("Error al insertar mesa decorativa:", error);
    } finally {
        await cliente.close(); 
        console.log("Conexión cerrada");
        rl.close(); 
    }
}


insertarMesaDecorativa();
