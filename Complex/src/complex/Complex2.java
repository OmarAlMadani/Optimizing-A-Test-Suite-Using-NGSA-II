package complex;

import java.util.Vector;
import cern.colt.bitvector.BitVector;

/*
 * ********Services************* 
 * Service 0: = 
 * Service 1: > 
 * Service 2: < 
 * Service 3: + 
 * Service 4: - 
 * Service 5: * 
 * Service 6: / 
 * Service 7: || 
 * Service 8: &&
 */

public class Complex2 {

    private BitVector coverage;
    private BitVector sInvoked;
    private static final int bSize = 24;
    private static final int sSize = 9;
    private Vector<Integer> numInvocations;

    public Complex2() {
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

    private void invokeService(int[] index) {
        for (int i = 0; i < index.length; i++) {
            int sNo = index[i];
            sInvoked.set(sNo);
            numInvocations.set(sNo, numInvocations.elementAt(sNo) + 1);
        }
    }

    public String test(int a, int b, int c, int d, int e, int f) {
        char z = 0;
        invokeService(new int[]{2, 7, 3, 0, 3, 7, 3, 2, 3, 3});
        if (a < e || e + a != c + b || e + c < a + b + d) {
            cover(0);
            a++;
            invokeService(new int[]{3, 3});
            switch (a + b) {
                case 0:
                    cover(1);
                    return getString(coverage.toString() + ";" + sInvoked.toString() + ";" + numInvocations.toString());
                case 10:
                    cover(2);
                    invokeService(new int[]{4});
                    a = b - e;
                    break;
                case 23:
                    cover(3);
                    invokeService(new int[]{3, 3});
                    e = a + b + d;
                    break;
                default:
                    cover(4);
                    c = a;
                    a = b;
            }
            c--;
            invokeService(new int[]{4});
        } else {
            cover(5);
            invokeService(new int[]{3});
            b++;
            invokeService(new int[]{2, 7, 1, 8, 2, 7, 0});
            if (c < b || (a > b && e < d) || a == e) {
                cover(6);
                invokeService(new int[]{3});
                c++;
            } else {
                cover(7);
            }
        }

        a = b + c;
        z = 0;
        invokeService(new int[]{3});

        while (f < d && z < 100) {
            invokeService(new int[]{2, 8, 2});
            cover(8);
            z++;
            e = c + e + b;
            f -= 2 * a + e + 1;
            invokeService(new int[]{3, 3, 4, 5, 3, 3, 2});
            if (e < f) {
                cover(9);
                break;
            } else {
                cover(10);
            }
            a = d + a;
            invokeService(new int[]{0, 3});
            if (f == a) {
                cover(11);
                break;
            } else {
                cover(12);
            }
            invokeService(new int[]{2, 8, 2});
            if (!(f < d && z < 100)) {
                cover(13);
            } else {
                cover(14);
            }
        }
        invokeService(new int[]{2, 7, 7, 2, 8, 2, 7, 2});
        if ((a < b || b < c) && (a < c || e < d)) {
            cover(15);
            return getString(coverage.toString() + ";" + sInvoked.toString() + ";" + numInvocations.toString());
        } else {
            cover(16);
        }

        a = b + c;
        z = 0;

        invokeService(new int[]{3});
        while (f + e < a + b && z < 100) {
            invokeService(new int[]{3, 2, 3, 8, 2});
            cover(17);
            z++;
            e = c + e + b;
            f -= 2 * a + e;
            invokeService(new int[]{3, 3, 4, 5, 3, 3, 2});
            if (e < f) {
                cover(18);
                break;
            } else {
                cover(19);
            }
            a = d + a;
            invokeService(new int[]{3, 0});//change
            if (f == a) {
                cover(20);
                break;
            } else {
                cover(21);
            }
            invokeService(new int[]{3, 2, 3, 8, 2});
            if (!(f + e < a + b && z < 100)) {
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

    public int getSize() {
        return bSize;
    }
}
