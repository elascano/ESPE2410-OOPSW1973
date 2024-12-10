const fs = require('fs');
const readline = require('readline');


const FILE_PATH = './data.json';


const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let items = [];

const loadData = () => {
    try {
        const data = fs.readFileSync(FILE_PATH, 'utf8');
        items = JSON.parse(data);
    } catch (err) {
        console.log('No se encontró el archivo o está vacío, se iniciará con una lista vacía.');
        items = [];
    }
};


const saveData = () => {
    fs.writeFileSync(FILE_PATH, JSON.stringify(items, null, 2));
    console.log('Datos guardados correctamente.');
};


const createItem = () => {
    rl.question('Ingrese el ID: ', (id) => {
        rl.question('Ingrese el nombre: ', (name) => {
            items.push({ id: parseInt(id), name });
            console.log('Elemento agregado exitosamente.');
            showMenu();
        });
    });
};


const readItems = () => {
    if (items.length === 0) {
        console.log('No hay elementos para mostrar.');
    } else {
        console.log('\n--- Lista de Elementos ---');
        items.forEach(item => {
            console.log(`ID: ${item.id}, Nombre: ${item.name}`);
        });
    }
    showMenu();
};


const updateItem = () => {
    rl.question('Ingrese el ID del elemento a actualizar: ', (id) => {
        const item = items.find(item => item.id === parseInt(id));
        if (item) {
            rl.question('Ingrese el nuevo nombre: ', (newName) => {
                item.name = newName;
                console.log('Elemento actualizado exitosamente.');
                showMenu();
            });
        } else {
            console.log('Elemento con ID ' + id + ' no encontrado.');
            showMenu();
        }
    });
};


const deleteItem = () => {
    rl.question('Ingrese el ID del elemento a eliminar: ', (id) => {
        const index = items.findIndex(item => item.id === parseInt(id));
        if (index !== -1) {
            items.splice(index, 1);
            console.log('Elemento eliminado exitosamente.');
        } else {
            console.log('Elemento con ID ' + id + ' no encontrado.');
        }
        showMenu();
    });
};


const showMenu = () => {
    console.log('\n--- Menu CRUD en Node.js ---');
    console.log('1. Crear');
    console.log('2. Leer');
    console.log('3. Actualizar');
    console.log('4. Eliminar');
    console.log('5. Salir');
    rl.question('Seleccione una opción: ', (option) => {
        switch (option) {
            case '1':
                createItem();
                break;
            case '2':
                readItems();
                break;
            case '3':
                updateItem();
                break;
            case '4':
                deleteItem();
                break;
            case '5':
                saveData();
                console.log('¡Hasta luego!');
                rl.close();
                break;
            default:
                console.log('Opción no válida. Intente nuevamente.');
                showMenu();
                break;
        }
    });
};

loadData();
showMenu();
