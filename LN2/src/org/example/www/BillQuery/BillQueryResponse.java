/**
 * BillQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.BillQuery;

public class BillQueryResponse  implements java.io.Serializable {
    private java.lang.String responseId;

    private java.lang.String resultCode;

    private java.lang.String resultInfo;

    private java.lang.Long totalBillFee;

    private org.example.www.BillQuery.BillInfo[] billInfoGroup;

    private org.example.www.BillQuery.AcctFeeInfo acctFeeInfo;

    private org.example.www.BillQuery.PointInfo pointInfo;

    private org.example.www.BillQuery.CoutesyReminderInfo coutesyReminderInfo;

    public BillQueryResponse() {
    }

    public BillQueryResponse(
           java.lang.String responseId,
           java.lang.String resultCode,
           java.lang.String resultInfo,
           java.lang.Long totalBillFee,
           org.example.www.BillQuery.BillInfo[] billInfoGroup,
           org.example.www.BillQuery.AcctFeeInfo acctFeeInfo,
           org.example.www.BillQuery.PointInfo pointInfo,
           org.example.www.BillQuery.CoutesyReminderInfo coutesyReminderInfo) {
           this.responseId = responseId;
           this.resultCode = resultCode;
           this.resultInfo = resultInfo;
           this.totalBillFee = totalBillFee;
           this.billInfoGroup = billInfoGroup;
           this.acctFeeInfo = acctFeeInfo;
           this.pointInfo = pointInfo;
           this.coutesyReminderInfo = coutesyReminderInfo;
    }


    /**
     * Gets the responseId value for this BillQueryResponse.
     * 
     * @return responseId
     */
    public java.lang.String getResponseId() {
        return responseId;
    }


    /**
     * Sets the responseId value for this BillQueryResponse.
     * 
     * @param responseId
     */
    public void setResponseId(java.lang.String responseId) {
        this.responseId = responseId;
    }


    /**
     * Gets the resultCode value for this BillQueryResponse.
     * 
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this BillQueryResponse.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultInfo value for this BillQueryResponse.
     * 
     * @return resultInfo
     */
    public java.lang.String getResultInfo() {
        return resultInfo;
    }


    /**
     * Sets the resultInfo value for this BillQueryResponse.
     * 
     * @param resultInfo
     */
    public void setResultInfo(java.lang.String resultInfo) {
        this.resultInfo = resultInfo;
    }


    /**
     * Gets the totalBillFee value for this BillQueryResponse.
     * 
     * @return totalBillFee
     */
    public java.lang.Long getTotalBillFee() {
        return totalBillFee;
    }


    /**
     * Sets the totalBillFee value for this BillQueryResponse.
     * 
     * @param totalBillFee
     */
    public void setTotalBillFee(java.lang.Long totalBillFee) {
        this.totalBillFee = totalBillFee;
    }


    /**
     * Gets the billInfoGroup value for this BillQueryResponse.
     * 
     * @return billInfoGroup
     */
    public org.example.www.BillQuery.BillInfo[] getBillInfoGroup() {
        return billInfoGroup;
    }


    /**
     * Sets the billInfoGroup value for this BillQueryResponse.
     * 
     * @param billInfoGroup
     */
    public void setBillInfoGroup(org.example.www.BillQuery.BillInfo[] billInfoGroup) {
        this.billInfoGroup = billInfoGroup;
    }

    public org.example.www.BillQuery.BillInfo getBillInfoGroup(int i) {
        return this.billInfoGroup[i];
    }

    public void setBillInfoGroup(int i, org.example.www.BillQuery.BillInfo _value) {
        this.billInfoGroup[i] = _value;
    }


    /**
     * Gets the acctFeeInfo value for this BillQueryResponse.
     * 
     * @return acctFeeInfo
     */
    public org.example.www.BillQuery.AcctFeeInfo getAcctFeeInfo() {
        return acctFeeInfo;
    }


    /**
     * Sets the acctFeeInfo value for this BillQueryResponse.
     * 
     * @param acctFeeInfo
     */
    public void setAcctFeeInfo(org.example.www.BillQuery.AcctFeeInfo acctFeeInfo) {
        this.acctFeeInfo = acctFeeInfo;
    }


    /**
     * Gets the pointInfo value for this BillQueryResponse.
     * 
     * @return pointInfo
     */
    public org.example.www.BillQuery.PointInfo getPointInfo() {
        return pointInfo;
    }


    /**
     * Sets the pointInfo value for this BillQueryResponse.
     * 
     * @param pointInfo
     */
    public void setPointInfo(org.example.www.BillQuery.PointInfo pointInfo) {
        this.pointInfo = pointInfo;
    }


    /**
     * Gets the coutesyReminderInfo value for this BillQueryResponse.
     * 
     * @return coutesyReminderInfo
     */
    public org.example.www.BillQuery.CoutesyReminderInfo getCoutesyReminderInfo() {
        return coutesyReminderInfo;
    }


    /**
     * Sets the coutesyReminderInfo value for this BillQueryResponse.
     * 
     * @param coutesyReminderInfo
     */
    public void setCoutesyReminderInfo(org.example.www.BillQuery.CoutesyReminderInfo coutesyReminderInfo) {
        this.coutesyReminderInfo = coutesyReminderInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillQueryResponse)) return false;
        BillQueryResponse other = (BillQueryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseId==null && other.getResponseId()==null) || 
             (this.responseId!=null &&
              this.responseId.equals(other.getResponseId()))) &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.resultInfo==null && other.getResultInfo()==null) || 
             (this.resultInfo!=null &&
              this.resultInfo.equals(other.getResultInfo()))) &&
            ((this.totalBillFee==null && other.getTotalBillFee()==null) || 
             (this.totalBillFee!=null &&
              this.totalBillFee.equals(other.getTotalBillFee()))) &&
            ((this.billInfoGroup==null && other.getBillInfoGroup()==null) || 
             (this.billInfoGroup!=null &&
              java.util.Arrays.equals(this.billInfoGroup, other.getBillInfoGroup()))) &&
            ((this.acctFeeInfo==null && other.getAcctFeeInfo()==null) || 
             (this.acctFeeInfo!=null &&
              this.acctFeeInfo.equals(other.getAcctFeeInfo()))) &&
            ((this.pointInfo==null && other.getPointInfo()==null) || 
             (this.pointInfo!=null &&
              this.pointInfo.equals(other.getPointInfo()))) &&
            ((this.coutesyReminderInfo==null && other.getCoutesyReminderInfo()==null) || 
             (this.coutesyReminderInfo!=null &&
              this.coutesyReminderInfo.equals(other.getCoutesyReminderInfo())));
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
        if (getResponseId() != null) {
            _hashCode += getResponseId().hashCode();
        }
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getResultInfo() != null) {
            _hashCode += getResultInfo().hashCode();
        }
        if (getTotalBillFee() != null) {
            _hashCode += getTotalBillFee().hashCode();
        }
        if (getBillInfoGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillInfoGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillInfoGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAcctFeeInfo() != null) {
            _hashCode += getAcctFeeInfo().hashCode();
        }
        if (getPointInfo() != null) {
            _hashCode += getPointInfo().hashCode();
        }
        if (getCoutesyReminderInfo() != null) {
            _hashCode += getCoutesyReminderInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", ">BillQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBillFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalBillFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billInfoGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BillInfoGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", "BillInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctFeeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcctFeeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", "AcctFeeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PointInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", "PointInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coutesyReminderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CoutesyReminderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", "CoutesyReminderInfo"));
        elemField.setMinOccurs(0);
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
