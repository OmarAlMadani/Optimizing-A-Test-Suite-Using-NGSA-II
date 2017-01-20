/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

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
public class IsLessThanTest {
    
    public IsLessThanTest() {
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
     * Test of getLeft method, of class IsLessThan.
     */
    @Test
    public void testGetLeft() {
        System.out.println("getLeft");
        IsLessThan instance = new IsLessThan();
        String expResult = "";
        String result = instance.getLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLeft method, of class IsLessThan.
     */
    @Test
    public void testSetLeft() {
        System.out.println("setLeft");
        String value = "";
        IsLessThan instance = new IsLessThan();
        instance.setLeft(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRight method, of class IsLessThan.
     */
    @Test
    public void testGetRight() {
        System.out.println("getRight");
        IsLessThan instance = new IsLessThan();
        String expResult = "";
        String result = instance.getRight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRight method, of class IsLessThan.
     */
    @Test
    public void testSetRight() {
        System.out.println("setRight");
        String value = "";
        IsLessThan instance = new IsLessThan();
        instance.setRight(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
