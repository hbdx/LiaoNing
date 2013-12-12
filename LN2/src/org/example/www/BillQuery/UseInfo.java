/**
 * UseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.BillQuery;

public class UseInfo  implements java.io.Serializable {
    private java.lang.String serviceId;

    private java.lang.String prodUseName;

    private java.lang.String totalUseValue;

    private java.lang.String useInfoValue;

    private int amountType;

    public UseInfo() {
    }

    public UseInfo(
           java.lang.String serviceId,
           java.lang.String prodUseName,
           java.lang.String totalUseValue,
           java.lang.String useInfoValue,
           int amountType) {
           this.serviceId = serviceId;
           this.prodUseName = prodUseName;
           this.totalUseValue = totalUseValue;
           this.useInfoValue = useInfoValue;
           this.amountType = amountType;
    }


    /**
     * Gets the serviceId value for this UseInfo.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this UseInfo.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the prodUseName value for this UseInfo.
     * 
     * @return prodUseName
     */
    public java.lang.String getProdUseName() {
        return prodUseName;
    }


    /**
     * Sets the prodUseName value for this UseInfo.
     * 
     * @param prodUseName
     */
    public void setProdUseName(java.lang.String prodUseName) {
        this.prodUseName = prodUseName;
    }


    /**
     * Gets the totalUseValue value for this UseInfo.
     * 
     * @return totalUseValue
     */
    public java.lang.String getTotalUseValue() {
        return totalUseValue;
    }


    /**
     * Sets the totalUseValue value for this UseInfo.
     * 
     * @param totalUseValue
     */
    public void setTotalUseValue(java.lang.String totalUseValue) {
        this.totalUseValue = totalUseValue;
    }


    /**
     * Gets the useInfoValue value for this UseInfo.
     * 
     * @return useInfoValue
     */
    public java.lang.String getUseInfoValue() {
        return useInfoValue;
    }


    /**
     * Sets the useInfoValue value for this UseInfo.
     * 
     * @param useInfoValue
     */
    public void setUseInfoValue(java.lang.String useInfoValue) {
        this.useInfoValue = useInfoValue;
    }


    /**
     * Gets the amountType value for this UseInfo.
     * 
     * @return amountType
     */
    public int getAmountType() {
        return amountType;
    }


    /**
     * Sets the amountType value for this UseInfo.
     * 
     * @param amountType
     */
    public void setAmountType(int amountType) {
        this.amountType = amountType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UseInfo)) return false;
        UseInfo other = (UseInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.prodUseName==null && other.getProdUseName()==null) || 
             (this.prodUseName!=null &&
              this.prodUseName.equals(other.getProdUseName()))) &&
            ((this.totalUseValue==null && other.getTotalUseValue()==null) || 
             (this.totalUseValue!=null &&
              this.totalUseValue.equals(other.getTotalUseValue()))) &&
            ((this.useInfoValue==null && other.getUseInfoValue()==null) || 
             (this.useInfoValue!=null &&
              this.useInfoValue.equals(other.getUseInfoValue()))) &&
            this.amountType == other.getAmountType();
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
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getProdUseName() != null) {
            _hashCode += getProdUseName().hashCode();
        }
        if (getTotalUseValue() != null) {
            _hashCode += getTotalUseValue().hashCode();
        }
        if (getUseInfoValue() != null) {
            _hashCode += getUseInfoValue().hashCode();
        }
        _hashCode += getAmountType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", "UseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodUseName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProdUseName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUseValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalUseValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useInfoValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UseInfoValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AmountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
