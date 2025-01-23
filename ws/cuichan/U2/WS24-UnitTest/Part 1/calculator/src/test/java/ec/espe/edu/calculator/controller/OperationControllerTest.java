/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.espe.edu.calculator.controller;

import ec.espe.edu.calculator.model.BasicOperation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LABS-DCCO
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
    public void testAdd() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        OperationController instance = null;
        float expResult = 0.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addition method, of class OperationController.
     */
    @Test
    public void testAddition () {
        System.out.println("addition");
        BasicOperation basicOperation = null;
        OperationController instance = null;
        float expResult = 0.0F;
        float result = instance.addition(basicOperation);
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
        OperationController instance = null;
        BasicOperation expResult = null;
        BasicOperation result = instance.getBasicOperation();
        assertEquals(expResult, result);
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
