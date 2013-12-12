/**
 * AccountTree.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.webservice.feemgt.common.data;

public class AccountTree  implements java.io.Serializable {
    private com.neusoft.crm.feemgt.data.payfee.AccountInfoVO[] accountInfoArray;

    private java.lang.String pointInfo;

    private java.lang.String relationServiceIdStr;

    private com.neusoft.crm.webservice.feemgt.common.data.AccountNode rootAccountNode;

    private java.lang.String totalFee;

    public AccountTree() {
    }

    public AccountTree(
           com.neusoft.crm.feemgt.data.payfee.AccountInfoVO[] accountInfoArray,
           java.lang.String pointInfo,
           java.lang.String relationServiceIdStr,
           com.neusoft.crm.webservice.feemgt.common.data.AccountNode rootAccountNode,
           java.lang.String totalFee) {
           this.accountInfoArray = accountInfoArray;
           this.pointInfo = pointInfo;
           this.relationServiceIdStr = relationServiceIdStr;
           this.rootAccountNode = rootAccountNode;
           this.totalFee = totalFee;
    }


    /**
     * Gets the accountInfoArray value for this AccountTree.
     * 
     * @return accountInfoArray
     */
    public com.neusoft.crm.feemgt.data.payfee.AccountInfoVO[] getAccountInfoArray() {
        return accountInfoArray;
    }


    /**
     * Sets the accountInfoArray value for this AccountTree.
     * 
     * @param accountInfoArray
     */
    public void setAccountInfoArray(com.neusoft.crm.feemgt.data.payfee.AccountInfoVO[] accountInfoArray) {
        this.accountInfoArray = accountInfoArray;
    }


    /**
     * Gets the pointInfo value for this AccountTree.
     * 
     * @return pointInfo
     */
    public java.lang.String getPointInfo() {
        return pointInfo;
    }


    /**
     * Sets the pointInfo value for this AccountTree.
     * 
     * @param pointInfo
     */
    public void setPointInfo(java.lang.String pointInfo) {
        this.pointInfo = pointInfo;
    }


    /**
     * Gets the relationServiceIdStr value for this AccountTree.
     * 
     * @return relationServiceIdStr
     */
    public java.lang.String getRelationServiceIdStr() {
        return relationServiceIdStr;
    }


    /**
     * Sets the relationServiceIdStr value for this AccountTree.
     * 
     * @param relationServiceIdStr
     */
    public void setRelationServiceIdStr(java.lang.String relationServiceIdStr) {
        this.relationServiceIdStr = relationServiceIdStr;
    }


    /**
     * Gets the rootAccountNode value for this AccountTree.
     * 
     * @return rootAccountNode
     */
    public com.neusoft.crm.webservice.feemgt.common.data.AccountNode getRootAccountNode() {
        return rootAccountNode;
    }


    /**
     * Sets the rootAccountNode value for this AccountTree.
     * 
     * @param rootAccountNode
     */
    public void setRootAccountNode(com.neusoft.crm.webservice.feemgt.common.data.AccountNode rootAccountNode) {
        this.rootAccountNode = rootAccountNode;
    }


    /**
     * Gets the totalFee value for this AccountTree.
     * 
     * @return totalFee
     */
    public java.lang.String getTotalFee() {
        return totalFee;
    }


    /**
     * Sets the totalFee value for this AccountTree.
     * 
     * @param totalFee
     */
    public void setTotalFee(java.lang.String totalFee) {
        this.totalFee = totalFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountTree)) return false;
        AccountTree other = (AccountTree) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountInfoArray==null && other.getAccountInfoArray()==null) || 
             (this.accountInfoArray!=null &&
              java.util.Arrays.equals(this.accountInfoArray, other.getAccountInfoArray()))) &&
            ((this.pointInfo==null && other.getPointInfo()==null) || 
             (this.pointInfo!=null &&
              this.pointInfo.equals(other.getPointInfo()))) &&
            ((this.relationServiceIdStr==null && other.getRelationServiceIdStr()==null) || 
             (this.relationServiceIdStr!=null &&
              this.relationServiceIdStr.equals(other.getRelationServiceIdStr()))) &&
            ((this.rootAccountNode==null && other.getRootAccountNode()==null) || 
             (this.rootAccountNode!=null &&
              this.rootAccountNode.equals(other.getRootAccountNode()))) &&
            ((this.totalFee==null && other.getTotalFee()==null) || 
             (this.totalFee!=null &&
              this.totalFee.equals(other.getTotalFee())));
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
        if (getAccountInfoArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountInfoArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountInfoArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPointInfo() != null) {
            _hashCode += getPointInfo().hashCode();
        }
        if (getRelationServiceIdStr() != null) {
            _hashCode += getRelationServiceIdStr().hashCode();
        }
        if (getRootAccountNode() != null) {
            _hashCode += getRootAccountNode().hashCode();
        }
        if (getTotalFee() != null) {
            _hashCode += getTotalFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountTree.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "AccountTree"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountInfoArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountInfoArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://payfee.data.feemgt.crm.neusoft.com", "AccountInfoVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationServiceIdStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationServiceIdStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootAccountNode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rootAccountNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "AccountNode"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalFee"));
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
