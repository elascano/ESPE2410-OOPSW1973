const {Head} = require("../controller/Head.cjs")

class GriffinHead extends Head{
    constructor(){
        super()
    }
    
    attack() {
        console.log("The head try to eat the intruder");
    }

    hasHorns() {
        return false;
    }
}

module.exports = GriffinHead