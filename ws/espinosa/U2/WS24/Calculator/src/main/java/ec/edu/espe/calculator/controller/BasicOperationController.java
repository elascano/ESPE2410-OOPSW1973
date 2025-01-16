package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.BasicOperation;

/**
 *
 * @author Andrés Espinosa
 */
public class BasicOperationController {
    
    private BasicOperation basicOperation;

    public BasicOperationController(BasicOperation basicOperation) {
        this.basicOperation = basicOperation;
    }
    
    public float add (float addent1, float addent2){
        float sum;
        sum = addent1 + addent2;
        return sum;
    }
    
    public float add (){
        float sum;
        sum = basicOperation.getTerm1() + basicOperation.getTerm2();
        return sum;
    }
    

  
}
