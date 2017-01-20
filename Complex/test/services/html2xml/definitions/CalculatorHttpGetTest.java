/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.html2xml.definitions;

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
public class CalculatorHttpGetTest {
    
    public CalculatorHttpGetTest() {
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
     * Test of add method, of class CalculatorHttpGet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String a = "";
        String b = "";
        CalculatorHttpGet instance = new CalculatorHttpGetImpl();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class CalculatorHttpGet.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        String a = "";
        String b = "";
        CalculatorHttpGet instance = new CalculatorHttpGetImpl();
        int expResult = 0;
        int result = instance.subtract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class CalculatorHttpGet.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        String a = "";
        String b = "";
        CalculatorHttpGet instance = new CalculatorHttpGetImpl();
        int expResult = 0;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class CalculatorHttpGet.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        String a = "";
        String b = "";
        CalculatorHttpGet instance = new CalculatorHttpGetImpl();
        int expResult = 0;
        int result = instance.divide(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CalculatorHttpGetImpl implements CalculatorHttpGet {

        public int add(String a, String b) {
            return 0;
        }

        public int subtract(String a, String b) {
            return 0;
        }

        public int multiply(String a, String b) {
            return 0;
        }

        public int divide(String a, String b) {
            return 0;
        }
    }
    
}
