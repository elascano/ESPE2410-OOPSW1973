const {MythologicalAnimal} = require("../controller/MythologicalAnimal.cjs")
const {EntityMixin}=require("../controller/EntityMixin.cjs")

class Dragon extends MythologicalAnimal{
    #partsOfBody

    constructor(){
        super()
        this.#partsOfBody = []
        this._validateImplementation()
    }

    add(entity){
        this.#partsOfBody.push(entity)
    }

    attack(){
        this.#partsOfBody.forEach(part =>{
            part.attack()
        })
    }

    showDescription(){
        console.log("I'm a dragon guardian of the heavens");
    }
    _validateImplementation() {
        Object.keys(EntityMixin).forEach((method) => {
            if (typeof this[method] !== "function") {
                throw new Error(`Error: the class must be implement the method '${method}'`);
            }
        });
    }
}



module.exports = Dragon