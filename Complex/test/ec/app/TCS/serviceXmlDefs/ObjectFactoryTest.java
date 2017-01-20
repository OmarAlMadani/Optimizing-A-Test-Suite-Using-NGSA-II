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
public class ObjectFactoryTest {
    
    public ObjectFactoryTest() {
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
     * Test of createService method, of class ObjectFactory.
     */
    @Test
    public void testCreateService() {
        System.out.println("createService");
        ObjectFactory instance = new ObjectFactory();
        Service expResult = null;
        Service result = instance.createService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createBranch method, of class ObjectFactory.
     */
    @Test
    public void testCreateBranch() {
        System.out.println("createBranch");
        ObjectFactory instance = new ObjectFactory();
        Branch expResult = null;
        Branch result = instance.createBranch();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTestCase method, of class ObjectFactory.
     */
    @Test
    public void testCreateTestCase() {
        System.out.println("createTestCase");
        ObjectFactory instance = new ObjectFactory();
        TestCase expResult = null;
        TestCase result = instance.createTestCase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createBranchList method, of class ObjectFactory.
     */
    @Test
    public void testCreateBranchList() {
        System.out.println("createBranchList");
        ObjectFactory instance = new ObjectFactory();
        BranchList expResult = null;
        BranchList result = instance.createBranchList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTestCaseList method, of class ObjectFactory.
     */
    @Test
    public void testCreateTestCaseList() {
        System.out.println("createTestCaseList");
        ObjectFactory instance = new ObjectFactory();
        TestCaseList expResult = null;
        TestCaseList result = instance.createTestCaseList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createServiceList method, of class ObjectFactory.
     */
    @Test
    public void testCreateServiceList() {
        System.out.println("createServiceList");
        ObjectFactory instance = new ObjectFactory();
        ServiceList expResult = null;
        ServiceList result = instance.createServiceList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
