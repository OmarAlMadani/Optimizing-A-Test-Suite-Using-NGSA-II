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
public class SubtractResponseTest {
    
    public SubtractResponseTest() {
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
     * Test of getReturn method, of class SubtractResponse.
     */
    @Test
    public void testGetReturn() {
        System.out.println("getReturn");
        SubtractResponse instance = new SubtractResponse();
        int expResult = 0;
        int result = instance.getReturn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReturn method, of class SubtractResponse.
     */
    @Test
    public void testSetReturn() {
        System.out.println("setReturn");
        int value = 0;
        SubtractResponse instance = new SubtractResponse();
        instance.setReturn(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
