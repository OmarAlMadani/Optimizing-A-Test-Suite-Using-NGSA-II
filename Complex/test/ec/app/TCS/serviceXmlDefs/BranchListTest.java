/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.app.TCS.serviceXmlDefs;

import java.util.List;
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
public class BranchListTest {
    
    public BranchListTest() {
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
     * Test of getBranch method, of class BranchList.
     */
    @Test
    public void testGetBranch() {
        System.out.println("getBranch");
        BranchList instance = new BranchList();
        List<Branch> expResult = null;
        List<Branch> result = instance.getBranch();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfBranches method, of class BranchList.
     */
    @Test
    public void testGetNumOfBranches() {
        System.out.println("getNumOfBranches");
        BranchList instance = new BranchList();
        Integer expResult = null;
        Integer result = instance.getNumOfBranches();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfBranches method, of class BranchList.
     */
    @Test
    public void testSetNumOfBranches() {
        System.out.println("setNumOfBranches");
        Integer value = null;
        BranchList instance = new BranchList();
        instance.setNumOfBranches(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
