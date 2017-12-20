
package org.xmlsoap.schemas.ws._2005._04.discovery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;
import org.xmlsoap.schemas.ws._2004._08.addressing.EndpointReferenceType;


/**
 * <p>Classe Java per ByeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ByeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2004/08/addressing}EndpointReference"/&gt;
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2005/04/discovery}Types" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2005/04/discovery}Scopes" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2005/04/discovery}XAddrs" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2005/04/discovery}MetadataVersion" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByeType", propOrder = {
    "endpointReference",
    "types",
    "scopes",
    "xAddrs",
    "metadataVersion",
    "any"
})
public class ByeType {

    @XmlElement(name = "EndpointReference", namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", required = true)
    protected EndpointReferenceType endpointReference;
    @XmlList
    @XmlElement(name = "Types")
    @XmlSchemaType(name = "anySimpleType")
    protected List<QName> types;
    @XmlElement(name = "Scopes")
    protected ScopesType scopes;
    @XmlList
    @XmlElement(name = "XAddrs")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> xAddrs;
    @XmlElement(name = "MetadataVersion")
    @XmlSchemaType(name = "unsignedInt")
    protected Long metadataVersion;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà endpointReference.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getEndpointReference() {
        return endpointReference;
    }

    /**
     * Imposta il valore della proprietà endpointReference.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setEndpointReference(EndpointReferenceType value) {
        this.endpointReference = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getTypes() {
        if (types == null) {
            types = new ArrayList<QName>();
        }
        return this.types;
    }

    /**
     * Recupera il valore della proprietà scopes.
     * 
     * @return
     *     possible object is
     *     {@link ScopesType }
     *     
     */
    public ScopesType getScopes() {
        return scopes;
    }

    /**
     * Imposta il valore della proprietà scopes.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopesType }
     *     
     */
    public void setScopes(ScopesType value) {
        this.scopes = value;
    }

    /**
     * Gets the value of the xAddrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xAddrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXAddrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getXAddrs() {
        if (xAddrs == null) {
            xAddrs = new ArrayList<String>();
        }
        return this.xAddrs;
    }

    /**
     * Recupera il valore della proprietà metadataVersion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMetadataVersion() {
        return metadataVersion;
    }

    /**
     * Imposta il valore della proprietà metadataVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMetadataVersion(Long value) {
        this.metadataVersion = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
