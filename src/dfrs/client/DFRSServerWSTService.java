
package dfrs.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DFRSServerWSTService", targetNamespace = "http://server.dfrs", wsdlLocation = "http://localhost:1051/dfrs?wsdl")
public class DFRSServerWSTService
    extends Service
{

    private final static URL DFRSSERVERWSTSERVICE_WSDL_LOCATION;
    private final static WebServiceException DFRSSERVERWSTSERVICE_EXCEPTION;
    private final static QName DFRSSERVERWSTSERVICE_QNAME = new QName("http://server.dfrs", "DFRSServerWSTService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1051/dfrs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DFRSSERVERWSTSERVICE_WSDL_LOCATION = url;
        DFRSSERVERWSTSERVICE_EXCEPTION = e;
    }

    public DFRSServerWSTService() {
        super(__getWsdlLocation(), DFRSSERVERWSTSERVICE_QNAME);
    }

    public DFRSServerWSTService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DFRSSERVERWSTSERVICE_QNAME, features);
    }

    public DFRSServerWSTService(URL wsdlLocation) {
        super(wsdlLocation, DFRSSERVERWSTSERVICE_QNAME);
    }

    public DFRSServerWSTService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DFRSSERVERWSTSERVICE_QNAME, features);
    }

    public DFRSServerWSTService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DFRSServerWSTService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IDFRSService
     */
    @WebEndpoint(name = "DFRSServerWSTPort")
    public IDFRSService getDFRSServerWSTPort() {
        return super.getPort(new QName("http://server.dfrs", "DFRSServerWSTPort"), IDFRSService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IDFRSService
     */
    @WebEndpoint(name = "DFRSServerWSTPort")
    public IDFRSService getDFRSServerWSTPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.dfrs", "DFRSServerWSTPort"), IDFRSService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DFRSSERVERWSTSERVICE_EXCEPTION!= null) {
            throw DFRSSERVERWSTSERVICE_EXCEPTION;
        }
        return DFRSSERVERWSTSERVICE_WSDL_LOCATION;
    }

}
