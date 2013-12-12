/**
 * PaymentBankQueryVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.webservice.feemgt.common.data;

public class PaymentBankQueryVO  implements java.io.Serializable {
    private java.lang.String billDate;

    private java.lang.String binkId;

    private java.lang.String cityCode;

    private int ifIntelligent;

    private java.lang.String invoceNo;

    private java.lang.String operateDate;

    private java.lang.String operateId;

    private java.lang.String operator;

    private java.lang.String serviceId;

    private java.lang.String serviceKind;

    private int settleFlag;

    private int status;

    private java.lang.String traceNo;

    private java.lang.String transDate;

    private double transFee;

    public PaymentBankQueryVO() {
    }

    public PaymentBankQueryVO(
           java.lang.String billDate,
           java.lang.String binkId,
           java.lang.String cityCode,
           int ifIntelligent,
           java.lang.String invoceNo,
           java.lang.String operateDate,
           java.lang.String operateId,
           java.lang.String operator,
           java.lang.String serviceId,
           java.lang.String serviceKind,
           int settleFlag,
           int status,
           java.lang.String traceNo,
           java.lang.String transDate,
           double transFee) {
           this.billDate = billDate;
           this.binkId = binkId;
           this.cityCode = cityCode;
           this.ifIntelligent = ifIntelligent;
           this.invoceNo = invoceNo;
           this.operateDate = operateDate;
           this.operateId = operateId;
           this.operator = operator;
           this.serviceId = serviceId;
           this.serviceKind = serviceKind;
           this.settleFlag = settleFlag;
           this.status = status;
           this.traceNo = traceNo;
           this.transDate = transDate;
           this.transFee = transFee;
    }


    /**
     * Gets the billDate value for this PaymentBankQueryVO.
     * 
     * @return billDate
     */
    public java.lang.String getBillDate() {
        return billDate;
    }


    /**
     * Sets the billDate value for this PaymentBankQueryVO.
     * 
     * @param billDate
     */
    public void setBillDate(java.lang.String billDate) {
        this.billDate = billDate;
    }


    /**
     * Gets the binkId value for this PaymentBankQueryVO.
     * 
     * @return binkId
     */
    public java.lang.String getBinkId() {
        return binkId;
    }


    /**
     * Sets the binkId value for this PaymentBankQueryVO.
     * 
     * @param binkId
     */
    public void setBinkId(java.lang.String binkId) {
        this.binkId = binkId;
    }


    /**
     * Gets the cityCode value for this PaymentBankQueryVO.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this PaymentBankQueryVO.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }


    /**
     * Gets the ifIntelligent value for this PaymentBankQueryVO.
     * 
     * @return ifIntelligent
     */
    public int getIfIntelligent() {
        return ifIntelligent;
    }


    /**
     * Sets the ifIntelligent value for this PaymentBankQueryVO.
     * 
     * @param ifIntelligent
     */
    public void setIfIntelligent(int ifIntelligent) {
        this.ifIntelligent = ifIntelligent;
    }


    /**
     * Gets the invoceNo value for this PaymentBankQueryVO.
     * 
     * @return invoceNo
     */
    public java.lang.String getInvoceNo() {
        return invoceNo;
    }


    /**
     * Sets the invoceNo value for this PaymentBankQueryVO.
     * 
     * @param invoceNo
     */
    public void setInvoceNo(java.lang.String invoceNo) {
        this.invoceNo = invoceNo;
    }


    /**
     * Gets the operateDate value for this PaymentBankQueryVO.
     * 
     * @return operateDate
     */
    public java.lang.String getOperateDate() {
        return operateDate;
    }


    /**
     * Sets the operateDate value for this PaymentBankQueryVO.
     * 
     * @param operateDate
     */
    public void setOperateDate(java.lang.String operateDate) {
        this.operateDate = operateDate;
    }


    /**
     * Gets the operateId value for this PaymentBankQueryVO.
     * 
     * @return operateId
     */
    public java.lang.String getOperateId() {
        return operateId;
    }


    /**
     * Sets the operateId value for this PaymentBankQueryVO.
     * 
     * @param operateId
     */
    public void setOperateId(java.lang.String operateId) {
        this.operateId = operateId;
    }


    /**
     * Gets the operator value for this PaymentBankQueryVO.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this PaymentBankQueryVO.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the serviceId value for this PaymentBankQueryVO.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this PaymentBankQueryVO.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceKind value for this PaymentBankQueryVO.
     * 
     * @return serviceKind
     */
    public java.lang.String getServiceKind() {
        return serviceKind;
    }


    /**
     * Sets the serviceKind value for this PaymentBankQueryVO.
     * 
     * @param serviceKind
     */
    public void setServiceKind(java.lang.String serviceKind) {
        this.serviceKind = serviceKind;
    }


    /**
     * Gets the settleFlag value for this PaymentBankQueryVO.
     * 
     * @return settleFlag
     */
    public int getSettleFlag() {
        return settleFlag;
    }


    /**
     * Sets the settleFlag value for this PaymentBankQueryVO.
     * 
     * @param settleFlag
     */
    public void setSettleFlag(int settleFlag) {
        this.settleFlag = settleFlag;
    }


    /**
     * Gets the status value for this PaymentBankQueryVO.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PaymentBankQueryVO.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the traceNo value for this PaymentBankQueryVO.
     * 
     * @return traceNo
     */
    public java.lang.String getTraceNo() {
        return traceNo;
    }


    /**
     * Sets the traceNo value for this PaymentBankQueryVO.
     * 
     * @param traceNo
     */
    public void setTraceNo(java.lang.String traceNo) {
        this.traceNo = traceNo;
    }


    /**
     * Gets the transDate value for this PaymentBankQueryVO.
     * 
     * @return transDate
     */
    public java.lang.String getTransDate() {
        return transDate;
    }


    /**
     * Sets the transDate value for this PaymentBankQueryVO.
     * 
     * @param transDate
     */
    public void setTransDate(java.lang.String transDate) {
        this.transDate = transDate;
    }


    /**
     * Gets the transFee value for this PaymentBankQueryVO.
     * 
     * @return transFee
     */
    public double getTransFee() {
        return transFee;
    }


    /**
     * Sets the transFee value for this PaymentBankQueryVO.
     * 
     * @param transFee
     */
    public void setTransFee(double transFee) {
        this.transFee = transFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentBankQueryVO)) return false;
        PaymentBankQueryVO other = (PaymentBankQueryVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billDate==null && other.getBillDate()==null) || 
             (this.billDate!=null &&
              this.billDate.equals(other.getBillDate()))) &&
            ((this.binkId==null && other.getBinkId()==null) || 
             (this.binkId!=null &&
              this.binkId.equals(other.getBinkId()))) &&
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode()))) &&
            this.ifIntelligent == other.getIfIntelligent() &&
            ((this.invoceNo==null && other.getInvoceNo()==null) || 
             (this.invoceNo!=null &&
              this.invoceNo.equals(other.getInvoceNo()))) &&
            ((this.operateDate==null && other.getOperateDate()==null) || 
             (this.operateDate!=null &&
              this.operateDate.equals(other.getOperateDate()))) &&
            ((this.operateId==null && other.getOperateId()==null) || 
             (this.operateId!=null &&
              this.operateId.equals(other.getOperateId()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.serviceKind==null && other.getServiceKind()==null) || 
             (this.serviceKind!=null &&
              this.serviceKind.equals(other.getServiceKind()))) &&
            this.settleFlag == other.getSettleFlag() &&
            this.status == other.getStatus() &&
            ((this.traceNo==null && other.getTraceNo()==null) || 
             (this.traceNo!=null &&
              this.traceNo.equals(other.getTraceNo()))) &&
            ((this.transDate==null && other.getTransDate()==null) || 
             (this.transDate!=null &&
              this.transDate.equals(other.getTransDate()))) &&
            this.transFee == other.getTransFee();
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
        if (getBillDate() != null) {
            _hashCode += getBillDate().hashCode();
        }
        if (getBinkId() != null) {
            _hashCode += getBinkId().hashCode();
        }
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        _hashCode += getIfIntelligent();
        if (getInvoceNo() != null) {
            _hashCode += getInvoceNo().hashCode();
        }
        if (getOperateDate() != null) {
            _hashCode += getOperateDate().hashCode();
        }
        if (getOperateId() != null) {
            _hashCode += getOperateId().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getServiceKind() != null) {
            _hashCode += getServiceKind().hashCode();
        }
        _hashCode += getSettleFlag();
        _hashCode += getStatus();
        if (getTraceNo() != null) {
            _hashCode += getTraceNo().hashCode();
        }
        if (getTransDate() != null) {
            _hashCode += getTransDate().hashCode();
        }
        _hashCode += new Double(getTransFee()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentBankQueryVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "PaymentBankQueryVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "binkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifIntelligent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifIntelligent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
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
        elemField.setFieldName("serviceKind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settleFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "settleFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
