
package ec.espe.edu.calculator.controller;

import ec.espe.edu.calculator.model.BasicOperation;

/**
 *
 * @author G406
 */
public class BasicOperationController {
    private BasicOperation basicOperation;
    
    public float add(float addend1, float addend2){
        float sum;
        sum = addend1 + addend2;
        return sum;
    }
    
    public float add(BasicOperation basicOperation){
        float sum;
        sum = basicOperation.getTerm1() + basicOperation.getTerm2();
        return sum;
    }

    public BasicOperationController(BasicOperation basicOperation) {
        this.basicOperation = basicOperation;
    }

    /**
     * @return the basicOperation
     */
    public BasicOperation getBasicOperation() {
        return basicOperation;
    }

    /**
     * @param basicOperation the basicOperation to set
     */
    public void setBasicOperation(BasicOperation basicOperation) {
        this.basicOperation = basicOperation;
    }
    
    
    
}
