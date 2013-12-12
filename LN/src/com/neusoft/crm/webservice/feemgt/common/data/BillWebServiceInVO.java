/**
 * BillWebServiceInVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.webservice.feemgt.common.data;

public class BillWebServiceInVO  implements java.io.Serializable {
    private com.neusoft.crm.webservice.feemgt.common.data.DetailBillListVO detailBillListVO;

    private java.lang.String errorDesc;

    private java.lang.String eventType;

    private com.neusoft.crm.webservice.feemgt.common.data.LeftFeeVO leftFeeVO;

    private java.lang.String moduleName;

    private boolean sucess;

    private java.lang.String cityCode;

    private java.lang.String serviceId;

    private int serviceKind;

    private java.lang.String applyEvent;

    private java.lang.String bankFlowNumber;

    private java.lang.String bankId;

    private int end;

    private int ifContinue;

    private java.lang.String notifyDate;

    private double payfee;

    private com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeParamVO productConsumeParamVO;

    private int start;

    public BillWebServiceInVO() {
    }

    public BillWebServiceInVO(
           com.neusoft.crm.webservice.feemgt.common.data.DetailBillListVO detailBillListVO,
           java.lang.String errorDesc,
           java.lang.String eventType,
           com.neusoft.crm.webservice.feemgt.common.data.LeftFeeVO leftFeeVO,
           java.lang.String moduleName,
           boolean sucess,
           java.lang.String cityCode,
           java.lang.String serviceId,
           int serviceKind,
           java.lang.String applyEvent,
           java.lang.String bankFlowNumber,
           java.lang.String bankId,
           int end,
           int ifContinue,
           java.lang.String notifyDate,
           double payfee,
           com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeParamVO productConsumeParamVO,
           int start) {
           this.detailBillListVO = detailBillListVO;
           this.errorDesc = errorDesc;
           this.eventType = eventType;
           this.leftFeeVO = leftFeeVO;
           this.moduleName = moduleName;
           this.sucess = sucess;
           this.cityCode = cityCode;
           this.serviceId = serviceId;
           this.serviceKind = serviceKind;
           this.applyEvent = applyEvent;
           this.bankFlowNumber = bankFlowNumber;
           this.bankId = bankId;
           this.end = end;
           this.ifContinue = ifContinue;
           this.notifyDate = notifyDate;
           this.payfee = payfee;
           this.productConsumeParamVO = productConsumeParamVO;
           this.start = start;
    }


    /**
     * Gets the detailBillListVO value for this BillWebServiceInVO.
     * 
     * @return detailBillListVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.DetailBillListVO getDetailBillListVO() {
        return detailBillListVO;
    }


    /**
     * Sets the detailBillListVO value for this BillWebServiceInVO.
     * 
     * @param detailBillListVO
     */
    public void setDetailBillListVO(com.neusoft.crm.webservice.feemgt.common.data.DetailBillListVO detailBillListVO) {
        this.detailBillListVO = detailBillListVO;
    }


    /**
     * Gets the errorDesc value for this BillWebServiceInVO.
     * 
     * @return errorDesc
     */
    public java.lang.String getErrorDesc() {
        return errorDesc;
    }


    /**
     * Sets the errorDesc value for this BillWebServiceInVO.
     * 
     * @param errorDesc
     */
    public void setErrorDesc(java.lang.String errorDesc) {
        this.errorDesc = errorDesc;
    }


    /**
     * Gets the eventType value for this BillWebServiceInVO.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this BillWebServiceInVO.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the leftFeeVO value for this BillWebServiceInVO.
     * 
     * @return leftFeeVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.LeftFeeVO getLeftFeeVO() {
        return leftFeeVO;
    }


    /**
     * Sets the leftFeeVO value for this BillWebServiceInVO.
     * 
     * @param leftFeeVO
     */
    public void setLeftFeeVO(com.neusoft.crm.webservice.feemgt.common.data.LeftFeeVO leftFeeVO) {
        this.leftFeeVO = leftFeeVO;
    }


    /**
     * Gets the moduleName value for this BillWebServiceInVO.
     * 
     * @return moduleName
     */
    public java.lang.String getModuleName() {
        return moduleName;
    }


    /**
     * Sets the moduleName value for this BillWebServiceInVO.
     * 
     * @param moduleName
     */
    public void setModuleName(java.lang.String moduleName) {
        this.moduleName = moduleName;
    }


    /**
     * Gets the sucess value for this BillWebServiceInVO.
     * 
     * @return sucess
     */
    public boolean isSucess() {
        return sucess;
    }


    /**
     * Sets the sucess value for this BillWebServiceInVO.
     * 
     * @param sucess
     */
    public void setSucess(boolean sucess) {
        this.sucess = sucess;
    }


    /**
     * Gets the cityCode value for this BillWebServiceInVO.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this BillWebServiceInVO.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }


    /**
     * Gets the serviceId value for this BillWebServiceInVO.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this BillWebServiceInVO.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceKind value for this BillWebServiceInVO.
     * 
     * @return serviceKind
     */
    public int getServiceKind() {
        return serviceKind;
    }


    /**
     * Sets the serviceKind value for this BillWebServiceInVO.
     * 
     * @param serviceKind
     */
    public void setServiceKind(int serviceKind) {
        this.serviceKind = serviceKind;
    }


    /**
     * Gets the applyEvent value for this BillWebServiceInVO.
     * 
     * @return applyEvent
     */
    public java.lang.String getApplyEvent() {
        return applyEvent;
    }


    /**
     * Sets the applyEvent value for this BillWebServiceInVO.
     * 
     * @param applyEvent
     */
    public void setApplyEvent(java.lang.String applyEvent) {
        this.applyEvent = applyEvent;
    }


    /**
     * Gets the bankFlowNumber value for this BillWebServiceInVO.
     * 
     * @return bankFlowNumber
     */
    public java.lang.String getBankFlowNumber() {
        return bankFlowNumber;
    }


    /**
     * Sets the bankFlowNumber value for this BillWebServiceInVO.
     * 
     * @param bankFlowNumber
     */
    public void setBankFlowNumber(java.lang.String bankFlowNumber) {
        this.bankFlowNumber = bankFlowNumber;
    }


    /**
     * Gets the bankId value for this BillWebServiceInVO.
     * 
     * @return bankId
     */
    public java.lang.String getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this BillWebServiceInVO.
     * 
     * @param bankId
     */
    public void setBankId(java.lang.String bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the end value for this BillWebServiceInVO.
     * 
     * @return end
     */
    public int getEnd() {
        return end;
    }


    /**
     * Sets the end value for this BillWebServiceInVO.
     * 
     * @param end
     */
    public void setEnd(int end) {
        this.end = end;
    }


    /**
     * Gets the ifContinue value for this BillWebServiceInVO.
     * 
     * @return ifContinue
     */
    public int getIfContinue() {
        return ifContinue;
    }


    /**
     * Sets the ifContinue value for this BillWebServiceInVO.
     * 
     * @param ifContinue
     */
    public void setIfContinue(int ifContinue) {
        this.ifContinue = ifContinue;
    }


    /**
     * Gets the notifyDate value for this BillWebServiceInVO.
     * 
     * @return notifyDate
     */
    public java.lang.String getNotifyDate() {
        return notifyDate;
    }


    /**
     * Sets the notifyDate value for this BillWebServiceInVO.
     * 
     * @param notifyDate
     */
    public void setNotifyDate(java.lang.String notifyDate) {
        this.notifyDate = notifyDate;
    }


    /**
     * Gets the payfee value for this BillWebServiceInVO.
     * 
     * @return payfee
     */
    public double getPayfee() {
        return payfee;
    }


    /**
     * Sets the payfee value for this BillWebServiceInVO.
     * 
     * @param payfee
     */
    public void setPayfee(double payfee) {
        this.payfee = payfee;
    }


    /**
     * Gets the productConsumeParamVO value for this BillWebServiceInVO.
     * 
     * @return productConsumeParamVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeParamVO getProductConsumeParamVO() {
        return productConsumeParamVO;
    }


    /**
     * Sets the productConsumeParamVO value for this BillWebServiceInVO.
     * 
     * @param productConsumeParamVO
     */
    public void setProductConsumeParamVO(com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeParamVO productConsumeParamVO) {
        this.productConsumeParamVO = productConsumeParamVO;
    }


    /**
     * Gets the start value for this BillWebServiceInVO.
     * 
     * @return start
     */
    public int getStart() {
        return start;
    }


    /**
     * Sets the start value for this BillWebServiceInVO.
     * 
     * @param start
     */
    public void setStart(int start) {
        this.start = start;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillWebServiceInVO)) return false;
        BillWebServiceInVO other = (BillWebServiceInVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.detailBillListVO==null && other.getDetailBillListVO()==null) || 
             (this.detailBillListVO!=null &&
              this.detailBillListVO.equals(other.getDetailBillListVO()))) &&
            ((this.errorDesc==null && other.getErrorDesc()==null) || 
             (this.errorDesc!=null &&
              this.errorDesc.equals(other.getErrorDesc()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.leftFeeVO==null && other.getLeftFeeVO()==null) || 
             (this.leftFeeVO!=null &&
              this.leftFeeVO.equals(other.getLeftFeeVO()))) &&
            ((this.moduleName==null && other.getModuleName()==null) || 
             (this.moduleName!=null &&
              this.moduleName.equals(other.getModuleName()))) &&
            this.sucess == other.isSucess() &&
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            this.serviceKind == other.getServiceKind() &&
            ((this.applyEvent==null && other.getApplyEvent()==null) || 
             (this.applyEvent!=null &&
              this.applyEvent.equals(other.getApplyEvent()))) &&
            ((this.bankFlowNumber==null && other.getBankFlowNumber()==null) || 
             (this.bankFlowNumber!=null &&
              this.bankFlowNumber.equals(other.getBankFlowNumber()))) &&
            ((this.bankId==null && other.getBankId()==null) || 
             (this.bankId!=null &&
              this.bankId.equals(other.getBankId()))) &&
            this.end == other.getEnd() &&
            this.ifContinue == other.getIfContinue() &&
            ((this.notifyDate==null && other.getNotifyDate()==null) || 
             (this.notifyDate!=null &&
              this.notifyDate.equals(other.getNotifyDate()))) &&
            this.payfee == other.getPayfee() &&
            ((this.productConsumeParamVO==null && other.getProductConsumeParamVO()==null) || 
             (this.productConsumeParamVO!=null &&
              this.productConsumeParamVO.equals(other.getProductConsumeParamVO()))) &&
            this.start == other.getStart();
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
        if (getDetailBillListVO() != null) {
            _hashCode += getDetailBillListVO().hashCode();
        }
        if (getErrorDesc() != null) {
            _hashCode += getErrorDesc().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getLeftFeeVO() != null) {
            _hashCode += getLeftFeeVO().hashCode();
        }
        if (getModuleName() != null) {
            _hashCode += getModuleName().hashCode();
        }
        _hashCode += (isSucess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        _hashCode += getServiceKind();
        if (getApplyEvent() != null) {
            _hashCode += getApplyEvent().hashCode();
        }
        if (getBankFlowNumber() != null) {
            _hashCode += getBankFlowNumber().hashCode();
        }
        if (getBankId() != null) {
            _hashCode += getBankId().hashCode();
        }
        _hashCode += getEnd();
        _hashCode += getIfContinue();
        if (getNotifyDate() != null) {
            _hashCode += getNotifyDate().hashCode();
        }
        _hashCode += new Double(getPayfee()).hashCode();
        if (getProductConsumeParamVO() != null) {
            _hashCode += getProductConsumeParamVO().hashCode();
        }
        _hashCode += getStart();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillWebServiceInVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "BillWebServiceInVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailBillListVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detailBillListVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "DetailBillListVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftFeeVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leftFeeVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "LeftFeeVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moduleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sucess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sucess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityCode"));
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
        elemField.setFieldName("serviceKind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applyEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankFlowNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankFlowNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end");
        elemField.setXmlName(new javax.xml.namespace.QName("", "end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifContinue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifContinue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payfee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payfee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productConsumeParamVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productConsumeParamVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProductConsumeParamVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start"));
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
