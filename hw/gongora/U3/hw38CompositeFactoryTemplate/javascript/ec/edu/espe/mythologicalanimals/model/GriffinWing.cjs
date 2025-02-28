const {Wing} = require("../controller/Wing.cjs")

class GriffinWing extends Wing {
    constructor(){
        super()
    }
    
    hasFeathers() {
        return true;
    }

    attack() {
        console.log(" wing - Flaps its wings to shoot its feathers like arrows");
    }
}

module.exports = GriffinWing