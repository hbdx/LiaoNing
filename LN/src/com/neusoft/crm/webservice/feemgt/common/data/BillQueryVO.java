/**
 * BillQueryVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.webservice.feemgt.common.data;

public class BillQueryVO  implements java.io.Serializable {
    private long accountId;

    private java.lang.String billFee;

    private java.lang.String cityCode;

    private long customerId;

    private java.lang.String feeDate;

    private java.lang.String feeDateDesc;

    private java.lang.String feeKindDesc;

    private java.lang.String flowNumber;

    private java.lang.String osCode;

    private java.lang.String osMessgae;

    private java.lang.String payDate;

    private java.lang.String payStatus;

    private int queryKind;

    private java.lang.String serviceId;

    private int serviceKind;

    private java.lang.String totalFee;

    private long useId;

    private java.lang.String accountName;

    private float fee;

    private java.lang.String feeName;

    private java.lang.String operate;

    private float overdueFee;

    private float payFee;

    private java.lang.String payWay;

    public BillQueryVO() {
    }

    public BillQueryVO(
           long accountId,
           java.lang.String billFee,
           java.lang.String cityCode,
           long customerId,
           java.lang.String feeDate,
           java.lang.String feeDateDesc,
           java.lang.String feeKindDesc,
           java.lang.String flowNumber,
           java.lang.String osCode,
           java.lang.String osMessgae,
           java.lang.String payDate,
           java.lang.String payStatus,
           int queryKind,
           java.lang.String serviceId,
           int serviceKind,
           java.lang.String totalFee,
           long useId,
           java.lang.String accountName,
           float fee,
           java.lang.String feeName,
           java.lang.String operate,
           float overdueFee,
           float payFee,
           java.lang.String payWay) {
           this.accountId = accountId;
           this.billFee = billFee;
           this.cityCode = cityCode;
           this.customerId = customerId;
           this.feeDate = feeDate;
           this.feeDateDesc = feeDateDesc;
           this.feeKindDesc = feeKindDesc;
           this.flowNumber = flowNumber;
           this.osCode = osCode;
           this.osMessgae = osMessgae;
           this.payDate = payDate;
           this.payStatus = payStatus;
           this.queryKind = queryKind;
           this.serviceId = serviceId;
           this.serviceKind = serviceKind;
           this.totalFee = totalFee;
           this.useId = useId;
           this.accountName = accountName;
           this.fee = fee;
           this.feeName = feeName;
           this.operate = operate;
           this.overdueFee = overdueFee;
           this.payFee = payFee;
           this.payWay = payWay;
    }


    /**
     * Gets the accountId value for this BillQueryVO.
     * 
     * @return accountId
     */
    public long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this BillQueryVO.
     * 
     * @param accountId
     */
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the billFee value for this BillQueryVO.
     * 
     * @return billFee
     */
    public java.lang.String getBillFee() {
        return billFee;
    }


    /**
     * Sets the billFee value for this BillQueryVO.
     * 
     * @param billFee
     */
    public void setBillFee(java.lang.String billFee) {
        this.billFee = billFee;
    }


    /**
     * Gets the cityCode value for this BillQueryVO.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this BillQueryVO.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }


    /**
     * Gets the customerId value for this BillQueryVO.
     * 
     * @return customerId
     */
    public long getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this BillQueryVO.
     * 
     * @param customerId
     */
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the feeDate value for this BillQueryVO.
     * 
     * @return feeDate
     */
    public java.lang.String getFeeDate() {
        return feeDate;
    }


    /**
     * Sets the feeDate value for this BillQueryVO.
     * 
     * @param feeDate
     */
    public void setFeeDate(java.lang.String feeDate) {
        this.feeDate = feeDate;
    }


    /**
     * Gets the feeDateDesc value for this BillQueryVO.
     * 
     * @return feeDateDesc
     */
    public java.lang.String getFeeDateDesc() {
        return feeDateDesc;
    }


    /**
     * Sets the feeDateDesc value for this BillQueryVO.
     * 
     * @param feeDateDesc
     */
    public void setFeeDateDesc(java.lang.String feeDateDesc) {
        this.feeDateDesc = feeDateDesc;
    }


    /**
     * Gets the feeKindDesc value for this BillQueryVO.
     * 
     * @return feeKindDesc
     */
    public java.lang.String getFeeKindDesc() {
        return feeKindDesc;
    }


    /**
     * Sets the feeKindDesc value for this BillQueryVO.
     * 
     * @param feeKindDesc
     */
    public void setFeeKindDesc(java.lang.String feeKindDesc) {
        this.feeKindDesc = feeKindDesc;
    }


    /**
     * Gets the flowNumber value for this BillQueryVO.
     * 
     * @return flowNumber
     */
    public java.lang.String getFlowNumber() {
        return flowNumber;
    }


    /**
     * Sets the flowNumber value for this BillQueryVO.
     * 
     * @param flowNumber
     */
    public void setFlowNumber(java.lang.String flowNumber) {
        this.flowNumber = flowNumber;
    }


    /**
     * Gets the osCode value for this BillQueryVO.
     * 
     * @return osCode
     */
    public java.lang.String getOsCode() {
        return osCode;
    }


    /**
     * Sets the osCode value for this BillQueryVO.
     * 
     * @param osCode
     */
    public void setOsCode(java.lang.String osCode) {
        this.osCode = osCode;
    }


    /**
     * Gets the osMessgae value for this BillQueryVO.
     * 
     * @return osMessgae
     */
    public java.lang.String getOsMessgae() {
        return osMessgae;
    }


    /**
     * Sets the osMessgae value for this BillQueryVO.
     * 
     * @param osMessgae
     */
    public void setOsMessgae(java.lang.String osMessgae) {
        this.osMessgae = osMessgae;
    }


    /**
     * Gets the payDate value for this BillQueryVO.
     * 
     * @return payDate
     */
    public java.lang.String getPayDate() {
        return payDate;
    }


    /**
     * Sets the payDate value for this BillQueryVO.
     * 
     * @param payDate
     */
    public void setPayDate(java.lang.String payDate) {
        this.payDate = payDate;
    }


    /**
     * Gets the payStatus value for this BillQueryVO.
     * 
     * @return payStatus
     */
    public java.lang.String getPayStatus() {
        return payStatus;
    }


    /**
     * Sets the payStatus value for this BillQueryVO.
     * 
     * @param payStatus
     */
    public void setPayStatus(java.lang.String payStatus) {
        this.payStatus = payStatus;
    }


    /**
     * Gets the queryKind value for this BillQueryVO.
     * 
     * @return queryKind
     */
    public int getQueryKind() {
        return queryKind;
    }


    /**
     * Sets the queryKind value for this BillQueryVO.
     * 
     * @param queryKind
     */
    public void setQueryKind(int queryKind) {
        this.queryKind = queryKind;
    }


    /**
     * Gets the serviceId value for this BillQueryVO.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this BillQueryVO.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceKind value for this BillQueryVO.
     * 
     * @return serviceKind
     */
    public int getServiceKind() {
        return serviceKind;
    }


    /**
     * Sets the serviceKind value for this BillQueryVO.
     * 
     * @param serviceKind
     */
    public void setServiceKind(int serviceKind) {
        this.serviceKind = serviceKind;
    }


    /**
     * Gets the totalFee value for this BillQueryVO.
     * 
     * @return totalFee
     */
    public java.lang.String getTotalFee() {
        return totalFee;
    }


    /**
     * Sets the totalFee value for this BillQueryVO.
     * 
     * @param totalFee
     */
    public void setTotalFee(java.lang.String totalFee) {
        this.totalFee = totalFee;
    }


    /**
     * Gets the useId value for this BillQueryVO.
     * 
     * @return useId
     */
    public long getUseId() {
        return useId;
    }


    /**
     * Sets the useId value for this BillQueryVO.
     * 
     * @param useId
     */
    public void setUseId(long useId) {
        this.useId = useId;
    }


    /**
     * Gets the accountName value for this BillQueryVO.
     * 
     * @return accountName
     */
    public java.lang.String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this BillQueryVO.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the fee value for this BillQueryVO.
     * 
     * @return fee
     */
    public float getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this BillQueryVO.
     * 
     * @param fee
     */
    public void setFee(float fee) {
        this.fee = fee;
    }


    /**
     * Gets the feeName value for this BillQueryVO.
     * 
     * @return feeName
     */
    public java.lang.String getFeeName() {
        return feeName;
    }


    /**
     * Sets the feeName value for this BillQueryVO.
     * 
     * @param feeName
     */
    public void setFeeName(java.lang.String feeName) {
        this.feeName = feeName;
    }


    /**
     * Gets the operate value for this BillQueryVO.
     * 
     * @return operate
     */
    public java.lang.String getOperate() {
        return operate;
    }


    /**
     * Sets the operate value for this BillQueryVO.
     * 
     * @param operate
     */
    public void setOperate(java.lang.String operate) {
        this.operate = operate;
    }


    /**
     * Gets the overdueFee value for this BillQueryVO.
     * 
     * @return overdueFee
     */
    public float getOverdueFee() {
        return overdueFee;
    }


    /**
     * Sets the overdueFee value for this BillQueryVO.
     * 
     * @param overdueFee
     */
    public void setOverdueFee(float overdueFee) {
        this.overdueFee = overdueFee;
    }


    /**
     * Gets the payFee value for this BillQueryVO.
     * 
     * @return payFee
     */
    public float getPayFee() {
        return payFee;
    }


    /**
     * Sets the payFee value for this BillQueryVO.
     * 
     * @param payFee
     */
    public void setPayFee(float payFee) {
        this.payFee = payFee;
    }


    /**
     * Gets the payWay value for this BillQueryVO.
     * 
     * @return payWay
     */
    public java.lang.String getPayWay() {
        return payWay;
    }


    /**
     * Sets the payWay value for this BillQueryVO.
     * 
     * @param payWay
     */
    public void setPayWay(java.lang.String payWay) {
        this.payWay = payWay;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillQueryVO)) return false;
        BillQueryVO other = (BillQueryVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountId == other.getAccountId() &&
            ((this.billFee==null && other.getBillFee()==null) || 
             (this.billFee!=null &&
              this.billFee.equals(other.getBillFee()))) &&
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode()))) &&
            this.customerId == other.getCustomerId() &&
            ((this.feeDate==null && other.getFeeDate()==null) || 
             (this.feeDate!=null &&
              this.feeDate.equals(other.getFeeDate()))) &&
            ((this.feeDateDesc==null && other.getFeeDateDesc()==null) || 
             (this.feeDateDesc!=null &&
              this.feeDateDesc.equals(other.getFeeDateDesc()))) &&
            ((this.feeKindDesc==null && other.getFeeKindDesc()==null) || 
             (this.feeKindDesc!=null &&
              this.feeKindDesc.equals(other.getFeeKindDesc()))) &&
            ((this.flowNumber==null && other.getFlowNumber()==null) || 
             (this.flowNumber!=null &&
              this.flowNumber.equals(other.getFlowNumber()))) &&
            ((this.osCode==null && other.getOsCode()==null) || 
             (this.osCode!=null &&
              this.osCode.equals(other.getOsCode()))) &&
            ((this.osMessgae==null && other.getOsMessgae()==null) || 
             (this.osMessgae!=null &&
              this.osMessgae.equals(other.getOsMessgae()))) &&
            ((this.payDate==null && other.getPayDate()==null) || 
             (this.payDate!=null &&
              this.payDate.equals(other.getPayDate()))) &&
            ((this.payStatus==null && other.getPayStatus()==null) || 
             (this.payStatus!=null &&
              this.payStatus.equals(other.getPayStatus()))) &&
            this.queryKind == other.getQueryKind() &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            this.serviceKind == other.getServiceKind() &&
            ((this.totalFee==null && other.getTotalFee()==null) || 
             (this.totalFee!=null &&
              this.totalFee.equals(other.getTotalFee()))) &&
            this.useId == other.getUseId() &&
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            this.fee == other.getFee() &&
            ((this.feeName==null && other.getFeeName()==null) || 
             (this.feeName!=null &&
              this.feeName.equals(other.getFeeName()))) &&
            ((this.operate==null && other.getOperate()==null) || 
             (this.operate!=null &&
              this.operate.equals(other.getOperate()))) &&
            this.overdueFee == other.getOverdueFee() &&
            this.payFee == other.getPayFee() &&
            ((this.payWay==null && other.getPayWay()==null) || 
             (this.payWay!=null &&
              this.payWay.equals(other.getPayWay())));
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
        if (getBillFee() != null) {
            _hashCode += getBillFee().hashCode();
        }
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        _hashCode += new Long(getCustomerId()).hashCode();
        if (getFeeDate() != null) {
            _hashCode += getFeeDate().hashCode();
        }
        if (getFeeDateDesc() != null) {
            _hashCode += getFeeDateDesc().hashCode();
        }
        if (getFeeKindDesc() != null) {
            _hashCode += getFeeKindDesc().hashCode();
        }
        if (getFlowNumber() != null) {
            _hashCode += getFlowNumber().hashCode();
        }
        if (getOsCode() != null) {
            _hashCode += getOsCode().hashCode();
        }
        if (getOsMessgae() != null) {
            _hashCode += getOsMessgae().hashCode();
        }
        if (getPayDate() != null) {
            _hashCode += getPayDate().hashCode();
        }
        if (getPayStatus() != null) {
            _hashCode += getPayStatus().hashCode();
        }
        _hashCode += getQueryKind();
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        _hashCode += getServiceKind();
        if (getTotalFee() != null) {
            _hashCode += getTotalFee().hashCode();
        }
        _hashCode += new Long(getUseId()).hashCode();
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        _hashCode += new Float(getFee()).hashCode();
        if (getFeeName() != null) {
            _hashCode += getFeeName().hashCode();
        }
        if (getOperate() != null) {
            _hashCode += getOperate().hashCode();
        }
        _hashCode += new Float(getOverdueFee()).hashCode();
        _hashCode += new Float(getPayFee()).hashCode();
        if (getPayWay() != null) {
            _hashCode += getPayWay().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillQueryVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "BillQueryVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeDateDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeDateDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeKindDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeKindDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flowNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osMessgae");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osMessgae"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryKind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
        elemField.setFieldName("totalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overdueFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overdueFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payWay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payWay"));
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
