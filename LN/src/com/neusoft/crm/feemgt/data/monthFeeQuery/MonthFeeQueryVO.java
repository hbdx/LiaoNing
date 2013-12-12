/**
 * MonthFeeQueryVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.feemgt.data.monthFeeQuery;

public class MonthFeeQueryVO  extends com.neusoft.tdframework.common.data.BaseVO  implements java.io.Serializable {
    private long accountId;

    private java.lang.String balanceFee;

    private java.lang.String billFee;

    private java.lang.String billMaxMonth;

    private java.lang.String billMinMonth;

    private java.lang.String cityCode;

    private java.lang.String creditFee;

    private java.lang.String currNoFavour;

    private java.lang.String currTotalFee;

    private long customerId;

    private java.lang.Object[] dataiList;

    private java.lang.String feeDate;

    private java.lang.String feeName;

    private java.lang.String feeValue;

    private java.lang.String leftFee;

    private int osCode;

    private java.lang.String osMessgae;

    private java.lang.String overdueFee;

    private java.lang.String preMonthNum;

    private int queryKind;

    private java.lang.String restFee;

    private java.lang.String resultStr;

    private java.lang.String serviceId;

    private int serviceKind;

    private java.lang.String totalFee;

    private long useId;

    public MonthFeeQueryVO() {
    }

    public MonthFeeQueryVO(
           long accountId,
           java.lang.String balanceFee,
           java.lang.String billFee,
           java.lang.String billMaxMonth,
           java.lang.String billMinMonth,
           java.lang.String cityCode,
           java.lang.String creditFee,
           java.lang.String currNoFavour,
           java.lang.String currTotalFee,
           long customerId,
           java.lang.Object[] dataiList,
           java.lang.String feeDate,
           java.lang.String feeName,
           java.lang.String feeValue,
           java.lang.String leftFee,
           int osCode,
           java.lang.String osMessgae,
           java.lang.String overdueFee,
           java.lang.String preMonthNum,
           int queryKind,
           java.lang.String restFee,
           java.lang.String resultStr,
           java.lang.String serviceId,
           int serviceKind,
           java.lang.String totalFee,
           long useId) {
        this.accountId = accountId;
        this.balanceFee = balanceFee;
        this.billFee = billFee;
        this.billMaxMonth = billMaxMonth;
        this.billMinMonth = billMinMonth;
        this.cityCode = cityCode;
        this.creditFee = creditFee;
        this.currNoFavour = currNoFavour;
        this.currTotalFee = currTotalFee;
        this.customerId = customerId;
        this.dataiList = dataiList;
        this.feeDate = feeDate;
        this.feeName = feeName;
        this.feeValue = feeValue;
        this.leftFee = leftFee;
        this.osCode = osCode;
        this.osMessgae = osMessgae;
        this.overdueFee = overdueFee;
        this.preMonthNum = preMonthNum;
        this.queryKind = queryKind;
        this.restFee = restFee;
        this.resultStr = resultStr;
        this.serviceId = serviceId;
        this.serviceKind = serviceKind;
        this.totalFee = totalFee;
        this.useId = useId;
    }


    /**
     * Gets the accountId value for this MonthFeeQueryVO.
     * 
     * @return accountId
     */
    public long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this MonthFeeQueryVO.
     * 
     * @param accountId
     */
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the balanceFee value for this MonthFeeQueryVO.
     * 
     * @return balanceFee
     */
    public java.lang.String getBalanceFee() {
        return balanceFee;
    }


    /**
     * Sets the balanceFee value for this MonthFeeQueryVO.
     * 
     * @param balanceFee
     */
    public void setBalanceFee(java.lang.String balanceFee) {
        this.balanceFee = balanceFee;
    }


    /**
     * Gets the billFee value for this MonthFeeQueryVO.
     * 
     * @return billFee
     */
    public java.lang.String getBillFee() {
        return billFee;
    }


    /**
     * Sets the billFee value for this MonthFeeQueryVO.
     * 
     * @param billFee
     */
    public void setBillFee(java.lang.String billFee) {
        this.billFee = billFee;
    }


    /**
     * Gets the billMaxMonth value for this MonthFeeQueryVO.
     * 
     * @return billMaxMonth
     */
    public java.lang.String getBillMaxMonth() {
        return billMaxMonth;
    }


    /**
     * Sets the billMaxMonth value for this MonthFeeQueryVO.
     * 
     * @param billMaxMonth
     */
    public void setBillMaxMonth(java.lang.String billMaxMonth) {
        this.billMaxMonth = billMaxMonth;
    }


    /**
     * Gets the billMinMonth value for this MonthFeeQueryVO.
     * 
     * @return billMinMonth
     */
    public java.lang.String getBillMinMonth() {
        return billMinMonth;
    }


    /**
     * Sets the billMinMonth value for this MonthFeeQueryVO.
     * 
     * @param billMinMonth
     */
    public void setBillMinMonth(java.lang.String billMinMonth) {
        this.billMinMonth = billMinMonth;
    }


    /**
     * Gets the cityCode value for this MonthFeeQueryVO.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this MonthFeeQueryVO.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }


    /**
     * Gets the creditFee value for this MonthFeeQueryVO.
     * 
     * @return creditFee
     */
    public java.lang.String getCreditFee() {
        return creditFee;
    }


    /**
     * Sets the creditFee value for this MonthFeeQueryVO.
     * 
     * @param creditFee
     */
    public void setCreditFee(java.lang.String creditFee) {
        this.creditFee = creditFee;
    }


    /**
     * Gets the currNoFavour value for this MonthFeeQueryVO.
     * 
     * @return currNoFavour
     */
    public java.lang.String getCurrNoFavour() {
        return currNoFavour;
    }


    /**
     * Sets the currNoFavour value for this MonthFeeQueryVO.
     * 
     * @param currNoFavour
     */
    public void setCurrNoFavour(java.lang.String currNoFavour) {
        this.currNoFavour = currNoFavour;
    }


    /**
     * Gets the currTotalFee value for this MonthFeeQueryVO.
     * 
     * @return currTotalFee
     */
    public java.lang.String getCurrTotalFee() {
        return currTotalFee;
    }


    /**
     * Sets the currTotalFee value for this MonthFeeQueryVO.
     * 
     * @param currTotalFee
     */
    public void setCurrTotalFee(java.lang.String currTotalFee) {
        this.currTotalFee = currTotalFee;
    }


    /**
     * Gets the customerId value for this MonthFeeQueryVO.
     * 
     * @return customerId
     */
    public long getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this MonthFeeQueryVO.
     * 
     * @param customerId
     */
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the dataiList value for this MonthFeeQueryVO.
     * 
     * @return dataiList
     */
    public java.lang.Object[] getDataiList() {
        return dataiList;
    }


    /**
     * Sets the dataiList value for this MonthFeeQueryVO.
     * 
     * @param dataiList
     */
    public void setDataiList(java.lang.Object[] dataiList) {
        this.dataiList = dataiList;
    }


    /**
     * Gets the feeDate value for this MonthFeeQueryVO.
     * 
     * @return feeDate
     */
    public java.lang.String getFeeDate() {
        return feeDate;
    }


    /**
     * Sets the feeDate value for this MonthFeeQueryVO.
     * 
     * @param feeDate
     */
    public void setFeeDate(java.lang.String feeDate) {
        this.feeDate = feeDate;
    }


    /**
     * Gets the feeName value for this MonthFeeQueryVO.
     * 
     * @return feeName
     */
    public java.lang.String getFeeName() {
        return feeName;
    }


    /**
     * Sets the feeName value for this MonthFeeQueryVO.
     * 
     * @param feeName
     */
    public void setFeeName(java.lang.String feeName) {
        this.feeName = feeName;
    }


    /**
     * Gets the feeValue value for this MonthFeeQueryVO.
     * 
     * @return feeValue
     */
    public java.lang.String getFeeValue() {
        return feeValue;
    }


    /**
     * Sets the feeValue value for this MonthFeeQueryVO.
     * 
     * @param feeValue
     */
    public void setFeeValue(java.lang.String feeValue) {
        this.feeValue = feeValue;
    }


    /**
     * Gets the leftFee value for this MonthFeeQueryVO.
     * 
     * @return leftFee
     */
    public java.lang.String getLeftFee() {
        return leftFee;
    }


    /**
     * Sets the leftFee value for this MonthFeeQueryVO.
     * 
     * @param leftFee
     */
    public void setLeftFee(java.lang.String leftFee) {
        this.leftFee = leftFee;
    }


    /**
     * Gets the osCode value for this MonthFeeQueryVO.
     * 
     * @return osCode
     */
    public int getOsCode() {
        return osCode;
    }


    /**
     * Sets the osCode value for this MonthFeeQueryVO.
     * 
     * @param osCode
     */
    public void setOsCode(int osCode) {
        this.osCode = osCode;
    }


    /**
     * Gets the osMessgae value for this MonthFeeQueryVO.
     * 
     * @return osMessgae
     */
    public java.lang.String getOsMessgae() {
        return osMessgae;
    }


    /**
     * Sets the osMessgae value for this MonthFeeQueryVO.
     * 
     * @param osMessgae
     */
    public void setOsMessgae(java.lang.String osMessgae) {
        this.osMessgae = osMessgae;
    }


    /**
     * Gets the overdueFee value for this MonthFeeQueryVO.
     * 
     * @return overdueFee
     */
    public java.lang.String getOverdueFee() {
        return overdueFee;
    }


    /**
     * Sets the overdueFee value for this MonthFeeQueryVO.
     * 
     * @param overdueFee
     */
    public void setOverdueFee(java.lang.String overdueFee) {
        this.overdueFee = overdueFee;
    }


    /**
     * Gets the preMonthNum value for this MonthFeeQueryVO.
     * 
     * @return preMonthNum
     */
    public java.lang.String getPreMonthNum() {
        return preMonthNum;
    }


    /**
     * Sets the preMonthNum value for this MonthFeeQueryVO.
     * 
     * @param preMonthNum
     */
    public void setPreMonthNum(java.lang.String preMonthNum) {
        this.preMonthNum = preMonthNum;
    }


    /**
     * Gets the queryKind value for this MonthFeeQueryVO.
     * 
     * @return queryKind
     */
    public int getQueryKind() {
        return queryKind;
    }


    /**
     * Sets the queryKind value for this MonthFeeQueryVO.
     * 
     * @param queryKind
     */
    public void setQueryKind(int queryKind) {
        this.queryKind = queryKind;
    }


    /**
     * Gets the restFee value for this MonthFeeQueryVO.
     * 
     * @return restFee
     */
    public java.lang.String getRestFee() {
        return restFee;
    }


    /**
     * Sets the restFee value for this MonthFeeQueryVO.
     * 
     * @param restFee
     */
    public void setRestFee(java.lang.String restFee) {
        this.restFee = restFee;
    }


    /**
     * Gets the resultStr value for this MonthFeeQueryVO.
     * 
     * @return resultStr
     */
    public java.lang.String getResultStr() {
        return resultStr;
    }


    /**
     * Sets the resultStr value for this MonthFeeQueryVO.
     * 
     * @param resultStr
     */
    public void setResultStr(java.lang.String resultStr) {
        this.resultStr = resultStr;
    }


    /**
     * Gets the serviceId value for this MonthFeeQueryVO.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this MonthFeeQueryVO.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceKind value for this MonthFeeQueryVO.
     * 
     * @return serviceKind
     */
    public int getServiceKind() {
        return serviceKind;
    }


    /**
     * Sets the serviceKind value for this MonthFeeQueryVO.
     * 
     * @param serviceKind
     */
    public void setServiceKind(int serviceKind) {
        this.serviceKind = serviceKind;
    }


    /**
     * Gets the totalFee value for this MonthFeeQueryVO.
     * 
     * @return totalFee
     */
    public java.lang.String getTotalFee() {
        return totalFee;
    }


    /**
     * Sets the totalFee value for this MonthFeeQueryVO.
     * 
     * @param totalFee
     */
    public void setTotalFee(java.lang.String totalFee) {
        this.totalFee = totalFee;
    }


    /**
     * Gets the useId value for this MonthFeeQueryVO.
     * 
     * @return useId
     */
    public long getUseId() {
        return useId;
    }


    /**
     * Sets the useId value for this MonthFeeQueryVO.
     * 
     * @param useId
     */
    public void setUseId(long useId) {
        this.useId = useId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MonthFeeQueryVO)) return false;
        MonthFeeQueryVO other = (MonthFeeQueryVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.accountId == other.getAccountId() &&
            ((this.balanceFee==null && other.getBalanceFee()==null) || 
             (this.balanceFee!=null &&
              this.balanceFee.equals(other.getBalanceFee()))) &&
            ((this.billFee==null && other.getBillFee()==null) || 
             (this.billFee!=null &&
              this.billFee.equals(other.getBillFee()))) &&
            ((this.billMaxMonth==null && other.getBillMaxMonth()==null) || 
             (this.billMaxMonth!=null &&
              this.billMaxMonth.equals(other.getBillMaxMonth()))) &&
            ((this.billMinMonth==null && other.getBillMinMonth()==null) || 
             (this.billMinMonth!=null &&
              this.billMinMonth.equals(other.getBillMinMonth()))) &&
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode()))) &&
            ((this.creditFee==null && other.getCreditFee()==null) || 
             (this.creditFee!=null &&
              this.creditFee.equals(other.getCreditFee()))) &&
            ((this.currNoFavour==null && other.getCurrNoFavour()==null) || 
             (this.currNoFavour!=null &&
              this.currNoFavour.equals(other.getCurrNoFavour()))) &&
            ((this.currTotalFee==null && other.getCurrTotalFee()==null) || 
             (this.currTotalFee!=null &&
              this.currTotalFee.equals(other.getCurrTotalFee()))) &&
            this.customerId == other.getCustomerId() &&
            ((this.dataiList==null && other.getDataiList()==null) || 
             (this.dataiList!=null &&
              java.util.Arrays.equals(this.dataiList, other.getDataiList()))) &&
            ((this.feeDate==null && other.getFeeDate()==null) || 
             (this.feeDate!=null &&
              this.feeDate.equals(other.getFeeDate()))) &&
            ((this.feeName==null && other.getFeeName()==null) || 
             (this.feeName!=null &&
              this.feeName.equals(other.getFeeName()))) &&
            ((this.feeValue==null && other.getFeeValue()==null) || 
             (this.feeValue!=null &&
              this.feeValue.equals(other.getFeeValue()))) &&
            ((this.leftFee==null && other.getLeftFee()==null) || 
             (this.leftFee!=null &&
              this.leftFee.equals(other.getLeftFee()))) &&
            this.osCode == other.getOsCode() &&
            ((this.osMessgae==null && other.getOsMessgae()==null) || 
             (this.osMessgae!=null &&
              this.osMessgae.equals(other.getOsMessgae()))) &&
            ((this.overdueFee==null && other.getOverdueFee()==null) || 
             (this.overdueFee!=null &&
              this.overdueFee.equals(other.getOverdueFee()))) &&
            ((this.preMonthNum==null && other.getPreMonthNum()==null) || 
             (this.preMonthNum!=null &&
              this.preMonthNum.equals(other.getPreMonthNum()))) &&
            this.queryKind == other.getQueryKind() &&
            ((this.restFee==null && other.getRestFee()==null) || 
             (this.restFee!=null &&
              this.restFee.equals(other.getRestFee()))) &&
            ((this.resultStr==null && other.getResultStr()==null) || 
             (this.resultStr!=null &&
              this.resultStr.equals(other.getResultStr()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            this.serviceKind == other.getServiceKind() &&
            ((this.totalFee==null && other.getTotalFee()==null) || 
             (this.totalFee!=null &&
              this.totalFee.equals(other.getTotalFee()))) &&
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
        int _hashCode = super.hashCode();
        _hashCode += new Long(getAccountId()).hashCode();
        if (getBalanceFee() != null) {
            _hashCode += getBalanceFee().hashCode();
        }
        if (getBillFee() != null) {
            _hashCode += getBillFee().hashCode();
        }
        if (getBillMaxMonth() != null) {
            _hashCode += getBillMaxMonth().hashCode();
        }
        if (getBillMinMonth() != null) {
            _hashCode += getBillMinMonth().hashCode();
        }
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        if (getCreditFee() != null) {
            _hashCode += getCreditFee().hashCode();
        }
        if (getCurrNoFavour() != null) {
            _hashCode += getCurrNoFavour().hashCode();
        }
        if (getCurrTotalFee() != null) {
            _hashCode += getCurrTotalFee().hashCode();
        }
        _hashCode += new Long(getCustomerId()).hashCode();
        if (getDataiList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataiList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataiList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeeDate() != null) {
            _hashCode += getFeeDate().hashCode();
        }
        if (getFeeName() != null) {
            _hashCode += getFeeName().hashCode();
        }
        if (getFeeValue() != null) {
            _hashCode += getFeeValue().hashCode();
        }
        if (getLeftFee() != null) {
            _hashCode += getLeftFee().hashCode();
        }
        _hashCode += getOsCode();
        if (getOsMessgae() != null) {
            _hashCode += getOsMessgae().hashCode();
        }
        if (getOverdueFee() != null) {
            _hashCode += getOverdueFee().hashCode();
        }
        if (getPreMonthNum() != null) {
            _hashCode += getPreMonthNum().hashCode();
        }
        _hashCode += getQueryKind();
        if (getRestFee() != null) {
            _hashCode += getRestFee().hashCode();
        }
        if (getResultStr() != null) {
            _hashCode += getResultStr().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        _hashCode += getServiceKind();
        if (getTotalFee() != null) {
            _hashCode += getTotalFee().hashCode();
        }
        _hashCode += new Long(getUseId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MonthFeeQueryVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://monthFeeQuery.data.feemgt.crm.neusoft.com", "MonthFeeQueryVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billMaxMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billMaxMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billMinMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billMinMonth"));
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
        elemField.setFieldName("creditFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currNoFavour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currNoFavour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currTotalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currTotalFee"));
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
        elemField.setFieldName("dataiList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataiList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
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
        elemField.setFieldName("feeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leftFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osMessgae");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osMessgae"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overdueFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overdueFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preMonthNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preMonthNum"));
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
        elemField.setFieldName("restFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultStr"));
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
