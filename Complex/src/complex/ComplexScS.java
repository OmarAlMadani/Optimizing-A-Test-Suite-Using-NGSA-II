package complex;

import java.util.Vector;
import cern.colt.bitvector.BitVector;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.Calculator;
import services.Calculator_Service;
import services.NumberFault_Exception;

/*
 * ********Services************* Service 0: = Service 1: > Service 2: < Service
 * 3: + Service 4: - Service 5: * Service 6: / Service 7: || Service 8: &&
 */
public class ComplexScS {

    
    Hashtable<String, Integer> partition = new  Hashtable<String, Integer>();
    Hashtable<String, Integer> branch = new  Hashtable<String, Integer>();
    
    
    FileWriter file;   
    
    private BitVector coverage;
    private BitVector EP;
    private BitVector sInvoked;
    private static final int bSize = 24;
    private static final int pSize = 20;
    private static final int sSize = 9;
    private Vector<Integer> numInvocations;
    Calculator relationalCalc = null;
    
    
    //CalculatorInvoker mathCalc = null;
    public BitVector getCoverage() {
        return coverage;
    }
   
    public BitVector getPartition() {
        return EP;
    }
    

    public BitVector getsInvoked() {
        return sInvoked;
    }

    public Vector<Integer> getNumInvocations() {
        return numInvocations;
    }
    
    
 
    
    public ComplexScS() {
        initialiseComplex();
        relationalCalc = new Calculator_Service().getCalculatorPort();
        
    }

    public ComplexScS(Calculator calc, FileWriter file) {
        initialiseComplex();
        this.relationalCalc = calc;
        this.file = file;
    }

    private void initialiseComplex() {
        coverage = new BitVector(bSize);
        sInvoked = new BitVector(sSize);
        EP = new BitVector(pSize);
        numInvocations = new Vector<Integer>();
        for (int i = 0; i < sSize; i++) {
            numInvocations.add(0);
        }
    }

    private void cover(int index) {
        coverage.set(index);
    }
    
    private void partition (int index){
        EP.set(index);
    }

    private void invokeService(int sNo) {
        sInvoked.set(sNo);
        numInvocations.set(sNo, numInvocations.elementAt(sNo) + 1);
    }

    public String test(int a, int b, int c, int d, int e, int f) throws IOException {
       
        char z = 0;
        if (xOR(xOR(isLessThan(a, e), !isEqualTo(add(e, a), add(c, b))), isLessThan(add(e, c), add(a, add(b, d))))) { //a < e || e + a != c + b || e + c < a + b + d) {            
            cover(0);
            incrementIfExist2("0");
            a = add(a, 1); //a++;

            switch (add(a, b)) { //a + b) {
                case 0:
                    cover(1);
                    incrementIfExist2("1");
                    //System.out.println("1");
                    return getString(this.coverage.toString() + ";" + this.sInvoked.toString() + ";" + this.numInvocations.toString());
                case 10:
                    cover(2);
                    incrementIfExist2("2");
                    a = subtract(b, e); //a = b - e;
                    //System.out.println("case 10");
                    break;
                case 23:
                    cover(3);
                    incrementIfExist2("3");
                    e = add(a, add(b, d)); //e = a + b + d;
                    //System.out.println("case 23");
                    break;
                default:
                    cover(4);
                    incrementIfExist2("4");
                    c = a;
                    a = b;
                    //System.out.println("case defult");
            }
            c = subtract(c, 1); //c--;
           // System.out.println("if 1");
        }// end of 1st if
        else {
            cover(5);
            incrementIfExist2("5");
            b = add(b, 1); //b++;   
            
            if (xOR(xOR(isLessThan(c, b), xAND(isGreaterThan(a, b), isLessThan(e, d))), isEqualTo(a, e))) { //c < b || (a > b && e < d) || a == e) {
                cover(6);
                incrementIfExist2("6");
                c = add(c, 1); //c++;
               // System.out.println("if 2");
            } else {
                cover(7);
                incrementIfExist2("7");
               // System.out.println("else 2");
            }//System.out.println("else 1");
        }

        a = add(b, c); //a = b + c;
        z = 0;

        while (xAND(isLessThan(f, d), isLessThan(z, 100))) {//f < d && z < 100) {            
            cover(8);
            incrementIfExist2("8");
            z++; //kept to make sure precision
            invokeService(8); //invoke add for previous line

            e = add(c, add(e, b));//e = c + e + b;            
            f = subtract(f, add(multiply(2, a), add(e, 1)));//f -= 2 * a + e + 1;            

            if (isLessThan(e, f)) {//e < f) {
                cover(9);
                incrementIfExist2("9");
                break;
            } else {
                cover(10);
                incrementIfExist2("10");
            }
            a = add(d, a); //a = d + a;

            if (isEqualTo(f, a)) {//f == a) {
                cover(11);
                incrementIfExist2("11");
                break;
            } else {
                cover(12);
                incrementIfExist2("12");
            }

            if (!xAND(isLessThan(f, d), isLessThan(z, 100))) {//!(f < d && z < 100)) {
                cover(13);
                incrementIfExist2("13");
            } else {
                cover(14);
                incrementIfExist2("14");
            }
            
           
            //System.out.println("while 1"+ countwhile1++);
            
        }//end of while

        if (xAND(xOR(isLessThan(a, b), isLessThan(b, c)), xOR(isLessThan(a, c), isLessThan(e, d)))) {//(a < b || b < c) && (a < c || e < d)) {
            cover(15);
            incrementIfExist2("15");
            //System.out.println("2");
            return getString(this.coverage.toString() + ";" + this.sInvoked.toString() + ";" + this.numInvocations.toString());
        } else {
            cover(16);
            incrementIfExist2("16");
        }

        a = add(b, c);//a = b + c;
        z = 0;

        while (xAND(isLessThan(add(f, e), add(a, b)), isLessThan(z, 100))) {//f + e < a + b && z < 100) {            
            cover(17);
            incrementIfExist2("17");
            z++; // kept for precision
            invokeService(8); // call add for prevoius line

            e = add(c, add(e, b)); //e = c + e + b;
            f = subtract(f, add(multiply(2, a), e)); //f -= 2 * a + e;            
            if (isLessThan(e, f)) {//e < f) {
                cover(18);
                incrementIfExist2("18");
                break;
            } else {
                cover(19);
                incrementIfExist2("19");
            }
            a = add(d, a); //a = d + a;            
            if (isEqualTo(f, a)) {//f == a) {
                cover(20);
                incrementIfExist2("20");
                break;
            } else {
                cover(21);
                incrementIfExist2("21");
            }
            if (!(xAND(isLessThan(add(f, e), add(a, b)), isLessThan(z, 100)))) {//!(f + e < a + b && z < 100)) {
                cover(22);
                incrementIfExist2("22");
            } else {
                cover(23);
                incrementIfExist2("23");
            }
            
            
            //System.out.println("while 2"+ countwhile2++);
        }
        //System.out.println("3");
        return getString(this.coverage.toString() + ";" + this.sInvoked.toString() + ";" + this.numInvocations.toString());
    }

    public String getString(String vecStr) {
        return (vecStr.toString().replace("}", "")).replace("{", "");
    }                                                                                                                                   
    
   
    
    public void resetComplex(){
        initialiseComplex();
    }
    
    public void resetHashTable(){
     partition = new  Hashtable<String, Integer>();
     branch = new  Hashtable<String, Integer>();
    }

    public int getSize() {
        return bSize;
    }
    
    public void incrementIfExist(String key){
        
        if (!partition.containsKey(key))
        {
            partition.put(key, 1);
        }
    }
    
     public void incrementIfExist2(String key){
        
        if (!branch.containsKey(key))
        {
            branch.put(key, 1);
        }
    }

    
    public int multiply(int left, int right) throws IOException {
        try {
            
            invokeService(0);
            
           if (left == 0 || right == 0) {
              //  file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : left == 0 || right == 0 ");
               // file.write("\n");
       
                incrementIfExist("1");
                partition(1);
            }
           if (left < 0 && right < 0) {
              // file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : left < 0 && right < 0 ");
              // file.write("\n");
               incrementIfExist("2");
               partition(2);
            }
           if (left < 0 || right < 0) {
              // file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : left < 0 || right < 0 ");
              // file.write("\n");
               incrementIfExist("3");
               partition(3);
           }
           if (left > 0 && right > 0) {
               //file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : left > 0 && right > 0 ");
               //file.write("\n");
               incrementIfExist("4");
               partition(4);
            }

            return relationalCalc.multiply(String.valueOf(left), String.valueOf(right));
            
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int divide(int left, int right) {
        try {
            invokeService(1);
            return relationalCalc.subtract(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }      

    public boolean xAND(boolean left, boolean right) throws IOException {
        try {
            invokeService(2);
           if (left == true && right == true) {
              // file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : left == true && right == true ");
              // file.write("\n");
               incrementIfExist("5");//5
               partition(5);
            }
           else {
              // file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : ! (left == true && right == true ) ");
              // file.write("\n");
               incrementIfExist("6");//6
               partition(6);
           }
            return relationalCalc.xAND(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean xOR(boolean left, boolean right) throws IOException {
        try {
            invokeService(3);
          if (left == false && right == false) {
              // file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : left == false || right == false ");
              // file.write("\n");
               incrementIfExist("7");//7
               partition(7);
            }
           else {
             //  file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : ! (left == false || right == false ) ");
              // file.write("\n");
               incrementIfExist("8");//8
               partition(8);
           }
            return relationalCalc.xOR(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isGreaterThan(int left, int right) throws IOException {
        try {
            invokeService(4);
           if (right > left) {
               // file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case: right > left ");
               // file.write("\n");//9
                incrementIfExist("9");
                partition(9);
            }
            if (right <= left) {
               // file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case: right <= left ");
               // file.write("\n");
                incrementIfExist("10");//10
                partition(10);
            }
            return relationalCalc.isGraterThan(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isLessThan(int left, int right) throws IOException {
        try {
            invokeService(5);
           if (right < left) {
                //file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : right < left ");
               // file.write("\n");//11
                incrementIfExist("11");
                partition(11);
            }
            if (right >= left) {
                //file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : right >= left ");
                //file.write("\n");
                incrementIfExist("12");//12
                partition(12);
            }
            return relationalCalc.isLessThan(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isEqualTo(int left, int right) throws IOException {
        try {
            invokeService(6);
           if (right == left) {
              //  file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : right == left ");
               // file.write("\n");
                incrementIfExist("13");//13
                partition(13);
            }
           else{
              // file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : !(right == left) ");
              // file.write("\n");
               incrementIfExist("14");//14
               partition(14);
           }
           
            return relationalCalc.isEqualTo(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public int subtract(int left, int right) throws IOException {
        try {
            invokeService(7);
         if (left > right) {
              //  file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : left > right ");
              //  file.write("\n");
                incrementIfExist("15");//15
                partition(15);
            }
         if (left < right) {
               // file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : left < right ");
               // file.write("\n");
                incrementIfExist("16");//16
                partition(16);
            }
            return relationalCalc.subtract(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int add(int left, int right) throws IOException {
        try {
           
            invokeService(8);
            if (left > 0 && right > 0) {
                
                //file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : left > 0 && right > 0 ");
                //file.write("\n");
                incrementIfExist("17");//17
                partition(17);
            }
            if (left < 0 && right < 0) {
              // file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : left < 0 && right < 0 ");
              // file.write("\n");
               incrementIfExist("18");//18
               partition(18);
            }
            if (left < 0 || right < 0) {
              //  file.write(Thread.currentThread().getStackTrace()[1].getMethodName() + " , case : left < 0 || right < 0 ");
              //  file.write("\n");
                incrementIfExist("19");//19
                partition(19);
            }
           
           
            return relationalCalc.add(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    
   
}