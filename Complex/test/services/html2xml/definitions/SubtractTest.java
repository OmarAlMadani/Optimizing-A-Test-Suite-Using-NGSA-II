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
public class SubtractTest {
    
    public SubtractTest() {
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
     * Test of getA method, of class Subtract.
     */
    @Test
    public void testGetA() {
        System.out.println("getA");
        Subtract instance = new Subtract();
        int expResult = 0;
        int result = instance.getA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setA method, of class Subtract.
     */
    @Test
    public void testSetA() {
        System.out.println("setA");
        int value = 0;
        Subtract instance = new Subtract();
        instance.setA(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getB method, of class Subtract.
     */
    @Test
    public void testGetB() {
        System.out.println("getB");
        Subtract instance = new Subtract();
        int expResult = 0;
        int result = instance.getB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setB method, of class Subtract.
     */
    @Test
    public void testSetB() {
        System.out.println("setB");
        int value = 0;
        Subtract instance = new Subtract();
        instance.setB(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
