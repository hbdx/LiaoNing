/**
 * BillQuerySoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.BillQuery;

public class BillQuerySoapBindingSkeleton implements org.example.www.BillQuery.BillQuery_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.BillQuery.BillQuery_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", "BillQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/BillQuery/", ">BillQueryRequest"), org.example.www.BillQuery.BillQueryRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("execute", _params, new javax.xml.namespace.QName("http://www.example.org/BillQuery/", "BillQueryResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/BillQuery/", ">BillQueryResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "execute"));
        _oper.setSoapAction("http://www.example.org/BillQuery/execute");
        _myOperationsList.add(_oper);
        if (_myOperations.get("execute") == null) {
            _myOperations.put("execute", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("execute")).add(_oper);
    }

    public BillQuerySoapBindingSkeleton() {
        this.impl = new org.example.www.BillQuery.BillQuerySoapBindingImpl();
    }

    public BillQuerySoapBindingSkeleton(org.example.www.BillQuery.BillQuery_PortType impl) {
        this.impl = impl;
    }
    public org.example.www.BillQuery.BillQueryResponse execute(org.example.www.BillQuery.BillQueryRequest billQueryRequest) throws java.rmi.RemoteException
    {
        org.example.www.BillQuery.BillQueryResponse ret = impl.execute(billQueryRequest);
        return ret;
    }

}
