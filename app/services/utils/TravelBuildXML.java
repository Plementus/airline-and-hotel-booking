package services.utils;

import javax.xml.bind.annotation.XmlElement;

public class TravelBuildXML {

  private XMLRequest xmlRequest;

  public XMLRequest getXmlRequest() {
    return xmlRequest;
  }

  @XmlElement(name="xmlRequest", namespace="http://traveltalk.com/wsTravelBuild")
  public void setXmlRequest(XMLRequest xmlRequest) {
    this.xmlRequest = xmlRequest;
  }
}