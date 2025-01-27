
package ec.espe.edu.calculator.controller;

import ec.espe.edu.calculator.model.BasicOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USUARIO
 */
public class BasicOperationControllerTest {
    
    public BasicOperationControllerTest() {
    }

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
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    @Test
    public void testAdd_BasicOperation() {
        System.out.println("add");
        BasicOperation basicOperation = null;
        BasicOperationController instance = null;
        float expResult = 0.0F;
        float result = instance.add(basicOperation);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetBasicOperation() {
        System.out.println("getBasicOperation");
        BasicOperationController instance = null;
        BasicOperation expResult = null;
        BasicOperation result = instance.getBasicOperation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetBasicOperation() {
        System.out.println("setBasicOperation");
        BasicOperation basicOperation = null;
        BasicOperationController instance = null;
        instance.setBasicOperation(basicOperation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
