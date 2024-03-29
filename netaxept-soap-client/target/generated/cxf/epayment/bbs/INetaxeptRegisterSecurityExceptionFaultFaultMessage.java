
package epayment.bbs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2022-09-08T10:34:38.780Z
 * Generated source version: 3.1.10
 */

@WebFault(name = "SecurityException", targetNamespace = "http://schemas.datacontract.org/2004/07/BBS.EPayment.ServiceLibrary")
public class INetaxeptRegisterSecurityExceptionFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.bbs_epayment.SecurityException securityException;

    public INetaxeptRegisterSecurityExceptionFaultFaultMessage() {
        super();
    }
    
    public INetaxeptRegisterSecurityExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public INetaxeptRegisterSecurityExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public INetaxeptRegisterSecurityExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.SecurityException securityException) {
        super(message);
        this.securityException = securityException;
    }

    public INetaxeptRegisterSecurityExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.SecurityException securityException, Throwable cause) {
        super(message, cause);
        this.securityException = securityException;
    }

    public org.datacontract.schemas._2004._07.bbs_epayment.SecurityException getFaultInfo() {
        return this.securityException;
    }
}
