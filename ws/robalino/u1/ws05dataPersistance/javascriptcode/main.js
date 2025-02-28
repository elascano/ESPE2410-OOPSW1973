// File: main.js
const readline = require('readline');
const DataManager = require('./dataManager');
const Person = require('./person');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

const dataManager = new DataManager('people.json');

/**
 * Prompts the user and ensures the input is a valid integer.
 * @param {string} prompt - The message to display to the user.
 * @param {function} callback - A callback function to pass the validated integer.
 */
function getValidInteger(prompt, callback) {
    rl.question(prompt, input => {
        const number = parseInt(input, 10);
        if (isNaN(number)) {
            console.log('Invalid input. Please enter a valid integer.');
            return getValidInteger(prompt, callback);
        }
        callback(number);
    });
}

/**
 * Prompts the user to enter details for a Person object with validated inputs.
 * @param {function} callback - A callback function to pass the created Person object.
 */
function getPersonFromConsole(callback) {
    getValidInteger('Enter ID: ', id => {
        rl.question('Enter Name: ', name => {
            getValidInteger('Enter Age: ', age => {
                const person = new Person(id, name, age);
                callback(person);
            });
        });
    });
}

/**
 * Displays the main menu and handles user choices.
 */
function mainMenu() {
    console.log('\n=== Data Manager ===');
    console.log('1. Add a Person');
    console.log('2. Update a Person');
    console.log('3. Delete a Person');
    console.log('4. View All People');
    console.log('5. Search for a Person by ID');
    console.log('6. Exit');

    rl.question('Choose an option: ', choice => {
        switch (choice) {
            case '1':
                getPersonFromConsole(person => {
                    dataManager.addPerson(person);
                    console.log('Person added successfully.');
                    mainMenu();
                });
                break;
            case '2':
                getValidInteger('Enter the ID of the person to update: ', id => {
                    getPersonFromConsole(updatedPerson => {
                        dataManager.updatePerson(id, updatedPerson);
                        console.log('Person updated successfully.');
                        mainMenu();
                    });
                });
                break;
            case '3':
                getValidInteger('Enter the ID of the person to delete: ', id => {
                    dataManager.deletePerson(id);
                    console.log('Person deleted successfully.');
                    mainMenu();
                });
                break;
            case '4':
                console.log('All People:');
                dataManager.getAllPeople().forEach(person => console.log(person));
                mainMenu();
                break;
            case '5':
                getValidInteger('Enter the ID of the person to search: ', id => {
                    const person = dataManager.searchById(id);
                    if (person) {
                        console.log('Person Found:', person);
                    } else {
                        console.log(`No person found with ID: ${id}`);
                    }
                    mainMenu();
                });
                break;
            case '6':
                console.log('Exiting... Goodbye!');
                rl.close();
                break;
            default:
                console.log('Invalid choice. Please try again.');
                mainMenu();
                break;
        }
    });
}

// Start the application
mainMenu();
