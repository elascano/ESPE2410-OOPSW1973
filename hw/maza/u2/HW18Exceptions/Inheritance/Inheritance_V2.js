class Employee {
    constructor(name, age, salary){
        this.name = name
        this.age = age
        this.salary = salary
    }
    information() {
        console.log(`The name of the worker is ${this.name}, have ${this.age} years and earns ${this.salary} dollars`)
    }
    calculateSalary() {
        return this.salary
    }
}
class Manager extends Employee {
    constructor(name, age, salary, bonification) {
      super(name, age, salary)
      this.bonification = bonification
    }
    calculateSalary(){
        return this.salary + this.bonification
    }
}
class Developer extends Employee {
    constructor(name, age, salary, programminglanguaje) {
        super(name, age, salary)
        this.programminglanguaje = programminglanguaje
    }
    calculateSalary(){
        const extraForLanguage = 100
        return this.salary + (this.programminglanguaje.length * extraForLanguage)
    }
}
class Practicing extends Employee {
    constructor(name, age, salary, practicalDuration) {
        super(name, age, salary)
        this.practicalDuration = practicalDuration
    }
    calculateSalary(){
        const reduction = 0.7
        return this.salary * reduction
    }
}
const manager = new Manager ('Jardel', 19, 470, 30)
console.log(`The manager salary is ${manager.calculateSalary()}`)
const developer = new Developer ('Juan', 18, 470, ['JavaScript', 'Python', 'Java'])
console.log(`The developer salary is ${developer.calculateSalary()}`)
const practicing = new Practicing ('Pedro', 18, 470, 6)
console.log(`The practicing salary is ${practicing.calculateSalary()}`)
