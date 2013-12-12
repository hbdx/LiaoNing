/**
 * ProductUseExtraInfoVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.webservice.feemgt.common.data;

public class ProductUseExtraInfoVO  implements java.io.Serializable {
    private java.lang.String extraInfo;

    private java.lang.String unit;

    public ProductUseExtraInfoVO() {
    }

    public ProductUseExtraInfoVO(
           java.lang.String extraInfo,
           java.lang.String unit) {
           this.extraInfo = extraInfo;
           this.unit = unit;
    }


    /**
     * Gets the extraInfo value for this ProductUseExtraInfoVO.
     * 
     * @return extraInfo
     */
    public java.lang.String getExtraInfo() {
        return extraInfo;
    }


    /**
     * Sets the extraInfo value for this ProductUseExtraInfoVO.
     * 
     * @param extraInfo
     */
    public void setExtraInfo(java.lang.String extraInfo) {
        this.extraInfo = extraInfo;
    }


    /**
     * Gets the unit value for this ProductUseExtraInfoVO.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this ProductUseExtraInfoVO.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductUseExtraInfoVO)) return false;
        ProductUseExtraInfoVO other = (ProductUseExtraInfoVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extraInfo==null && other.getExtraInfo()==null) || 
             (this.extraInfo!=null &&
              this.extraInfo.equals(other.getExtraInfo()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExtraInfo() != null) {
            _hashCode += getExtraInfo().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductUseExtraInfoVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProductUseExtraInfoVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extraInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
