const fs = require('fs');
const readline = require('readline');

const FILE_PATH = './data.json';

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let standList = [];

const loadData = () => {
    try {
        const data = fs.readFileSync(FILE_PATH, 'utf8');
        standList = JSON.parse(data);
    } catch (err) {
        console.log('empy File.');
        standList = [];
    }
};

const saveData = () => {
    fs.writeFileSync(FILE_PATH, JSON.stringify(standList, null, 2));
    console.log('Datos guardados correctamente.');
};

const createStandList = () => {
    rl.question('Enter ID: ', (id) => {
        rl.question('Enter color: ', (color) => {
            rl.question('Enter material: ', (material) => {
                rl.question('Enter propuorse of stand: ', (tipo) => {
                    standList.push({
                        id: parseInt(id),
                        color,
                        material,
                        tipo
                    });
                    console.log('Elemento agregado exitosamente.');
                    saveData();
                    showMenu();
                });
            });
        });
    });
};

const readStandList = () => {
    if (standList.length === 0) {
        console.log('There is no elements to show');
    } else {
        console.log('\n--- List of Elements ---');
        standList.forEach(item => {
            console.log(`ID: ${item.id}, Color: ${item.color}, Material: ${item.material}, Tipo: ${item.tipo}`);
        });
    }
    showMenu();
};

const showMenu = () => {
    console.log('\n--- Menu  ---');
    console.log('1. Create');
    console.log('2. Read');
    console.log('3. Exit');
    rl.question('Select an option: ', (option) => {
        switch (option) {
            case '1':
                createStandList();
                break;
            case '2':
                readStandList();
                break;
            case '3':
                console.log('Exit...');
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
