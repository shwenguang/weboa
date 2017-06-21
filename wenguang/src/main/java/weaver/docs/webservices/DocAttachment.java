
package weaver.docs.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DocAttachment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DocAttachment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aesCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docImageFileId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="docfiletype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="filecontent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filerealpath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileused" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imagefiledesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagefileheight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imagefileid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imagefilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagefilesize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imagefilewidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isAesEncrype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isencrype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isextfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iszip" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="versionDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="versionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocAttachment", namespace = "http://webservices.docs.weaver", propOrder = {
    "aesCode",
    "docImageFileId",
    "docfiletype",
    "docid",
    "filecontent",
    "filename",
    "filerealpath",
    "filetype",
    "fileused",
    "imagefiledesc",
    "imagefileheight",
    "imagefileid",
    "imagefilename",
    "imagefilesize",
    "imagefilewidth",
    "isAesEncrype",
    "isencrype",
    "isextfile",
    "iszip",
    "versionDetail",
    "versionId"
})
public class DocAttachment {

    @XmlElementRef(name = "aesCode", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> aesCode;
    protected Integer docImageFileId;
    @XmlElementRef(name = "docfiletype", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docfiletype;
    protected Integer docid;
    @XmlElementRef(name = "filecontent", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> filecontent;
    @XmlElementRef(name = "filename", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> filename;
    @XmlElementRef(name = "filerealpath", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> filerealpath;
    @XmlElementRef(name = "filetype", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> filetype;
    protected Integer fileused;
    @XmlElementRef(name = "imagefiledesc", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> imagefiledesc;
    protected Integer imagefileheight;
    protected Integer imagefileid;
    @XmlElementRef(name = "imagefilename", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> imagefilename;
    protected Integer imagefilesize;
    protected Integer imagefilewidth;
    protected Integer isAesEncrype;
    protected Integer isencrype;
    @XmlElementRef(name = "isextfile", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> isextfile;
    protected Integer iszip;
    @XmlElementRef(name = "versionDetail", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> versionDetail;
    protected Integer versionId;

    /**
     * 获取aesCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAesCode() {
        return aesCode;
    }

    /**
     * 设置aesCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAesCode(JAXBElement<String> value) {
        this.aesCode = value;
    }

    /**
     * 获取docImageFileId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocImageFileId() {
        return docImageFileId;
    }

    /**
     * 设置docImageFileId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocImageFileId(Integer value) {
        this.docImageFileId = value;
    }

    /**
     * 获取docfiletype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocfiletype() {
        return docfiletype;
    }

    /**
     * 设置docfiletype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocfiletype(JAXBElement<String> value) {
        this.docfiletype = value;
    }

    /**
     * 获取docid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocid() {
        return docid;
    }

    /**
     * 设置docid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocid(Integer value) {
        this.docid = value;
    }

    /**
     * 获取filecontent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilecontent() {
        return filecontent;
    }

    /**
     * 设置filecontent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilecontent(JAXBElement<String> value) {
        this.filecontent = value;
    }

    /**
     * 获取filename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilename() {
        return filename;
    }

    /**
     * 设置filename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilename(JAXBElement<String> value) {
        this.filename = value;
    }

    /**
     * 获取filerealpath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilerealpath() {
        return filerealpath;
    }

    /**
     * 设置filerealpath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilerealpath(JAXBElement<String> value) {
        this.filerealpath = value;
    }

    /**
     * 获取filetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiletype() {
        return filetype;
    }

    /**
     * 设置filetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiletype(JAXBElement<String> value) {
        this.filetype = value;
    }

    /**
     * 获取fileused属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFileused() {
        return fileused;
    }

    /**
     * 设置fileused属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFileused(Integer value) {
        this.fileused = value;
    }

    /**
     * 获取imagefiledesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImagefiledesc() {
        return imagefiledesc;
    }

    /**
     * 设置imagefiledesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImagefiledesc(JAXBElement<String> value) {
        this.imagefiledesc = value;
    }

    /**
     * 获取imagefileheight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImagefileheight() {
        return imagefileheight;
    }

    /**
     * 设置imagefileheight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImagefileheight(Integer value) {
        this.imagefileheight = value;
    }

    /**
     * 获取imagefileid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImagefileid() {
        return imagefileid;
    }

    /**
     * 设置imagefileid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImagefileid(Integer value) {
        this.imagefileid = value;
    }

    /**
     * 获取imagefilename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImagefilename() {
        return imagefilename;
    }

    /**
     * 设置imagefilename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImagefilename(JAXBElement<String> value) {
        this.imagefilename = value;
    }

    /**
     * 获取imagefilesize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImagefilesize() {
        return imagefilesize;
    }

    /**
     * 设置imagefilesize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImagefilesize(Integer value) {
        this.imagefilesize = value;
    }

    /**
     * 获取imagefilewidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImagefilewidth() {
        return imagefilewidth;
    }

    /**
     * 设置imagefilewidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImagefilewidth(Integer value) {
        this.imagefilewidth = value;
    }

    /**
     * 获取isAesEncrype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsAesEncrype() {
        return isAesEncrype;
    }

    /**
     * 设置isAesEncrype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsAesEncrype(Integer value) {
        this.isAesEncrype = value;
    }

    /**
     * 获取isencrype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsencrype() {
        return isencrype;
    }

    /**
     * 设置isencrype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsencrype(Integer value) {
        this.isencrype = value;
    }

    /**
     * 获取isextfile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsextfile() {
        return isextfile;
    }

    /**
     * 设置isextfile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsextfile(JAXBElement<String> value) {
        this.isextfile = value;
    }

    /**
     * 获取iszip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIszip() {
        return iszip;
    }

    /**
     * 设置iszip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIszip(Integer value) {
        this.iszip = value;
    }

    /**
     * 获取versionDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersionDetail() {
        return versionDetail;
    }

    /**
     * 设置versionDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersionDetail(JAXBElement<String> value) {
        this.versionDetail = value;
    }

    /**
     * 获取versionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * 设置versionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionId(Integer value) {
        this.versionId = value;
    }

}
