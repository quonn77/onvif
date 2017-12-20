
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
 * <p>Classe Java per VideoDecoderConfigurationOptions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VideoDecoderConfigurationOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JpegDecOptions" type="{http://www.onvif.org/ver10/schema}JpegDecOptions" minOccurs="0"/&gt;
 *         &lt;element name="H264DecOptions" type="{http://www.onvif.org/ver10/schema}H264DecOptions" minOccurs="0"/&gt;
 *         &lt;element name="Mpeg4DecOptions" type="{http://www.onvif.org/ver10/schema}Mpeg4DecOptions" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoDecoderConfigurationOptionsExtension" minOccurs="0"/&gt;
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
@XmlType(name = "VideoDecoderConfigurationOptions", propOrder = {
    "jpegDecOptions",
    "h264DecOptions",
    "mpeg4DecOptions",
    "extension"
})
public class VideoDecoderConfigurationOptions {

    @XmlElement(name = "JpegDecOptions")
    protected JpegDecOptions jpegDecOptions;
    @XmlElement(name = "H264DecOptions")
    protected H264DecOptions h264DecOptions;
    @XmlElement(name = "Mpeg4DecOptions")
    protected Mpeg4DecOptions mpeg4DecOptions;
    @XmlElement(name = "Extension")
    protected VideoDecoderConfigurationOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà jpegDecOptions.
     * 
     * @return
     *     possible object is
     *     {@link JpegDecOptions }
     *     
     */
    public JpegDecOptions getJpegDecOptions() {
        return jpegDecOptions;
    }

    /**
     * Imposta il valore della proprietà jpegDecOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JpegDecOptions }
     *     
     */
    public void setJpegDecOptions(JpegDecOptions value) {
        this.jpegDecOptions = value;
    }

    /**
     * Recupera il valore della proprietà h264DecOptions.
     * 
     * @return
     *     possible object is
     *     {@link H264DecOptions }
     *     
     */
    public H264DecOptions getH264DecOptions() {
        return h264DecOptions;
    }

    /**
     * Imposta il valore della proprietà h264DecOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link H264DecOptions }
     *     
     */
    public void setH264DecOptions(H264DecOptions value) {
        this.h264DecOptions = value;
    }

    /**
     * Recupera il valore della proprietà mpeg4DecOptions.
     * 
     * @return
     *     possible object is
     *     {@link Mpeg4DecOptions }
     *     
     */
    public Mpeg4DecOptions getMpeg4DecOptions() {
        return mpeg4DecOptions;
    }

    /**
     * Imposta il valore della proprietà mpeg4DecOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Mpeg4DecOptions }
     *     
     */
    public void setMpeg4DecOptions(Mpeg4DecOptions value) {
        this.mpeg4DecOptions = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link VideoDecoderConfigurationOptionsExtension }
     *     
     */
    public VideoDecoderConfigurationOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoDecoderConfigurationOptionsExtension }
     *     
     */
    public void setExtension(VideoDecoderConfigurationOptionsExtension value) {
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
