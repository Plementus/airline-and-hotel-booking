
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TimeSpanRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSpanRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateWindowRange" type="{http://traveltalk.com/wsTravelBuild}DateWindowRangeRS" minOccurs="0"/>
 *         &lt;element name="StartDateWindow" type="{http://traveltalk.com/wsTravelBuild}StartDateWindowRS" minOccurs="0"/>
 *         &lt;element name="EndDateWindow" type="{http://traveltalk.com/wsTravelBuild}EndDateWindowRS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSpanRS", propOrder = {
    "dateWindowRange",
    "startDateWindow",
    "endDateWindow"
})
public class TimeSpanRS {

    @XmlElement(name = "DateWindowRange")
    protected DateWindowRangeRS dateWindowRange;
    @XmlElement(name = "StartDateWindow")
    protected StartDateWindowRS startDateWindow;
    @XmlElement(name = "EndDateWindow")
    protected EndDateWindowRS endDateWindow;
    @XmlAttribute(name = "Start")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar end;

    /**
     * Gets the value of the dateWindowRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateWindowRangeRS }
     *     
     */
    public DateWindowRangeRS getDateWindowRange() {
        return dateWindowRange;
    }

    /**
     * Sets the value of the dateWindowRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateWindowRangeRS }
     *     
     */
    public void setDateWindowRange(DateWindowRangeRS value) {
        this.dateWindowRange = value;
    }

    /**
     * Gets the value of the startDateWindow property.
     * 
     * @return
     *     possible object is
     *     {@link StartDateWindowRS }
     *     
     */
    public StartDateWindowRS getStartDateWindow() {
        return startDateWindow;
    }

    /**
     * Sets the value of the startDateWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDateWindowRS }
     *     
     */
    public void setStartDateWindow(StartDateWindowRS value) {
        this.startDateWindow = value;
    }

    /**
     * Gets the value of the endDateWindow property.
     * 
     * @return
     *     possible object is
     *     {@link EndDateWindowRS }
     *     
     */
    public EndDateWindowRS getEndDateWindow() {
        return endDateWindow;
    }

    /**
     * Sets the value of the endDateWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDateWindowRS }
     *     
     */
    public void setEndDateWindow(EndDateWindowRS value) {
        this.endDateWindow = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

}
