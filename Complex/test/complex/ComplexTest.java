/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;
//there ??
//did you  find something ? no :( nothing
//okay


import com.sun.xml.bind.api.JAXBRIContext;
import ec.app.TCS.serviceXmlDefs.TestCaseList;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.apache.commons.io.FileUtils;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author mustafa
 */
public class ComplexTest {

    public ComplexTest() {
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
    
    @Test
    public void testBranchPercentage(){
        final String expNum = "ex2";
        final String filename = "/ts1_coverage.txt";        
            final String dfilePath = "?/Users/Omar/Documents/omar/Complex/test/experimentFiles/tcs/";
            ArrayList<String> coverages = new ArrayList<String>();
        try {            
            List<String> lines = FileUtils.readLines(new File(dfilePath + expNum + filename));
            /*for(String s: lines){
                if(!coverages.contains(s)){
                    coverages.add(s);
                }
            }*/
            Collections.sort(lines);
            for(String s : lines)
            System.out.println(s);
            System.out.println("Uniques test cases: "+coverages.size());
        } catch (IOException ex) {
            Logger.getLogger(ComplexTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    //@Test
    public void testComplexInt() {
        System.out.println("Complex test from random ints");
        int iNum = 20;
        String expNum = "ex1";
        String filename = String.valueOf(System.nanoTime());
        ArrayList<Integer> total = new ArrayList<Integer>();
        for (int i = 0; i < iNum; i++) {
            int[] num = generateTestData();
            String tempCov = new Complex().test(num[0], num[1], num[2], num[3], num[4], num[5]);
            String[] artefacts = tempCov.split(";");
            //System.out.println("tc" + (i + 1) + " " + getString(num) + "  " + artefacts[0] + "; " + artefacts[1] + "; " + artefacts[2]);
            //System.out.println("tc" + (i + 1) + ";" + getString(num) + " " + branches);
            String[] coverage = artefacts[0].replaceAll(" ", "").split(",");
            for (String s : coverage) {
                int bNum = Integer.parseInt(s);
                if (!total.contains(bNum)) {
                    total.add(bNum);
                }
            }
            writeRandomArtefacts(expNum, filename, getString(num), artefacts[0], artefacts[1], artefacts[2].replace("[", "").replace("]", ""));
        }
        Collections.sort(total);
        System.out.println(total);
    }

    /**
     * Test of test method, of class Complex.
     */
    //@Test
    public void testComplexFile() {
        String expNum = "ex1";
        String filename = "/ts2.txt";
        final String dfilePath = "//Users/Omar/Documents/omar/Complex/test/experimentFiles/tcs/";
        System.out.println("Complex test from file");        
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
                Complex2 instance = new Complex2();
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
                writeArtefacts(expNum, filename, artefacts[0], artefacts[1], artefacts[2]);               
            }
            Collections.sort(total);
            System.out.println(total);            
        } catch (IOException ex) {
            Logger.getLogger(ComplexTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void writeCoverageResults(TestCaseList tcl, String outputFilePath) {

        try {
            JAXBContext jc = JAXBRIContext.newInstance("ec.app.TCS.serviceXmlDefs");
            Marshaller m = jc.createMarshaller();
            m.marshal(tcl, new File(outputFilePath));
        } catch (JAXBException je) {
            Logger.getLogger(TestCaseList.class.getName()).log(Level.SEVERE, null, je);
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

    private void writeRandomArtefacts(String expNum, String filename, String tc, String coverage, String services, String numbers) {
        try {
            final String dfilePath = "//Users/Omar/Documents/omar/Complex/test/experimentFiles/tcs/";
            FileUtils.writeStringToFile(new File(dfilePath + expNum + "/" + filename + "_tc.txt"), coverage + "\n", true);
            FileUtils.writeStringToFile(new File(dfilePath + expNum + "/" + filename + "_coverage.txt"), coverage + "\n", true);
            FileUtils.writeStringToFile(new File(dfilePath + expNum + "/" + filename + "_services.txt"), services + "\n", true);
            FileUtils.writeStringToFile(new File(dfilePath + expNum + "/" + filename + "_numbers.txt"), numbers + "\n", true);
        } catch (IOException ex) {
            Logger.getLogger(ComplexTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Test of getSize method, of class Complex.
     */
    //@Test
    public void testGetSize() {
        System.out.println("getSize");
        Complex instance = new Complex();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private String getString(int[] nums) {
        String temp = "";
        for (int n : nums) {
            temp += String.valueOf(n) + ",";
        }
        return temp.substring(0, temp.length() - 1).concat(";");
    }

    private int[] generateTestData() {
        final int max = 50;
        int[] nums = new int[6];
        for (int i = 0; i < 6; i++) {
            nums[i] = (int) (Math.random() * max * (Math.random() < 0.5 ? 1 : -1));
        }
        return nums;
    }

    /**
     * Test of test method, of class Complex.
     */
    @Test
    public void testTest() {
        System.out.println("test");
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        Complex instance = new Complex();
        String expResult = "";
        String result = instance.test(a, b, c, d, e, f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
