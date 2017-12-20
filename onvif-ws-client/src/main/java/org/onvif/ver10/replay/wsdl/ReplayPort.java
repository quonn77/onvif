package org.onvif.ver10.replay.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-12-20T19:13:27.118+01:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://www.onvif.org/ver10/replay/wsdl", name = "ReplayPort")
@XmlSeeAlso({org.oasis_open.docs.wsrf.bf_2.ObjectFactory.class, org.w3._2004._08.xop.include.ObjectFactory.class, ObjectFactory.class, org.onvif.ver10.schema.ObjectFactory.class, org.oasis_open.docs.wsn.b_2.ObjectFactory.class, org.oasis_open.docs.wsn.t_1.ObjectFactory.class, org.w3._2003._05.soap_envelope.ObjectFactory.class, org.w3._2005._05.xmlmime.ObjectFactory.class})
public interface ReplayPort {

    /**
     * Returns the capabilities of the replay service. The result is returned in a typed answer.
     */
    @WebMethod(operationName = "GetServiceCapabilities", action = "http://www.onvif.org/ver10/replay/wsdl/GetServiceCapabilities")
    @RequestWrapper(localName = "GetServiceCapabilities", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl", className = "org.onvif.ver10.replay.wsdl.GetServiceCapabilities")
    @ResponseWrapper(localName = "GetServiceCapabilitiesResponse", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl", className = "org.onvif.ver10.replay.wsdl.GetServiceCapabilitiesResponse")
    @WebResult(name = "Capabilities", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl")
    public org.onvif.ver10.replay.wsdl.Capabilities getServiceCapabilities();

    /**
     * Requests a URI that can be used to initiate playback of a recorded stream
     * 				using RTSP as the control protocol. The URI is valid only as it is
     * 				specified in the response.
     * 				This operation is mandatory.
     * 			
     */
    @WebMethod(operationName = "GetReplayUri", action = "http://www.onvif.org/ver10/replay/wsdl/GetReplayUri")
    @RequestWrapper(localName = "GetReplayUri", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl", className = "org.onvif.ver10.replay.wsdl.GetReplayUri")
    @ResponseWrapper(localName = "GetReplayUriResponse", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl", className = "org.onvif.ver10.replay.wsdl.GetReplayUriResponse")
    @WebResult(name = "Uri", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl")
    public java.lang.String getReplayUri(
        @WebParam(name = "StreamSetup", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl")
        org.onvif.ver10.schema.StreamSetup streamSetup,
        @WebParam(name = "RecordingToken", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl")
        java.lang.String recordingToken
    );

    /**
     * Returns the current configuration of the replay service.
     * 				This operation is mandatory.
     * 			
     */
    @WebMethod(operationName = "GetReplayConfiguration", action = "http://www.onvif.org/ver10/replay/wsdl/GetReplayConfiguration")
    @RequestWrapper(localName = "GetReplayConfiguration", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl", className = "org.onvif.ver10.replay.wsdl.GetReplayConfiguration")
    @ResponseWrapper(localName = "GetReplayConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl", className = "org.onvif.ver10.replay.wsdl.GetReplayConfigurationResponse")
    @WebResult(name = "Configuration", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl")
    public org.onvif.ver10.schema.ReplayConfiguration getReplayConfiguration();

    /**
     * Changes the current configuration of the replay service.
     * 				This operation is mandatory.
     * 			
     */
    @WebMethod(operationName = "SetReplayConfiguration", action = "http://www.onvif.org/ver10/replay/wsdl/SetReplayConfiguration")
    @RequestWrapper(localName = "SetReplayConfiguration", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl", className = "org.onvif.ver10.replay.wsdl.SetReplayConfiguration")
    @ResponseWrapper(localName = "SetReplayConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl", className = "org.onvif.ver10.replay.wsdl.SetReplayConfigurationResponse")
    public void setReplayConfiguration(
        @WebParam(name = "Configuration", targetNamespace = "http://www.onvif.org/ver10/replay/wsdl")
        org.onvif.ver10.schema.ReplayConfiguration configuration
    );
}
