/**
 * AccountDetailInfoVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.webservice.feemgt.common.data;

public class AccountDetailInfoVO  implements java.io.Serializable {
    private long accountId;

    private java.lang.String cityCode;

    private java.lang.String feeName;

    private java.lang.String feeValue;

    private long useId;

    public AccountDetailInfoVO() {
    }

    public AccountDetailInfoVO(
           long accountId,
           java.lang.String cityCode,
           java.lang.String feeName,
           java.lang.String feeValue,
           long useId) {
           this.accountId = accountId;
           this.cityCode = cityCode;
           this.feeName = feeName;
           this.feeValue = feeValue;
           this.useId = useId;
    }


    /**
     * Gets the accountId value for this AccountDetailInfoVO.
     * 
     * @return accountId
     */
    public long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this AccountDetailInfoVO.
     * 
     * @param accountId
     */
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the cityCode value for this AccountDetailInfoVO.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this AccountDetailInfoVO.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }


    /**
     * Gets the feeName value for this AccountDetailInfoVO.
     * 
     * @return feeName
     */
    public java.lang.String getFeeName() {
        return feeName;
    }


    /**
     * Sets the feeName value for this AccountDetailInfoVO.
     * 
     * @param feeName
     */
    public void setFeeName(java.lang.String feeName) {
        this.feeName = feeName;
    }


    /**
     * Gets the feeValue value for this AccountDetailInfoVO.
     * 
     * @return feeValue
     */
    public java.lang.String getFeeValue() {
        return feeValue;
    }


    /**
     * Sets the feeValue value for this AccountDetailInfoVO.
     * 
     * @param feeValue
     */
    public void setFeeValue(java.lang.String feeValue) {
        this.feeValue = feeValue;
    }


    /**
     * Gets the useId value for this AccountDetailInfoVO.
     * 
     * @return useId
     */
    public long getUseId() {
        return useId;
    }


    /**
     * Sets the useId value for this AccountDetailInfoVO.
     * 
     * @param useId
     */
    public void setUseId(long useId) {
        this.useId = useId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountDetailInfoVO)) return false;
        AccountDetailInfoVO other = (AccountDetailInfoVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountId == other.getAccountId() &&
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode()))) &&
            ((this.feeName==null && other.getFeeName()==null) || 
             (this.feeName!=null &&
              this.feeName.equals(other.getFeeName()))) &&
            ((this.feeValue==null && other.getFeeValue()==null) || 
             (this.feeValue!=null &&
              this.feeValue.equals(other.getFeeValue()))) &&
            this.useId == other.getUseId();
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
        _hashCode += new Long(getAccountId()).hashCode();
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        if (getFeeName() != null) {
            _hashCode += getFeeName().hashCode();
        }
        if (getFeeValue() != null) {
            _hashCode += getFeeValue().hashCode();
        }
        _hashCode += new Long(getUseId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountDetailInfoVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "AccountDetailInfoVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
