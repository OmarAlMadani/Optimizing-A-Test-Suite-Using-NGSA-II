
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DivideResponse_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "divideResponse");
    private final static QName _NumberFault_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "NumberFault");
    private final static QName _XANDResponse_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "xANDResponse");
    private final static QName _XOR_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "xOR");
    private final static QName _IsEqualTo_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "isEqualTo");
    private final static QName _IsLessThanResponse_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "isLessThanResponse");
    private final static QName _XORResponse_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "xORResponse");
    private final static QName _Subtract_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "subtract");
    private final static QName _IsGraterThan_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "isGraterThan");
    private final static QName _SubtractResponse_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "subtractResponse");
    private final static QName _IsLessThan_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "isLessThan");
    private final static QName _Add_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "add");
    private final static QName _Divide_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "divide");
    private final static QName _IsGraterThanResponse_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "isGraterThanResponse");
    private final static QName _Multiply_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "multiply");
    private final static QName _MultiplyResponse_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "multiplyResponse");
    private final static QName _AddResponse_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "addResponse");
    private final static QName _IsEqualToResponse_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "isEqualToResponse");
    private final static QName _XAND_QNAME = new QName("http://localhost:11305/CalculatorService/Calculator", "xAND");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsGraterThanResponse }
     * 
     */
    public IsGraterThanResponse createIsGraterThanResponse() {
        return new IsGraterThanResponse();
    }

    /**
     * Create an instance of {@link IsLessThan }
     * 
     */
    public IsLessThan createIsLessThan() {
        return new IsLessThan();
    }

    /**
     * Create an instance of {@link IsEqualTo }
     * 
     */
    public IsEqualTo createIsEqualTo() {
        return new IsEqualTo();
    }

    /**
     * Create an instance of {@link MultiplyResponse }
     * 
     */
    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    /**
     * Create an instance of {@link DivideResponse }
     * 
     */
    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link IsEqualToResponse }
     * 
     */
    public IsEqualToResponse createIsEqualToResponse() {
        return new IsEqualToResponse();
    }

    /**
     * Create an instance of {@link XANDResponse }
     * 
     */
    public XANDResponse createXANDResponse() {
        return new XANDResponse();
    }

    /**
     * Create an instance of {@link XOR }
     * 
     */
    public XOR createXOR() {
        return new XOR();
    }

    /**
     * Create an instance of {@link Divide }
     * 
     */
    public Divide createDivide() {
        return new Divide();
    }

    /**
     * Create an instance of {@link Subtract }
     * 
     */
    public Subtract createSubtract() {
        return new Subtract();
    }

    /**
     * Create an instance of {@link NumberFault }
     * 
     */
    public NumberFault createNumberFault() {
        return new NumberFault();
    }

    /**
     * Create an instance of {@link SubtractResponse }
     * 
     */
    public SubtractResponse createSubtractResponse() {
        return new SubtractResponse();
    }

    /**
     * Create an instance of {@link Multiply }
     * 
     */
    public Multiply createMultiply() {
        return new Multiply();
    }

    /**
     * Create an instance of {@link IsGraterThan }
     * 
     */
    public IsGraterThan createIsGraterThan() {
        return new IsGraterThan();
    }

    /**
     * Create an instance of {@link XORResponse }
     * 
     */
    public XORResponse createXORResponse() {
        return new XORResponse();
    }

    /**
     * Create an instance of {@link XAND }
     * 
     */
    public XAND createXAND() {
        return new XAND();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link IsLessThanResponse }
     * 
     */
    public IsLessThanResponse createIsLessThanResponse() {
        return new IsLessThanResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<DivideResponse>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "NumberFault")
    public JAXBElement<NumberFault> createNumberFault(NumberFault value) {
        return new JAXBElement<NumberFault>(_NumberFault_QNAME, NumberFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XANDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "xANDResponse")
    public JAXBElement<XANDResponse> createXANDResponse(XANDResponse value) {
        return new JAXBElement<XANDResponse>(_XANDResponse_QNAME, XANDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XOR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "xOR")
    public JAXBElement<XOR> createXOR(XOR value) {
        return new JAXBElement<XOR>(_XOR_QNAME, XOR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsEqualTo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "isEqualTo")
    public JAXBElement<IsEqualTo> createIsEqualTo(IsEqualTo value) {
        return new JAXBElement<IsEqualTo>(_IsEqualTo_QNAME, IsEqualTo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsLessThanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "isLessThanResponse")
    public JAXBElement<IsLessThanResponse> createIsLessThanResponse(IsLessThanResponse value) {
        return new JAXBElement<IsLessThanResponse>(_IsLessThanResponse_QNAME, IsLessThanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XORResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "xORResponse")
    public JAXBElement<XORResponse> createXORResponse(XORResponse value) {
        return new JAXBElement<XORResponse>(_XORResponse_QNAME, XORResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "subtract")
    public JAXBElement<Subtract> createSubtract(Subtract value) {
        return new JAXBElement<Subtract>(_Subtract_QNAME, Subtract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsGraterThan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "isGraterThan")
    public JAXBElement<IsGraterThan> createIsGraterThan(IsGraterThan value) {
        return new JAXBElement<IsGraterThan>(_IsGraterThan_QNAME, IsGraterThan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "subtractResponse")
    public JAXBElement<SubtractResponse> createSubtractResponse(SubtractResponse value) {
        return new JAXBElement<SubtractResponse>(_SubtractResponse_QNAME, SubtractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsLessThan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "isLessThan")
    public JAXBElement<IsLessThan> createIsLessThan(IsLessThan value) {
        return new JAXBElement<IsLessThan>(_IsLessThan_QNAME, IsLessThan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<Divide>(_Divide_QNAME, Divide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsGraterThanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "isGraterThanResponse")
    public JAXBElement<IsGraterThanResponse> createIsGraterThanResponse(IsGraterThanResponse value) {
        return new JAXBElement<IsGraterThanResponse>(_IsGraterThanResponse_QNAME, IsGraterThanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsEqualToResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "isEqualToResponse")
    public JAXBElement<IsEqualToResponse> createIsEqualToResponse(IsEqualToResponse value) {
        return new JAXBElement<IsEqualToResponse>(_IsEqualToResponse_QNAME, IsEqualToResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAND }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:11305/CalculatorService/Calculator", name = "xAND")
    public JAXBElement<XAND> createXAND(XAND value) {
        return new JAXBElement<XAND>(_XAND_QNAME, XAND.class, null, value);
    }

}
