export class Animal {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    getDetails() {
        return `${this.name} tiene ${this.age} años.`;
    }
}
