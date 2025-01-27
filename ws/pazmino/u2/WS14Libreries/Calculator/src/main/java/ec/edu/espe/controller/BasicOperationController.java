package ec.edu.espe.controller;

import ec.edu.espe.model.BasicOperation;

/**
 *
 * @author Branodn Pazmino
 */
public class BasicOperationController {
    
    public float add(float addend1, float addend2){
        float sum;
        sum =addend1 + addend2;
        return sum;
    }
    
    
    private BasicOperation basicOperation;
    
    public float add(){
        float sum ;
        sum = getBasicOperation().getTerm1()+ getBasicOperation().getTerm2();
        return sum;
        
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
