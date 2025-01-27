package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.BasicOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class BasicOperationControllerTest {
    
    public BasicOperationControllerTest() {
    }

    /**
     * Test of add method, of class BasicOperationController.
     */
    @Test
    public void testAdd_float_floatBigNumbers() {
        System.out.println("add");
        float addend1 = 134234.2F;
        float addend2 = 12342432.4F;
        BasicOperation basicOperation = new BasicOperation(1342432.2F, 3234232.6F);
        BasicOperationController instance = new BasicOperationController(basicOperation);
        float expResult = 4576664.8F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBasicOperation method, of class BasicOperationController.
     */
    @Test
    public void testGetBasicOperation() {
        System.out.println("getBasicOperation");
        BasicOperationController instance = new BasicOperationController();
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
        BasicOperationController instance = new BasicOperationController();
        instance.setBasicOperation(basicOperation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
