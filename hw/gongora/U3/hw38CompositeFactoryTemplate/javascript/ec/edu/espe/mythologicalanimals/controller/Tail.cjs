const {EntityMixin} = require("./EntityMixin.cjs")

class Tail{
    constructor(){
        if (new.target === Tail){
            throw new Error("the class cannot be instantiated")
        }
        this._validateImplementation()
    }

    hasSharpTip(){
        throw new Error("The method must be implemented")
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
    Tail
}