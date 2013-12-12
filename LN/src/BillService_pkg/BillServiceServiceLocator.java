/**
 * BillServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package BillService_pkg;

public class BillServiceServiceLocator extends org.apache.axis.client.Service implements BillService_pkg.BillServiceService {

    public BillServiceServiceLocator() {
    }


    public BillServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BillServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BillService
    private java.lang.String BillService_address = "http://tempuri.org/LN/services/BillService";

    public java.lang.String getBillServiceAddress() {
        return BillService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BillServiceWSDDServiceName = "BillService";

    public java.lang.String getBillServiceWSDDServiceName() {
        return BillServiceWSDDServiceName;
    }

    public void setBillServiceWSDDServiceName(java.lang.String name) {
        BillServiceWSDDServiceName = name;
    }

    public BillService_pkg.BillService getBillService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BillService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBillService(endpoint);
    }

    public BillService_pkg.BillService getBillService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            BillService_pkg.BillServiceSoapBindingStub _stub = new BillService_pkg.BillServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getBillServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBillServiceEndpointAddress(java.lang.String address) {
        BillService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (BillService_pkg.BillService.class.isAssignableFrom(serviceEndpointInterface)) {
                BillService_pkg.BillServiceSoapBindingStub _stub = new BillService_pkg.BillServiceSoapBindingStub(new java.net.URL(BillService_address), this);
                _stub.setPortName(getBillServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BillService".equals(inputPortName)) {
            return getBillService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:BillService", "BillServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:BillService", "BillService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BillService".equals(portName)) {
            setBillServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
