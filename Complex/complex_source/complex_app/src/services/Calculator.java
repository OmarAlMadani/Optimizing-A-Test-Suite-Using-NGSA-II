
package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Calculator", targetNamespace = "http://localhost:11305/CalculatorService/Calculator")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculator {


    /**
     * 
     * @param left
     * @param right
     * @return
     *     returns int
     * @throws NumberFault_Exception
     */
    @WebMethod(action = "urn:addSOAP")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.AddResponse")
    public int add(
        @WebParam(name = "left", targetNamespace = "")
        String left,
        @WebParam(name = "right", targetNamespace = "")
        String right)
        throws NumberFault_Exception
    ;

    /**
     * 
     * @param left
     * @param right
     * @return
     *     returns int
     * @throws NumberFault_Exception
     */
    @WebMethod(action = "urn:divideSOAP")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divide", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.Divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.DivideResponse")
    public int divide(
        @WebParam(name = "left", targetNamespace = "")
        String left,
        @WebParam(name = "right", targetNamespace = "")
        String right)
        throws NumberFault_Exception
    ;

    /**
     * 
     * @param left
     * @param right
     * @return
     *     returns int
     * @throws NumberFault_Exception
     */
    @WebMethod(action = "urn:multiplySOAP")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.MultiplyResponse")
    public int multiply(
        @WebParam(name = "left", targetNamespace = "")
        String left,
        @WebParam(name = "right", targetNamespace = "")
        String right)
        throws NumberFault_Exception
    ;

    /**
     * 
     * @param left
     * @param right
     * @return
     *     returns int
     * @throws NumberFault_Exception
     */
    @WebMethod(action = "urn:subtractSOAP")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.SubtractResponse")
    public int subtract(
        @WebParam(name = "left", targetNamespace = "")
        String left,
        @WebParam(name = "right", targetNamespace = "")
        String right)
        throws NumberFault_Exception
    ;

    /**
     * 
     * @param left
     * @param right
     * @return
     *     returns boolean
     * @throws NumberFault_Exception
     */
    @WebMethod(action = "urn:isGraterThanSOAP")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isGraterThan", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.IsGraterThan")
    @ResponseWrapper(localName = "isGraterThanResponse", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.IsGraterThanResponse")
    public boolean isGraterThan(
        @WebParam(name = "left", targetNamespace = "")
        String left,
        @WebParam(name = "right", targetNamespace = "")
        String right)
        throws NumberFault_Exception
    ;

    /**
     * 
     * @param left
     * @param right
     * @return
     *     returns boolean
     * @throws NumberFault_Exception
     */
    @WebMethod(action = "urn:isLessThanSOAP")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isLessThan", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.IsLessThan")
    @ResponseWrapper(localName = "isLessThanResponse", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.IsLessThanResponse")
    public boolean isLessThan(
        @WebParam(name = "left", targetNamespace = "")
        String left,
        @WebParam(name = "right", targetNamespace = "")
        String right)
        throws NumberFault_Exception
    ;

    /**
     * 
     * @param left
     * @param right
     * @return
     *     returns boolean
     * @throws NumberFault_Exception
     */
    @WebMethod(action = "urn:xORSOAP")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "xOR", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.XOR")
    @ResponseWrapper(localName = "xORResponse", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.XORResponse")
    public boolean xOR(
        @WebParam(name = "left", targetNamespace = "")
        String left,
        @WebParam(name = "right", targetNamespace = "")
        String right)
        throws NumberFault_Exception
    ;

    /**
     * 
     * @param left
     * @param right
     * @return
     *     returns boolean
     * @throws NumberFault_Exception
     */
    @WebMethod(action = "urn:xANDSOAP")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "xAND", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.XAND")
    @ResponseWrapper(localName = "xANDResponse", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.XANDResponse")
    public boolean xAND(
        @WebParam(name = "left", targetNamespace = "")
        String left,
        @WebParam(name = "right", targetNamespace = "")
        String right)
        throws NumberFault_Exception
    ;

    /**
     * 
     * @param left
     * @param right
     * @return
     *     returns boolean
     * @throws NumberFault_Exception
     */
    @WebMethod(action = "urn:isEqualToSOAP")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isEqualTo", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.IsEqualTo")
    @ResponseWrapper(localName = "isEqualToResponse", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", className = "services.IsEqualToResponse")
    public boolean isEqualTo(
        @WebParam(name = "left", targetNamespace = "")
        String left,
        @WebParam(name = "right", targetNamespace = "")
        String right)
        throws NumberFault_Exception
    ;

}
