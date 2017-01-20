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
public class MultiplyResponseTest {
    
    public MultiplyResponseTest() {
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
     * Test of getMultiplyResult method, of class MultiplyResponse.
     */
    @Test
    public void testGetMultiplyResult() {
        System.out.println("getMultiplyResult");
        MultiplyResponse instance = new MultiplyResponse();
        int expResult = 0;
        int result = instance.getMultiplyResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMultiplyResult method, of class MultiplyResponse.
     */
    @Test
    public void testSetMultiplyResult() {
        System.out.println("setMultiplyResult");
        int value = 0;
        MultiplyResponse instance = new MultiplyResponse();
        instance.setMultiplyResult(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
