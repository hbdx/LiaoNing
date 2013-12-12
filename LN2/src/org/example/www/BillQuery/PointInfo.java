/**
 * PointInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.BillQuery;

public class PointInfo  implements java.io.Serializable {
    private double lastPoint;

    private double thisPoint;

    private double usePoint;

    private double addPoint;

    private double yearPoint;

    public PointInfo() {
    }

    public PointInfo(
           double lastPoint,
           double thisPoint,
           double usePoint,
           double addPoint,
           double yearPoint) {
           this.lastPoint = lastPoint;
           this.thisPoint = thisPoint;
           this.usePoint = usePoint;
           this.addPoint = addPoint;
           this.yearPoint = yearPoint;
    }


    /**
     * Gets the lastPoint value for this PointInfo.
     * 
     * @return lastPoint
     */
    public double getLastPoint() {
        return lastPoint;
    }


    /**
     * Sets the lastPoint value for this PointInfo.
     * 
     * @param lastPoint
     */
    public void setLastPoint(double lastPoint) {
        this.lastPoint = lastPoint;
    }


    /**
     * Gets the thisPoint value for this PointInfo.
     * 
     * @return thisPoint
     */
    public double getThisPoint() {
        return thisPoint;
    }


    /**
     * Sets the thisPoint value for this PointInfo.
     * 
     * @param thisPoint
     */
    public void setThisPoint(double thisPoint) {
        this.thisPoint = thisPoint;
    }


    /**
     * Gets the usePoint value for this PointInfo.
     * 
     * @return usePoint
     */
    public double getUsePoint() {
        return usePoint;
    }


    /**
     * Sets the usePoint value for this PointInfo.
     * 
     * @param usePoint
     */
    public void setUsePoint(double usePoint) {
        this.usePoint = usePoint;
    }


    /**
     * Gets the addPoint value for this PointInfo.
     * 
     * @return addPoint
     */
    public double getAddPoint() {
        return addPoint;
    }


    /**
     * Sets the addPoint value for this PointInfo.
     * 
     * @param addPoint
     */
    public void setAddPoint(double addPoint) {
        this.addPoint = addPoint;
    }


    /**
     * Gets the yearPoint value for this PointInfo.
     * 
     * @return yearPoint
     */
    public double getYearPoint() {
        return yearPoint;
    }


    /**
     * Sets the yearPoint value for this PointInfo.
     * 
     * @param yearPoint
     */
    public void setYearPoint(double yearPoint) {
        this.yearPoint = yearPoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PointInfo)) return false;
        PointInfo other = (PointInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.lastPoint == other.getLastPoint() &&
            this.thisPoint == other.getThisPoint() &&
            this.usePoint == other.getUsePoint() &&
            this.addPoint == other.getAddPoint() &&
            this.yearPoint == other.getYearPoint();
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
        _hashCode += new Double(getLastPoint()).hashCode();
        _hashCode += new Double(getThisPoint()).hashCode();
        _hashCode += new Double(getUsePoint()).hashCode();
        _hashCode += new Double(getAddPoint()).hashCode();
        _hashCode += new Double(getYearPoint()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PointInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", "PointInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thisPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ThisPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usePoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UsePoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "YearPoint"));
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
