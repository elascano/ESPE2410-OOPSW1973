const { Tail } = require("../controller/Tail.cjs")

class DragonTail extends Tail {
    constructor() {
        super()
    }

    attack() {
        console.log("tail - tries to stab his prey");
    }

    hasSharpTip() {
        console.log(" have a sharp tail");
        return true;
    }
}

module.exports = DragonTail