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
public class IsGraterThanResponseTest {
    
    public IsGraterThanResponseTest() {
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
     * Test of isReturn method, of class IsGraterThanResponse.
     */
    @Test
    public void testIsReturn() {
        System.out.println("isReturn");
        IsGraterThanResponse instance = new IsGraterThanResponse();
        boolean expResult = false;
        boolean result = instance.isReturn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReturn method, of class IsGraterThanResponse.
     */
    @Test
    public void testSetReturn() {
        System.out.println("setReturn");
        boolean value = false;
        IsGraterThanResponse instance = new IsGraterThanResponse();
        instance.setReturn(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
