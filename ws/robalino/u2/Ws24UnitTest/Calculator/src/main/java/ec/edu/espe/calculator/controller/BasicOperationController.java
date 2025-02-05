

package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.BasicOperation;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */

public class BasicOperationController {
    private BasicOperation basicOperation;
    private float add(BasicOperation basicOperation){
        float sum ;
        sum = basicOperation.getTerm1() + basicOperation.getTerm2();
        return sum;
    }

    public BasicOperationController(BasicOperation basicOperation) {
        this.basicOperation = basicOperation;
    }
    
    
    public float add(float addend1, float addend2){
        float sum;
        sum = addend1+addend2;
        return sum;
        
    }
    

    public BasicOperationController() {
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
