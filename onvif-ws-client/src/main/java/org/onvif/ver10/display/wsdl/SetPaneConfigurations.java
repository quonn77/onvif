
package org.onvif.ver10.display.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PaneConfiguration;


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
 *         &lt;element name="VideoOutput" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="PaneConfiguration" type="{http://www.onvif.org/ver10/schema}PaneConfiguration" maxOccurs="unbounded"/&gt;
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
    "videoOutput",
    "paneConfiguration"
})
@XmlRootElement(name = "SetPaneConfigurations")
public class SetPaneConfigurations {

    @XmlElement(name = "VideoOutput", required = true)
    protected String videoOutput;
    @XmlElement(name = "PaneConfiguration", required = true)
    protected List<PaneConfiguration> paneConfiguration;

    /**
     * Recupera il valore della proprietà videoOutput.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoOutput() {
        return videoOutput;
    }

    /**
     * Imposta il valore della proprietà videoOutput.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoOutput(String value) {
        this.videoOutput = value;
    }

    /**
     * Gets the value of the paneConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paneConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaneConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaneConfiguration }
     * 
     * 
     */
    public List<PaneConfiguration> getPaneConfiguration() {
        if (paneConfiguration == null) {
            paneConfiguration = new ArrayList<PaneConfiguration>();
        }
        return this.paneConfiguration;
    }

}
