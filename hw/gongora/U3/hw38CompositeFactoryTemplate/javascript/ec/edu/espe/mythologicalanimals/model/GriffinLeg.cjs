const {Leg} = require("../controller/Leg.cjs")

class GriffinLeg extends Leg {
    constructor(){
        super()
    }
  
    attack() {
        console.log("It's a leg trying to crush it");
    }

    
    hasPads() {
        return false;
    }
}

module.exports = GriffinLeg