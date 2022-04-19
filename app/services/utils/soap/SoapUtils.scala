/**
 * Created by Ibrahim Olanrewaju on 4/5/2016.
 */

package services.utils.soap


import java.io.{ByteArrayInputStream, InputStream}
import java.net.URL
import javax.xml.soap.{MessageFactory, SOAPConnectionFactory, SOAPMessage}
import javax.xml.transform.dom.DOMResult
import javax.xml.transform.{Transformer, TransformerFactory, Source}

import com.sun.org.apache.xalan.internal.xsltc.trax.DOM2SAX
import org.w3c.dom.{Node => w3cNode}

import scala.xml.Node
import scala.xml.parsing.NoBindingFactoryAdapter


trait SoapUtils {
  protected def toNode(soapMsg: SOAPMessage): Node = {
    val dom2sax = new DOM2SAX(toDomNode(soapMsg))
    val adapter = new NoBindingFactoryAdapter
    dom2sax.setContentHandler(adapter)
    dom2sax.parse()
    adapter.rootElem
  }

  protected def soapRequest(soapMessage: String, endpointUrl: String): SOAPMessage = {
    try {
      val soapConnectionFactory = SOAPConnectionFactory.newInstance
      val connection = soapConnectionFactory.createConnection
      val is: InputStream = new ByteArrayInputStream(soapMessage.getBytes)
      val request = MessageFactory.newInstance.createMessage(null, is)
      val endpoint: URL = new URL(endpointUrl)
      val soapResponse = connection.call(request, endpoint)
      connection.close()
      soapResponse
    }
    catch { case ex: Exception => throw new RuntimeException(ex) }
  }

  private def toDomNode(soapMsg: SOAPMessage): w3cNode = {
    val source: Source = soapMsg.getSOAPPart.getContent
    val factory: TransformerFactory = TransformerFactory.newInstance()
    val transformer: Transformer = factory.newTransformer()
    val domResult: DOMResult = new DOMResult()
    transformer.transform(source, domResult)
    domResult.getNode
  }
}

