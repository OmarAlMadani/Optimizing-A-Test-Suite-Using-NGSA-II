/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import java.io.Serializable;
import javax.xml.ws.WebFault;

/**
 *
 * @author mustafa
 */
@WebFault(name="NumberFault", targetNamespace="http://localhost:11305/CalculatorService/Calculator")
public class NumberFault extends Exception implements Serializable {    

   /**
     * Java type that goes as soapenv:Fault detail element.
     */
    

    public NumberFault(){       
        super("No more keys left");
    }

    public NumberFault(String message, Throwable cause){
        super(message,cause);
    }
    
}