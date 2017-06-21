
package weaver.docs.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DocInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DocInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessorycount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="allParentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assetid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="attachments" type="{http://webservices.docs.weaver}ArrayOfDocAttachment" minOccurs="0"/&gt;
 *         &lt;element name="childdoc" type="{http://localhost/services/DocService}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="chiledocname" type="{http://localhost/services/DocService}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="crmid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="docCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docEdition" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="docEditionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="docEditionStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docPublishType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="docStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="docStatusStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="docapprovedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docapprovetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docapproveuserid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="docapproveusername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docapproveusertype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="docarchivedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docarchivetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docarchiveuserid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="docarchiveusername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docarchiveusertype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="doccanceldate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doccanceltime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doccanceluserid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="doccancelusername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doccancelusertype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="doccontent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doccreatedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doccreaterid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="doccreatername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doccreatertype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="doccreatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doccustomfields" type="{http://webservices.docs.weaver}ArrayOfDocCustomField" minOccurs="0"/&gt;
 *         &lt;element name="docdepartmentStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docdepartmentid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="docinvaldate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docinvaltime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docinvaluserid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="docinvalusername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docinvalusertype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="doclangurage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="doclangurageStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doclastmoddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doclastmodtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doclastmoduserid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="doclastmodusername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doclastmodusertype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dummyIds" type="{http://localhost/services/DocService}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="dummyNames" type="{http://localhost/services/DocService}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="financeid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="hrmresid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imagefileId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="invalidationdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isreply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maincategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maincategoryStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maindoc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maindocname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ownername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownertype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="parentids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pictures" type="{http://webservices.docs.weaver}ArrayOfDocAttachment" minOccurs="0"/&gt;
 *         &lt;element name="projectid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="publishable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="replaydoccount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="replydocid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="seccategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="seccategoryStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subcategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="subcategoryStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DocInfo", namespace = "http://webservices.docs.weaver", propOrder = {
    "accessorycount",
    "allParentName",
    "assetid",
    "attachments",
    "childdoc",
    "chiledocname",
    "crmid",
    "docCode",
    "docEdition",
    "docEditionId",
    "docEditionStr",
    "docPublishType",
    "docStatus",
    "docStatusStr",
    "docSubject",
    "docType",
    "docapprovedate",
    "docapprovetime",
    "docapproveuserid",
    "docapproveusername",
    "docapproveusertype",
    "docarchivedate",
    "docarchivetime",
    "docarchiveuserid",
    "docarchiveusername",
    "docarchiveusertype",
    "doccanceldate",
    "doccanceltime",
    "doccanceluserid",
    "doccancelusername",
    "doccancelusertype",
    "doccontent",
    "doccreatedate",
    "doccreaterid",
    "doccreatername",
    "doccreatertype",
    "doccreatetime",
    "doccustomfields",
    "docdepartmentStr",
    "docdepartmentid",
    "docinvaldate",
    "docinvaltime",
    "docinvaluserid",
    "docinvalusername",
    "docinvalusertype",
    "doclangurage",
    "doclangurageStr",
    "doclastmoddate",
    "doclastmodtime",
    "doclastmoduserid",
    "doclastmodusername",
    "doclastmodusertype",
    "dummyIds",
    "dummyNames",
    "financeid",
    "hrmresid",
    "id",
    "imagefileId",
    "invalidationdate",
    "isreply",
    "itemid",
    "keyword",
    "maincategory",
    "maincategoryStr",
    "maindoc",
    "maindocname",
    "ownerid",
    "ownername",
    "ownertype",
    "parentids",
    "pictures",
    "projectid",
    "publishable",
    "replaydoccount",
    "replydocid",
    "seccategory",
    "seccategoryStr",
    "subcategory",
    "subcategoryStr",
    "versionId"
})
public class DocInfo {

    protected Integer accessorycount;
    @XmlElementRef(name = "allParentName", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> allParentName;
    protected Integer assetid;
    @XmlElementRef(name = "attachments", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDocAttachment> attachments;
    @XmlElementRef(name = "childdoc", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<ArrayOfInt> childdoc;
    @XmlElementRef(name = "chiledocname", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<ArrayOfString> chiledocname;
    protected Integer crmid;
    @XmlElementRef(name = "docCode", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docCode;
    protected Integer docEdition;
    protected Integer docEditionId;
    @XmlElementRef(name = "docEditionStr", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docEditionStr;
    protected Integer docPublishType;
    protected Integer docStatus;
    @XmlElementRef(name = "docStatusStr", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docStatusStr;
    @XmlElementRef(name = "docSubject", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docSubject;
    protected Integer docType;
    @XmlElementRef(name = "docapprovedate", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docapprovedate;
    @XmlElementRef(name = "docapprovetime", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docapprovetime;
    protected Integer docapproveuserid;
    @XmlElementRef(name = "docapproveusername", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docapproveusername;
    protected Integer docapproveusertype;
    @XmlElementRef(name = "docarchivedate", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docarchivedate;
    @XmlElementRef(name = "docarchivetime", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docarchivetime;
    protected Integer docarchiveuserid;
    @XmlElementRef(name = "docarchiveusername", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docarchiveusername;
    protected Integer docarchiveusertype;
    @XmlElementRef(name = "doccanceldate", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> doccanceldate;
    @XmlElementRef(name = "doccanceltime", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> doccanceltime;
    protected Integer doccanceluserid;
    @XmlElementRef(name = "doccancelusername", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> doccancelusername;
    protected Integer doccancelusertype;
    @XmlElementRef(name = "doccontent", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> doccontent;
    @XmlElementRef(name = "doccreatedate", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> doccreatedate;
    protected Integer doccreaterid;
    @XmlElementRef(name = "doccreatername", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> doccreatername;
    protected Integer doccreatertype;
    @XmlElementRef(name = "doccreatetime", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> doccreatetime;
    @XmlElementRef(name = "doccustomfields", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDocCustomField> doccustomfields;
    @XmlElementRef(name = "docdepartmentStr", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docdepartmentStr;
    protected Integer docdepartmentid;
    @XmlElementRef(name = "docinvaldate", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docinvaldate;
    @XmlElementRef(name = "docinvaltime", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docinvaltime;
    protected Integer docinvaluserid;
    @XmlElementRef(name = "docinvalusername", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> docinvalusername;
    protected Integer docinvalusertype;
    protected Integer doclangurage;
    @XmlElementRef(name = "doclangurageStr", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> doclangurageStr;
    @XmlElementRef(name = "doclastmoddate", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> doclastmoddate;
    @XmlElementRef(name = "doclastmodtime", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> doclastmodtime;
    protected Integer doclastmoduserid;
    @XmlElementRef(name = "doclastmodusername", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> doclastmodusername;
    protected Integer doclastmodusertype;
    @XmlElementRef(name = "dummyIds", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<ArrayOfInt> dummyIds;
    @XmlElementRef(name = "dummyNames", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<ArrayOfString> dummyNames;
    protected Integer financeid;
    protected Integer hrmresid;
    protected Integer id;
    protected Integer imagefileId;
    @XmlElementRef(name = "invalidationdate", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> invalidationdate;
    @XmlElementRef(name = "isreply", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> isreply;
    protected Integer itemid;
    @XmlElementRef(name = "keyword", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> keyword;
    protected Integer maincategory;
    @XmlElementRef(name = "maincategoryStr", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> maincategoryStr;
    protected Integer maindoc;
    @XmlElementRef(name = "maindocname", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> maindocname;
    protected Integer ownerid;
    @XmlElementRef(name = "ownername", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> ownername;
    protected Integer ownertype;
    @XmlElementRef(name = "parentids", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> parentids;
    @XmlElementRef(name = "pictures", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDocAttachment> pictures;
    protected Integer projectid;
    @XmlElementRef(name = "publishable", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> publishable;
    protected Integer replaydoccount;
    protected Integer replydocid;
    protected Integer seccategory;
    @XmlElementRef(name = "seccategoryStr", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> seccategoryStr;
    protected Integer subcategory;
    @XmlElementRef(name = "subcategoryStr", namespace = "http://webservices.docs.weaver", type = JAXBElement.class)
    protected JAXBElement<String> subcategoryStr;
    protected Integer versionId;

    /**
     * 获取accessorycount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccessorycount() {
        return accessorycount;
    }

    /**
     * 设置accessorycount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccessorycount(Integer value) {
        this.accessorycount = value;
    }

    /**
     * 获取allParentName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAllParentName() {
        return allParentName;
    }

    /**
     * 设置allParentName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAllParentName(JAXBElement<String> value) {
        this.allParentName = value;
    }

    /**
     * 获取assetid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssetid() {
        return assetid;
    }

    /**
     * 设置assetid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssetid(Integer value) {
        this.assetid = value;
    }

    /**
     * 获取attachments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocAttachment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocAttachment> getAttachments() {
        return attachments;
    }

    /**
     * 设置attachments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocAttachment }{@code >}
     *     
     */
    public void setAttachments(JAXBElement<ArrayOfDocAttachment> value) {
        this.attachments = value;
    }

    /**
     * 获取childdoc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInt }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInt> getChilddoc() {
        return childdoc;
    }

    /**
     * 设置childdoc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInt }{@code >}
     *     
     */
    public void setChilddoc(JAXBElement<ArrayOfInt> value) {
        this.childdoc = value;
    }

    /**
     * 获取chiledocname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getChiledocname() {
        return chiledocname;
    }

    /**
     * 设置chiledocname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setChiledocname(JAXBElement<ArrayOfString> value) {
        this.chiledocname = value;
    }

    /**
     * 获取crmid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCrmid() {
        return crmid;
    }

    /**
     * 设置crmid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCrmid(Integer value) {
        this.crmid = value;
    }

    /**
     * 获取docCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocCode() {
        return docCode;
    }

    /**
     * 设置docCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocCode(JAXBElement<String> value) {
        this.docCode = value;
    }

    /**
     * 获取docEdition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocEdition() {
        return docEdition;
    }

    /**
     * 设置docEdition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocEdition(Integer value) {
        this.docEdition = value;
    }

    /**
     * 获取docEditionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocEditionId() {
        return docEditionId;
    }

    /**
     * 设置docEditionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocEditionId(Integer value) {
        this.docEditionId = value;
    }

    /**
     * 获取docEditionStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocEditionStr() {
        return docEditionStr;
    }

    /**
     * 设置docEditionStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocEditionStr(JAXBElement<String> value) {
        this.docEditionStr = value;
    }

    /**
     * 获取docPublishType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocPublishType() {
        return docPublishType;
    }

    /**
     * 设置docPublishType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocPublishType(Integer value) {
        this.docPublishType = value;
    }

    /**
     * 获取docStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocStatus() {
        return docStatus;
    }

    /**
     * 设置docStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocStatus(Integer value) {
        this.docStatus = value;
    }

    /**
     * 获取docStatusStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocStatusStr() {
        return docStatusStr;
    }

    /**
     * 设置docStatusStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocStatusStr(JAXBElement<String> value) {
        this.docStatusStr = value;
    }

    /**
     * 获取docSubject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocSubject() {
        return docSubject;
    }

    /**
     * 设置docSubject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocSubject(JAXBElement<String> value) {
        this.docSubject = value;
    }

    /**
     * 获取docType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocType() {
        return docType;
    }

    /**
     * 设置docType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocType(Integer value) {
        this.docType = value;
    }

    /**
     * 获取docapprovedate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocapprovedate() {
        return docapprovedate;
    }

    /**
     * 设置docapprovedate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocapprovedate(JAXBElement<String> value) {
        this.docapprovedate = value;
    }

    /**
     * 获取docapprovetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocapprovetime() {
        return docapprovetime;
    }

    /**
     * 设置docapprovetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocapprovetime(JAXBElement<String> value) {
        this.docapprovetime = value;
    }

    /**
     * 获取docapproveuserid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocapproveuserid() {
        return docapproveuserid;
    }

    /**
     * 设置docapproveuserid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocapproveuserid(Integer value) {
        this.docapproveuserid = value;
    }

    /**
     * 获取docapproveusername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocapproveusername() {
        return docapproveusername;
    }

    /**
     * 设置docapproveusername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocapproveusername(JAXBElement<String> value) {
        this.docapproveusername = value;
    }

    /**
     * 获取docapproveusertype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocapproveusertype() {
        return docapproveusertype;
    }

    /**
     * 设置docapproveusertype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocapproveusertype(Integer value) {
        this.docapproveusertype = value;
    }

    /**
     * 获取docarchivedate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocarchivedate() {
        return docarchivedate;
    }

    /**
     * 设置docarchivedate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocarchivedate(JAXBElement<String> value) {
        this.docarchivedate = value;
    }

    /**
     * 获取docarchivetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocarchivetime() {
        return docarchivetime;
    }

    /**
     * 设置docarchivetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocarchivetime(JAXBElement<String> value) {
        this.docarchivetime = value;
    }

    /**
     * 获取docarchiveuserid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocarchiveuserid() {
        return docarchiveuserid;
    }

    /**
     * 设置docarchiveuserid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocarchiveuserid(Integer value) {
        this.docarchiveuserid = value;
    }

    /**
     * 获取docarchiveusername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocarchiveusername() {
        return docarchiveusername;
    }

    /**
     * 设置docarchiveusername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocarchiveusername(JAXBElement<String> value) {
        this.docarchiveusername = value;
    }

    /**
     * 获取docarchiveusertype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocarchiveusertype() {
        return docarchiveusertype;
    }

    /**
     * 设置docarchiveusertype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocarchiveusertype(Integer value) {
        this.docarchiveusertype = value;
    }

    /**
     * 获取doccanceldate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoccanceldate() {
        return doccanceldate;
    }

    /**
     * 设置doccanceldate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoccanceldate(JAXBElement<String> value) {
        this.doccanceldate = value;
    }

    /**
     * 获取doccanceltime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoccanceltime() {
        return doccanceltime;
    }

    /**
     * 设置doccanceltime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoccanceltime(JAXBElement<String> value) {
        this.doccanceltime = value;
    }

    /**
     * 获取doccanceluserid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoccanceluserid() {
        return doccanceluserid;
    }

    /**
     * 设置doccanceluserid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoccanceluserid(Integer value) {
        this.doccanceluserid = value;
    }

    /**
     * 获取doccancelusername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoccancelusername() {
        return doccancelusername;
    }

    /**
     * 设置doccancelusername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoccancelusername(JAXBElement<String> value) {
        this.doccancelusername = value;
    }

    /**
     * 获取doccancelusertype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoccancelusertype() {
        return doccancelusertype;
    }

    /**
     * 设置doccancelusertype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoccancelusertype(Integer value) {
        this.doccancelusertype = value;
    }

    /**
     * 获取doccontent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoccontent() {
        return doccontent;
    }

    /**
     * 设置doccontent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoccontent(JAXBElement<String> value) {
        this.doccontent = value;
    }

    /**
     * 获取doccreatedate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoccreatedate() {
        return doccreatedate;
    }

    /**
     * 设置doccreatedate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoccreatedate(JAXBElement<String> value) {
        this.doccreatedate = value;
    }

    /**
     * 获取doccreaterid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoccreaterid() {
        return doccreaterid;
    }

    /**
     * 设置doccreaterid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoccreaterid(Integer value) {
        this.doccreaterid = value;
    }

    /**
     * 获取doccreatername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoccreatername() {
        return doccreatername;
    }

    /**
     * 设置doccreatername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoccreatername(JAXBElement<String> value) {
        this.doccreatername = value;
    }

    /**
     * 获取doccreatertype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoccreatertype() {
        return doccreatertype;
    }

    /**
     * 设置doccreatertype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoccreatertype(Integer value) {
        this.doccreatertype = value;
    }

    /**
     * 获取doccreatetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoccreatetime() {
        return doccreatetime;
    }

    /**
     * 设置doccreatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoccreatetime(JAXBElement<String> value) {
        this.doccreatetime = value;
    }

    /**
     * 获取doccustomfields属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocCustomField }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocCustomField> getDoccustomfields() {
        return doccustomfields;
    }

    /**
     * 设置doccustomfields属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocCustomField }{@code >}
     *     
     */
    public void setDoccustomfields(JAXBElement<ArrayOfDocCustomField> value) {
        this.doccustomfields = value;
    }

    /**
     * 获取docdepartmentStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocdepartmentStr() {
        return docdepartmentStr;
    }

    /**
     * 设置docdepartmentStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocdepartmentStr(JAXBElement<String> value) {
        this.docdepartmentStr = value;
    }

    /**
     * 获取docdepartmentid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocdepartmentid() {
        return docdepartmentid;
    }

    /**
     * 设置docdepartmentid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocdepartmentid(Integer value) {
        this.docdepartmentid = value;
    }

    /**
     * 获取docinvaldate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocinvaldate() {
        return docinvaldate;
    }

    /**
     * 设置docinvaldate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocinvaldate(JAXBElement<String> value) {
        this.docinvaldate = value;
    }

    /**
     * 获取docinvaltime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocinvaltime() {
        return docinvaltime;
    }

    /**
     * 设置docinvaltime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocinvaltime(JAXBElement<String> value) {
        this.docinvaltime = value;
    }

    /**
     * 获取docinvaluserid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocinvaluserid() {
        return docinvaluserid;
    }

    /**
     * 设置docinvaluserid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocinvaluserid(Integer value) {
        this.docinvaluserid = value;
    }

    /**
     * 获取docinvalusername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocinvalusername() {
        return docinvalusername;
    }

    /**
     * 设置docinvalusername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocinvalusername(JAXBElement<String> value) {
        this.docinvalusername = value;
    }

    /**
     * 获取docinvalusertype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocinvalusertype() {
        return docinvalusertype;
    }

    /**
     * 设置docinvalusertype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocinvalusertype(Integer value) {
        this.docinvalusertype = value;
    }

    /**
     * 获取doclangurage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoclangurage() {
        return doclangurage;
    }

    /**
     * 设置doclangurage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoclangurage(Integer value) {
        this.doclangurage = value;
    }

    /**
     * 获取doclangurageStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoclangurageStr() {
        return doclangurageStr;
    }

    /**
     * 设置doclangurageStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoclangurageStr(JAXBElement<String> value) {
        this.doclangurageStr = value;
    }

    /**
     * 获取doclastmoddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoclastmoddate() {
        return doclastmoddate;
    }

    /**
     * 设置doclastmoddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoclastmoddate(JAXBElement<String> value) {
        this.doclastmoddate = value;
    }

    /**
     * 获取doclastmodtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoclastmodtime() {
        return doclastmodtime;
    }

    /**
     * 设置doclastmodtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoclastmodtime(JAXBElement<String> value) {
        this.doclastmodtime = value;
    }

    /**
     * 获取doclastmoduserid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoclastmoduserid() {
        return doclastmoduserid;
    }

    /**
     * 设置doclastmoduserid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoclastmoduserid(Integer value) {
        this.doclastmoduserid = value;
    }

    /**
     * 获取doclastmodusername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoclastmodusername() {
        return doclastmodusername;
    }

    /**
     * 设置doclastmodusername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoclastmodusername(JAXBElement<String> value) {
        this.doclastmodusername = value;
    }

    /**
     * 获取doclastmodusertype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoclastmodusertype() {
        return doclastmodusertype;
    }

    /**
     * 设置doclastmodusertype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoclastmodusertype(Integer value) {
        this.doclastmodusertype = value;
    }

    /**
     * 获取dummyIds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInt }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInt> getDummyIds() {
        return dummyIds;
    }

    /**
     * 设置dummyIds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInt }{@code >}
     *     
     */
    public void setDummyIds(JAXBElement<ArrayOfInt> value) {
        this.dummyIds = value;
    }

    /**
     * 获取dummyNames属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getDummyNames() {
        return dummyNames;
    }

    /**
     * 设置dummyNames属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setDummyNames(JAXBElement<ArrayOfString> value) {
        this.dummyNames = value;
    }

    /**
     * 获取financeid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinanceid() {
        return financeid;
    }

    /**
     * 设置financeid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinanceid(Integer value) {
        this.financeid = value;
    }

    /**
     * 获取hrmresid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHrmresid() {
        return hrmresid;
    }

    /**
     * 设置hrmresid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHrmresid(Integer value) {
        this.hrmresid = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * 获取imagefileId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImagefileId() {
        return imagefileId;
    }

    /**
     * 设置imagefileId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImagefileId(Integer value) {
        this.imagefileId = value;
    }

    /**
     * 获取invalidationdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvalidationdate() {
        return invalidationdate;
    }

    /**
     * 设置invalidationdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvalidationdate(JAXBElement<String> value) {
        this.invalidationdate = value;
    }

    /**
     * 获取isreply属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsreply() {
        return isreply;
    }

    /**
     * 设置isreply属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsreply(JAXBElement<String> value) {
        this.isreply = value;
    }

    /**
     * 获取itemid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemid() {
        return itemid;
    }

    /**
     * 设置itemid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemid(Integer value) {
        this.itemid = value;
    }

    /**
     * 获取keyword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeyword() {
        return keyword;
    }

    /**
     * 设置keyword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeyword(JAXBElement<String> value) {
        this.keyword = value;
    }

    /**
     * 获取maincategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaincategory() {
        return maincategory;
    }

    /**
     * 设置maincategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaincategory(Integer value) {
        this.maincategory = value;
    }

    /**
     * 获取maincategoryStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaincategoryStr() {
        return maincategoryStr;
    }

    /**
     * 设置maincategoryStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaincategoryStr(JAXBElement<String> value) {
        this.maincategoryStr = value;
    }

    /**
     * 获取maindoc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaindoc() {
        return maindoc;
    }

    /**
     * 设置maindoc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaindoc(Integer value) {
        this.maindoc = value;
    }

    /**
     * 获取maindocname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaindocname() {
        return maindocname;
    }

    /**
     * 设置maindocname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaindocname(JAXBElement<String> value) {
        this.maindocname = value;
    }

    /**
     * 获取ownerid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOwnerid() {
        return ownerid;
    }

    /**
     * 设置ownerid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOwnerid(Integer value) {
        this.ownerid = value;
    }

    /**
     * 获取ownername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnername() {
        return ownername;
    }

    /**
     * 设置ownername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnername(JAXBElement<String> value) {
        this.ownername = value;
    }

    /**
     * 获取ownertype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOwnertype() {
        return ownertype;
    }

    /**
     * 设置ownertype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOwnertype(Integer value) {
        this.ownertype = value;
    }

    /**
     * 获取parentids属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentids() {
        return parentids;
    }

    /**
     * 设置parentids属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentids(JAXBElement<String> value) {
        this.parentids = value;
    }

    /**
     * 获取pictures属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocAttachment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocAttachment> getPictures() {
        return pictures;
    }

    /**
     * 设置pictures属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocAttachment }{@code >}
     *     
     */
    public void setPictures(JAXBElement<ArrayOfDocAttachment> value) {
        this.pictures = value;
    }

    /**
     * 获取projectid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * 设置projectid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectid(Integer value) {
        this.projectid = value;
    }

    /**
     * 获取publishable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublishable() {
        return publishable;
    }

    /**
     * 设置publishable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublishable(JAXBElement<String> value) {
        this.publishable = value;
    }

    /**
     * 获取replaydoccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReplaydoccount() {
        return replaydoccount;
    }

    /**
     * 设置replaydoccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReplaydoccount(Integer value) {
        this.replaydoccount = value;
    }

    /**
     * 获取replydocid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReplydocid() {
        return replydocid;
    }

    /**
     * 设置replydocid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReplydocid(Integer value) {
        this.replydocid = value;
    }

    /**
     * 获取seccategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeccategory() {
        return seccategory;
    }

    /**
     * 设置seccategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeccategory(Integer value) {
        this.seccategory = value;
    }

    /**
     * 获取seccategoryStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeccategoryStr() {
        return seccategoryStr;
    }

    /**
     * 设置seccategoryStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeccategoryStr(JAXBElement<String> value) {
        this.seccategoryStr = value;
    }

    /**
     * 获取subcategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubcategory() {
        return subcategory;
    }

    /**
     * 设置subcategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubcategory(Integer value) {
        this.subcategory = value;
    }

    /**
     * 获取subcategoryStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubcategoryStr() {
        return subcategoryStr;
    }

    /**
     * 设置subcategoryStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubcategoryStr(JAXBElement<String> value) {
        this.subcategoryStr = value;
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
