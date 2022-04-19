package core.gdsbookingengine.clients;

import org.apache.commons.lang3.StringEscapeUtils;
import org.w3c.dom.Document;

import javax.xml.bind.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class XmlUtils {
//  String namespace = "\"http://traveltalk.com/wsLowFareMatrix\"";
  //String tagName = "wmLowFareMatrixXml";

  public static XMLGregorianCalendar
  toXMLGregorianCalendar(LocalDateTime dateTime) {
    XMLGregorianCalendar calendar;
    try {
      GregorianCalendar gregorianCalendar =
          new GregorianCalendar(dateTime.getYear(),
              dateTime.getMonthValue(),
              dateTime.getDayOfMonth());

      calendar = DatatypeFactory.newInstance()
          .newXMLGregorianCalendar(gregorianCalendar);
      return  calendar;
    } catch(DatatypeConfigurationException e) {
      throw new RuntimeException(e);
    }
  }

  public static String removeXmlTag(String xmlString,int from) {
    String modifiedXML = "";
    String[] travels = convertXmlStringToArray(xmlString);
    String[] travelsCopy = Arrays
        .copyOfRange(travels, from, travels.length - (from - 1));

    for (String s : travelsCopy) {
      modifiedXML += s + "\n";
    }
    return modifiedXML.trim();
  }

  private static String[] convertXmlStringToArray(String xmlString) {
    return xmlString.split("\n");
  }

  public static <T> String convertToXmlString(T object, String namespace, String tagName) {
    String response;
    try {
      Class objectClass = object.getClass();
      JAXBContext context = JAXBContext.newInstance(objectClass);
      Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
      QName qName = new QName(namespace, tagName);
      JAXBElement<T> root =
          new JAXBElement<>( qName, objectClass,
              object);

      StringWriter writer = new StringWriter();
      marshaller.marshal(root, writer);
      response =  StringEscapeUtils.unescapeXml(writer.toString());
    } catch(JAXBException jaxbEx) {throw new RuntimeException(jaxbEx);}
    return StringEscapeUtils.unescapeXml(response);
  }

  public static <T> String convertToXmlString2(T object, String namespace, String tagName) {
    String response;
    try {
      Class objectClass = object.getClass();
      JAXBContext context = JAXBContext.newInstance(objectClass);
      Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
      QName qName = new QName(namespace, tagName);
      JAXBElement<T> root =
          new JAXBElement<>( qName, objectClass,
              object);

      StringWriter writer = new StringWriter();
      marshaller.marshal(root, writer);
      response = writer.toString();
    } catch(JAXBException jaxbEx) {throw new RuntimeException(jaxbEx);}
    return StringEscapeUtils.unescapeXml(response);
  }

  public static <T> T convertToType(Document document) {
    T responseXml;
    try {
      Unmarshaller unMarshaller = JAXBContext
          .newInstance().createUnmarshaller();

     responseXml = (T) unMarshaller.unmarshal(document);

    } catch(JAXBException jaxbEx) {throw new RuntimeException(jaxbEx);}
    return responseXml;
  }
}
