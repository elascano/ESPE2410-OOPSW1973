const {Wing} = require("../controller/Wing.cjs")

class DragonWing extends Wing {
    constructor(){
        super()
    }
    
    hasFeathers() {
        return false;
    }

    attack() {
        console.log("Wing - Flaps to Sweep Around");
    }
}

module.exports = DragonWing