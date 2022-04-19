/**
 * Created by Ibrahim Olanrewaju on 2/27/2016.
 */
package services.sabre.utils

import java.time.LocalDateTime
import java.util.UUID
import play.api.Play
import play.api.Play.current

import scala.xml.Node

object SabreXMLRequestUtils extends SabreXMLRequestUtils

trait SabreXMLRequestUtils {
  protected val config = Play.configuration
  val ENDPOINT_URL = config.getString("sabre.endpoint").get
  val SERVICE_TYPE= config.getString("sabre.serviceType").get
  val DOMAIN = config.getString("sabre.domain").get
  val SABRE_PCC = config.getString("sabre.pcc").get
  val USERNAME = config.getString("sabre.username").get
  val PASSWORD = config.getString("sabre.password").get
  val CONVERSATION_ID = config.getString("sabre.conversationId").get
  val PARTY_ID_TYPE = config.getString("sabre.partyIdType").get
  val PARTY_ID_TO = config.getString("sabre.partyIdTo").get
  val PARTY_ID_FROM = config.getString("sabre.partyIdFrom").get
  val CURRENCY = config.getString("sabre.currency").get
  val AGENCY_NAME = config.getString("sabre.agency.name").get

  protected def getMessageId: String = UUID.randomUUID.toString + "@travelfix.co"
  protected def getMessageTimeStamp: String = LocalDateTime.now.toString + "Z"

  def sessionCreateXmlRequest = {
    val service = "SessionCreateRQ"
    val action = "SessionCreateRQ"
    val description = "Session Creation Service"
    val sessionCreate = {
      <SessionCreateRQ returnContextID="true">
        <POS>
          <Source PseudoCityCode={SABRE_PCC}/>
        </POS>
      </SessionCreateRQ>
    }
    soapTemplate(service, action, description, sessionCreate)
  }

  def soapTemplate(service: String, action: String, description: String, body: Node) = {
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                      xmlns:sec="http://schemas.xmlsoap.org/ws/2002/12/secext"
                      xmlns:mes="http://www.ebxml.org/namespaces/messageHeader"
                      xmlns:ns="http://www.opentravel.org/OTA/2003/05">
      <soapenv:Header>
        <sec:Security>
          <sec:UsernameToken>
            <sec:Username>{USERNAME}</sec:Username>
            <sec:Password>{PASSWORD}</sec:Password>
            <Organization>{SABRE_PCC}</Organization>
            <Domain>{DOMAIN}</Domain>
          </sec:UsernameToken>
        </sec:Security>
        <mes:MessageHeader mes:id={getMessageId} mes:version="2.0">
          <mes:From>
            <mes:PartyId mes:type={PARTY_ID_TYPE}>{PARTY_ID_FROM}</mes:PartyId>
          </mes:From>
          <mes:To>
            <mes:PartyId mes:type={PARTY_ID_TYPE}>{PARTY_ID_TO}</mes:PartyId>
          </mes:To>
          <mes:CPAId>{SABRE_PCC}</mes:CPAId>
          <mes:ConversationId>{CONVERSATION_ID}</mes:ConversationId>
          <mes:Service mes:type={SERVICE_TYPE}>{service}</mes:Service>
          <mes:Action>{action}</mes:Action>
          <mes:MessageData>
            <mes:MessageId>{getMessageId}</mes:MessageId>
            <mes:Timestamp>{getMessageTimeStamp}</mes:Timestamp>
          </mes:MessageData>
          <mes:Description xml:lang="en">{description}</mes:Description>
        </mes:MessageHeader>
      </soapenv:Header>
      <soapenv:Body>
        {body}
      </soapenv:Body>
    </soapenv:Envelope>
  }

  def soapTemplateWithToken(binarySecurityToken: String, service: String, action: String, description: String, body: Node) = {
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                      xmlns:sec="http://schemas.xmlsoap.org/ws/2002/12/secext"
                      xmlns:mes="http://www.ebxml.org/namespaces/messageHeader"
                      xmlns:ns="http://www.opentravel.org/OTA/2003/05">
      <soapenv:Header>
        <sec:Security>
          <sec:UsernameToken>
            <sec:Username>{USERNAME}</sec:Username>
            <sec:Password>{PASSWORD}</sec:Password>
            <Organization>{SABRE_PCC}</Organization>
            <Domain>{DOMAIN}</Domain>
          </sec:UsernameToken>
          <sec:BinarySecurityToken>{binarySecurityToken}</sec:BinarySecurityToken>
        </sec:Security>
        <mes:MessageHeader mes:id={getMessageId} mes:version="2.0">
          <mes:From>
            <mes:PartyId mes:type={PARTY_ID_TYPE}>{PARTY_ID_FROM}</mes:PartyId>
          </mes:From>
          <mes:To>
            <mes:PartyId mes:type={PARTY_ID_TYPE}>{PARTY_ID_TO}</mes:PartyId>
          </mes:To>
          <mes:CPAId>{SABRE_PCC}</mes:CPAId>
          <mes:ConversationId>{CONVERSATION_ID}</mes:ConversationId>
          <mes:Service mes:type={SERVICE_TYPE}>{service}</mes:Service>
          <mes:Action>{action}</mes:Action>
          <mes:MessageData>
            <mes:MessageId>{getMessageId}</mes:MessageId>
            <mes:Timestamp>{getMessageTimeStamp}</mes:Timestamp>
          </mes:MessageData>
          <mes:Description xml:lang="en">{description}</mes:Description>
        </mes:MessageHeader>
      </soapenv:Header>
      <soapenv:Body>
        {body}
      </soapenv:Body>
    </soapenv:Envelope>
  }
}