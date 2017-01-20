/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author mustafa
 */
@WebService(serviceName = "Calculator", targetNamespace = "http://localhost:11305/CalculatorService/Calculator")
//@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
public class Calculator {

    Object left = null, right = null;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "add", action = "urn:addSOAP")
    public int add(@WebParam(name = "left") String left, @WebParam(name = "right") String right) throws NumberFault {
        checkNumberException(left, right, true);
        return ((Number) this.left).intValue() + ((Number) this.right).intValue();
    }

    @WebMethod(operationName = "subtract", action = "urn:subtractSOAP")
    public int subtract(@WebParam(name = "left") String left, @WebParam(name = "right") String right) throws NumberFault {
        checkNumberException(left, right, true);
        return ((Number) this.left).intValue() - ((Number) this.right).intValue();
    }

    @WebMethod(operationName = "multiply", action = "urn:multiplySOAP")
    public int multiply(@WebParam(name = "left") String left, @WebParam(name = "right") String right) throws NumberFault {
        checkNumberException(left, right, true);
        return ((Number) this.left).intValue() * ((Number) this.right).intValue();

    }

    @WebMethod(operationName = "divide", action = "urn:divideSOAP")
    public int divide(@WebParam(name = "left") String left, @WebParam(name = "right") String right) throws NumberFault {
        checkNumberException(left, right, true);
        return ((Number) this.left).intValue() / ((Number) this.right).intValue();
    }

    @WebMethod(operationName = "isGraterThan", action = "urn:isGraterThanSOAP")
    public boolean isGraterThan(@WebParam(name = "left") String left, @WebParam(name = "right") String right) throws NumberFault {
        checkNumberException(left, right, true);
        return ((Number) this.left).intValue() > ((Number) this.right).intValue() ? true : false;
    }

    @WebMethod(operationName = "isLessThan", action = "urn:isLessThanSOAP")
    public boolean isLessThan(@WebParam(name = "left") String left, @WebParam(name = "right") String right) throws NumberFault {
        checkNumberException(left, right, true);
        return ((Number) this.left).intValue() < ((Number) this.right).intValue() ? true : false;
    }

    @WebMethod(operationName = "isEqualTo", action = "urn:isEqualToSOAP")
    public boolean isEqualTo(@WebParam(name = "left") String left, @WebParam(name = "right") String right) throws NumberFault {
        checkNumberException(left, right, true);
        return ((Number) this.left).intValue() == ((Number) this.right).intValue() ? true : false;
    }

    @WebMethod(operationName = "xOR", action = "urn:xORSOAP")
    public boolean xOR(@WebParam(name = "left") String left, @WebParam(name = "right") String right) throws NumberFault {
        checkNumberException(left, right, false);
        return ((Boolean) this.left).booleanValue() || ((Boolean) this.right).booleanValue();
    }

    @WebMethod(operationName = "xAND", action = "urn:xANDSOAP")
    public boolean xAND(@WebParam(name = "left") String left, @WebParam(name = "right") String right) throws NumberFault {
        checkNumberException(left, right, false);
        return ((Boolean) this.left).booleanValue() && ((Boolean) this.right).booleanValue();
    }

    private void checkNumberException(String left, String right, boolean isInt) throws NumberFault {
        if (isInt) {
            this.left = checkInteger(left, true);
            this.right = checkInteger(right, false);
        } else {
            this.left = checkBoolean(left, true);
            this.right = checkBoolean(right, false);

        }
    }

    private boolean checkBoolean(String boolValue, boolean isLeft) throws NumberFault {
        String tempValue = boolValue.toLowerCase();
        if (tempValue.contentEquals("true") || tempValue.contentEquals("t") || tempValue.contentEquals("1")) {
            return true;
        } else if (tempValue.contentEquals("false") || tempValue.contentEquals("f") || tempValue.contentEquals("0")) {
            return false;
        } else {
            throw new NumberFault("An invalid value entered for " + (isLeft ? "'Left'" : "'Right'") + " input. Only 'true', 'false' 't', 'f','1' and '0' are valid values for boolean inputs.", null);
        }
    }

    private int checkInteger(String intValue, boolean isLeft) throws NumberFault {
        try {
            return Integer.parseInt(intValue);
        } catch (NumberFormatException ex) {
            throw new NumberFault("An invalid value entered for " + (isLeft ? "'Left'" : "'Right'") + " input.", ex.getCause());
        }
    }
}
