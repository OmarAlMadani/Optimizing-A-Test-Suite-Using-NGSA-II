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
     * Test of getSubtractResult method, of class SubtractResponse.
     */
    @Test
    public void testGetSubtractResult() {
        System.out.println("getSubtractResult");
        SubtractResponse instance = new SubtractResponse();
        int expResult = 0;
        int result = instance.getSubtractResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubtractResult method, of class SubtractResponse.
     */
    @Test
    public void testSetSubtractResult() {
        System.out.println("setSubtractResult");
        int value = 0;
        SubtractResponse instance = new SubtractResponse();
        instance.setSubtractResult(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
