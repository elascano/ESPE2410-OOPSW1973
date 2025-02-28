const {MythologicalAnimal} = require("../controller/MythologicalAnimal.cjs")
const {EntityMixin}=require("../controller/EntityMixin.cjs")

class Griffin extends MythologicalAnimal{
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
        console.log("I am the Griffin, a majestic creature born from the union of the"
                + " king of beasts and the lord of the skies. My body is that of a lion—strong and agile—while my head and wings belong to an eagle");
    }

    _validateImplementation() {
        Object.keys(EntityMixin).forEach((method) => {
            if (typeof this[method] !== "function") {
                throw new Error(`Error: the class must be implement the method '${method}'`);
            }
        });
    }

}



module.exports = Griffin