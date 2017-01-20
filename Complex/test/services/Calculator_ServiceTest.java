/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

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
public class Calculator_ServiceTest {
    
    public Calculator_ServiceTest() {
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
     * Test of getCalculatorPort method, of class Calculator_Service.
     */
    @Test
    public void testGetCalculatorPort() {
        System.out.println("getCalculatorPort");
        Calculator_Service instance = new Calculator_Service();
        Calculator expResult = null;
        Calculator result = instance.getCalculatorPort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalculatorPort method, of class Calculator_Service.
     */
    @Test
    public void testGetCalculatorPort_WebServiceFeatureArr() {
        System.out.println("getCalculatorPort");
        WebServiceFeature[] features = null;
        Calculator_Service instance = new Calculator_Service();
        Calculator expResult = null;
        Calculator result = instance.getCalculatorPort(features);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
