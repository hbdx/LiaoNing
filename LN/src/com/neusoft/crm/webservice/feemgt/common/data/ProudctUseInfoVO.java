/**
 * ProudctUseInfoVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.webservice.feemgt.common.data;

public class ProudctUseInfoVO  implements java.io.Serializable {
    private boolean evdoFlag;

    private com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeVO[] productConsumeArray;

    private com.neusoft.crm.webservice.feemgt.common.data.ProductUseExtraInfoVO[] productUseExtraInfoArray;

    private java.lang.String serviceId;

    public ProudctUseInfoVO() {
    }

    public ProudctUseInfoVO(
           boolean evdoFlag,
           com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeVO[] productConsumeArray,
           com.neusoft.crm.webservice.feemgt.common.data.ProductUseExtraInfoVO[] productUseExtraInfoArray,
           java.lang.String serviceId) {
           this.evdoFlag = evdoFlag;
           this.productConsumeArray = productConsumeArray;
           this.productUseExtraInfoArray = productUseExtraInfoArray;
           this.serviceId = serviceId;
    }


    /**
     * Gets the evdoFlag value for this ProudctUseInfoVO.
     * 
     * @return evdoFlag
     */
    public boolean isEvdoFlag() {
        return evdoFlag;
    }


    /**
     * Sets the evdoFlag value for this ProudctUseInfoVO.
     * 
     * @param evdoFlag
     */
    public void setEvdoFlag(boolean evdoFlag) {
        this.evdoFlag = evdoFlag;
    }


    /**
     * Gets the productConsumeArray value for this ProudctUseInfoVO.
     * 
     * @return productConsumeArray
     */
    public com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeVO[] getProductConsumeArray() {
        return productConsumeArray;
    }


    /**
     * Sets the productConsumeArray value for this ProudctUseInfoVO.
     * 
     * @param productConsumeArray
     */
    public void setProductConsumeArray(com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeVO[] productConsumeArray) {
        this.productConsumeArray = productConsumeArray;
    }


    /**
     * Gets the productUseExtraInfoArray value for this ProudctUseInfoVO.
     * 
     * @return productUseExtraInfoArray
     */
    public com.neusoft.crm.webservice.feemgt.common.data.ProductUseExtraInfoVO[] getProductUseExtraInfoArray() {
        return productUseExtraInfoArray;
    }


    /**
     * Sets the productUseExtraInfoArray value for this ProudctUseInfoVO.
     * 
     * @param productUseExtraInfoArray
     */
    public void setProductUseExtraInfoArray(com.neusoft.crm.webservice.feemgt.common.data.ProductUseExtraInfoVO[] productUseExtraInfoArray) {
        this.productUseExtraInfoArray = productUseExtraInfoArray;
    }


    /**
     * Gets the serviceId value for this ProudctUseInfoVO.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this ProudctUseInfoVO.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProudctUseInfoVO)) return false;
        ProudctUseInfoVO other = (ProudctUseInfoVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.evdoFlag == other.isEvdoFlag() &&
            ((this.productConsumeArray==null && other.getProductConsumeArray()==null) || 
             (this.productConsumeArray!=null &&
              java.util.Arrays.equals(this.productConsumeArray, other.getProductConsumeArray()))) &&
            ((this.productUseExtraInfoArray==null && other.getProductUseExtraInfoArray()==null) || 
             (this.productUseExtraInfoArray!=null &&
              java.util.Arrays.equals(this.productUseExtraInfoArray, other.getProductUseExtraInfoArray()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId())));
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
        _hashCode += (isEvdoFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProductConsumeArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductConsumeArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductConsumeArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductUseExtraInfoArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductUseExtraInfoArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductUseExtraInfoArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProudctUseInfoVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProudctUseInfoVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evdoFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "evdoFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productConsumeArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productConsumeArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProductConsumeVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productUseExtraInfoArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productUseExtraInfoArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProductUseExtraInfoVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
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
