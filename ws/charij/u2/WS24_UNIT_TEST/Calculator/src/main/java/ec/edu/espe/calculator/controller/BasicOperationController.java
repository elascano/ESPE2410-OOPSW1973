

package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.BasicOperation;

/**
 *
 * @author Sebastian Charij
 */
public class BasicOperationController {
    private BasicOperation basicOperation;
    
    public float add(float addend1, float addend2){
        float sum;
        sum = addend1 + addend2;
        return sum;
    }
    public float add(){
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
