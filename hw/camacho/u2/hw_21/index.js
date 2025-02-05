const { MongoClient } = require('mongodb');
const readline = require('readline');

// Crear interfaz para recibir entrada de usuario
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

// Función para hacer preguntas de manera asíncrona
const question = (query) => new Promise((resolve) => rl.question(query, resolve));

// URL de conexión a MongoDB (usa tu base de datos y credenciales)
const uri = 'mongodb+srv://0000mama:0000mama@cluster0.0nmcc.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0&ssl=true';


// Clase para manejar la conexión y operaciones en MongoDB
class StudentManager {
  constructor() {
    this.client = new MongoClient(uri);
    this.dbName = 'PersonRecords'; // Nombre de la base de datos
    this.collectionName = 'Students'; // Nombre de la colección donde se guardarán los estudiantes
  }

  // Método para insertar un estudiante
  async insertStudent(student) {
    try {
      await this.client.connect(); // Conectar a la base de datos
      const db = this.client.db(this.dbName);
      const collection = db.collection(this.collectionName);

      const result = await collection.insertOne(student); // Insertar el estudiante
      console.log('Estudiante registrado con ID:', result.insertedId);
    } catch (error) {
      console.error('Error al registrar el estudiante:', error);
    } finally {
      await this.client.close(); // Cerrar la conexión
    }
  }
}

// Función principal para registrar estudiantes
async function registerStudent() {
  const studentManager = new StudentManager();

  // Preguntar los datos del estudiante
  const id = await question('Ingrese el ID del estudiante: ');
  const nombre = await question('Ingrese el nombre del estudiante: ');
  const fechaNacimiento = await question('Ingrese la fecha de nacimiento del estudiante (YYYY-MM-DD): ');

  // Crear un objeto con los datos del estudiante
  const student = {
    id,
    nombre,
    fechaNacimiento,
  };

  // Registrar al estudiante en la base de datos
  await studentManager.insertStudent(student);

  // Cerrar la interfaz readline
  rl.close();
}

// Llamar a la función para registrar el estudiante
registerStudent();
