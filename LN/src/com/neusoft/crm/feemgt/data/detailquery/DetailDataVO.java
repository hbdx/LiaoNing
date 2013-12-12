/**
 * DetailDataVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.feemgt.data.detailquery;

public class DetailDataVO  implements java.io.Serializable {
    private float billTotal;

    private java.lang.String callDate;

    private java.lang.String calledNum;

    private java.lang.String callingNum;

    private double duration;

    private java.lang.String endDate;

    private java.util.HashMap exportMap;

    private float favourTotal;

    private java.lang.String feeDate;

    private java.lang.String feeName;

    private double inBytes;

    private double outBytes;

    private java.lang.String serviceId;

    private float totalFee;

    public DetailDataVO() {
    }

    public DetailDataVO(
           float billTotal,
           java.lang.String callDate,
           java.lang.String calledNum,
           java.lang.String callingNum,
           double duration,
           java.lang.String endDate,
           java.util.HashMap exportMap,
           float favourTotal,
           java.lang.String feeDate,
           java.lang.String feeName,
           double inBytes,
           double outBytes,
           java.lang.String serviceId,
           float totalFee) {
           this.billTotal = billTotal;
           this.callDate = callDate;
           this.calledNum = calledNum;
           this.callingNum = callingNum;
           this.duration = duration;
           this.endDate = endDate;
           this.exportMap = exportMap;
           this.favourTotal = favourTotal;
           this.feeDate = feeDate;
           this.feeName = feeName;
           this.inBytes = inBytes;
           this.outBytes = outBytes;
           this.serviceId = serviceId;
           this.totalFee = totalFee;
    }


    /**
     * Gets the billTotal value for this DetailDataVO.
     * 
     * @return billTotal
     */
    public float getBillTotal() {
        return billTotal;
    }


    /**
     * Sets the billTotal value for this DetailDataVO.
     * 
     * @param billTotal
     */
    public void setBillTotal(float billTotal) {
        this.billTotal = billTotal;
    }


    /**
     * Gets the callDate value for this DetailDataVO.
     * 
     * @return callDate
     */
    public java.lang.String getCallDate() {
        return callDate;
    }


    /**
     * Sets the callDate value for this DetailDataVO.
     * 
     * @param callDate
     */
    public void setCallDate(java.lang.String callDate) {
        this.callDate = callDate;
    }


    /**
     * Gets the calledNum value for this DetailDataVO.
     * 
     * @return calledNum
     */
    public java.lang.String getCalledNum() {
        return calledNum;
    }


    /**
     * Sets the calledNum value for this DetailDataVO.
     * 
     * @param calledNum
     */
    public void setCalledNum(java.lang.String calledNum) {
        this.calledNum = calledNum;
    }


    /**
     * Gets the callingNum value for this DetailDataVO.
     * 
     * @return callingNum
     */
    public java.lang.String getCallingNum() {
        return callingNum;
    }


    /**
     * Sets the callingNum value for this DetailDataVO.
     * 
     * @param callingNum
     */
    public void setCallingNum(java.lang.String callingNum) {
        this.callingNum = callingNum;
    }


    /**
     * Gets the duration value for this DetailDataVO.
     * 
     * @return duration
     */
    public double getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this DetailDataVO.
     * 
     * @param duration
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }


    /**
     * Gets the endDate value for this DetailDataVO.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DetailDataVO.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the exportMap value for this DetailDataVO.
     * 
     * @return exportMap
     */
    public java.util.HashMap getExportMap() {
        return exportMap;
    }


    /**
     * Sets the exportMap value for this DetailDataVO.
     * 
     * @param exportMap
     */
    public void setExportMap(java.util.HashMap exportMap) {
        this.exportMap = exportMap;
    }


    /**
     * Gets the favourTotal value for this DetailDataVO.
     * 
     * @return favourTotal
     */
    public float getFavourTotal() {
        return favourTotal;
    }


    /**
     * Sets the favourTotal value for this DetailDataVO.
     * 
     * @param favourTotal
     */
    public void setFavourTotal(float favourTotal) {
        this.favourTotal = favourTotal;
    }


    /**
     * Gets the feeDate value for this DetailDataVO.
     * 
     * @return feeDate
     */
    public java.lang.String getFeeDate() {
        return feeDate;
    }


    /**
     * Sets the feeDate value for this DetailDataVO.
     * 
     * @param feeDate
     */
    public void setFeeDate(java.lang.String feeDate) {
        this.feeDate = feeDate;
    }


    /**
     * Gets the feeName value for this DetailDataVO.
     * 
     * @return feeName
     */
    public java.lang.String getFeeName() {
        return feeName;
    }


    /**
     * Sets the feeName value for this DetailDataVO.
     * 
     * @param feeName
     */
    public void setFeeName(java.lang.String feeName) {
        this.feeName = feeName;
    }


    /**
     * Gets the inBytes value for this DetailDataVO.
     * 
     * @return inBytes
     */
    public double getInBytes() {
        return inBytes;
    }


    /**
     * Sets the inBytes value for this DetailDataVO.
     * 
     * @param inBytes
     */
    public void setInBytes(double inBytes) {
        this.inBytes = inBytes;
    }


    /**
     * Gets the outBytes value for this DetailDataVO.
     * 
     * @return outBytes
     */
    public double getOutBytes() {
        return outBytes;
    }


    /**
     * Sets the outBytes value for this DetailDataVO.
     * 
     * @param outBytes
     */
    public void setOutBytes(double outBytes) {
        this.outBytes = outBytes;
    }


    /**
     * Gets the serviceId value for this DetailDataVO.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this DetailDataVO.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the totalFee value for this DetailDataVO.
     * 
     * @return totalFee
     */
    public float getTotalFee() {
        return totalFee;
    }


    /**
     * Sets the totalFee value for this DetailDataVO.
     * 
     * @param totalFee
     */
    public void setTotalFee(float totalFee) {
        this.totalFee = totalFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetailDataVO)) return false;
        DetailDataVO other = (DetailDataVO) obj;
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
            ((this.calledNum==null && other.getCalledNum()==null) || 
             (this.calledNum!=null &&
              this.calledNum.equals(other.getCalledNum()))) &&
            ((this.callingNum==null && other.getCallingNum()==null) || 
             (this.callingNum!=null &&
              this.callingNum.equals(other.getCallingNum()))) &&
            this.duration == other.getDuration() &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
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
            this.inBytes == other.getInBytes() &&
            this.outBytes == other.getOutBytes() &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
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
        if (getCalledNum() != null) {
            _hashCode += getCalledNum().hashCode();
        }
        if (getCallingNum() != null) {
            _hashCode += getCallingNum().hashCode();
        }
        _hashCode += new Double(getDuration()).hashCode();
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
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
        _hashCode += new Double(getInBytes()).hashCode();
        _hashCode += new Double(getOutBytes()).hashCode();
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        _hashCode += new Float(getTotalFee()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetailDataVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetailDataVO"));
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
        elemField.setFieldName("calledNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
        elemField.setFieldName("inBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
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
