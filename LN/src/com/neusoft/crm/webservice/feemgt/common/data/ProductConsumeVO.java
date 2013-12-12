/**
 * ProductConsumeVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.webservice.feemgt.common.data;

public class ProductConsumeVO  implements java.io.Serializable {
    private java.lang.String consumeNumber;

    private java.lang.String extraInfo;

    private java.lang.String favourName;

    private java.lang.String freeNumber;

    private java.lang.String productName;

    private java.lang.String remainingNumber;

    private java.lang.String serviceId;

    private java.lang.String unit;

    public ProductConsumeVO() {
    }

    public ProductConsumeVO(
           java.lang.String consumeNumber,
           java.lang.String extraInfo,
           java.lang.String favourName,
           java.lang.String freeNumber,
           java.lang.String productName,
           java.lang.String remainingNumber,
           java.lang.String serviceId,
           java.lang.String unit) {
           this.consumeNumber = consumeNumber;
           this.extraInfo = extraInfo;
           this.favourName = favourName;
           this.freeNumber = freeNumber;
           this.productName = productName;
           this.remainingNumber = remainingNumber;
           this.serviceId = serviceId;
           this.unit = unit;
    }


    /**
     * Gets the consumeNumber value for this ProductConsumeVO.
     * 
     * @return consumeNumber
     */
    public java.lang.String getConsumeNumber() {
        return consumeNumber;
    }


    /**
     * Sets the consumeNumber value for this ProductConsumeVO.
     * 
     * @param consumeNumber
     */
    public void setConsumeNumber(java.lang.String consumeNumber) {
        this.consumeNumber = consumeNumber;
    }


    /**
     * Gets the extraInfo value for this ProductConsumeVO.
     * 
     * @return extraInfo
     */
    public java.lang.String getExtraInfo() {
        return extraInfo;
    }


    /**
     * Sets the extraInfo value for this ProductConsumeVO.
     * 
     * @param extraInfo
     */
    public void setExtraInfo(java.lang.String extraInfo) {
        this.extraInfo = extraInfo;
    }


    /**
     * Gets the favourName value for this ProductConsumeVO.
     * 
     * @return favourName
     */
    public java.lang.String getFavourName() {
        return favourName;
    }


    /**
     * Sets the favourName value for this ProductConsumeVO.
     * 
     * @param favourName
     */
    public void setFavourName(java.lang.String favourName) {
        this.favourName = favourName;
    }


    /**
     * Gets the freeNumber value for this ProductConsumeVO.
     * 
     * @return freeNumber
     */
    public java.lang.String getFreeNumber() {
        return freeNumber;
    }


    /**
     * Sets the freeNumber value for this ProductConsumeVO.
     * 
     * @param freeNumber
     */
    public void setFreeNumber(java.lang.String freeNumber) {
        this.freeNumber = freeNumber;
    }


    /**
     * Gets the productName value for this ProductConsumeVO.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this ProductConsumeVO.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the remainingNumber value for this ProductConsumeVO.
     * 
     * @return remainingNumber
     */
    public java.lang.String getRemainingNumber() {
        return remainingNumber;
    }


    /**
     * Sets the remainingNumber value for this ProductConsumeVO.
     * 
     * @param remainingNumber
     */
    public void setRemainingNumber(java.lang.String remainingNumber) {
        this.remainingNumber = remainingNumber;
    }


    /**
     * Gets the serviceId value for this ProductConsumeVO.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this ProductConsumeVO.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the unit value for this ProductConsumeVO.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this ProductConsumeVO.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductConsumeVO)) return false;
        ProductConsumeVO other = (ProductConsumeVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consumeNumber==null && other.getConsumeNumber()==null) || 
             (this.consumeNumber!=null &&
              this.consumeNumber.equals(other.getConsumeNumber()))) &&
            ((this.extraInfo==null && other.getExtraInfo()==null) || 
             (this.extraInfo!=null &&
              this.extraInfo.equals(other.getExtraInfo()))) &&
            ((this.favourName==null && other.getFavourName()==null) || 
             (this.favourName!=null &&
              this.favourName.equals(other.getFavourName()))) &&
            ((this.freeNumber==null && other.getFreeNumber()==null) || 
             (this.freeNumber!=null &&
              this.freeNumber.equals(other.getFreeNumber()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.remainingNumber==null && other.getRemainingNumber()==null) || 
             (this.remainingNumber!=null &&
              this.remainingNumber.equals(other.getRemainingNumber()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
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
        if (getConsumeNumber() != null) {
            _hashCode += getConsumeNumber().hashCode();
        }
        if (getExtraInfo() != null) {
            _hashCode += getExtraInfo().hashCode();
        }
        if (getFavourName() != null) {
            _hashCode += getFavourName().hashCode();
        }
        if (getFreeNumber() != null) {
            _hashCode += getFreeNumber().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getRemainingNumber() != null) {
            _hashCode += getRemainingNumber().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductConsumeVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProductConsumeVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consumeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extraInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favourName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "favourName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
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
