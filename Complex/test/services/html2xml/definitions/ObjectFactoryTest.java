/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.html2xml.definitions;

import javax.xml.bind.JAXBElement;
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
     * Test of createSubtractResponse method, of class ObjectFactory.
     */
    @Test
    public void testCreateSubtractResponse() {
        System.out.println("createSubtractResponse");
        ObjectFactory instance = new ObjectFactory();
        SubtractResponse expResult = null;
        SubtractResponse result = instance.createSubtractResponse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMultiply method, of class ObjectFactory.
     */
    @Test
    public void testCreateMultiply() {
        System.out.println("createMultiply");
        ObjectFactory instance = new ObjectFactory();
        Multiply expResult = null;
        Multiply result = instance.createMultiply();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSubtract method, of class ObjectFactory.
     */
    @Test
    public void testCreateSubtract() {
        System.out.println("createSubtract");
        ObjectFactory instance = new ObjectFactory();
        Subtract expResult = null;
        Subtract result = instance.createSubtract();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createDivide method, of class ObjectFactory.
     */
    @Test
    public void testCreateDivide() {
        System.out.println("createDivide");
        ObjectFactory instance = new ObjectFactory();
        Divide expResult = null;
        Divide result = instance.createDivide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAdd method, of class ObjectFactory.
     */
    @Test
    public void testCreateAdd() {
        System.out.println("createAdd");
        ObjectFactory instance = new ObjectFactory();
        Add expResult = null;
        Add result = instance.createAdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAddResponse method, of class ObjectFactory.
     */
    @Test
    public void testCreateAddResponse() {
        System.out.println("createAddResponse");
        ObjectFactory instance = new ObjectFactory();
        AddResponse expResult = null;
        AddResponse result = instance.createAddResponse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMultiplyResponse method, of class ObjectFactory.
     */
    @Test
    public void testCreateMultiplyResponse() {
        System.out.println("createMultiplyResponse");
        ObjectFactory instance = new ObjectFactory();
        MultiplyResponse expResult = null;
        MultiplyResponse result = instance.createMultiplyResponse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createDivideResponse method, of class ObjectFactory.
     */
    @Test
    public void testCreateDivideResponse() {
        System.out.println("createDivideResponse");
        ObjectFactory instance = new ObjectFactory();
        DivideResponse expResult = null;
        DivideResponse result = instance.createDivideResponse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createInt method, of class ObjectFactory.
     */
    @Test
    public void testCreateInt() {
        System.out.println("createInt");
        Integer value = null;
        ObjectFactory instance = new ObjectFactory();
        JAXBElement<Integer> expResult = null;
        JAXBElement<Integer> result = instance.createInt(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
