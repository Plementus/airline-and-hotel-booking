
package services.sabre.airavail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifier.System", namespace = "http://services.service.sabre.com/STL_Header/v120", propOrder = {
    "value"
})
public class IdentifierSystem {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "instance")
    protected String instance;
    @XmlAttribute(name = "cluster")
    protected String cluster;
    @XmlAttribute(name = "host")
    protected String host;
    @XmlAttribute(name = "uri")
    protected String uri;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String value) {
        this.instance = value;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String value) {
        this.cluster = value;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String value) {
        this.host = value;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String value) {
        this.uri = value;
    }

}
