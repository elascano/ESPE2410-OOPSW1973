
class OperationController{
    #basicOperation

    constructor(basicOperation){
        this.#basicOperation = basicOperation;
    }

    add(addend1, addend2) {
        let sum = addend1 + addend2;
        return sum;
    }

    add() {
        let sum = this.#basicOperation.getTerm1() + this.#basicOperation.getTerm2();
        return sum;
    }

    getBasicOperation(){
        return this.#basicOperation;
    }

    setBasicOperation(basicOperation){
        this.#basicOperation = basicOperation
    }
}

module.exports = OperationController;