
package nl.surf.polynsi.soap.connection.provider;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-02-21T11:15:34.692+01:00
 * Generated source version: 3.3.5
 */

@WebFault(name = "error", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types")
public class Error extends Exception {

    private nl.surf.polynsi.soap.connection.types.GenericErrorType error;

    public Error() {
        super();
    }

    public Error(String message) {
        super(message);
    }

    public Error(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public Error(String message, nl.surf.polynsi.soap.connection.types.GenericErrorType error) {
        super(message);
        this.error = error;
    }

    public Error(String message, nl.surf.polynsi.soap.connection.types.GenericErrorType error, java.lang.Throwable cause) {
        super(message, cause);
        this.error = error;
    }

    public nl.surf.polynsi.soap.connection.types.GenericErrorType getFaultInfo() {
        return this.error;
    }
}