/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author mustafa
 */
public class ComplexScSTest {

    public ComplexScSTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of test method, of class ComplexScS.
     */
    //@Test
    public void testTest() {
        System.out.println("test");
        ComplexScS instance = new ComplexScS();
        Complex orj = new Complex();
        for (int i = 0; i < 100; i++) {
            int[] num = generateTestData();
            String[] expResult = orj.test(num[0], num[1], num[2], num[3], num[4], num[5]).split(";");
            String[] result = instance.test(num[0], num[1], num[2], num[3], num[4], num[5]).split(";");
            System.out.println("orj: " + expResult[0] + " new: " + result[0]);
            assertEquals(expResult[0], result[0]);
        }        
    }

    private int[] generateTestData() {
        final int max = 50;
        int[] nums = new int[6];
        for (int i = 0; i < 6; i++) {
            nums[i] = (int) (Math.random() * max * (Math.random() < 0.5 ? 1 : -1));
        }
        return nums;
    }

    //@Test
    public void testComplexFile() {
        String expNum = "ex1";
        String filename = "/ts3.txt";
        
        
        final String dfilePath = "//Users/Omar/Documents/omar/Complex/test/experimentFiles/tcs/";
        System.out.println("Complex test from file");
        ComplexScS instance = new ComplexScS();
        try {
            ArrayList<Integer> total = new ArrayList<Integer>();
            List<String> lines = FileUtils.readLines(new File(dfilePath + expNum + filename));
            for (String line : lines) {
                String[] inputs = line.split(",");
                int a = Integer.parseInt(inputs[0]);
                int b = Integer.parseInt(inputs[1]);
                int c = Integer.parseInt(inputs[2]);
                int d = Integer.parseInt(inputs[3]);
                int e = Integer.parseInt(inputs[4]);
                int f = Integer.parseInt(inputs[5]);   
                instance.resetComplex();
                String tempCov = instance.test(a, b, c, d, e, f);
                String[] artefacts = tempCov.split(";");
                System.out.println(artefacts[0]);
                String[] coverage = artefacts[0].replaceAll(" ", "").split(",");
                for (String s : coverage) {
                    int bNum = Integer.parseInt(s);
                    if (!total.contains(bNum)) {
                        total.add(bNum);
                    }
                }
               // writeArtefacts(expNum, filename, artefacts[0], artefacts[1], artefacts[2]);
            }
            Collections.sort(total);
            System.out.println(total);
        } catch (IOException ex) {
            Logger.getLogger(ComplexTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void writeArtefacts(String expNum, String tcFile, String coverage, String services, String numbers) {
        try {
            final String dfilePath = "//Users/Omar/Documents/omar/Complex/test/experimentFiles/tcs/";
            //FileUtils fu = new FileUtils();            
            FileUtils.writeStringToFile(new File(dfilePath + expNum + "/" + tcFile.replace(".txt", "") + "_coverage.txt"), coverage + "\n", true);
            FileUtils.writeStringToFile(new File(dfilePath + expNum + "/" + tcFile.replace(".txt", "") + "_services.txt"), services + "\n", true);
            FileUtils.writeStringToFile(new File(dfilePath + expNum + "/" + tcFile.replace(".txt", "") + "_numbers.txt"), numbers + "\n", true);
        } catch (IOException ex) {
            Logger.getLogger(ComplexTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Test of getSize method, of class ComplexScS.
     */
    //@Test
    public void testGetSize() {
        System.out.println("getSize");
        ComplexScS instance = new ComplexScS();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ComplexScS.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int left = 1;
        int right = 2;
        ComplexScS instance = new ComplexScS();
        int expResult = 3;
        int result = instance.add(left, right);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testMutiply() {
        System.out.println("multiply");
        int left = 1;
        int right = 2;
        ComplexScS instance = new ComplexScS();
        int expResult = 2;
        int result = instance.multiply(left, right);
        assertEquals(expResult, result);        
    }

    /**
     * Test of resetComplex method, of class ComplexScS.
     */
    @Test
    public void testResetComplex() {
        System.out.println("resetComplex");
        ComplexScS instance = new ComplexScS();
        instance.resetComplex();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class ComplexScS.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int left = 0;
        int right = 0;
        ComplexScS instance = new ComplexScS();
        int expResult = 0;
        int result = instance.multiply(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class ComplexScS.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int left = 0;
        int right = 0;
        ComplexScS instance = new ComplexScS();
        int expResult = 0;
        int result = instance.divide(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of xAND method, of class ComplexScS.
     */
    @Test
    public void testXAND() {
        System.out.println("xAND");
        boolean left = false;
        boolean right = false;
        ComplexScS instance = new ComplexScS();
        boolean expResult = false;
        boolean result = instance.xAND(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of xOR method, of class ComplexScS.
     */
    @Test
    public void testXOR() {
        System.out.println("xOR");
        boolean left = false;
        boolean right = false;
        ComplexScS instance = new ComplexScS();
        boolean expResult = false;
        boolean result = instance.xOR(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGreaterThan method, of class ComplexScS.
     */
    @Test
    public void testIsGreaterThan() {
        System.out.println("isGreaterThan");
        int left = 0;
        int right = 0;
        ComplexScS instance = new ComplexScS();
        boolean expResult = false;
        boolean result = instance.isGreaterThan(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLessThan method, of class ComplexScS.
     */
    @Test
    public void testIsLessThan() {
        System.out.println("isLessThan");
        int left = 0;
        int right = 0;
        ComplexScS instance = new ComplexScS();
        boolean expResult = false;
        boolean result = instance.isLessThan(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEqualTo method, of class ComplexScS.
     */
    @Test
    public void testIsEqualTo() {
        System.out.println("isEqualTo");
        int left = 0;
        int right = 0;
        ComplexScS instance = new ComplexScS();
        boolean expResult = false;
        boolean result = instance.isEqualTo(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class ComplexScS.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int left = 0;
        int right = 0;
        ComplexScS instance = new ComplexScS();
        int expResult = 0;
        int result = instance.subtract(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
