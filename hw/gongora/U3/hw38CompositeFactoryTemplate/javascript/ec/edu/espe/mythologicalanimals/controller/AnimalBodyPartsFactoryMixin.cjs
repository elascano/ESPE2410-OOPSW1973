const AnimalBodyPartsFactoryMixin={
    createHead(){
        throw new Error("The method must be implemented")
    },
    createLeg(){
        throw new Error("The method must be implemented")
    },
    createTail(){
        throw new Error("The method must be implemented")
    },
    createWing(){
        throw new Error("The method must be implemented")
    }
}

module.exports = {
    AnimalBodyPartsFactoryMixin
}

