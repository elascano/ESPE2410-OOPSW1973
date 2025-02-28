class BasicOperationsController{
    BasicOperationsController(basicOperations){
        this.basicOperations= basicOperations;
    }

    add(term1,term2){
        let sum;
        sum=term1+term2;
        return sum;
    }

    add(){
        let sum;
        sum=this.basicOperations.getTerm1()+this.basicOperations.getTerm2();
        return sum;
    }
}