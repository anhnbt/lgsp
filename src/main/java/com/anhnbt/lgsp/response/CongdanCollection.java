//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.28 at 05:28:06 PM ICT 
//


package com.anhnbt.lgsp.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CongDan" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SoDinhDanh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SoCMND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="HoVaTen">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Ho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ChuDem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Ten" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="NgayThangNamSinh">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NgayThangNam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Cha">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SoDinhDanh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="QuocTich" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="HoVaTen">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Ho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ChuDem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Ten" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Me">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SoDinhDanh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="QuocTich" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="HoVaTen">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Ho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ChuDem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Ten" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="SoCongDan" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GhiChu" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ThoiDiemDuLieu" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "congDan"
})
@XmlRootElement(name = "CongdanCollection")
public class CongdanCollection {

    @XmlElement(name = "CongDan", required = true)
    protected List<CongdanCollection.CongDan> congDan;
    @XmlAttribute(name = "SoCongDan")
    protected String soCongDan;
    @XmlAttribute(name = "GhiChu")
    protected String ghiChu;
    @XmlAttribute(name = "ThoiDiemDuLieu")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar thoiDiemDuLieu;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the congDan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the congDan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCongDan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CongdanCollection.CongDan }
     * 
     * 
     */
    public List<CongdanCollection.CongDan> getCongDan() {
        if (congDan == null) {
            congDan = new ArrayList<CongdanCollection.CongDan>();
        }
        return this.congDan;
    }

    /**
     * Gets the value of the soCongDan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoCongDan() {
        return soCongDan;
    }

    /**
     * Sets the value of the soCongDan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoCongDan(String value) {
        this.soCongDan = value;
    }

    /**
     * Gets the value of the ghiChu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGhiChu() {
        return ghiChu;
    }

    /**
     * Sets the value of the ghiChu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGhiChu(String value) {
        this.ghiChu = value;
    }

    /**
     * Gets the value of the thoiDiemDuLieu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThoiDiemDuLieu() {
        return thoiDiemDuLieu;
    }

    /**
     * Sets the value of the thoiDiemDuLieu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThoiDiemDuLieu(XMLGregorianCalendar value) {
        this.thoiDiemDuLieu = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SoDinhDanh" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SoCMND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="HoVaTen">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Ho" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ChuDem" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Ten" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="NgayThangNamSinh">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NgayThangNam" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Cha">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SoDinhDanh" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="QuocTich" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="HoVaTen">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Ho" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ChuDem" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Ten" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Me">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SoDinhDanh" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="QuocTich" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="HoVaTen">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Ho" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ChuDem" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Ten" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "soDinhDanh",
        "soCMND",
        "hoVaTen",
        "ngayThangNamSinh",
        "cha",
        "me"
    })
    public static class CongDan {

        @XmlElement(name = "SoDinhDanh", required = true)
        protected String soDinhDanh;
        @XmlElement(name = "SoCMND", required = true)
        protected String soCMND;
        @XmlElement(name = "HoVaTen", required = true)
        protected CongdanCollection.CongDan.HoVaTen hoVaTen;
        @XmlElement(name = "NgayThangNamSinh", required = true)
        protected CongdanCollection.CongDan.NgayThangNamSinh ngayThangNamSinh;
        @XmlElement(name = "Cha", required = true)
        protected CongdanCollection.CongDan.Cha cha;
        @XmlElement(name = "Me", required = true)
        protected CongdanCollection.CongDan.Me me;

        /**
         * Gets the value of the soDinhDanh property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSoDinhDanh() {
            return soDinhDanh;
        }

        /**
         * Sets the value of the soDinhDanh property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSoDinhDanh(String value) {
            this.soDinhDanh = value;
        }

        /**
         * Gets the value of the soCMND property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSoCMND() {
            return soCMND;
        }

        /**
         * Sets the value of the soCMND property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSoCMND(String value) {
            this.soCMND = value;
        }

        /**
         * Gets the value of the hoVaTen property.
         * 
         * @return
         *     possible object is
         *     {@link CongdanCollection.CongDan.HoVaTen }
         *     
         */
        public CongdanCollection.CongDan.HoVaTen getHoVaTen() {
            return hoVaTen;
        }

        /**
         * Sets the value of the hoVaTen property.
         * 
         * @param value
         *     allowed object is
         *     {@link CongdanCollection.CongDan.HoVaTen }
         *     
         */
        public void setHoVaTen(CongdanCollection.CongDan.HoVaTen value) {
            this.hoVaTen = value;
        }

        /**
         * Gets the value of the ngayThangNamSinh property.
         * 
         * @return
         *     possible object is
         *     {@link CongdanCollection.CongDan.NgayThangNamSinh }
         *     
         */
        public CongdanCollection.CongDan.NgayThangNamSinh getNgayThangNamSinh() {
            return ngayThangNamSinh;
        }

        /**
         * Sets the value of the ngayThangNamSinh property.
         * 
         * @param value
         *     allowed object is
         *     {@link CongdanCollection.CongDan.NgayThangNamSinh }
         *     
         */
        public void setNgayThangNamSinh(CongdanCollection.CongDan.NgayThangNamSinh value) {
            this.ngayThangNamSinh = value;
        }

        /**
         * Gets the value of the cha property.
         * 
         * @return
         *     possible object is
         *     {@link CongdanCollection.CongDan.Cha }
         *     
         */
        public CongdanCollection.CongDan.Cha getCha() {
            return cha;
        }

        /**
         * Sets the value of the cha property.
         * 
         * @param value
         *     allowed object is
         *     {@link CongdanCollection.CongDan.Cha }
         *     
         */
        public void setCha(CongdanCollection.CongDan.Cha value) {
            this.cha = value;
        }

        /**
         * Gets the value of the me property.
         * 
         * @return
         *     possible object is
         *     {@link CongdanCollection.CongDan.Me }
         *     
         */
        public CongdanCollection.CongDan.Me getMe() {
            return me;
        }

        /**
         * Sets the value of the me property.
         * 
         * @param value
         *     allowed object is
         *     {@link CongdanCollection.CongDan.Me }
         *     
         */
        public void setMe(CongdanCollection.CongDan.Me value) {
            this.me = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SoDinhDanh" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="QuocTich" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="HoVaTen">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Ho" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ChuDem" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Ten" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "soDinhDanh",
            "quocTich",
            "hoVaTen"
        })
        public static class Cha {

            @XmlElement(name = "SoDinhDanh", required = true)
            protected String soDinhDanh;
            @XmlElement(name = "QuocTich", required = true)
            protected String quocTich;
            @XmlElement(name = "HoVaTen", required = true)
            protected CongdanCollection.CongDan.Cha.HoVaTen hoVaTen;

            /**
             * Gets the value of the soDinhDanh property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSoDinhDanh() {
                return soDinhDanh;
            }

            /**
             * Sets the value of the soDinhDanh property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSoDinhDanh(String value) {
                this.soDinhDanh = value;
            }

            /**
             * Gets the value of the quocTich property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuocTich() {
                return quocTich;
            }

            /**
             * Sets the value of the quocTich property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuocTich(String value) {
                this.quocTich = value;
            }

            /**
             * Gets the value of the hoVaTen property.
             * 
             * @return
             *     possible object is
             *     {@link CongdanCollection.CongDan.Cha.HoVaTen }
             *     
             */
            public CongdanCollection.CongDan.Cha.HoVaTen getHoVaTen() {
                return hoVaTen;
            }

            /**
             * Sets the value of the hoVaTen property.
             * 
             * @param value
             *     allowed object is
             *     {@link CongdanCollection.CongDan.Cha.HoVaTen }
             *     
             */
            public void setHoVaTen(CongdanCollection.CongDan.Cha.HoVaTen value) {
                this.hoVaTen = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Ho" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ChuDem" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Ten" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ho",
                "chuDem",
                "ten"
            })
            public static class HoVaTen {

                @XmlElement(name = "Ho", required = true)
                protected String ho;
                @XmlElement(name = "ChuDem", required = true)
                protected String chuDem;
                @XmlElement(name = "Ten", required = true)
                protected String ten;

                /**
                 * Gets the value of the ho property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHo() {
                    return ho;
                }

                /**
                 * Sets the value of the ho property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHo(String value) {
                    this.ho = value;
                }

                /**
                 * Gets the value of the chuDem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChuDem() {
                    return chuDem;
                }

                /**
                 * Sets the value of the chuDem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChuDem(String value) {
                    this.chuDem = value;
                }

                /**
                 * Gets the value of the ten property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTen() {
                    return ten;
                }

                /**
                 * Sets the value of the ten property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTen(String value) {
                    this.ten = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Ho" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ChuDem" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Ten" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ho",
            "chuDem",
            "ten"
        })
        public static class HoVaTen {

            @XmlElement(name = "Ho", required = true)
            protected String ho;
            @XmlElement(name = "ChuDem", required = true)
            protected String chuDem;
            @XmlElement(name = "Ten", required = true)
            protected String ten;

            /**
             * Gets the value of the ho property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHo() {
                return ho;
            }

            /**
             * Sets the value of the ho property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHo(String value) {
                this.ho = value;
            }

            /**
             * Gets the value of the chuDem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChuDem() {
                return chuDem;
            }

            /**
             * Sets the value of the chuDem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChuDem(String value) {
                this.chuDem = value;
            }

            /**
             * Gets the value of the ten property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTen() {
                return ten;
            }

            /**
             * Sets the value of the ten property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTen(String value) {
                this.ten = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SoDinhDanh" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="QuocTich" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="HoVaTen">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Ho" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ChuDem" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Ten" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "soDinhDanh",
            "quocTich",
            "hoVaTen"
        })
        public static class Me {

            @XmlElement(name = "SoDinhDanh", required = true)
            protected String soDinhDanh;
            @XmlElement(name = "QuocTich", required = true)
            protected String quocTich;
            @XmlElement(name = "HoVaTen", required = true)
            protected CongdanCollection.CongDan.Me.HoVaTen hoVaTen;

            /**
             * Gets the value of the soDinhDanh property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSoDinhDanh() {
                return soDinhDanh;
            }

            /**
             * Sets the value of the soDinhDanh property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSoDinhDanh(String value) {
                this.soDinhDanh = value;
            }

            /**
             * Gets the value of the quocTich property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuocTich() {
                return quocTich;
            }

            /**
             * Sets the value of the quocTich property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuocTich(String value) {
                this.quocTich = value;
            }

            /**
             * Gets the value of the hoVaTen property.
             * 
             * @return
             *     possible object is
             *     {@link CongdanCollection.CongDan.Me.HoVaTen }
             *     
             */
            public CongdanCollection.CongDan.Me.HoVaTen getHoVaTen() {
                return hoVaTen;
            }

            /**
             * Sets the value of the hoVaTen property.
             * 
             * @param value
             *     allowed object is
             *     {@link CongdanCollection.CongDan.Me.HoVaTen }
             *     
             */
            public void setHoVaTen(CongdanCollection.CongDan.Me.HoVaTen value) {
                this.hoVaTen = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Ho" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ChuDem" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Ten" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ho",
                "chuDem",
                "ten"
            })
            public static class HoVaTen {

                @XmlElement(name = "Ho", required = true)
                protected String ho;
                @XmlElement(name = "ChuDem", required = true)
                protected String chuDem;
                @XmlElement(name = "Ten", required = true)
                protected String ten;

                /**
                 * Gets the value of the ho property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHo() {
                    return ho;
                }

                /**
                 * Sets the value of the ho property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHo(String value) {
                    this.ho = value;
                }

                /**
                 * Gets the value of the chuDem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChuDem() {
                    return chuDem;
                }

                /**
                 * Sets the value of the chuDem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChuDem(String value) {
                    this.chuDem = value;
                }

                /**
                 * Gets the value of the ten property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTen() {
                    return ten;
                }

                /**
                 * Sets the value of the ten property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTen(String value) {
                    this.ten = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="NgayThangNam" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ngayThangNam"
        })
        public static class NgayThangNamSinh {

            @XmlElement(name = "NgayThangNam", required = true)
            protected String ngayThangNam;

            /**
             * Gets the value of the ngayThangNam property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNgayThangNam() {
                return ngayThangNam;
            }

            /**
             * Sets the value of the ngayThangNam property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNgayThangNam(String value) {
                this.ngayThangNam = value;
            }

        }

    }

}
