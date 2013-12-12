/**
 * DetailPstnVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.feemgt.data.detailquery;

public class DetailPstnVO  implements java.io.Serializable {
    private float billTotal;

    private java.lang.String callDate;

    private java.lang.String callType;

    private java.lang.String callingNumber;

    private java.lang.String counterNumber;

    private long duration;

    private java.util.HashMap exportMap;

    private float favourTotal;

    private java.lang.String feeDate;

    private java.lang.String feeName;

    private java.lang.String serviceId;

    private java.lang.String tollType;

    private float totalFee;

    public DetailPstnVO() {
    }

    public DetailPstnVO(
           float billTotal,
           java.lang.String callDate,
           java.lang.String callType,
           java.lang.String callingNumber,
           java.lang.String counterNumber,
           long duration,
           java.util.HashMap exportMap,
           float favourTotal,
           java.lang.String feeDate,
           java.lang.String feeName,
           java.lang.String serviceId,
           java.lang.String tollType,
           float totalFee) {
           this.billTotal = billTotal;
           this.callDate = callDate;
           this.callType = callType;
           this.callingNumber = callingNumber;
           this.counterNumber = counterNumber;
           this.duration = duration;
           this.exportMap = exportMap;
           this.favourTotal = favourTotal;
           this.feeDate = feeDate;
           this.feeName = feeName;
           this.serviceId = serviceId;
           this.tollType = tollType;
           this.totalFee = totalFee;
    }


    /**
     * Gets the billTotal value for this DetailPstnVO.
     * 
     * @return billTotal
     */
    public float getBillTotal() {
        return billTotal;
    }


    /**
     * Sets the billTotal value for this DetailPstnVO.
     * 
     * @param billTotal
     */
    public void setBillTotal(float billTotal) {
        this.billTotal = billTotal;
    }


    /**
     * Gets the callDate value for this DetailPstnVO.
     * 
     * @return callDate
     */
    public java.lang.String getCallDate() {
        return callDate;
    }


    /**
     * Sets the callDate value for this DetailPstnVO.
     * 
     * @param callDate
     */
    public void setCallDate(java.lang.String callDate) {
        this.callDate = callDate;
    }


    /**
     * Gets the callType value for this DetailPstnVO.
     * 
     * @return callType
     */
    public java.lang.String getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this DetailPstnVO.
     * 
     * @param callType
     */
    public void setCallType(java.lang.String callType) {
        this.callType = callType;
    }


    /**
     * Gets the callingNumber value for this DetailPstnVO.
     * 
     * @return callingNumber
     */
    public java.lang.String getCallingNumber() {
        return callingNumber;
    }


    /**
     * Sets the callingNumber value for this DetailPstnVO.
     * 
     * @param callingNumber
     */
    public void setCallingNumber(java.lang.String callingNumber) {
        this.callingNumber = callingNumber;
    }


    /**
     * Gets the counterNumber value for this DetailPstnVO.
     * 
     * @return counterNumber
     */
    public java.lang.String getCounterNumber() {
        return counterNumber;
    }


    /**
     * Sets the counterNumber value for this DetailPstnVO.
     * 
     * @param counterNumber
     */
    public void setCounterNumber(java.lang.String counterNumber) {
        this.counterNumber = counterNumber;
    }


    /**
     * Gets the duration value for this DetailPstnVO.
     * 
     * @return duration
     */
    public long getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this DetailPstnVO.
     * 
     * @param duration
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }


    /**
     * Gets the exportMap value for this DetailPstnVO.
     * 
     * @return exportMap
     */
    public java.util.HashMap getExportMap() {
        return exportMap;
    }


    /**
     * Sets the exportMap value for this DetailPstnVO.
     * 
     * @param exportMap
     */
    public void setExportMap(java.util.HashMap exportMap) {
        this.exportMap = exportMap;
    }


    /**
     * Gets the favourTotal value for this DetailPstnVO.
     * 
     * @return favourTotal
     */
    public float getFavourTotal() {
        return favourTotal;
    }


    /**
     * Sets the favourTotal value for this DetailPstnVO.
     * 
     * @param favourTotal
     */
    public void setFavourTotal(float favourTotal) {
        this.favourTotal = favourTotal;
    }


    /**
     * Gets the feeDate value for this DetailPstnVO.
     * 
     * @return feeDate
     */
    public java.lang.String getFeeDate() {
        return feeDate;
    }


    /**
     * Sets the feeDate value for this DetailPstnVO.
     * 
     * @param feeDate
     */
    public void setFeeDate(java.lang.String feeDate) {
        this.feeDate = feeDate;
    }


    /**
     * Gets the feeName value for this DetailPstnVO.
     * 
     * @return feeName
     */
    public java.lang.String getFeeName() {
        return feeName;
    }


    /**
     * Sets the feeName value for this DetailPstnVO.
     * 
     * @param feeName
     */
    public void setFeeName(java.lang.String feeName) {
        this.feeName = feeName;
    }


    /**
     * Gets the serviceId value for this DetailPstnVO.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this DetailPstnVO.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the tollType value for this DetailPstnVO.
     * 
     * @return tollType
     */
    public java.lang.String getTollType() {
        return tollType;
    }


    /**
     * Sets the tollType value for this DetailPstnVO.
     * 
     * @param tollType
     */
    public void setTollType(java.lang.String tollType) {
        this.tollType = tollType;
    }


    /**
     * Gets the totalFee value for this DetailPstnVO.
     * 
     * @return totalFee
     */
    public float getTotalFee() {
        return totalFee;
    }


    /**
     * Sets the totalFee value for this DetailPstnVO.
     * 
     * @param totalFee
     */
    public void setTotalFee(float totalFee) {
        this.totalFee = totalFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetailPstnVO)) return false;
        DetailPstnVO other = (DetailPstnVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.billTotal == other.getBillTotal() &&
            ((this.callDate==null && other.getCallDate()==null) || 
             (this.callDate!=null &&
              this.callDate.equals(other.getCallDate()))) &&
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
            ((this.callingNumber==null && other.getCallingNumber()==null) || 
             (this.callingNumber!=null &&
              this.callingNumber.equals(other.getCallingNumber()))) &&
            ((this.counterNumber==null && other.getCounterNumber()==null) || 
             (this.counterNumber!=null &&
              this.counterNumber.equals(other.getCounterNumber()))) &&
            this.duration == other.getDuration() &&
            ((this.exportMap==null && other.getExportMap()==null) || 
             (this.exportMap!=null &&
              this.exportMap.equals(other.getExportMap()))) &&
            this.favourTotal == other.getFavourTotal() &&
            ((this.feeDate==null && other.getFeeDate()==null) || 
             (this.feeDate!=null &&
              this.feeDate.equals(other.getFeeDate()))) &&
            ((this.feeName==null && other.getFeeName()==null) || 
             (this.feeName!=null &&
              this.feeName.equals(other.getFeeName()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.tollType==null && other.getTollType()==null) || 
             (this.tollType!=null &&
              this.tollType.equals(other.getTollType()))) &&
            this.totalFee == other.getTotalFee();
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
        _hashCode += new Float(getBillTotal()).hashCode();
        if (getCallDate() != null) {
            _hashCode += getCallDate().hashCode();
        }
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
        }
        if (getCallingNumber() != null) {
            _hashCode += getCallingNumber().hashCode();
        }
        if (getCounterNumber() != null) {
            _hashCode += getCounterNumber().hashCode();
        }
        _hashCode += new Long(getDuration()).hashCode();
        if (getExportMap() != null) {
            _hashCode += getExportMap().hashCode();
        }
        _hashCode += new Float(getFavourTotal()).hashCode();
        if (getFeeDate() != null) {
            _hashCode += getFeeDate().hashCode();
        }
        if (getFeeName() != null) {
            _hashCode += getFeeName().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getTollType() != null) {
            _hashCode += getTollType().hashCode();
        }
        _hashCode += new Float(getTotalFee()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetailPstnVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetailPstnVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counterNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "counterNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportMap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exportMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favourTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "favourTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeDate"));
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
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tollType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tollType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
