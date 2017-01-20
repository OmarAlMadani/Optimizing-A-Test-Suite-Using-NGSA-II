/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;


import com.sun.tools.javac.util.Paths;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


/**
 *
 * @author Omar
 */
public class testSuiteData {
    
  
int sum = 0; 
int count = 1;
static FileWriter file1 = null;
static FileWriter file2 = null;
static FileWriter file3 = null;
static FileWriter file4 = null;
static FileWriter file5 = null;
static BufferedWriter f1 = null;
static BufferedWriter f2 = null;
static BufferedWriter f3 = null; 
static BufferedWriter f5 = null; 
static  ComplexScS s = new ComplexScS() ;

    private int[] generateTestData() throws InterruptedException {
        final int max =  10;
        int[] nums = new int[6];
        
        for (int i = 0; i < 6; i++) {
            nums[i] = (int) (Math.random() * max * (Math.random() < 0.5 ? 1 : -1));
        }
        return nums;
        
    }
    
    
    private void openFile() throws IOException{
      
        file1 = new FileWriter("//Users/Omar/Documents/omar/Complex/test/experimentFiles/tcs/tc.txt", false);
        file2 = new FileWriter("//Users/Omar/Documents/omar/Complex/test/experimentFiles/tcs/branches.txt", false);
        file3 = new FileWriter("//Users/Omar/Documents/omar/Complex/test/experimentFiles/tcs/numinoke.txt", false);
        //file4 = new FileWriter("//Users/Omar/Documents/omar/Complex/test/experimentFiles/tcs/partitions.txt", false);
        file5 = new FileWriter("//Users/Omar/Documents/omar/Complex/test/experimentFiles/tcs/partitions.txt", false);

        f1 = new BufferedWriter(file1);
        f2 = new BufferedWriter(file2);
        f3 = new BufferedWriter(file3);   
        f5 = new BufferedWriter(file5);   
    }
    
    private void closeFile() throws IOException{
        
         f1.close();
         f2.close();
         f3.close();
         f5.close();;
         file1.close();
         file2.close();
         file3.close();
         file5.close();
        // file4.close(); 
       
        
    }
    
   
    
         public ArrayList<ArrayList<Integer>> readTestSuite() throws FileNotFoundException, UnsupportedEncodingException, IOException, InterruptedException{
           
           BufferedReader br = null;
           ArrayList<ArrayList<Integer>> testCases = new ArrayList<ArrayList<Integer>>();
           try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("//Users/Omar/Documents/omar/Complex/test/experimentFiles/tcs/ts1.txt"));
                         String[] inputs;
                         ArrayList<Integer> testCase;
                         
			while ((sCurrentLine = br.readLine()) != null) {
                            inputs = sCurrentLine.replace("[", "").replace("]", "").split(",");
                            testCase = new ArrayList<Integer>();
                            for (String str: inputs) {
                                testCase.add(Integer.parseInt(str));
                            }
                            //System.out.println(testCase.toString());
                            testCases.add(testCase);
                                
				//System.out.println(sCurrentLine);
                            
			}

		} catch (IOException e) {
		} 
          return testCases ;
         }

         public void writeData () throws IOException{
             
             ArrayList<ArrayList<Integer>> test;
             Integer [] testCases;
             openFile();
             int index = 0;
             try {
             test = readTestSuite();
            
             for (ArrayList<Integer> test2 : test){
                 testCases = new Integer[6];
                 index = 0;
                 for (Integer i:test2) {
                     testCases[index] = i;
                     index++;
             }
                 
           int a = testCases[0];
           int b = testCases[1];
           int c = testCases[2];
           int d = testCases[3];
           int e = testCases[4];
           int f = testCases[5];
            
            
            
            s.test(a,b,c,d,e,f);
            f2.write(s.getString(s.getCoverage().toString()));
            f2.newLine();
            f5.write(s.getString(s.getPartition().toString()));
            f5.newLine();
            for (int numi = 0 ; numi < s.getNumInvocations().size() ; numi++){
              sum += s.getNumInvocations().get(numi);
             }
            f3.write(""+this.sum);
            f3.newLine();
            
            s.resetComplex();
            
            sum=0;
             }
           
           closeFile();
             }
             catch (Exception e) {
                 System.out.println("Exception: - \n" + e.toString());
                 e.printStackTrace();
             }
            
         }
        
    public static void main(String [ ] args) throws UnsupportedEncodingException, IOException, FileNotFoundException, InterruptedException{
        
        
        testSuiteData t = new testSuiteData();
        
      t.writeData();
      
    }
 
}


