/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.espe.edu.calculator.controller;

import ec.espe.edu.calculator.model.BasicOperation;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author David Cuichan
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

    /**
     * Test of add method, of class OperationController.
     */
    @Test
    public void testAdd_floatBigNumber() {
        System.out.println("add");
        float addend1 = 10456.2F;
        float addend2 = 10456.2F;
        BasicOperation basicOperation = new BasicOperation(0.0F, 0.0F);
        OperationController instance = new OperationController(basicOperation);
        float expResult = 20912.4F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addition method, of class OperationController.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        BasicOperation basicOperation = null;
        OperationController instance = null;
        float expResult = 0.0F;
        float result = instance.addition(basicOperation);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBasicOperation method, of class OperationController.
     */
    @Test
    public void testGetBasicOperation() {
        System.out.println("getBasicOperation");
        OperationController instance = null;
        BasicOperation expResult = null;
        BasicOperation result = instance.getBasicOperation();
        assertEquals(expResult, result);
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
        fail("The test case is a prototype.");
    }
    
}
