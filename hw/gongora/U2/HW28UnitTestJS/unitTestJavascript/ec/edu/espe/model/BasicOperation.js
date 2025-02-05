class BasicOperation{
    #term1;
    #term2;

    constructor(term1,term2){
        this.#term1 = term1;
        this.#term2 = term2; 
    }

    getTerm1(){
        return this.#term1;
    }

    getTerm2(){
        return this.#term2;
    }

    setTerm1(term1){
        this.#term1 = term1;
    }
    
    setTerm2(term2){
        this.#term2 = term2;
    }

}

module.exports = BasicOperation;