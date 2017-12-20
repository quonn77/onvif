package org.onvif.ver10.doorcontrol.wsdl;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-12-20T19:13:33.671+01:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "DoorControlService", 
                  targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl") 
public class DoorControlService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.onvif.org/ver10/doorcontrol/wsdl", "DoorControlService");
    public final static QName DoorControlPort = new QName("http://www.onvif.org/ver10/doorcontrol/wsdl", "DoorControlPort");
    static {
        WSDL_LOCATION = null;
    }

    public DoorControlService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DoorControlService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DoorControlService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public DoorControlService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DoorControlService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DoorControlService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns DoorControlPort
     */
    @WebEndpoint(name = "DoorControlPort")
    public DoorControlPort getDoorControlPort() {
        return super.getPort(DoorControlPort, DoorControlPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DoorControlPort
     */
    @WebEndpoint(name = "DoorControlPort")
    public DoorControlPort getDoorControlPort(WebServiceFeature... features) {
        return super.getPort(DoorControlPort, DoorControlPort.class, features);
    }

}
