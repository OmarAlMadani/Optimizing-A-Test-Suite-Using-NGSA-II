/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.app.TCS.serviceXmlDefs;

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
public class BranchTest {
    
    public BranchTest() {
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
     * Test of getWeight method, of class Branch.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Branch instance = new Branch();
        int expResult = 0;
        int result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Branch.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        int value = 0;
        Branch instance = new Branch();
        instance.setWeight(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBranchID method, of class Branch.
     */
    @Test
    public void testGetBranchID() {
        System.out.println("getBranchID");
        Branch instance = new Branch();
        String expResult = "";
        String result = instance.getBranchID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBranchID method, of class Branch.
     */
    @Test
    public void testSetBranchID() {
        System.out.println("setBranchID");
        String value = "";
        Branch instance = new Branch();
        instance.setBranchID(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
