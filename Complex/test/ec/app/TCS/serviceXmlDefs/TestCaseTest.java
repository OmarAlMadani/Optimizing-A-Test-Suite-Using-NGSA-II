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
public class TestCaseTest {
    
    public TestCaseTest() {
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
     * Test of getCoveredBranches method, of class TestCase.
     */
    @Test
    public void testGetCoveredBranches() {
        System.out.println("getCoveredBranches");
        TestCase instance = new TestCase();
        List<String> expResult = null;
        List<String> result = instance.getCoveredBranches();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInvokedServices method, of class TestCase.
     */
    @Test
    public void testGetInvokedServices() {
        System.out.println("getInvokedServices");
        TestCase instance = new TestCase();
        List<String> expResult = null;
        List<String> result = instance.getInvokedServices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTestCaseID method, of class TestCase.
     */
    @Test
    public void testGetTestCaseID() {
        System.out.println("getTestCaseID");
        TestCase instance = new TestCase();
        String expResult = "";
        String result = instance.getTestCaseID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTestCaseID method, of class TestCase.
     */
    @Test
    public void testSetTestCaseID() {
        System.out.println("setTestCaseID");
        String value = "";
        TestCase instance = new TestCase();
        instance.setTestCaseID(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCoveredBranch method, of class TestCase.
     */
    @Test
    public void testAddCoveredBranch() {
        System.out.println("addCoveredBranch");
        String branchID = "";
        TestCase instance = new TestCase();
        instance.addCoveredBranch(branchID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addInvokedService method, of class TestCase.
     */
    @Test
    public void testAddInvokedService() {
        System.out.println("addInvokedService");
        String serviceID = "";
        TestCase instance = new TestCase();
        instance.addInvokedService(serviceID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
