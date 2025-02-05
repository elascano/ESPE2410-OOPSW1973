const fs = require('fs');
const readline = require('readline');
const Notebook = require('./Notebook'); // Importar la clase Notebook

// Crear la interfaz de lectura desde la consola
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// Función para guardar los notebooks en un archivo JSON
function guardarNotebooks(notebooks) {
    fs.writeFileSync('notebooks.json', JSON.stringify(notebooks, null, 2), 'utf-8');
    console.log('Lista guardada correctamente en el archivo.');
}

// Función para cargar los notebooks desde un archivo JSON
function cargarNotebooks() {
    if (fs.existsSync('notebooks.json')) {
        const data = fs.readFileSync('notebooks.json', 'utf-8');
        return JSON.parse(data);
    } else {
        return []; // Si el archivo no existe, devuelve un arreglo vacío
    }
}

// Función para agregar un nuevo notebook
function agregarNotebook(nuevoNotebook) {
    let notebooks = cargarNotebooks(); // Cargar la lista actual desde el archivo

    // Verificar si el notebook ya existe en la lista
    const existe = notebooks.some((notebook) => notebook.marca === nuevoNotebook.marca && notebook.modelo === nuevoNotebook.modelo);

    if (existe) {
        console.log(`El notebook ${nuevoNotebook.marca} ${nuevoNotebook.modelo} ya existe en la lista.`);
    } else {
        // Si el notebook no existe, agregarlo a la lista
        notebooks.push(nuevoNotebook);
        console.log(`Notebook ${nuevoNotebook.marca} ${nuevoNotebook.modelo} agregado correctamente.`);
    }

    // Guardar la lista actualizada de notebooks en el archivo JSON
    guardarNotebooks(notebooks);
}

// Función para actualizar un notebook en la lista
function actualizarNotebook(marca, modelo, nuevosDatos) {
    let notebooks = cargarNotebooks(); // Cargar la lista actual desde el archivo

    // Buscar el notebook con la misma marca y modelo
    const notebookIndex = notebooks.findIndex((notebook) => notebook.marca === marca && notebook.modelo === modelo);

    if (notebookIndex !== -1) {
        // Si el notebook es encontrado, actualizamos los campos
        notebooks[notebookIndex] = { ...notebooks[notebookIndex], ...nuevosDatos };
        console.log(`Notebook ${marca} ${modelo} actualizado correctamente.`);
    } else {
        console.log(`Notebook con marca ${marca} y modelo ${modelo} no encontrado.`);
    }

    // Guardar la lista actualizada de notebooks en el archivo JSON
    guardarNotebooks(notebooks);
}

// Función para agregar un notebook pidiendo datos por consola
function pedirDatosParaAgregar() {
    rl.question('Ingrese la marca del notebook: ', (marca) => {
        rl.question('Ingrese el modelo del notebook: ', (modelo) => {
            rl.question('Ingrese la cantidad de RAM (GB): ', (ram) => {
                rl.question('Ingrese el almacenamiento (GB): ', (almacenamiento) => {
                    const nuevoNotebook = new Notebook(marca, modelo, parseInt(ram), parseInt(almacenamiento));
                    agregarNotebook(nuevoNotebook);
                    rl.close(); // Cierra la interfaz después de agregar el notebook
                });
            });
        });
    });
}

// Función para actualizar un notebook pidiendo datos por consola
function pedirDatosParaActualizar() {
    rl.question('Ingrese la marca del notebook a actualizar: ', (marca) => {
        rl.question('Ingrese el modelo del notebook a actualizar: ', (modelo) => {
            rl.question('Ingrese la nueva cantidad de RAM (GB): ', (ram) => {
                rl.question('Ingrese el nuevo almacenamiento (GB): ', (almacenamiento) => {
                    const nuevosDatos = {
                        ram: parseInt(ram),
                        almacenamiento: parseInt(almacenamiento)
                    };
                    actualizarNotebook(marca, modelo, nuevosDatos);
                    rl.close(); // Cierra la interfaz después de actualizar el notebook
                });
            });
        });
    });
}

// Menú de opciones
function mostrarMenu() {
    console.log('\nSeleccione una opción:');
    console.log('1. Agregar un nuevo notebook');
    console.log('2. Modificar un notebook existente');
    console.log('3. Salir');

    rl.question('Opción: ', (opcion) => {
        if (opcion === '1') {
            pedirDatosParaAgregar(); // Agregar notebook
        } else if (opcion === '2') {
            pedirDatosParaActualizar(); // Modificar notebook
        } else if (opcion === '3') {
            rl.close(); // Salir
        } else {
            console.log('Opción no válida.');
            mostrarMenu(); // Volver a mostrar el menú si la opción no es válida
        }
    });
}

// Iniciar el programa mostrando el menú
mostrarMenu();
