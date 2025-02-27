const fs = require('fs');

// Datos a guardar en el archivo JSON
const apartamentos = [
    { id: 101, inquilino: "Juan Perez", numHabitaciones: 3, ocupado: true },
    { id: 102, inquilino: "Maria Gomez", numHabitaciones: 2, ocupado: false }
];

// Convertir los datos a JSON y guardarlos en un archivo
fs.writeFile('apartamentos.json', JSON.stringify(apartamentos, null, 4), (err) => {
    if (err) {
        console.error("Error al guardar el archivo:", err);
    } else {
        console.log("Archivo JSON guardado exitosamente.");
    }
});
