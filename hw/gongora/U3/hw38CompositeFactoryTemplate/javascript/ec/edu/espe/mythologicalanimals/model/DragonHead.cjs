const {Head} =  require("../controller/Head.cjs")

class DragonHead extends Head {

    constructor(){
        super()
    }
    
    attack() {
        console.log("the head - breathe fire");
    }

    
    hasHorns() {
        return true;
    }

}

module.exports = DragonHead