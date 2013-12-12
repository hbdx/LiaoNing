/**
 * BillServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package BillService_pkg;

public class BillServiceSoapBindingSkeleton implements BillService_pkg.BillService, org.apache.axis.wsdl.Skeleton {
    private BillService_pkg.BillService impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "BillWebServiceInVO"), com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceInVO.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("callService", _params, new javax.xml.namespace.QName("", "callServiceReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "BillWebServiceOutVO"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:BillService", "callService"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("callService") == null) {
            _myOperations.put("callService", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("callService")).add(_oper);
    }

    public BillServiceSoapBindingSkeleton() {
        this.impl = new BillService_pkg.BillServiceSoapBindingImpl();
    }

    public BillServiceSoapBindingSkeleton(BillService_pkg.BillService impl) {
        this.impl = impl;
    }
    public com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceOutVO callService(com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceInVO in0) throws java.rmi.RemoteException
    {
        com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceOutVO ret = impl.callService(in0);
        return ret;
    }

}
