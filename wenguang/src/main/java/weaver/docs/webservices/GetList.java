
package weaver.docs.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="in0" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="in1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="in2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "in0",
    "in1",
    "in2"
})
@XmlRootElement(name = "getList")
public class GetList {

    @XmlElement(required = true, nillable = true)
    protected String in0;
    protected int in1;
    protected int in2;

    /**
     * 获取in0属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn0() {
        return in0;
    }

    /**
     * 设置in0属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn0(String value) {
        this.in0 = value;
    }

    /**
     * 获取in1属性的值。
     * 
     */
    public int getIn1() {
        return in1;
    }

    /**
     * 设置in1属性的值。
     * 
     */
    public void setIn1(int value) {
        this.in1 = value;
    }

    /**
     * 获取in2属性的值。
     * 
     */
    public int getIn2() {
        return in2;
    }

    /**
     * 设置in2属性的值。
     * 
     */
    public void setIn2(int value) {
        this.in2 = value;
    }

}
