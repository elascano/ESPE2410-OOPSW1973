const fs = require('fs');

class Reader {
    static readJsonFile(filePath) {
        try {
            const data = fs.readFileSync(filePath, 'utf8');
            return JSON.parse(data).students;
        } catch (err) {
            console.error("Error al leer el archivo:", err);
            return [];
        }
    }
}

module.exports = Reader;

class Student {
    constructor(id, name, nrc, email, courses) {
        this.id = id;
        this.name = name;
        this.nrc = nrc;
        this.email = email;
        this.courses = courses;
    }

    static fromJson(json) {
        return new Student(json.id, json.name, json.nrc, json.email, json.courses);
    }

    toJson() {
        return {
            id: this.id,
            name: this.name,
            nrc: this.nrc,
            email: this.email,
            courses: this.courses
        };
    }
}

module.exports = Student;

class Editor {
    static editStudent(students, studentId, updatedStudent) {
        const index = students.findIndex(student => student.id === studentId);
        if (index !== -1) {
            students[index] = updatedStudent;
            console.log("Estudiante editado exitosamente.");
        } else {
            console.log("Estudiante no encontrado.");
        }
    }
}

module.exports = Editor;

class Deleter {
    static deleteStudent(students, studentId) {
        const index = students.findIndex(student => student.id === studentId);
        if (index !== -1) {
            students.splice(index, 1);
            console.log("Estudiante borrado exitosamente.");
        } else {
            console.log("Estudiante no encontrado.");
        }
    }
}

module.exports = Deleter;


class Searcher {
    static searchStudents(students, query) {
        return students.filter(student => 
            student.name.includes(query) || 
            student.nrc.toString().includes(query) || 
            student.email.includes(query) ||
            student.courses.some(course => course.includes(query)) ||
            student.id.toString().includes(query)
        );
    }
}

module.exports = Searcher;

class GrabatorJson {
    static writeJsonFile(filePath, students) {
        try {
            const data = { students };
            fs.writeFileSync(filePath, JSON.stringify(data, null, 2));
            console.log("Archivo actualizado exitosamente.");
        } catch (err) {
            console.error("Error al guardar el archivo:", err);
        }
    }
}

module.exports = GrabatorJson;


const Reader = require('./Reader');
const Editor = require('./Editor');
const Deleter = require('./Deleter');
const Searcher = require('./Searcher');
const GrabatorJson = require('./GrabatorJson');
const readlineSync = require('readline-sync');  // Librería para leer input desde la consola

const FILE_PATH = "path/to/your/students.json";  // Cambia esta ruta a tu archivo JSON

class StudentRead {
    static main() {
        let students = Reader.readJsonFile(FILE_PATH);
        
        while (true) {
            console.log("Seleccione una opción:");
            console.log("1. Leer archivo Json");
            console.log("2. Editar estudiante");
            console.log("3. Borrar estudiante");
            console.log("4. Buscar estudiante");
            console.log("5. Salir");

            const option = readlineSync.questionInt('Ingrese una opción: ');

            switch (option) {
                case 1:
                    students.forEach(student => console.log(student));
                    this.waitForUser();
                    break;
                case 2:
                    const editId = readlineSync.questionInt('Ingrese el ID del estudiante a editar: ');
                    const updatedName = readlineSync.question('Ingrese el nuevo nombre: ');
                    const updatedNrc = readlineSync.questionInt('Ingrese el nuevo NRC: ');
                    const updatedEmail = readlineSync.question('Ingrese el nuevo correo: ');
                    const updatedCourses = readlineSync.question('Ingrese los nuevos cursos (separados por comas): ').split(',');

                    const updatedStudent = new Student(editId, updatedName, updatedNrc, updatedEmail, updatedCourses);
                    Editor.editStudent(students, editId, updatedStudent);
                    GrabatorJson.writeJsonFile(FILE_PATH, students);
                    this.waitForUser();
                    break;
                case 3:
                    const deleteId = readlineSync.questionInt('Ingrese el ID del estudiante a borrar: ');
                    Deleter.deleteStudent(students, deleteId);
                    GrabatorJson.writeJsonFile(FILE_PATH, students);
                    this.waitForUser();
                    break;
                case 4:
                    const query = readlineSync.question('Ingrese el término de búsqueda: ');
                    const foundStudents = Searcher.searchStudents(students, query);
                    if (foundStudents.length > 0) {
                        foundStudents.forEach(student => console.log(student));
                    } else {
                        console.log("No se encontraron estudiantes.");
                    }
                    this.waitForUser();
                    break;
                case 5:
                    console.log("Saliendo...");
                    return;
                default:
                    console.log("Opción no válida.");
            }
        }
    }

    static waitForUser() {
        const answer = readlineSync.question('¿Desea regresar al menú principal? (s/n): ');
        if (answer.toLowerCase() !== 's') {
            console.log("Saliendo...");
            process.exit(0);
        }
    }
}

StudentRead.main();
