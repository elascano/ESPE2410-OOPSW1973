/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.BasicOperation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lucas Gongora
 */
public class OperationControllerTest {
    
    public OperationControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class OperationController.
     */
    @Test
    public void testAdd_float_float() {
        System.out.println("add");
        float addend1 = 1.2F;
        float addend2 = 2.4F;
        BasicOperation basicOperation = new BasicOperation(addend1, addend2);
        OperationController operationController = new OperationController(basicOperation);
        float expResult = 3.6F;
        float result = operationController.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testAdd_float_floatBigNumbers() {
        System.out.println("add");
        float addend1 =10456.2F;
        float addend2 = 20456.4F;
        BasicOperation basicOperation = new BasicOperation(0.0F, addend2);
        OperationController operationController = new OperationController(basicOperation);
        float expResult =operationController.add(addend1,addend2);
        float result = operationController.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class OperationController.
     */
    @Test
    public void testAdd_0args() {
        System.out.println("add");
        BasicOperation basicOperation = new BasicOperation(0, 0);
        OperationController operationController = new OperationController(basicOperation);
        float expResult = 0.0F;
        float result = operationController.add();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBasicOperation method, of class OperationController.
     */
    @Test
    public void testGetBasicOperation() {
        System.out.println("getBasicOperation");
        BasicOperation basicOperation = new BasicOperation(0, 0);
        OperationController instance = new OperationController(basicOperation);
        BasicOperation result = instance.getBasicOperation();
        assertEquals(basicOperation, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBasicOperation method, of class OperationController.
     */
    @Test
    public void testSetBasicOperation() {
        System.out.println("setBasicOperation");
        BasicOperation basicOperation = null;
        OperationController instance = null;
        instance.setBasicOperation(basicOperation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
