const {EntityMixin} = require("./EntityMixin.cjs")

class Wing{
    constructor(){
        if (new.target === Wing){
            throw new Error("the class cannot be instantiated")
        }
        this._validateImplementation()
    }

    hasFeathers(){
        throw new Error("the method must be implemented")
    }

    _validateImplementation() {
        Object.keys(EntityMixin).forEach((method) => {
            if (typeof this[method] !== "function") {
                throw new Error(`Error: the class must be implement the method '${method}'`);
            }
        });
    }
}



module.exports = {
    Wing
}