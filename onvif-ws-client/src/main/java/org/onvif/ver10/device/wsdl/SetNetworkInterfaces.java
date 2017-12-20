
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.NetworkInterfaceSetConfiguration;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InterfaceToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="NetworkInterface" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceSetConfiguration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "interfaceToken",
    "networkInterface"
})
@XmlRootElement(name = "SetNetworkInterfaces")
public class SetNetworkInterfaces {

    @XmlElement(name = "InterfaceToken", required = true)
    protected String interfaceToken;
    @XmlElement(name = "NetworkInterface", required = true)
    protected NetworkInterfaceSetConfiguration networkInterface;

    /**
     * Recupera il valore della proprietà interfaceToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceToken() {
        return interfaceToken;
    }

    /**
     * Imposta il valore della proprietà interfaceToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceToken(String value) {
        this.interfaceToken = value;
    }

    /**
     * Recupera il valore della proprietà networkInterface.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceSetConfiguration }
     *     
     */
    public NetworkInterfaceSetConfiguration getNetworkInterface() {
        return networkInterface;
    }

    /**
     * Imposta il valore della proprietà networkInterface.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceSetConfiguration }
     *     
     */
    public void setNetworkInterface(NetworkInterfaceSetConfiguration value) {
        this.networkInterface = value;
    }

}
