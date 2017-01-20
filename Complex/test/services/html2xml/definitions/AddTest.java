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
public class AddTest {
    
    public AddTest() {
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
     * Test of getA method, of class Add.
     */
    @Test
    public void testGetA() {
        System.out.println("getA");
        Add instance = new Add();
        int expResult = 0;
        int result = instance.getA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setA method, of class Add.
     */
    @Test
    public void testSetA() {
        System.out.println("setA");
        int value = 0;
        Add instance = new Add();
        instance.setA(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getB method, of class Add.
     */
    @Test
    public void testGetB() {
        System.out.println("getB");
        Add instance = new Add();
        int expResult = 0;
        int result = instance.getB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setB method, of class Add.
     */
    @Test
    public void testSetB() {
        System.out.println("setB");
        int value = 0;
        Add instance = new Add();
        instance.setB(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
