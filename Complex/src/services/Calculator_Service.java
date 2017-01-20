
package services;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "Calculator", targetNamespace = "http://localhost:11305/CalculatorService/Calculator", wsdlLocation = "http://localhost:11305/CalculatorService/Calculator?wsdl")
public class Calculator_Service
    extends Service
{

    private final static URL CALCULATOR_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(services.Calculator_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = services.Calculator_Service.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:11305/CalculatorService/Calculator?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:11305/CalculatorService/Calculator?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CALCULATOR_WSDL_LOCATION = url;
    }

    public Calculator_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Calculator_Service() {
        super(CALCULATOR_WSDL_LOCATION, new QName("http://localhost:11305/CalculatorService/Calculator", "Calculator"));
    }

    /**
     * 
     * @return
     *     returns Calculator
     */
    @WebEndpoint(name = "CalculatorPort")
    public Calculator getCalculatorPort() {
        return super.getPort(new QName("http://localhost:11305/CalculatorService/Calculator", "CalculatorPort"), Calculator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calculator
     */
    @WebEndpoint(name = "CalculatorPort")
    public Calculator getCalculatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost:11305/CalculatorService/Calculator", "CalculatorPort"), Calculator.class, features);
    }

}
