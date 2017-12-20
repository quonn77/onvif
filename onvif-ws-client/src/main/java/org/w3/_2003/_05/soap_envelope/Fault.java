
package org.w3._2003._05.soap_envelope;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	    Fault reporting structure
 * 	  
 * 
 * <p>Classe Java per Fault complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Fault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2003/05/soap-envelope}faultcode"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2003/05/soap-envelope}faultreason"/&gt;
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="Detail" type="{http://www.w3.org/2003/05/soap-envelope}detail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", propOrder = {
    "code",
    "reason",
    "node",
    "role",
    "detail"
})
public class Fault {

    @XmlElement(name = "Code", required = true)
    protected Faultcode code;
    @XmlElement(name = "Reason", required = true)
    protected Faultreason reason;
    @XmlElement(name = "Node")
    @XmlSchemaType(name = "anyURI")
    protected String node;
    @XmlElement(name = "Role")
    @XmlSchemaType(name = "anyURI")
    protected String role;
    @XmlElement(name = "Detail")
    protected Detail detail;

    /**
     * Recupera il valore della proprietà code.
     * 
     * @return
     *     possible object is
     *     {@link Faultcode }
     *     
     */
    public Faultcode getCode() {
        return code;
    }

    /**
     * Imposta il valore della proprietà code.
     * 
     * @param value
     *     allowed object is
     *     {@link Faultcode }
     *     
     */
    public void setCode(Faultcode value) {
        this.code = value;
    }

    /**
     * Recupera il valore della proprietà reason.
     * 
     * @return
     *     possible object is
     *     {@link Faultreason }
     *     
     */
    public Faultreason getReason() {
        return reason;
    }

    /**
     * Imposta il valore della proprietà reason.
     * 
     * @param value
     *     allowed object is
     *     {@link Faultreason }
     *     
     */
    public void setReason(Faultreason value) {
        this.reason = value;
    }

    /**
     * Recupera il valore della proprietà node.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Imposta il valore della proprietà node.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Recupera il valore della proprietà role.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Imposta il valore della proprietà role.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Recupera il valore della proprietà detail.
     * 
     * @return
     *     possible object is
     *     {@link Detail }
     *     
     */
    public Detail getDetail() {
        return detail;
    }

    /**
     * Imposta il valore della proprietà detail.
     * 
     * @param value
     *     allowed object is
     *     {@link Detail }
     *     
     */
    public void setDetail(Detail value) {
        this.detail = value;
    }

}
