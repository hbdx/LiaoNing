/**
 * LeftFeeVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.webservice.feemgt.common.data;

public class LeftFeeVO  implements java.io.Serializable {
    private float balanceFee;

    private float billFee;

    private java.lang.String billMax;

    private java.lang.String billMin;

    private float creditFee;

    private float currNoFavour;

    private float currTotalFee;

    private float leftFee;

    private float overdue;

    private float preNum;

    private float restFee;

    private java.lang.String serviceId;

    private int serviceKind;

    private com.neusoft.crm.webservice.feemgt.common.data.AccountDetailInfoVO[] accountDetailInfoColl;

    private java.lang.String cityCode;

    private int queryLevel;

    public LeftFeeVO() {
    }

    public LeftFeeVO(
           float balanceFee,
           float billFee,
           java.lang.String billMax,
           java.lang.String billMin,
           float creditFee,
           float currNoFavour,
           float currTotalFee,
           float leftFee,
           float overdue,
           float preNum,
           float restFee,
           java.lang.String serviceId,
           int serviceKind,
           com.neusoft.crm.webservice.feemgt.common.data.AccountDetailInfoVO[] accountDetailInfoColl,
           java.lang.String cityCode,
           int queryLevel) {
           this.balanceFee = balanceFee;
           this.billFee = billFee;
           this.billMax = billMax;
           this.billMin = billMin;
           this.creditFee = creditFee;
           this.currNoFavour = currNoFavour;
           this.currTotalFee = currTotalFee;
           this.leftFee = leftFee;
           this.overdue = overdue;
           this.preNum = preNum;
           this.restFee = restFee;
           this.serviceId = serviceId;
           this.serviceKind = serviceKind;
           this.accountDetailInfoColl = accountDetailInfoColl;
           this.cityCode = cityCode;
           this.queryLevel = queryLevel;
    }


    /**
     * Gets the balanceFee value for this LeftFeeVO.
     * 
     * @return balanceFee
     */
    public float getBalanceFee() {
        return balanceFee;
    }


    /**
     * Sets the balanceFee value for this LeftFeeVO.
     * 
     * @param balanceFee
     */
    public void setBalanceFee(float balanceFee) {
        this.balanceFee = balanceFee;
    }


    /**
     * Gets the billFee value for this LeftFeeVO.
     * 
     * @return billFee
     */
    public float getBillFee() {
        return billFee;
    }


    /**
     * Sets the billFee value for this LeftFeeVO.
     * 
     * @param billFee
     */
    public void setBillFee(float billFee) {
        this.billFee = billFee;
    }


    /**
     * Gets the billMax value for this LeftFeeVO.
     * 
     * @return billMax
     */
    public java.lang.String getBillMax() {
        return billMax;
    }


    /**
     * Sets the billMax value for this LeftFeeVO.
     * 
     * @param billMax
     */
    public void setBillMax(java.lang.String billMax) {
        this.billMax = billMax;
    }


    /**
     * Gets the billMin value for this LeftFeeVO.
     * 
     * @return billMin
     */
    public java.lang.String getBillMin() {
        return billMin;
    }


    /**
     * Sets the billMin value for this LeftFeeVO.
     * 
     * @param billMin
     */
    public void setBillMin(java.lang.String billMin) {
        this.billMin = billMin;
    }


    /**
     * Gets the creditFee value for this LeftFeeVO.
     * 
     * @return creditFee
     */
    public float getCreditFee() {
        return creditFee;
    }


    /**
     * Sets the creditFee value for this LeftFeeVO.
     * 
     * @param creditFee
     */
    public void setCreditFee(float creditFee) {
        this.creditFee = creditFee;
    }


    /**
     * Gets the currNoFavour value for this LeftFeeVO.
     * 
     * @return currNoFavour
     */
    public float getCurrNoFavour() {
        return currNoFavour;
    }


    /**
     * Sets the currNoFavour value for this LeftFeeVO.
     * 
     * @param currNoFavour
     */
    public void setCurrNoFavour(float currNoFavour) {
        this.currNoFavour = currNoFavour;
    }


    /**
     * Gets the currTotalFee value for this LeftFeeVO.
     * 
     * @return currTotalFee
     */
    public float getCurrTotalFee() {
        return currTotalFee;
    }


    /**
     * Sets the currTotalFee value for this LeftFeeVO.
     * 
     * @param currTotalFee
     */
    public void setCurrTotalFee(float currTotalFee) {
        this.currTotalFee = currTotalFee;
    }


    /**
     * Gets the leftFee value for this LeftFeeVO.
     * 
     * @return leftFee
     */
    public float getLeftFee() {
        return leftFee;
    }


    /**
     * Sets the leftFee value for this LeftFeeVO.
     * 
     * @param leftFee
     */
    public void setLeftFee(float leftFee) {
        this.leftFee = leftFee;
    }


    /**
     * Gets the overdue value for this LeftFeeVO.
     * 
     * @return overdue
     */
    public float getOverdue() {
        return overdue;
    }


    /**
     * Sets the overdue value for this LeftFeeVO.
     * 
     * @param overdue
     */
    public void setOverdue(float overdue) {
        this.overdue = overdue;
    }


    /**
     * Gets the preNum value for this LeftFeeVO.
     * 
     * @return preNum
     */
    public float getPreNum() {
        return preNum;
    }


    /**
     * Sets the preNum value for this LeftFeeVO.
     * 
     * @param preNum
     */
    public void setPreNum(float preNum) {
        this.preNum = preNum;
    }


    /**
     * Gets the restFee value for this LeftFeeVO.
     * 
     * @return restFee
     */
    public float getRestFee() {
        return restFee;
    }


    /**
     * Sets the restFee value for this LeftFeeVO.
     * 
     * @param restFee
     */
    public void setRestFee(float restFee) {
        this.restFee = restFee;
    }


    /**
     * Gets the serviceId value for this LeftFeeVO.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this LeftFeeVO.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceKind value for this LeftFeeVO.
     * 
     * @return serviceKind
     */
    public int getServiceKind() {
        return serviceKind;
    }


    /**
     * Sets the serviceKind value for this LeftFeeVO.
     * 
     * @param serviceKind
     */
    public void setServiceKind(int serviceKind) {
        this.serviceKind = serviceKind;
    }


    /**
     * Gets the accountDetailInfoColl value for this LeftFeeVO.
     * 
     * @return accountDetailInfoColl
     */
    public com.neusoft.crm.webservice.feemgt.common.data.AccountDetailInfoVO[] getAccountDetailInfoColl() {
        return accountDetailInfoColl;
    }


    /**
     * Sets the accountDetailInfoColl value for this LeftFeeVO.
     * 
     * @param accountDetailInfoColl
     */
    public void setAccountDetailInfoColl(com.neusoft.crm.webservice.feemgt.common.data.AccountDetailInfoVO[] accountDetailInfoColl) {
        this.accountDetailInfoColl = accountDetailInfoColl;
    }


    /**
     * Gets the cityCode value for this LeftFeeVO.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this LeftFeeVO.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }


    /**
     * Gets the queryLevel value for this LeftFeeVO.
     * 
     * @return queryLevel
     */
    public int getQueryLevel() {
        return queryLevel;
    }


    /**
     * Sets the queryLevel value for this LeftFeeVO.
     * 
     * @param queryLevel
     */
    public void setQueryLevel(int queryLevel) {
        this.queryLevel = queryLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LeftFeeVO)) return false;
        LeftFeeVO other = (LeftFeeVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.balanceFee == other.getBalanceFee() &&
            this.billFee == other.getBillFee() &&
            ((this.billMax==null && other.getBillMax()==null) || 
             (this.billMax!=null &&
              this.billMax.equals(other.getBillMax()))) &&
            ((this.billMin==null && other.getBillMin()==null) || 
             (this.billMin!=null &&
              this.billMin.equals(other.getBillMin()))) &&
            this.creditFee == other.getCreditFee() &&
            this.currNoFavour == other.getCurrNoFavour() &&
            this.currTotalFee == other.getCurrTotalFee() &&
            this.leftFee == other.getLeftFee() &&
            this.overdue == other.getOverdue() &&
            this.preNum == other.getPreNum() &&
            this.restFee == other.getRestFee() &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            this.serviceKind == other.getServiceKind() &&
            ((this.accountDetailInfoColl==null && other.getAccountDetailInfoColl()==null) || 
             (this.accountDetailInfoColl!=null &&
              java.util.Arrays.equals(this.accountDetailInfoColl, other.getAccountDetailInfoColl()))) &&
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode()))) &&
            this.queryLevel == other.getQueryLevel();
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
        _hashCode += new Float(getBalanceFee()).hashCode();
        _hashCode += new Float(getBillFee()).hashCode();
        if (getBillMax() != null) {
            _hashCode += getBillMax().hashCode();
        }
        if (getBillMin() != null) {
            _hashCode += getBillMin().hashCode();
        }
        _hashCode += new Float(getCreditFee()).hashCode();
        _hashCode += new Float(getCurrNoFavour()).hashCode();
        _hashCode += new Float(getCurrTotalFee()).hashCode();
        _hashCode += new Float(getLeftFee()).hashCode();
        _hashCode += new Float(getOverdue()).hashCode();
        _hashCode += new Float(getPreNum()).hashCode();
        _hashCode += new Float(getRestFee()).hashCode();
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        _hashCode += getServiceKind();
        if (getAccountDetailInfoColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountDetailInfoColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountDetailInfoColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        _hashCode += getQueryLevel();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LeftFeeVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "LeftFeeVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currNoFavour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currNoFavour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currTotalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currTotalFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leftFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overdue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
        elemField.setFieldName("accountDetailInfoColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountDetailInfoColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "AccountDetailInfoVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryLevel"));
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
