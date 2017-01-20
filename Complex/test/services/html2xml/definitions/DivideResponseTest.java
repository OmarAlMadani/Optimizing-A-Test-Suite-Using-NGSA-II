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
public class DivideResponseTest {
    
    public DivideResponseTest() {
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
     * Test of getDivideResult method, of class DivideResponse.
     */
    @Test
    public void testGetDivideResult() {
        System.out.println("getDivideResult");
        DivideResponse instance = new DivideResponse();
        int expResult = 0;
        int result = instance.getDivideResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDivideResult method, of class DivideResponse.
     */
    @Test
    public void testSetDivideResult() {
        System.out.println("setDivideResult");
        int value = 0;
        DivideResponse instance = new DivideResponse();
        instance.setDivideResult(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
