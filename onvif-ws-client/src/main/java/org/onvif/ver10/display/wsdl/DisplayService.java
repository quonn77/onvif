package org.onvif.ver10.display.wsdl;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-12-20T19:13:29.587+01:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "DisplayService", 
                  targetNamespace = "http://www.onvif.org/ver10/display/wsdl") 
public class DisplayService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.onvif.org/ver10/display/wsdl", "DisplayService");
    public final static QName DisplayPort = new QName("http://www.onvif.org/ver10/display/wsdl", "DisplayPort");
    static {
        WSDL_LOCATION = null;
    }

    public DisplayService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DisplayService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DisplayService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public DisplayService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DisplayService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DisplayService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns DisplayPort
     */
    @WebEndpoint(name = "DisplayPort")
    public DisplayPort getDisplayPort() {
        return super.getPort(DisplayPort, DisplayPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DisplayPort
     */
    @WebEndpoint(name = "DisplayPort")
    public DisplayPort getDisplayPort(WebServiceFeature... features) {
        return super.getPort(DisplayPort, DisplayPort.class, features);
    }

}
