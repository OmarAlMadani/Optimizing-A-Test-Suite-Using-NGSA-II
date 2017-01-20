/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.html2xml.definitions;

import javax.xml.ws.WebServiceFeature;
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
     * Test of getCalculatorSoap method, of class Calculator.
     */
    @Test
    public void testGetCalculatorSoap() {
        System.out.println("getCalculatorSoap");
        Calculator instance = new Calculator();
        CalculatorSoap expResult = null;
        CalculatorSoap result = instance.getCalculatorSoap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalculatorSoap method, of class Calculator.
     */
    @Test
    public void testGetCalculatorSoap_WebServiceFeatureArr() {
        System.out.println("getCalculatorSoap");
        WebServiceFeature[] features = null;
        Calculator instance = new Calculator();
        CalculatorSoap expResult = null;
        CalculatorSoap result = instance.getCalculatorSoap(features);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalculatorSoap12 method, of class Calculator.
     */
    @Test
    public void testGetCalculatorSoap12() {
        System.out.println("getCalculatorSoap12");
        Calculator instance = new Calculator();
        CalculatorSoap expResult = null;
        CalculatorSoap result = instance.getCalculatorSoap12();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalculatorSoap12 method, of class Calculator.
     */
    @Test
    public void testGetCalculatorSoap12_WebServiceFeatureArr() {
        System.out.println("getCalculatorSoap12");
        WebServiceFeature[] features = null;
        Calculator instance = new Calculator();
        CalculatorSoap expResult = null;
        CalculatorSoap result = instance.getCalculatorSoap12(features);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalculatorHttpGet method, of class Calculator.
     */
    @Test
    public void testGetCalculatorHttpGet() {
        System.out.println("getCalculatorHttpGet");
        Calculator instance = new Calculator();
        CalculatorHttpGet expResult = null;
        CalculatorHttpGet result = instance.getCalculatorHttpGet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalculatorHttpGet method, of class Calculator.
     */
    @Test
    public void testGetCalculatorHttpGet_WebServiceFeatureArr() {
        System.out.println("getCalculatorHttpGet");
        WebServiceFeature[] features = null;
        Calculator instance = new Calculator();
        CalculatorHttpGet expResult = null;
        CalculatorHttpGet result = instance.getCalculatorHttpGet(features);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalculatorHttpPost method, of class Calculator.
     */
    @Test
    public void testGetCalculatorHttpPost() {
        System.out.println("getCalculatorHttpPost");
        Calculator instance = new Calculator();
        CalculatorHttpPost expResult = null;
        CalculatorHttpPost result = instance.getCalculatorHttpPost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalculatorHttpPost method, of class Calculator.
     */
    @Test
    public void testGetCalculatorHttpPost_WebServiceFeatureArr() {
        System.out.println("getCalculatorHttpPost");
        WebServiceFeature[] features = null;
        Calculator instance = new Calculator();
        CalculatorHttpPost expResult = null;
        CalculatorHttpPost result = instance.getCalculatorHttpPost(features);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
