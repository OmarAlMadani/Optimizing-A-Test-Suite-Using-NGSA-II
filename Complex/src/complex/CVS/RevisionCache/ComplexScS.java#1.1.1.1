package complex;

import java.util.Vector;
import cern.colt.bitvector.BitVector;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.Calculator;
import services.Calculator_Service;
import services.NumberFault_Exception;
import services.html2xml.definitions.CalculatorInvoker;

/*
 * ********Services************* Service 0: = Service 1: > Service 2: < Service
 * 3: + Service 4: - Service 5: * Service 6: / Service 7: || Service 8: &&
 */
public class ComplexScS {

    private BitVector coverage;
    private BitVector sInvoked;
    private static final int bSize = 24;
    private static final int sSize = 9;
    private Vector<Integer> numInvocations;
    Calculator relationalCalc = null;
    CalculatorInvoker mathCalc = null;

    public ComplexScS() {
        initialiseComplex();
        relationalCalc = new Calculator_Service().getCalculatorPort();
        mathCalc = new CalculatorInvoker();
    }

    public ComplexScS(Calculator calc) {
        initialiseComplex();
        this.relationalCalc = calc;
    }

    private void initialiseComplex() {
        coverage = new BitVector(bSize);
        sInvoked = new BitVector(sSize);
        numInvocations = new Vector<Integer>();
        for (int i = 0; i < sSize; i++) {
            numInvocations.add(0);
        }
    }

    private void cover(int index) {
        coverage.set(index);
    }

    private void invokeService(int sNo) {
        sInvoked.set(sNo);
        numInvocations.set(sNo, numInvocations.elementAt(sNo) + 1);
    }

    public String test(int a, int b, int c, int d, int e, int f) {
        char z = 0;
        if (xOR(xOR(isLessThan(a, e), !isEqualTo(add(e, a), add(c, b))), isLessThan(add(e, c), add(a, add(b, d))))) { //a < e || e + a != c + b || e + c < a + b + d) {            
            cover(0);
            a = add(a, 1); //a++;

            switch (add(a, b)) { //a + b) {
                case 0:
                    cover(1);
                    return getString(coverage.toString() + ";" + sInvoked.toString() + ";" + numInvocations.toString());
                case 10:
                    cover(2);
                    a = subtract(b, e); //a = b - e;
                    break;
                case 23:
                    cover(3);
                    e = add(a, add(b, d)); //e = a + b + d;
                    break;
                default:
                    cover(4);
                    c = a;
                    a = b;
            }
            c = subtract(c, 1); //c--;

        } else {
            cover(5);
            b = add(b, 1); //b++;            
            if (xOR(xOR(isLessThan(c, b), xAND(isGreaterThan(a, b), isLessThan(e, d))), isEqualTo(a, e))) { //c < b || (a > b && e < d) || a == e) {
                cover(6);
                c = add(c, 1); //c++;
            } else {
                cover(7);
            }
        }

        a = add(b, c); //a = b + c;
        z = 0;

        while (xAND(isLessThan(f, d), isLessThan(z, 100))) {//f < d && z < 100) {            
            cover(8);
            z++; //kept to make sure precision
            invokeService(3); //invoke add for previous line

            e = add(c, add(e, b));//e = c + e + b;            
            f = subtract(f, add(multiply(2, a), add(e, 1)));//f -= 2 * a + e + 1;            

            if (isLessThan(e, f)) {//e < f) {
                cover(9);
                break;
            } else {
                cover(10);
            }
            a = add(d, a); //a = d + a;

            if (isEqualTo(f, a)) {//f == a) {
                cover(11);
                break;
            } else {
                cover(12);
            }

            if (!xAND(isLessThan(f, d), isLessThan(z, 100))) {//!(f < d && z < 100)) {
                cover(13);
            } else {
                cover(14);
            }
        }

        if (xAND(xOR(isLessThan(a, b), isLessThan(b, c)), xOR(isLessThan(a, c), isLessThan(e, d)))) {//(a < b || b < c) && (a < c || e < d)) {
            cover(15);
            return getString(coverage.toString() + ";" + sInvoked.toString() + ";" + numInvocations.toString());
        } else {
            cover(16);
        }

        a = add(b, c);//a = b + c;
        z = 0;

        while (xAND(isLessThan(add(f, e), add(a, b)), isLessThan(z, 100))) {//f + e < a + b && z < 100) {            
            cover(17);
            z++; // kept for precision
            invokeService(3); // call add for prevoius line

            e = add(c, add(e, b)); //e = c + e + b;
            f = subtract(f, add(multiply(2, a), e)); //f -= 2 * a + e;            
            if (isLessThan(e, f)) {//e < f) {
                cover(18);
                break;
            } else {
                cover(19);
            }
            a = add(d, a); //a = d + a;            
            if (isEqualTo(f, a)) {//f == a) {
                cover(20);
                break;
            } else {
                cover(21);
            }
            if (!(xAND(isLessThan(add(f, e), add(a, b)), isLessThan(z, 100)))) {//!(f + e < a + b && z < 100)) {
                cover(22);
            } else {
                cover(23);
            }
        }
        return getString(coverage.toString() + ";" + sInvoked.toString() + ";" + numInvocations.toString());
    }

    private String getString(String vecStr) {
        return (vecStr.toString().replace("}", "")).replace("{", "");
    }
    
    public void resetComplex(){
        initialiseComplex();
    }

    public int getSize() {
        return bSize;
    }

    
    public int multiply(int left, int right) {
        try {
            invokeService(0);
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

    public boolean xAND(boolean left, boolean right) {
        try {
            invokeService(2);
            return relationalCalc.xAND(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean xOR(boolean left, boolean right) {
        try {
            invokeService(2);
            return relationalCalc.xOR(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isGreaterThan(int left, int right) {
        try {
            invokeService(4);
            return relationalCalc.isGraterThan(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isLessThan(int left, int right) {
        try {
            invokeService(5);
            return relationalCalc.isLessThan(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isEqualTo(int left, int right) {
        try {
            invokeService(6);
            return relationalCalc.isEqualTo(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public int subtract(int left, int right) {
        try {
            invokeService(7);
            return relationalCalc.subtract(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int add(int left, int right) {
        try {
            invokeService(8);
            return relationalCalc.add(String.valueOf(left), String.valueOf(right));
        } catch (NumberFault_Exception ex) {
            Logger.getLogger(ComplexScS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    
   
}
