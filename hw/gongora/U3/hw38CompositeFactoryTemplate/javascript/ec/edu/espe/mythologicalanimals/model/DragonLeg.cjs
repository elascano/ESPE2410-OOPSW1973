const {Leg} = require("../controller/Leg.cjs")

class DragonLeg extends Leg {
    constructor(){
        super()
    }
  
    attack() {
        console.log("leg -  tries to scratch his prey");
    }

    
    hasPads() {
        return false;
    }
}

module.exports = DragonLeg