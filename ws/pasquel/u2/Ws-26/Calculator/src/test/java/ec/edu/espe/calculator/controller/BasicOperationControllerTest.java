
package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.BasicOperation;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author marlo
 */
public class BasicOperationControllerTest {
    
    public BasicOperationControllerTest() {
    }

    @Test
    public void testAdd_float_float() {
        System.out.println("add");
        float addend1 = 1.24f;
        float addend2 = 2.4f;
        BasicOperation basicOperation = new BasicOperation(0.0F, 0.0F);
        BasicOperationController instance = new BasicOperationController(basicOperation);
        float expResult = 3.6000001F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testAdd_0args() {
        System.out.println("add");
        BasicOperation basicOperation = new BasicOperation(1.2F, 3.6F);
        
        BasicOperationController instance = new BasicOperationController(basicOperation);
        float expResult = 4.8F;
        float result = instance.add();
        assertEquals(expResult, result, 0);
    }

     @Test
    public void testAdd_float_floatBiggerNumbers() {
        System.out.println("add");
        double addend1 = 10010456.2;
        float addend2 = 10010456.4f;
        BasicOperation basicOperation = new BasicOperation(0.0F, 0.0F);
        BasicOperationController instance = new BasicOperationController(basicOperation);
        float expResult = 20020912.6F;
        float result = instance.add((float) addend1, addend2);
        assertEquals(expResult, result, 0);
    }
    

    
}
