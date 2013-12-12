/**
 * CoutesyReminderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.BillQuery;

public class CoutesyReminderInfo  implements java.io.Serializable {
    private java.lang.String prodEstimate;

    private java.lang.String consumptionAnalysis;

    public CoutesyReminderInfo() {
    }

    public CoutesyReminderInfo(
           java.lang.String prodEstimate,
           java.lang.String consumptionAnalysis) {
           this.prodEstimate = prodEstimate;
           this.consumptionAnalysis = consumptionAnalysis;
    }


    /**
     * Gets the prodEstimate value for this CoutesyReminderInfo.
     * 
     * @return prodEstimate
     */
    public java.lang.String getProdEstimate() {
        return prodEstimate;
    }


    /**
     * Sets the prodEstimate value for this CoutesyReminderInfo.
     * 
     * @param prodEstimate
     */
    public void setProdEstimate(java.lang.String prodEstimate) {
        this.prodEstimate = prodEstimate;
    }


    /**
     * Gets the consumptionAnalysis value for this CoutesyReminderInfo.
     * 
     * @return consumptionAnalysis
     */
    public java.lang.String getConsumptionAnalysis() {
        return consumptionAnalysis;
    }


    /**
     * Sets the consumptionAnalysis value for this CoutesyReminderInfo.
     * 
     * @param consumptionAnalysis
     */
    public void setConsumptionAnalysis(java.lang.String consumptionAnalysis) {
        this.consumptionAnalysis = consumptionAnalysis;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoutesyReminderInfo)) return false;
        CoutesyReminderInfo other = (CoutesyReminderInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prodEstimate==null && other.getProdEstimate()==null) || 
             (this.prodEstimate!=null &&
              this.prodEstimate.equals(other.getProdEstimate()))) &&
            ((this.consumptionAnalysis==null && other.getConsumptionAnalysis()==null) || 
             (this.consumptionAnalysis!=null &&
              this.consumptionAnalysis.equals(other.getConsumptionAnalysis())));
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
        if (getProdEstimate() != null) {
            _hashCode += getProdEstimate().hashCode();
        }
        if (getConsumptionAnalysis() != null) {
            _hashCode += getConsumptionAnalysis().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CoutesyReminderInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", "CoutesyReminderInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProdEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumptionAnalysis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConsumptionAnalysis"));
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
