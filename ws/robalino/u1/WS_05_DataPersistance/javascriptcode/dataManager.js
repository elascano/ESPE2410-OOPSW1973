// File: dataManager.js
const fs = require('fs');
const Person = require('./person');

class DataManager {
    constructor(filePath) {
        this.filePath = filePath;
        this.people = this.loadFromFile();
    }

    loadFromFile() {
        try {
            const data = fs.readFileSync(this.filePath, 'utf8');
            const peopleArray = JSON.parse(data);
            return peopleArray.map(person => Person.fromJSON(person));
        } catch (error) {
            if (error.code === 'ENOENT') {
                return []; // File does not exist, return an empty list
            }
            throw error;
        }
    }

    saveToFile() {
        const data = JSON.stringify(this.people.map(person => person.toJSON()), null, 4);
        fs.writeFileSync(this.filePath, data, 'utf8');
    }

    addPerson(person) {
        this.people.push(person);
        this.saveToFile();
    }

    updatePerson(id, updatedPerson) {
        this.people = this.people.filter(person => person.id !== id); // Remove the old person
        this.addPerson(updatedPerson); // Add the updated person
    }

    deletePerson(id) {
        this.people = this.people.filter(person => person.id !== id);
        this.saveToFile();
    }

    searchById(id) {
        return this.people.find(person => person.id === id) || null;
    }

    getAllPeople() {
        return this.people;
    }
}

module.exports = DataManager;
