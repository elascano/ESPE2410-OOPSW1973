const Furniture = require('./Furniture'); // Importa el modelo de Furniture

// Método para crear un mueble
async function createFurniture(furnitureData) {
  try {
    const furniture = new Furniture(furnitureData); // Crear la instancia del mueble
    await furniture.save(); // Guardar el mueble en la base de datos
    return furniture; // Retorna el mueble creado
  } catch (error) {
    console.log('Error al crear el mueble:', error);
    throw error; // Lanzar el error si ocurre un problema
  }
}

module.exports = { createFurniture };
