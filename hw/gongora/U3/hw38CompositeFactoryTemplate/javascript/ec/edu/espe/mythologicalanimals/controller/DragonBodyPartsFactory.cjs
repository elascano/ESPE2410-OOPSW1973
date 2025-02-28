const {AnimalBodyPartsFactoryMixin} = require("./AnimalBodyPartsFactoryMixin.cjs")
const {DragonHead,DragonLeg,DragonTail,DragonWing} = require("../model/index.cjs")

class DragonBodyPartsFactory{
    constructor(){
        this._validateImplementation()
    }
    createHead(){
        return new DragonHead()
    }
    createLeg(){
        return new DragonLeg()
    }
    createTail(){
        return new DragonTail()
    }
    createWing(){
        return new DragonWing()
    }
    _validateImplementation() {
        Object.keys(AnimalBodyPartsFactoryMixin).forEach((method) => {
            if (typeof this[method] !== "function") {
                throw new Error(`Error: the class must be implement the method '${method}'`);
            }
        });
    }
}



module.exports = DragonBodyPartsFactory