/**
 * BillInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.BillQuery;

public class BillInfo  implements java.io.Serializable {
    private java.lang.String prodName;

    private java.lang.String serviceInfoStr;

    private java.lang.String ifHaveOverlyPkg;

    private org.example.www.BillQuery.FeeInfo[] feeInfo;

    private org.example.www.BillQuery.UseInfo[] useInfo;

    public BillInfo() {
    }

    public BillInfo(
           java.lang.String prodName,
           java.lang.String serviceInfoStr,
           java.lang.String ifHaveOverlyPkg,
           org.example.www.BillQuery.FeeInfo[] feeInfo,
           org.example.www.BillQuery.UseInfo[] useInfo) {
           this.prodName = prodName;
           this.serviceInfoStr = serviceInfoStr;
           this.ifHaveOverlyPkg = ifHaveOverlyPkg;
           this.feeInfo = feeInfo;
           this.useInfo = useInfo;
    }


    /**
     * Gets the prodName value for this BillInfo.
     * 
     * @return prodName
     */
    public java.lang.String getProdName() {
        return prodName;
    }


    /**
     * Sets the prodName value for this BillInfo.
     * 
     * @param prodName
     */
    public void setProdName(java.lang.String prodName) {
        this.prodName = prodName;
    }


    /**
     * Gets the serviceInfoStr value for this BillInfo.
     * 
     * @return serviceInfoStr
     */
    public java.lang.String getServiceInfoStr() {
        return serviceInfoStr;
    }


    /**
     * Sets the serviceInfoStr value for this BillInfo.
     * 
     * @param serviceInfoStr
     */
    public void setServiceInfoStr(java.lang.String serviceInfoStr) {
        this.serviceInfoStr = serviceInfoStr;
    }


    /**
     * Gets the ifHaveOverlyPkg value for this BillInfo.
     * 
     * @return ifHaveOverlyPkg
     */
    public java.lang.String getIfHaveOverlyPkg() {
        return ifHaveOverlyPkg;
    }


    /**
     * Sets the ifHaveOverlyPkg value for this BillInfo.
     * 
     * @param ifHaveOverlyPkg
     */
    public void setIfHaveOverlyPkg(java.lang.String ifHaveOverlyPkg) {
        this.ifHaveOverlyPkg = ifHaveOverlyPkg;
    }


    /**
     * Gets the feeInfo value for this BillInfo.
     * 
     * @return feeInfo
     */
    public org.example.www.BillQuery.FeeInfo[] getFeeInfo() {
        return feeInfo;
    }


    /**
     * Sets the feeInfo value for this BillInfo.
     * 
     * @param feeInfo
     */
    public void setFeeInfo(org.example.www.BillQuery.FeeInfo[] feeInfo) {
        this.feeInfo = feeInfo;
    }

    public org.example.www.BillQuery.FeeInfo getFeeInfo(int i) {
        return this.feeInfo[i];
    }

    public void setFeeInfo(int i, org.example.www.BillQuery.FeeInfo _value) {
        this.feeInfo[i] = _value;
    }


    /**
     * Gets the useInfo value for this BillInfo.
     * 
     * @return useInfo
     */
    public org.example.www.BillQuery.UseInfo[] getUseInfo() {
        return useInfo;
    }


    /**
     * Sets the useInfo value for this BillInfo.
     * 
     * @param useInfo
     */
    public void setUseInfo(org.example.www.BillQuery.UseInfo[] useInfo) {
        this.useInfo = useInfo;
    }

    public org.example.www.BillQuery.UseInfo getUseInfo(int i) {
        return this.useInfo[i];
    }

    public void setUseInfo(int i, org.example.www.BillQuery.UseInfo _value) {
        this.useInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillInfo)) return false;
        BillInfo other = (BillInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prodName==null && other.getProdName()==null) || 
             (this.prodName!=null &&
              this.prodName.equals(other.getProdName()))) &&
            ((this.serviceInfoStr==null && other.getServiceInfoStr()==null) || 
             (this.serviceInfoStr!=null &&
              this.serviceInfoStr.equals(other.getServiceInfoStr()))) &&
            ((this.ifHaveOverlyPkg==null && other.getIfHaveOverlyPkg()==null) || 
             (this.ifHaveOverlyPkg!=null &&
              this.ifHaveOverlyPkg.equals(other.getIfHaveOverlyPkg()))) &&
            ((this.feeInfo==null && other.getFeeInfo()==null) || 
             (this.feeInfo!=null &&
              java.util.Arrays.equals(this.feeInfo, other.getFeeInfo()))) &&
            ((this.useInfo==null && other.getUseInfo()==null) || 
             (this.useInfo!=null &&
              java.util.Arrays.equals(this.useInfo, other.getUseInfo())));
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
        if (getProdName() != null) {
            _hashCode += getProdName().hashCode();
        }
        if (getServiceInfoStr() != null) {
            _hashCode += getServiceInfoStr().hashCode();
        }
        if (getIfHaveOverlyPkg() != null) {
            _hashCode += getIfHaveOverlyPkg().hashCode();
        }
        if (getFeeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeeInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUseInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUseInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", "BillInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProdName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceInfoStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceInfoStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifHaveOverlyPkg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IfHaveOverlyPkg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FeeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", "FeeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UseInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", "UseInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
