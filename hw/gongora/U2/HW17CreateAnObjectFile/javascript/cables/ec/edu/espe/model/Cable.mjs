export class Cable{
    #id;
    #type;
    #numberOfConductors;
    #price;

    toString(){
        return `ID: ${this.#id}, Type: ${this.#type}, Number of conductors: ${this.#numberOfConductors}, Price: ${this.#price}`;
    }

    constructor(id,type,numberOfConductors,price){
        this.#id=id;
        this.#type=type;
        this.#numberOfConductors=numberOfConductors;
        this.#price=price;
    }

    getId(){
        return this.#id;
    }

    getType(){
        return this.#type;
    }

    getNumberOfConductors(){
        return this.#numberOfConductors;
    }

    getPrice(){
        return this.#price;
    }

    toJSON(){
        return {
            id:this.#id,
            type:this.#type,
            numberOfConductors:this.#numberOfConductors,
            price:this.#price

        }
    }

}