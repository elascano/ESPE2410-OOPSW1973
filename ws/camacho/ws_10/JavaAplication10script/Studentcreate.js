class Student {
    constructor(name, lastname, id, nrc) {
      this.name = name;
      this.lastname = lastname;
      this.id = id;
      this.nrc = nrc;
    }
  
    // Método para mostrar los detalles del estudiante
    getDetails() {
      return `ID: ${this.id}, Name: ${this.name} ${this.lastname}, NRC: ${this.nrc}`;
    }
  }

  const fs = require('fs');  // Necesario para trabajar con el sistema de archivos en Node.js

class GrabatorJson {
  static saveToJson(students, filename) {
    const jsonData = JSON.stringify(students, null, 2); // Convierte el array de estudiantes a JSON
    fs.writeFileSync(filename, jsonData, 'utf-8');  // Guarda el JSON en un archivo
    console.log('Datos guardados correctamente en ' + filename);
  }
}

const readlineSync = require('readline-sync');  // Necesario para interactuar con el usuario desde la terminal

class Main {
  static run() {
    let students = [];

    // Ingresar estudiantes
    let addMore = true;
    while (addMore) {
      const name = readlineSync.question('Ingrese el nombre del estudiante: ');
      const lastname = readlineSync.question('Ingrese el apellido del estudiante: ');
      const id = readlineSync.questionInt('Ingrese el ID del estudiante: ');
      const nrc = readlineSync.questionInt('Ingrese el NRC del estudiante: ');

      // Crear una nueva instancia de Student
      const student = new Student(name, lastname, id, nrc);
      students.push(student);

      // Preguntar si desea agregar otro estudiante
      addMore = readlineSync.keyInYNStrict('¿Desea agregar otro estudiante?');

      // Si no agrega más, guardamos los datos
      if (!addMore) {
        GrabatorJson.saveToJson(students, 'students.json');
      }
    }
  }
}

// Ejecutar el programa principal
Main.run();
