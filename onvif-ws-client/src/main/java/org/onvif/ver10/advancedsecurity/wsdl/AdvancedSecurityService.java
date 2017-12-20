package org.onvif.ver10.advancedsecurity.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * Common functionality for all advanced security service parts.
 *
 * This class was generated by Apache CXF 3.1.10
 * 2017-12-20T19:13:35.996+01:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://www.onvif.org/ver10/advancedsecurity/wsdl", name = "AdvancedSecurityService")
@XmlSeeAlso({ObjectFactory.class})
public interface AdvancedSecurityService {

    /**
     * Returns the capabilities of the advanced security service. The result is returned in a typed answer.
     */
    @WebMethod(operationName = "GetServiceCapabilities", action = "http://www.onvif.org/ver10/advancedsecurity/wsdl/GetServiceCapabilities")
    @RequestWrapper(localName = "GetServiceCapabilities", targetNamespace = "http://www.onvif.org/ver10/advancedsecurity/wsdl", className = "org.onvif.ver10.advancedsecurity.wsdl.GetServiceCapabilities")
    @ResponseWrapper(localName = "GetServiceCapabilitiesResponse", targetNamespace = "http://www.onvif.org/ver10/advancedsecurity/wsdl", className = "org.onvif.ver10.advancedsecurity.wsdl.GetServiceCapabilitiesResponse")
    @WebResult(name = "Capabilities", targetNamespace = "http://www.onvif.org/ver10/advancedsecurity/wsdl")
    public org.onvif.ver10.advancedsecurity.wsdl.Capabilities getServiceCapabilities();
}
