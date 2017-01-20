/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package experimentFiles.tcs.ex1;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

/**
 *
 * @author mustafa
 */
public class testCaseGenerator {

    final int max = -20;
    final int tcNum = 50;
    final String dfilePath = "/Users/Omar/Documents/omar/Complex/test/experimentFiles/tcs/";
    final String testSuiteFile = "/ts3";
    final String expNumber = "ex1";

    //@Test
    public void createTests() {
        saveStringtoFile(dfilePath + expNumber + testSuiteFile + ".txt", generateTestSuite());
    }

    @Test
    public void generateReliabilities() {
        saveStringtoFile(dfilePath + expNumber + testSuiteFile + "_reliabilities.txt", generateRelibilityStr());

    }

    //@Test
    public void clearTestCases() {
        try {
            final String fileName = (dfilePath + expNumber + testSuiteFile + "_coverage.txt");
            List<String> covs = FileUtils.readLines(new File(fileName));
            for (int i = 0; i < covs.size(); i++) {
                covs.set(i, covs.get(i) + "-----" + (i + 1));
            }
            Collections.sort(covs);
            for (String s : covs) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            Logger.getLogger(testCaseGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private String generateRelibilityStr() {
        String reliabilities = "";
        //double Low = 0.80, High = 1;
        //int numInputs = 6;
        double[] values = {0.999, 0.744, 0.995, 0.939, 0.965, 0.987, 0.899, 0.954, 1, 1, 1, 1};
        try {
            /*
             * for (int i = 0; i < numInputs * 2; i++) { values[i] = new
             * Random().nextDouble() * (High - Low) + Low;
            }
             */
            List<String> tcs = FileUtils.readLines(new File(dfilePath + expNumber + testSuiteFile + ".txt"));
            DecimalFormat df = new DecimalFormat("#.####");
            for (String s : tcs) {
                double reliability = 0;
                String[] temp = s.split(",");
                for (int i = 0; i < temp.length; i++) {
                    reliability += values[(2 * i) + (temp[i].contains("-") ? 0 : 1)];
                }
                reliabilities += df.format(reliability / 6) + "\n";
            }
            String temp = "";
            for (double d : values) {
                temp += d + "\n";
            }
            saveStringtoFile(dfilePath + expNumber + testSuiteFile + "_inputprices.txt", temp);
        } catch (IOException ex) {
            Logger.getLogger(testCaseGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reliabilities;
    }

    private String generateTestSuite() {
        //int a, b, c, d, e, f;    
        String tcText = "";
        for (int i = 0; i < tcNum; i++) {
            String tempData = generateTestCase();
            while (tcText.contains(tempData)) {
                tempData = generateTestCase();
            }
            tcText += tempData + "\n";
        }
        return tcText;
    }

    private String generateTestCase() {
        String inputs = "";
        for (int i = 0; i < 6; i++) {
            inputs += (int) (Math.random() * max * (Math.random() < 0.5 ? 1 : -1)) + ",";
        }
        return inputs;
    }

    private void saveStringtoFile(String filePath, String fileContent) {
        try {
            FileUtils.writeStringToFile(new File(filePath), fileContent);
        } catch (IOException ex) {
            Logger.getLogger(testCaseGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
