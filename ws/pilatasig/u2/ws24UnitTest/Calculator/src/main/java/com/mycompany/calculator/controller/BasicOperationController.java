package com.mycompany.calculator.controller;

import com.mycompany.calculator.model.BasicOperation;

/**
 *
 * @author Usuario
 */
public class BasicOperationController {
    
    private BasicOperation basicOperation;
    
    public float add(float addend1, float addend2){
        float sum;
        sum= addend1+addend2;
        return sum;
    }
    
    public float add(){
        float sum;
        sum=basicOperation.getTerm1()+ basicOperation.getTerm2();
        return sum;
    }

    public BasicOperationController(BasicOperation basicOperation) {
        this.basicOperation = basicOperation;
    }

    public BasicOperation getBasicOperation() {
        return basicOperation;
    }

    public void setBasicOperation(BasicOperation basicOperation) {
        this.basicOperation = basicOperation;
    }
    
}
