const fs = require('fs');
const path = require('path');
const filePath = path.join(__dirname, '../data.json');

// Función para leer los datos del archivo JSON
function leerDatos() {
    try {
        const data = fs.readFileSync(filePath, 'utf-8');
        return JSON.parse(data); // Devuelve el objeto de datos
    } catch (error) {
        console.error('Error al leer el archivo JSON:', error);
        return {}; // Si hay un error, devuelve un objeto vacío
    }
}

// Función para escribir los datos al archivo JSON
function escribirDatos(data) {
    try {
        fs.writeFileSync(filePath, JSON.stringify(data, null, 2), 'utf-8');
    } catch (error) {
        console.error('Error al escribir en el archivo JSON:', error);
    }
}

module.exports = { leerDatos, escribirDatos };
