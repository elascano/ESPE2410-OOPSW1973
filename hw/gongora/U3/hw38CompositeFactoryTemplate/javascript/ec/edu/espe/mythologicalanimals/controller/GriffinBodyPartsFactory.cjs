const { AnimalBodyPartsFactoryMixin } = require("./AnimalBodyPartsFactoryMixin.cjs")
const { GriffinHead, GriffinLeg, GriffinTail, GriffinWing } = require("../model/index.cjs")


class GriffinBodyPartsFactory {
    constructor() {
        this._validateImplementation()

    }
    createHead() {
        return new GriffinHead()
    }
    createLeg() {
        return new GriffinLeg()
    }
    createTail() {
        return new GriffinTail()
    }
    createWing() {
        return new GriffinWing()
    }
    _validateImplementation() {
        Object.keys(AnimalBodyPartsFactoryMixin).forEach((method) => {
            if (typeof this[method] !== "function") {
                throw new Error(`Error: the class must be implement the method '${method}'`);
            }
        });
    }
}


module.exports = GriffinBodyPartsFactory