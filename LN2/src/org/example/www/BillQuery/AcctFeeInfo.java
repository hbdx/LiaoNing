/**
 * AcctFeeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.BillQuery;

public class AcctFeeInfo  implements java.io.Serializable {
    private long usedFee;

    private long paidFee;

    private long paidPreFee;

    private long paidTransFee;

    private long shouldPayFee;

    public AcctFeeInfo() {
    }

    public AcctFeeInfo(
           long usedFee,
           long paidFee,
           long paidPreFee,
           long paidTransFee,
           long shouldPayFee) {
           this.usedFee = usedFee;
           this.paidFee = paidFee;
           this.paidPreFee = paidPreFee;
           this.paidTransFee = paidTransFee;
           this.shouldPayFee = shouldPayFee;
    }


    /**
     * Gets the usedFee value for this AcctFeeInfo.
     * 
     * @return usedFee
     */
    public long getUsedFee() {
        return usedFee;
    }


    /**
     * Sets the usedFee value for this AcctFeeInfo.
     * 
     * @param usedFee
     */
    public void setUsedFee(long usedFee) {
        this.usedFee = usedFee;
    }


    /**
     * Gets the paidFee value for this AcctFeeInfo.
     * 
     * @return paidFee
     */
    public long getPaidFee() {
        return paidFee;
    }


    /**
     * Sets the paidFee value for this AcctFeeInfo.
     * 
     * @param paidFee
     */
    public void setPaidFee(long paidFee) {
        this.paidFee = paidFee;
    }


    /**
     * Gets the paidPreFee value for this AcctFeeInfo.
     * 
     * @return paidPreFee
     */
    public long getPaidPreFee() {
        return paidPreFee;
    }


    /**
     * Sets the paidPreFee value for this AcctFeeInfo.
     * 
     * @param paidPreFee
     */
    public void setPaidPreFee(long paidPreFee) {
        this.paidPreFee = paidPreFee;
    }


    /**
     * Gets the paidTransFee value for this AcctFeeInfo.
     * 
     * @return paidTransFee
     */
    public long getPaidTransFee() {
        return paidTransFee;
    }


    /**
     * Sets the paidTransFee value for this AcctFeeInfo.
     * 
     * @param paidTransFee
     */
    public void setPaidTransFee(long paidTransFee) {
        this.paidTransFee = paidTransFee;
    }


    /**
     * Gets the shouldPayFee value for this AcctFeeInfo.
     * 
     * @return shouldPayFee
     */
    public long getShouldPayFee() {
        return shouldPayFee;
    }


    /**
     * Sets the shouldPayFee value for this AcctFeeInfo.
     * 
     * @param shouldPayFee
     */
    public void setShouldPayFee(long shouldPayFee) {
        this.shouldPayFee = shouldPayFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AcctFeeInfo)) return false;
        AcctFeeInfo other = (AcctFeeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.usedFee == other.getUsedFee() &&
            this.paidFee == other.getPaidFee() &&
            this.paidPreFee == other.getPaidPreFee() &&
            this.paidTransFee == other.getPaidTransFee() &&
            this.shouldPayFee == other.getShouldPayFee();
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
        _hashCode += new Long(getUsedFee()).hashCode();
        _hashCode += new Long(getPaidFee()).hashCode();
        _hashCode += new Long(getPaidPreFee()).hashCode();
        _hashCode += new Long(getPaidTransFee()).hashCode();
        _hashCode += new Long(getShouldPayFee()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AcctFeeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", "AcctFeeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UsedFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaidFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidPreFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaidPreFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidTransFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaidTransFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shouldPayFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShouldPayFee"));
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
