//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.04 at 02:39:05 PM NOVT 
//


package ru.develop.anketamanager.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Anketa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Anketa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Customer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Region" type="{http://tempuri.org/XMLSchema.xsd}Region"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KindActivity" type="{http://tempuri.org/XMLSchema.xsd}ActivityKind"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="VisitPurpose" type="{http://tempuri.org/XMLSchema.xsd}VisitPurpose"/>
 *         &lt;element name="ProductRange" type="{http://tempuri.org/XMLSchema.xsd}AnketaProductInfo" minOccurs="0"/>
 *         &lt;element name="AdditionInfo" type="{http://tempuri.org/XMLSchema.xsd}AnketaAdditionInfo"/>
 *         &lt;element name="MarketInfo" type="{http://tempuri.org/XMLSchema.xsd}AnketaMarketInfo"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Anketa", propOrder = {

})
public class Anketa {

    @XmlElement(name = "Customer", required = true)
    protected String customer;
    @XmlElement(name = "Region", required = true)
    protected Region region;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "KindActivity", required = true)
    protected ActivityKind kindActivity;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "VisitPurpose", required = true)
    protected VisitPurpose visitPurpose;
    @XmlElement(name = "ProductRange")
    protected List<AnketaProductInfo> productRanges;
    @XmlElement(name = "AdditionInfo", required = true)
    protected AnketaAdditionInfo additionInfo;
    @XmlElement(name = "MarketInfo", required = true)
    protected AnketaMarketInfo marketInfo;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link Region }
     *     
     */
    public Region getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link Region }
     *     
     */
    public void setRegion(Region value) {
        this.region = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the kindActivity property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityKind }
     *     
     */
    public ActivityKind getKindActivity() {
        return kindActivity;
    }

    /**
     * Sets the value of the kindActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityKind }
     *     
     */
    public void setKindActivity(ActivityKind value) {
        this.kindActivity = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the visitPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link VisitPurpose }
     *     
     */
    public VisitPurpose getVisitPurpose() {
        return visitPurpose;
    }

    /**
     * Sets the value of the visitPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisitPurpose }
     *     
     */
    public void setVisitPurpose(VisitPurpose value) {
        this.visitPurpose = value;
    }

    /**
     * Gets the value of the productRange property.
     * 
     * @return
     *     possible object is
     *     {@link AnketaProductInfo }
     *     
     */
    public List<AnketaProductInfo> getProductRanges() {
        return productRanges;
    }

    /**
     * Sets the value of the productRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnketaProductInfo }
     *     
     */
    public void setProductRanges(List<AnketaProductInfo> value) {
        this.productRanges = value;
    }

    /**
     * Gets the value of the additionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AnketaAdditionInfo }
     *     
     */
    public AnketaAdditionInfo getAdditionInfo() {
        return additionInfo;
    }

    /**
     * Sets the value of the additionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnketaAdditionInfo }
     *     
     */
    public void setAdditionInfo(AnketaAdditionInfo value) {
        this.additionInfo = value;
    }

    /**
     * Gets the value of the marketInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AnketaMarketInfo }
     *     
     */
    public AnketaMarketInfo getMarketInfo() {
        return marketInfo;
    }

    /**
     * Sets the value of the marketInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnketaMarketInfo }
     *     
     */
    public void setMarketInfo(AnketaMarketInfo value) {
        this.marketInfo = value;
    }

}