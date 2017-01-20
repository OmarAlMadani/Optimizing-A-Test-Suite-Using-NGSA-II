/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services.html2xml.definitions;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author mustafa
 */
public class CalculatorInvokerTest {
    
    public CalculatorInvokerTest() {
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
     * Test of add method, of class CalculatorInvoker.
     */
    //@Test
    public void testAdd() {
        System.out.println("add");
        int left = 1;
        int right = 2;
        CalculatorInvoker instance = new CalculatorInvoker();
        int expResult = 3;
        int result = instance.add(left, right);
        assertEquals(expResult, result);        
    }

    /**
     * Test of subtract method, of class CalculatorInvoker.
     */
   // @Test
    public void testSubtract() {
        System.out.println("subtract");
        int left = 3;
        int right = 2;
        CalculatorInvoker instance = new CalculatorInvoker();
        int expResult = 1;
        int result = instance.subtract(left, right);
        assertEquals(expResult, result);       
    }

    /**
     * Test of multiply method, of class CalculatorInvoker.
     */
    //@Test
    public void testMultiply() {
        System.out.println("multiply");
        int left = 3;
        int right = 2;
        CalculatorInvoker instance = new CalculatorInvoker();
        int expResult = 6;
        int result = instance.multiply(left, right);
        assertEquals(expResult, result);        
    }

    /**
     * Test of divide method, of class CalculatorInvoker.
     */
    //@Test
    public void testDivide() {
        System.out.println("divide");
        int left = 6;
        int right = 2;
        CalculatorInvoker instance = new CalculatorInvoker();
        int expResult = 3;
        int result = instance.divide(left, right);
        assertEquals(expResult, result);        
    }
}
