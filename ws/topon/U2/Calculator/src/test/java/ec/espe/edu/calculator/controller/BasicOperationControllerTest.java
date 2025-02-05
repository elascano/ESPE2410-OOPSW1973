package ec.espe.edu.calculator.controller;

import ec.espe.edu.calculator.model.BasicOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class BasicOperationControllerTest {
    
    public BasicOperationControllerTest() {
    }

    /**
     * Test of add method, of class BasicOperationController.
     */
    @Test
    public void testAdd_float_float() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 2.4F;
        BasicOperation basicOperation = new BasicOperation(1.2F, 3.6F);
        BasicOperationController instance = new BasicOperationController(basicOperation);
        float expResult = 3.6F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of add method, of class BasicOperationController.
     */
    @Test
    public void testAdd_0args() {
        System.out.println("add");
        BasicOperation basicOperation = new BasicOperation (1.2F, 3.6F);
        BasicOperationController instance = new BasicOperationController(basicOperation);
        float expResult = 0.0F;
        float result = instance.add();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBasicOperation method, of class BasicOperationController.
     */
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

    /**
     * Test of setBasicOperation method, of class BasicOperationController.
     */
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
