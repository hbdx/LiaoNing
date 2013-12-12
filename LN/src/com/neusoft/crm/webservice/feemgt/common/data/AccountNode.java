/**
 * AccountNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.webservice.feemgt.common.data;

public class AccountNode  implements java.io.Serializable {
    private java.lang.String billName;

    private java.lang.String billValue;

    private com.neusoft.crm.webservice.feemgt.common.data.AccountNode[] childrenList;

    private int level;

    private com.neusoft.crm.webservice.feemgt.common.data.AccountNode parentAccountNode;

    public AccountNode() {
    }

    public AccountNode(
           java.lang.String billName,
           java.lang.String billValue,
           com.neusoft.crm.webservice.feemgt.common.data.AccountNode[] childrenList,
           int level,
           com.neusoft.crm.webservice.feemgt.common.data.AccountNode parentAccountNode) {
           this.billName = billName;
           this.billValue = billValue;
           this.childrenList = childrenList;
           this.level = level;
           this.parentAccountNode = parentAccountNode;
    }


    /**
     * Gets the billName value for this AccountNode.
     * 
     * @return billName
     */
    public java.lang.String getBillName() {
        return billName;
    }


    /**
     * Sets the billName value for this AccountNode.
     * 
     * @param billName
     */
    public void setBillName(java.lang.String billName) {
        this.billName = billName;
    }


    /**
     * Gets the billValue value for this AccountNode.
     * 
     * @return billValue
     */
    public java.lang.String getBillValue() {
        return billValue;
    }


    /**
     * Sets the billValue value for this AccountNode.
     * 
     * @param billValue
     */
    public void setBillValue(java.lang.String billValue) {
        this.billValue = billValue;
    }


    /**
     * Gets the childrenList value for this AccountNode.
     * 
     * @return childrenList
     */
    public com.neusoft.crm.webservice.feemgt.common.data.AccountNode[] getChildrenList() {
        return childrenList;
    }


    /**
     * Sets the childrenList value for this AccountNode.
     * 
     * @param childrenList
     */
    public void setChildrenList(com.neusoft.crm.webservice.feemgt.common.data.AccountNode[] childrenList) {
        this.childrenList = childrenList;
    }


    /**
     * Gets the level value for this AccountNode.
     * 
     * @return level
     */
    public int getLevel() {
        return level;
    }


    /**
     * Sets the level value for this AccountNode.
     * 
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }


    /**
     * Gets the parentAccountNode value for this AccountNode.
     * 
     * @return parentAccountNode
     */
    public com.neusoft.crm.webservice.feemgt.common.data.AccountNode getParentAccountNode() {
        return parentAccountNode;
    }


    /**
     * Sets the parentAccountNode value for this AccountNode.
     * 
     * @param parentAccountNode
     */
    public void setParentAccountNode(com.neusoft.crm.webservice.feemgt.common.data.AccountNode parentAccountNode) {
        this.parentAccountNode = parentAccountNode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountNode)) return false;
        AccountNode other = (AccountNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billName==null && other.getBillName()==null) || 
             (this.billName!=null &&
              this.billName.equals(other.getBillName()))) &&
            ((this.billValue==null && other.getBillValue()==null) || 
             (this.billValue!=null &&
              this.billValue.equals(other.getBillValue()))) &&
            ((this.childrenList==null && other.getChildrenList()==null) || 
             (this.childrenList!=null &&
              java.util.Arrays.equals(this.childrenList, other.getChildrenList()))) &&
            this.level == other.getLevel() &&
            ((this.parentAccountNode==null && other.getParentAccountNode()==null) || 
             (this.parentAccountNode!=null &&
              this.parentAccountNode.equals(other.getParentAccountNode())));
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
        if (getBillName() != null) {
            _hashCode += getBillName().hashCode();
        }
        if (getBillValue() != null) {
            _hashCode += getBillValue().hashCode();
        }
        if (getChildrenList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildrenList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildrenList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getLevel();
        if (getParentAccountNode() != null) {
            _hashCode += getParentAccountNode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "AccountNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childrenList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "childrenList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "AccountNode"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentAccountNode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentAccountNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "AccountNode"));
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
