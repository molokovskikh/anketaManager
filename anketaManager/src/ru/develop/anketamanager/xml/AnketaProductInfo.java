//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.04 at 02:39:05 PM NOVT 
//


package ru.develop.anketamanager.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnketaProductInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnketaProductInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Turnover" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Availability" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Stands" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Adv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Extensions" type="{http://tempuri.org/XMLSchema.xsd}AnketaProductInfoExt" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "AnketaProductInfo", propOrder = {

//})
public class AnketaProductInfo  implements Serializable{

    //@XmlElement(name = "Brand", required = true)
    protected String brand;
    //@XmlElement(name = "Turnover", required = true)
    protected BigDecimal turnover;
    //@XmlElement(name = "Availability", required = true)
    protected String availability;
    //@XmlElement(name = "Stands", required = true)
    protected String stands;
    //@XmlElement(name = "Adv", required = true)
    protected String adv;
    //@XmlElement(name = "Comment", required = true)
    protected String comment;
    //@XmlElement(name = "Extensions")
    protected List<AnketaProductInfoExt> extensions;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the turnover property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTurnover() {
        return turnover;
    }

    /**
     * Sets the value of the turnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTurnover(BigDecimal value) {
        this.turnover = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailability(String value) {
        this.availability = value;
    }

    /**
     * Gets the value of the stands property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStands() {
        return stands;
    }

    /**
     * Sets the value of the stands property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStands(String value) {
        this.stands = value;
    }

    /**
     * Gets the value of the adv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdv() {
        return adv;
    }

    /**
     * Sets the value of the adv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdv(String value) {
        this.adv = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link AnketaProductInfoExt }
     *     
     */
    public List<AnketaProductInfoExt> getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnketaProductInfoExt }
     *     
     */
    public void setExtensions(List<AnketaProductInfoExt> value) {
        this.extensions = value;
    }

}
