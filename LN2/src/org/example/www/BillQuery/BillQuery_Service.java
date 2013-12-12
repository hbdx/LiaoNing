/**
 * BillQuery_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.BillQuery;

public interface BillQuery_Service extends javax.xml.rpc.Service {
    public java.lang.String getBillQueryAddress();

    public org.example.www.BillQuery.BillQuery_PortType getBillQuery() throws javax.xml.rpc.ServiceException;

    public org.example.www.BillQuery.BillQuery_PortType getBillQuery(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
