
package weaver.docs.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DocCustomField complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DocCustomField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fielddbtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldhtmltype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fieldshow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldtype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fieldvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocCustomField", namespace = "http://webservices.docs.weaver", propOrder = {
    "fielddbtype",
    "fieldhtmltype",
    "fieldid",
    "fieldshow",
    "fieldtype",
    "fieldvalue"
})
public class DocCustomField {

    @XmlElementRef(name = "fielddbtype", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> fielddbtype;
    @XmlElementRef(name = "fieldhtmltype", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> fieldhtmltype;
    protected Integer fieldid;
    @XmlElementRef(name = "fieldshow", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> fieldshow;
    protected Integer fieldtype;
    @XmlElementRef(name = "fieldvalue", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> fieldvalue;

    /**
     * 获取fielddbtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFielddbtype() {
        return fielddbtype;
    }

    /**
     * 设置fielddbtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFielddbtype(JAXBElement<String> value) {
        this.fielddbtype = value;
    }

    /**
     * 获取fieldhtmltype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldhtmltype() {
        return fieldhtmltype;
    }

    /**
     * 设置fieldhtmltype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldhtmltype(JAXBElement<String> value) {
        this.fieldhtmltype = value;
    }

    /**
     * 获取fieldid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldid() {
        return fieldid;
    }

    /**
     * 设置fieldid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldid(Integer value) {
        this.fieldid = value;
    }

    /**
     * 获取fieldshow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldshow() {
        return fieldshow;
    }

    /**
     * 设置fieldshow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldshow(JAXBElement<String> value) {
        this.fieldshow = value;
    }

    /**
     * 获取fieldtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldtype() {
        return fieldtype;
    }

    /**
     * 设置fieldtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldtype(Integer value) {
        this.fieldtype = value;
    }

    /**
     * 获取fieldvalue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFieldvalue() {
        return fieldvalue;
    }

    /**
     * 设置fieldvalue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFieldvalue(JAXBElement<String> value) {
        this.fieldvalue = value;
    }

}
