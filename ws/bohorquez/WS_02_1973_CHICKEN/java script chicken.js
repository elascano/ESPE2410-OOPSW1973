
//Definition this class
class chickensimulator{
    constructor(){

    }
    toString(){
        return "This is a chicken instance";
    }
}

//Prj chicken

class PrjChickenSimulator{
    static main(){
        console.log("Hello chickens");
         let chicken = new Chicken(); 
         console.log("Chicken --> " + chicken.toString());
    }
}

PrjChickenSimulator.main();
