
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Queue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Queue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Queue")
public class Queue {

    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    @XmlAttribute(name = "QueueNumber")
    protected String queueNumber;
    @XmlAttribute(name = "QueueCategory")
    protected String queueCategory;

    /**
     * Gets the value of the pseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * Gets the value of the queueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueNumber() {
        return queueNumber;
    }

    /**
     * Sets the value of the queueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueNumber(String value) {
        this.queueNumber = value;
    }

    /**
     * Gets the value of the queueCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueCategory() {
        return queueCategory;
    }

    /**
     * Sets the value of the queueCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueCategory(String value) {
        this.queueCategory = value;
    }

}
