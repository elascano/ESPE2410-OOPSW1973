import Animal from './Animal.js';

class Cat {
    constructor(name, weight) {
        return new Animal({
            name,
            weight,
            type: 'cat',
            foodAmount: Cat.calculateFood(weight)
        });
    }

    static calculateFood(weight) {
        return weight * 0.03; 
    }
}

export default Cat;