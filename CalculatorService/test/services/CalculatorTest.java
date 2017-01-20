/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author mustafa
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
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
    public void testAdd() {
        try {
            System.out.println("add");
            String left = "1";
            String right = "2";
            Calculator instance = new Calculator();
            int expResult = 3;
            int result = instance.add(left, right);
            assertEquals(expResult, result);
        } catch (NumberFault ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        try {
            System.out.println("subtract");
            String left = "4";
            String right = "3";
            Calculator instance = new Calculator();
            int expResult = 1;
            int result = instance.subtract(left, right);
            assertEquals(expResult, result);
        } catch (NumberFault ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        try {
            System.out.println("multiply");
            String left = "2";
            String right = "3";
            Calculator instance = new Calculator();
            int expResult = 6;
            int result = instance.multiply(left, right);
            assertEquals(expResult, result);
        } catch (NumberFault ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        try {
            System.out.println("divide");
            String left = "6";
            String right = "3";
            Calculator instance = new Calculator();
            int expResult = 2;
            int result = instance.divide(left, right);
            assertEquals(expResult, result);
        } catch (NumberFault ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of isGraterThan method, of class Calculator.
     */
    @Test
    public void testIsGraterThan() {
        try {
            System.out.println("isGraterThan");
            String left = "2";
            String right = "1";
            Calculator instance = new Calculator();
            boolean expResult = true;
            boolean result = instance.isGraterThan(left, right);
            assertEquals(expResult, result);
        } catch (NumberFault ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of isLessThan method, of class Calculator.
     */
    @Test
    public void testIsLessThan() {
        try {
            System.out.println("isLessThan");
            String left = "1";
            String right = "2";
            Calculator instance = new Calculator();
            boolean expResult = true;
            boolean result = instance.isLessThan(left, right);
            assertEquals(expResult, result);
        } catch (NumberFault ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of isEqualTo method, of class Calculator.
     */
    @Test
    public void testIsEqualTo() {
        try {
            System.out.println("isEqualTo");
            String left = "3";
            String right = "a";
            Calculator instance = new Calculator();
            boolean expResult = true;
            boolean result = instance.isEqualTo(left, right);
            assertEquals(expResult, result);
        } catch (NumberFault ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of xOR method, of class Calculator.
     */
    @Test
    public void testXOR() {
        try {
            System.out.println("xOR");
            String left = "t";
            String right = "false";
            Calculator instance = new Calculator();
            boolean expResult = true;
            boolean result = instance.xOR(left, right);
            assertEquals(expResult, result);
        } catch (NumberFault ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of xAND method, of class Calculator.
     */
    @Test
    public void testXAND() {
        try {
            System.out.println("xAND");
            String left = "1";
            String right = "t";
            Calculator instance = new Calculator();
            boolean expResult = true;
            boolean result = instance.xAND(left, right);
            assertEquals(expResult, result);
        } catch (NumberFault ex) {
            Logger.getLogger(CalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
