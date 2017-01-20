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
public class ServiceListTest {
    
    public ServiceListTest() {
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
     * Test of getService method, of class ServiceList.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        ServiceList instance = new ServiceList();
        List<Service> expResult = null;
        List<Service> result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfServices method, of class ServiceList.
     */
    @Test
    public void testGetNumOfServices() {
        System.out.println("getNumOfServices");
        ServiceList instance = new ServiceList();
        Integer expResult = null;
        Integer result = instance.getNumOfServices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfServices method, of class ServiceList.
     */
    @Test
    public void testSetNumOfServices() {
        System.out.println("setNumOfServices");
        Integer value = null;
        ServiceList instance = new ServiceList();
        instance.setNumOfServices(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
