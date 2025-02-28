const { Tail } = require("../controller/Tail.cjs");

class GriffinTail extends Tail {
    constructor() {
        super()
    }

    attack() {
        console.log("Wags its tail to clean its surroundings");
    }

    hasSharpTip() {
       
        return false;
    }
}

module.exports = GriffinTail
