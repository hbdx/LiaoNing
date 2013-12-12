/**
 * BillQueryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.BillQuery;

public class BillQueryRequest  implements java.io.Serializable {
    private java.lang.String requestId;

    private java.lang.String systemId;

    private java.lang.String queryType;

    private java.lang.String serviceId;

    private int serviceKind;

    private java.lang.String feeDate;

    public BillQueryRequest() {
    }

    public BillQueryRequest(
           java.lang.String requestId,
           java.lang.String systemId,
           java.lang.String queryType,
           java.lang.String serviceId,
           int serviceKind,
           java.lang.String feeDate) {
           this.requestId = requestId;
           this.systemId = systemId;
           this.queryType = queryType;
           this.serviceId = serviceId;
           this.serviceKind = serviceKind;
           this.feeDate = feeDate;
    }


    /**
     * Gets the requestId value for this BillQueryRequest.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this BillQueryRequest.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the systemId value for this BillQueryRequest.
     * 
     * @return systemId
     */
    public java.lang.String getSystemId() {
        return systemId;
    }


    /**
     * Sets the systemId value for this BillQueryRequest.
     * 
     * @param systemId
     */
    public void setSystemId(java.lang.String systemId) {
        this.systemId = systemId;
    }


    /**
     * Gets the queryType value for this BillQueryRequest.
     * 
     * @return queryType
     */
    public java.lang.String getQueryType() {
        return queryType;
    }


    /**
     * Sets the queryType value for this BillQueryRequest.
     * 
     * @param queryType
     */
    public void setQueryType(java.lang.String queryType) {
        this.queryType = queryType;
    }


    /**
     * Gets the serviceId value for this BillQueryRequest.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this BillQueryRequest.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceKind value for this BillQueryRequest.
     * 
     * @return serviceKind
     */
    public int getServiceKind() {
        return serviceKind;
    }


    /**
     * Sets the serviceKind value for this BillQueryRequest.
     * 
     * @param serviceKind
     */
    public void setServiceKind(int serviceKind) {
        this.serviceKind = serviceKind;
    }


    /**
     * Gets the feeDate value for this BillQueryRequest.
     * 
     * @return feeDate
     */
    public java.lang.String getFeeDate() {
        return feeDate;
    }


    /**
     * Sets the feeDate value for this BillQueryRequest.
     * 
     * @param feeDate
     */
    public void setFeeDate(java.lang.String feeDate) {
        this.feeDate = feeDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillQueryRequest)) return false;
        BillQueryRequest other = (BillQueryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.systemId==null && other.getSystemId()==null) || 
             (this.systemId!=null &&
              this.systemId.equals(other.getSystemId()))) &&
            ((this.queryType==null && other.getQueryType()==null) || 
             (this.queryType!=null &&
              this.queryType.equals(other.getQueryType()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            this.serviceKind == other.getServiceKind() &&
            ((this.feeDate==null && other.getFeeDate()==null) || 
             (this.feeDate!=null &&
              this.feeDate.equals(other.getFeeDate())));
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
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getSystemId() != null) {
            _hashCode += getSystemId().hashCode();
        }
        if (getQueryType() != null) {
            _hashCode += getQueryType().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        _hashCode += getServiceKind();
        if (getFeeDate() != null) {
            _hashCode += getFeeDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillQueryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", ">BillQueryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceKind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FeeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
