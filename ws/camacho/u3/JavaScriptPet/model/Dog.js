import Animal from './Animal.js';

class Dog {
    constructor(name, weight) {
        return new Animal({
            name,
            weight,
            type: 'dog',
            foodAmount: Dog.calculateFood(weight)
        });
    }

    static calculateFood(weight) {
        return weight * 0.04; 
    }
}

export default Dog;