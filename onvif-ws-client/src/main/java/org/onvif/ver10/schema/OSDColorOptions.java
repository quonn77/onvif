
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * Describe the option of the color and its transparency.
 * 
 * <p>Classe Java per OSDColorOptions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OSDColorOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Color" type="{http://www.onvif.org/ver10/schema}ColorOptions" minOccurs="0"/&gt;
 *         &lt;element name="Transparent" type="{http://www.onvif.org/ver10/schema}IntRange" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDColorOptionsExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OSDColorOptions", propOrder = {
    "color",
    "transparent",
    "extension"
})
public class OSDColorOptions {

    @XmlElement(name = "Color")
    protected ColorOptions color;
    @XmlElement(name = "Transparent")
    protected IntRange transparent;
    @XmlElement(name = "Extension")
    protected OSDColorOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà color.
     * 
     * @return
     *     possible object is
     *     {@link ColorOptions }
     *     
     */
    public ColorOptions getColor() {
        return color;
    }

    /**
     * Imposta il valore della proprietà color.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorOptions }
     *     
     */
    public void setColor(ColorOptions value) {
        this.color = value;
    }

    /**
     * Recupera il valore della proprietà transparent.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getTransparent() {
        return transparent;
    }

    /**
     * Imposta il valore della proprietà transparent.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setTransparent(IntRange value) {
        this.transparent = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link OSDColorOptionsExtension }
     *     
     */
    public OSDColorOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDColorOptionsExtension }
     *     
     */
    public void setExtension(OSDColorOptionsExtension value) {
        this.extension = value;
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
