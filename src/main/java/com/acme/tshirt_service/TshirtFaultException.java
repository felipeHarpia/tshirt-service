
package com.acme.tshirt_service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.2
 * 2020-03-30T14:33:56.659-03:00
 * Generated source version: 3.3.2
 */

@WebFault(name = "TshirtFault", targetNamespace = "http://acme.com/tshirt-service")
public class TshirtFaultException extends Exception {

    private com.acme.tshirt_service.TshirtFault tshirtFault;

    public TshirtFaultException() {
        super();
    }

    public TshirtFaultException(String message) {
        super(message);
    }

    public TshirtFaultException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public TshirtFaultException(String message, com.acme.tshirt_service.TshirtFault tshirtFault) {
        super(message);
        this.tshirtFault = tshirtFault;
    }

    public TshirtFaultException(String message, com.acme.tshirt_service.TshirtFault tshirtFault, java.lang.Throwable cause) {
        super(message, cause);
        this.tshirtFault = tshirtFault;
    }

    public com.acme.tshirt_service.TshirtFault getFaultInfo() {
        return this.tshirtFault;
    }
}
