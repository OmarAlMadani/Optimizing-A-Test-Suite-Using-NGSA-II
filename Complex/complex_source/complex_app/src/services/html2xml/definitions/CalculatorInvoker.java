/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services.html2xml.definitions;

/**
 *
 * @author mustafa
 */
public class CalculatorInvoker {
    CalculatorSoap calcService = new Calculator().getCalculatorSoap();
    
    public int add(int left, int right){
        return calcService.add(left, right);
    }
    public int subtract(int left, int right){
        return calcService.subtract(left, right);
    }
    
    public int multiply(int left, int right){
        return calcService.multiply(left, right);
    }
    public int divide(int left, int right){
        return calcService.divide(left, right);
    }
    
}
