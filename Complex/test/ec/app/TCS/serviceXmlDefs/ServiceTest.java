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
public class ServiceTest {
    
    public ServiceTest() {
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
     * Test of getPrice method, of class Service.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Service instance = new Service();
        float expResult = 0.0F;
        float result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Service.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float value = 0.0F;
        Service instance = new Service();
        instance.setPrice(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServiceID method, of class Service.
     */
    @Test
    public void testGetServiceID() {
        System.out.println("getServiceID");
        Service instance = new Service();
        String expResult = "";
        String result = instance.getServiceID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServiceID method, of class Service.
     */
    @Test
    public void testSetServiceID() {
        System.out.println("setServiceID");
        String value = "";
        Service instance = new Service();
        instance.setServiceID(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
