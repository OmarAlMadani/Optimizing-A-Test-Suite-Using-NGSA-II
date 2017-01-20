/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Omar
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        String left = "";
        String right = "";
        Calculator instance = new CalculatorImpl();
        int expResult = 0;
        int result = instance.add(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() throws Exception {
        System.out.println("divide");
        String left = "";
        String right = "";
        Calculator instance = new CalculatorImpl();
        int expResult = 0;
        int result = instance.divide(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() throws Exception {
        System.out.println("multiply");
        String left = "";
        String right = "";
        Calculator instance = new CalculatorImpl();
        int expResult = 0;
        int result = instance.multiply(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() throws Exception {
        System.out.println("subtract");
        String left = "";
        String right = "";
        Calculator instance = new CalculatorImpl();
        int expResult = 0;
        int result = instance.subtract(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGraterThan method, of class Calculator.
     */
    @Test
    public void testIsGraterThan() throws Exception {
        System.out.println("isGraterThan");
        String left = "";
        String right = "";
        Calculator instance = new CalculatorImpl();
        boolean expResult = false;
        boolean result = instance.isGraterThan(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLessThan method, of class Calculator.
     */
    @Test
    public void testIsLessThan() throws Exception {
        System.out.println("isLessThan");
        String left = "";
        String right = "";
        Calculator instance = new CalculatorImpl();
        boolean expResult = false;
        boolean result = instance.isLessThan(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of xOR method, of class Calculator.
     */
    @Test
    public void testXOR() throws Exception {
        System.out.println("xOR");
        String left = "";
        String right = "";
        Calculator instance = new CalculatorImpl();
        boolean expResult = false;
        boolean result = instance.xOR(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of xAND method, of class Calculator.
     */
    @Test
    public void testXAND() throws Exception {
        System.out.println("xAND");
        String left = "";
        String right = "";
        Calculator instance = new CalculatorImpl();
        boolean expResult = false;
        boolean result = instance.xAND(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEqualTo method, of class Calculator.
     */
    @Test
    public void testIsEqualTo() throws Exception {
        System.out.println("isEqualTo");
        String left = "";
        String right = "";
        Calculator instance = new CalculatorImpl();
        boolean expResult = false;
        boolean result = instance.isEqualTo(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CalculatorImpl implements Calculator {

        public int add(String left, String right) throws NumberFault_Exception {
            return 0;
        }

        public int divide(String left, String right) throws NumberFault_Exception {
            return 0;
        }

        public int multiply(String left, String right) throws NumberFault_Exception {
            return 0;
        }

        public int subtract(String left, String right) throws NumberFault_Exception {
            return 0;
        }

        public boolean isGraterThan(String left, String right) throws NumberFault_Exception {
            return false;
        }

        public boolean isLessThan(String left, String right) throws NumberFault_Exception {
            return false;
        }

        public boolean xOR(String left, String right) throws NumberFault_Exception {
            return false;
        }

        public boolean xAND(String left, String right) throws NumberFault_Exception {
            return false;
        }

        public boolean isEqualTo(String left, String right) throws NumberFault_Exception {
            return false;
        }
    }
    
}
