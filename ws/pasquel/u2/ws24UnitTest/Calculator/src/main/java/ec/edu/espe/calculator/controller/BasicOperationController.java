
package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.BasicOperation;

/**
 *
 * @author marlo
 */
public class BasicOperationController {

        private BasicOperation basicOperation;
        public float add(float addend1, addend2){
            float sum;
            sum = addend1 + addend2;
            return sum;
        }
        
         float add(BasicOperation){
          float sum;
          sum = getBasicOperation().getTerm1() + getBasicOperation().getTerm2();
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
