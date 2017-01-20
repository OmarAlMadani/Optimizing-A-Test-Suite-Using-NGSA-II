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
public class IsEqualToResponseTest {
    
    public IsEqualToResponseTest() {
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
     * Test of isReturn method, of class IsEqualToResponse.
     */
    @Test
    public void testIsReturn() {
        System.out.println("isReturn");
        IsEqualToResponse instance = new IsEqualToResponse();
        boolean expResult = false;
        boolean result = instance.isReturn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReturn method, of class IsEqualToResponse.
     */
    @Test
    public void testSetReturn() {
        System.out.println("setReturn");
        boolean value = false;
        IsEqualToResponse instance = new IsEqualToResponse();
        instance.setReturn(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
