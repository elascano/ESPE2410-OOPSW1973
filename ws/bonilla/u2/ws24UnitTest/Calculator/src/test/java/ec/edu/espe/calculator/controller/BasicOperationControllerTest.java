
package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.BasicOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alan Arias
 */
public class BasicOperationControllerTest {
    
    public BasicOperationControllerTest() {
    }

    @org.junit.jupiter.api.Test
    public void testGetBasicOperation() {
    }

    @org.junit.jupiter.api.Test
    public void testSetBasicOperation() {
    }

    /**
     * Test of add method, of class BasicOperationController.
     */
    @Test
    public void testAdd_float_floatBigNumbers() {
        System.out.println("add");
        float addend1 = 10456.2F;
        float addend2 = 10456.4F;
        BasicOperation basicOperation = new BasicOperation(0.0F, 0.0F);
        BasicOperationController instance = new BasicOperationController(basicOperation);
        float expResult = 20912.6F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
       
    }

    /**
     * Test of add method, of class BasicOperationController.
     */
    @Test
    public void testAdd_0argsBiggerNumbers() {
        System.out.println("add");
            float addend1 = 10010456.2F;
            float addend2 = 10010456.4F;
        BasicOperation basicOperation = new BasicOperation(0.0F, 0.0F);
        BasicOperationController instance = new BasicOperationController(basicOperation);
        float expResult = 20020912.6F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);

    }
    
}
