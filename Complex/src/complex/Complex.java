package complex;

import java.util.Vector;
//glassfish is working ?
//no .. it says starting glass fish then 20 minutes later it says failed... can you share me some link where  I can get some help about it ? it is not the same problem as before so I dont really know ..abstract . okay you need  to start glass fish server ? yes ...ok let me seeok
//import pad.data.TestCase;
//import pad.data.Variable;
import cern.colt.bitvector.BitVector;

public class Complex {

    private BitVector coverage;
    private BitVector sInvoked;
    private static final int bSize = 24;
    private static final int sSize = 15;
    //private Vector<String> snapshots = null;
    private Vector<Integer> numInvocations;

    public Complex() {
        coverage = new BitVector(bSize);
        sInvoked = new BitVector(sSize);
        //snapshots = new Vector<String>();
        numInvocations = new Vector<Integer>();
        for(int i = 0; i < sSize; i++){
            numInvocations.add(0);
        }
    }

    
    /*
     * public Vector<String> getSnapshotVector() { return snapshots; }
     */
    private void cover(int index) {
        coverage.set(index);
    }

    private void invokeService(int[] index) {
        for (int i = 0; i < index.length; i++) {
            int sNo = index[i];
            sInvoked.set(sNo);
            numInvocations.set(sNo, numInvocations.elementAt(sNo)+1);
        }
    }

    public String test(int a, int b, int c, int d, int e, int f) {
        char z = 0;
        //String ret = "";
        if (a < e || e + a != c + b || e + c < a + b + d) {
            cover(0);
            //invokeService(new int[]{2, 3, 7, 3, 3, 2, 3, 3});
            invokeService(new int[]{2, 3, 7});
            a++;
            switch (a + b) {
                case 0:
                    cover(1);
                    invokeService(new int[]{0,3});
                    //ret = a + ":" + b + ":" + c + ":" + d + ":" + e + ":" + f + ":" + z + ":";
                    //return ret + 2;
                    return getString(coverage.toString() + ";" + sInvoked.toString() + ";" + numInvocations.toString());
                case 10:
                    cover(2);
                    invokeService(new int[]{3, 4, 8});
                    a = b - e;
                    break;
                case 23:
                    cover(3);
                    //invokeService(new int[]{3, 3, 3, 3, 8});
                    invokeService(new int[]{1, 3, 8});
                    e = a + b + d;
                    break;
                default:
                    cover(4);
                    invokeService(new int[]{1, 8});
                    c = a;
                    a = b;
            }
            c--;
            invokeService(new int[]{4, 8});
        } else {
            cover(5);
            invokeService(new int[]{3, 8});
            b++;
            if (c < b || (a > b && e < d) || a == e) {
                cover(6);                
                invokeService(new int[]{1, 2, 6});
                c++;
            } else {
                cover(7);
                invokeService(new int[]{3, 8});
            }
        }

        a = b + c;
        z = 0;        
        invokeService(new int[]{3, 8});

        while (f < d && z < 100) {
            cover(8);
            z++;
            e = c + e + b;
            f -= 2 * a + e + 1;            
            invokeService(new int[]{2, 3, 4, 5, 8});
            if (e < f) {
                invokeService(new int[]{2,9});
                cover(9);
                break;
            } else {
                cover(10);
                invokeService(new int[]{2,10});//change
            }
            a = d + a;
            invokeService(new int[]{3, 8});

            if (f == a) {
                cover(11);
                invokeService(new int[]{6,11});
                break;
            } else {
                cover(12);
                invokeService(new int[]{6,12});//change
            }

            if (!(f < d && z < 100)) {
                cover(13);                
                invokeService(new int[]{2,13});
            } else {
                cover(14);
                invokeService(new int[]{6,14});//change
            }
        }

        if ((a < b || b < c) && (a < c || e < d)) {
            cover(15);            
            invokeService(new int[]{2,11});            
            return getString(coverage.toString() + ";" + sInvoked.toString() + ";" + numInvocations.toString());
        } else {
            cover(16);
            invokeService(new int[]{6,12});//change
        }

        a = b + c;
        z = 0;        
        invokeService(new int[]{3, 8});
        while (f + e < a + b && z < 100) //default z < 100 modified z <  
        {
            cover(17);
            z++;
            e = c + e + b;
            f -= 2 * a + e;
            //invokeService(new int[]{2, 2, 3, 3, 3, 8, 8, 4, 8, 5, 3});
            invokeService(new int[]{2, 3, 4, 5, 8});
            if (e < f) {
                cover(18);
                invokeService(new int[]{2,13});
                break;
            } else {
                cover(19);
                invokeService(new int[]{6,14});//change
            }
            a = d + a;
            invokeService(new int[]{3, 8});//change
            if (f == a) {
                cover(20);
                invokeService(new int[]{0,6});
                break;
            } else {
                cover(21);
                invokeService(new int[]{6,10});//change
            }

            if (!(f + e < a + b && z < 100)) {
                cover(22);                
                invokeService(new int[]{7, 3, 2});
            } else {
                cover(23);
                invokeService(new int[]{6,9});//change
            }
        }
        //ret = a + ":" + b + ":" + c + ":" + d + ":" + e + ":" + f + ":" + z + ":";
        //System.out.println("Coverage: " + coverage.toString() + "\nServices: " + sInvoked.toString() + "\nInvocations:" + numInvocations.toString());
        return getString(coverage.toString() + ";" + sInvoked.toString() + ";" + numInvocations.toString());
        //return ret + 0;                
    }
    
    private String getString(String vecStr){
        return (vecStr.toString().replace("}", "")).replace("{", "");
    }

    /*
     * public BitVector execute(TestCase testcase) { coverage.clear();
     * Vector<Variable> variables = testcase.getInputVector(); test((Integer)
     * variables.get(0).getValue(), (Integer) variables.get(1).getValue(),
     * (Integer) variables.get(2).getValue(), (Integer)
     * variables.get(3).getValue(), (Integer) variables.get(4).getValue(),
     * (Integer) variables.get(5).getValue()); return coverage; }
     *
     * public Vector<Class> getInputTypes() { Vector<Class> types = new
     * Vector<Class>(); types.add(Integer.class); types.add(Integer.class);
     * types.add(Integer.class); types.add(Integer.class);
     * types.add(Integer.class); types.add(Integer.class); return types; }
     */
    public int getSize() {
        return Complex.bSize;
    }
}
