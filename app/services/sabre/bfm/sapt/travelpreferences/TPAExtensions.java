/**
 * Created by Babatunde on 4/8/2016.
 */

package services.sabre.bfm.sapt.travelpreferences;

import services.sabre.bfm.sapt.AllianceType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExcludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "includeAlliancePref",
    "excludeAlliancePref"
})
public class TPAExtensions {

  @XmlElement(name = "IncludeAlliancePref")
  protected List<AllianceType> includeAlliancePref;
  @XmlElement(name = "ExcludeAlliancePref")
  protected List<AllianceType> excludeAlliancePref;

  /**
   * Gets the value of the includeAlliancePref property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the includeAlliancePref property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getIncludeAlliancePref().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link AllianceType }
   *
   *
   */
  public List<AllianceType> getIncludeAlliancePref() {
    if (includeAlliancePref == null) {
      includeAlliancePref = new ArrayList<AllianceType>();
    }
    return this.includeAlliancePref;
  }

  /**
   * Gets the value of the excludeAlliancePref property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the excludeAlliancePref property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getExcludeAlliancePref().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link AllianceType }
   *
   *
   */
  public List<AllianceType> getExcludeAlliancePref() {
    if (excludeAlliancePref == null) {
      excludeAlliancePref = new ArrayList<AllianceType>();
    }
    return this.excludeAlliancePref;
  }

}