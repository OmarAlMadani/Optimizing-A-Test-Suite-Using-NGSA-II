/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

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
public class makeTestSuite {
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Omar
 */

    
  
int sum = 0; 
int count = 1;
static FileWriter file1 = null;
static FileWriter file2 = null;
static FileWriter file3 = null;
static FileWriter file4 = null;
static BufferedWriter f1 = null;
static BufferedWriter f2 = null;
static BufferedWriter f3 = null; 
static BufferedWriter f4 = null; 


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
        file4 = new FileWriter("//Users/Omar/Documents/omar/Complex/test/experimentFiles/tcs/partitions.txt", false);

        f1 = new BufferedWriter(file1);
        f2 = new BufferedWriter(file2);
        f3 = new BufferedWriter(file3);   
        f4 = new BufferedWriter(file4);   
    }
    
    private void closeFile() throws IOException{
        
         f1.close();
         f2.close();
         f3.close();
         f4.close();
         
         file1.close();
         file2.close();
         file3.close();
         file4.close();
       
       
        
    }
    
    public void testTest() throws FileNotFoundException, UnsupportedEncodingException, IOException, InterruptedException{
        
       
        //Integer.MAX_VALUE
        for (int i = 1 ; i < 100 ; i++){
            
        ComplexScS s = new ComplexScS() ;
        
        
           int[] num = generateTestData();
           int a = num[0];
           int b = num[1];
           int c = num[2];
           int d = num[3];
           int e = num[4];
           int f = num[5];
           
           
          // if(!(a < e || e + a != c + b || e + c < a + b + d)){
           s.test(a, b, c, d, e, f);
          // }
           
             
         
             for (int numi = 0 ; numi < s.getNumInvocations().size() ; numi++){
              sum += s.getNumInvocations().get(numi);
             }
             
            
            
              //if(s.partition.containsKey("1")){        
              //if (s.branch.containsKey("cover 20")){
             if (s.branch.size()>10 &&s.partition.size()>10) { 
                   
            System.out.println(count);
            System.out.println("test case " + i + " :" + "(" +num[0] + "," + num[1] + "," + num[2] + "," + num[3] +" " + num[4] + "," + num[5]+ ")");
            System.out.println("paritions " + i + " : " + s.partition.keySet().size());
            System.out.println(s.partition.keySet());
            System.out.println("number of branches :" + s.branch.keySet().size());
            System.out.println(s.getString(s.getCoverage().toString()));
            System.out.println();
           
            
            count ++;
            }
          
          sum = 0 ;
            
        }
        
        
           
       }

    public static void main(String [ ] args) throws UnsupportedEncodingException, IOException, FileNotFoundException, InterruptedException{
        
      makeTestSuite mts = new makeTestSuite();
      mts.testTest();
        
      
    }

    
}


 
