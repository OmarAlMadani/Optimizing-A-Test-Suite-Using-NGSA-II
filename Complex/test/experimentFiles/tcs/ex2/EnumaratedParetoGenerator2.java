/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package experimentFiles.tcs.ex2;

import java.util.ArrayList;


/**
 *
 * @author mustafa
 */
public class EnumaratedParetoGenerator2 {

    public enum ProblemType {

        twoD, threeD
    }
    ArrayList<Solution> solutions = new ArrayList<Solution>();
    ProblemType problemType;

    public EnumaratedParetoGenerator2(int problemType) {
        if (problemType == 2) {
            this.problemType = ProblemType.twoD;
        } else {
            this.problemType = ProblemType.threeD;
        }
    }

    private void findOptimalPF() {
        for (int i = 0; i < solutions.size(); i++) {
            for (int y = 0; y < solutions.size(); y++) {
                if (y != i) {
                    Solution cs = solutions.get(i);
                    Solution ts = solutions.get(y);
                    if (problemType == ProblemType.twoD) {
                        if (cs.getObj1() >= ts.getObj1() && cs.getObj2() <= ts.getObj2()) {
                            solutions.remove(i);
                            i--;
                            break;
                        } else {
                            if (cs.getObj1() >= ts.getObj1() && cs.getObj2() <= ts.getObj2() && cs.getObj3() <= ts.getObj3()) {
                                solutions.remove(i);
                                i--;
                                break;
                            }
                        }
                    }
                }
            }
        }

    }
}
class Solution {

    private double obj1 = 0, obj2 = 0, obj3 = 0;

    public Solution(double obj1, double obj2, double obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void setObj1(double newValue) {
        this.obj1 = newValue;
    }

    public void setObj2(double newValue) {
        this.obj2 = newValue;
    }

    public void setObj3(double newValue) {
        this.obj3 = newValue;
    }

    public double getObj1() {
        return this.obj1;
    }

    public double getObj2() {
        return this.obj2;
    }

    public double getObj3() {
        return this.obj3;
    }
}