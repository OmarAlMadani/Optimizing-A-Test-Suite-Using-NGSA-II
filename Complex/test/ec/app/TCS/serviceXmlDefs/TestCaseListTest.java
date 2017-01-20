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
public class TestCaseListTest {
    
    public TestCaseListTest() {
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
     * Test of getTestCase method, of class TestCaseList.
     */
    @Test
    public void testGetTestCase() {
        System.out.println("getTestCase");
        TestCaseList instance = new TestCaseList();
        List<TestCase> expResult = null;
        List<TestCase> result = instance.getTestCase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfTestCases method, of class TestCaseList.
     */
    @Test
    public void testGetNumOfTestCases() {
        System.out.println("getNumOfTestCases");
        TestCaseList instance = new TestCaseList();
        Integer expResult = null;
        Integer result = instance.getNumOfTestCases();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfTestCases method, of class TestCaseList.
     */
    @Test
    public void testSetNumOfTestCases() {
        System.out.println("setNumOfTestCases");
        Integer value = null;
        TestCaseList instance = new TestCaseList();
        instance.setNumOfTestCases(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
