class MythologicalAnimal{
    constructor (){
        if (new.target === MythologicalAnimal){
            throw new Error("the class cannot be instantiated")
        }
    }
    appear(){
        console.log("I'm a mythological animal");
        this.showDescription();
    }
    
    showDescription(){
        throw new Error("the method must be implemented")
    }

}


module.exports = {
    MythologicalAnimal
}
