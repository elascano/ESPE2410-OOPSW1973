// File: person.js
class Person {
    constructor(id, name, age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    toJSON() {
        return { id: this.id, name: this.name, age: this.age };
    }

    static fromJSON(json) {
        return new Person(json.id, json.name, json.age);
    }
}

module.exports = Person;
