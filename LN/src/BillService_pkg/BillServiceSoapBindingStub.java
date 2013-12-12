/**
 * BillServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package BillService_pkg;

public class BillServiceSoapBindingStub extends org.apache.axis.client.Stub implements BillService_pkg.BillService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("callService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "BillWebServiceInVO"), com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceInVO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "BillWebServiceOutVO"));
        oper.setReturnClass(com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceOutVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "callServiceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

    }

    public BillServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BillServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BillServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "AccountDetailInfoVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.AccountDetailInfoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "AccountNode");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.AccountNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "AccountTree");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.AccountTree.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "BillQueryVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.BillQueryVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "BillWebServiceInVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceInVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "BillWebServiceOutVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceOutVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "Cdma1XDetailVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.Cdma1XDetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "CurrentMonthFeeVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.CurrentMonthFeeVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "DataDetailQueryVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.DataDetailQueryVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "DetailBillListVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.DetailBillListVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "DetaileVoiceVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.DetaileVoiceVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "IncrementDetailQueryVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.IncrementDetailQueryVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "LeftFeeVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.LeftFeeVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "PayFeeHisVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.PayFeeHisVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "PaymentBankQueryVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.PaymentBankQueryVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProductConsumeParamVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeParamVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProductConsumeVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProductUseExtraInfoVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.ProductUseExtraInfoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProudctUseInfoVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.ProudctUseInfoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ShortMessageDetailVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.ShortMessageDetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "SpFeeQueryVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.SpFeeQueryVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "TransferByMonthInfoVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.TransferByMonthInfoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://data.common.tdframework.neusoft.com", "BaseVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.tdframework.common.data.BaseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetailDataVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.detailquery.DetailDataVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetaileCDMA1XVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.detailquery.DetaileCDMA1XVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetaileNotesVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.detailquery.DetaileNotesVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetailPstnVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.detailquery.DetailPstnVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetailVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.detailquery.DetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://monthFeeQuery.data.feemgt.crm.neusoft.com", "MonthFeeDetailVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.monthFeeQuery.MonthFeeDetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://monthFeeQuery.data.feemgt.crm.neusoft.com", "MonthFeeQueryVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.monthFeeQuery.MonthFeeQueryVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://payfee.data.feemgt.crm.neusoft.com", "AccountInfoVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.payfee.AccountInfoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "mapItem");
            cachedSerQNames.add(qName);
            cls = org.apache.xml.xml_soap.MapItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_AccountDetailInfoVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.AccountDetailInfoVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "AccountDetailInfoVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_AccountInfoVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.payfee.AccountInfoVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://payfee.data.feemgt.crm.neusoft.com", "AccountInfoVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_AccountNode");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.AccountNode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "AccountNode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_BillQueryVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.BillQueryVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "BillQueryVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_Cdma1XDetailVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.Cdma1XDetailVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "Cdma1XDetailVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_DataDetailQueryVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.DataDetailQueryVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "DataDetailQueryVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_DetailDataVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.detailquery.DetailDataVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetailDataVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_DetaileCDMA1XVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.detailquery.DetaileCDMA1XVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetaileCDMA1XVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_DetaileNotesVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.detailquery.DetaileNotesVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetaileNotesVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_DetaileVoiceVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.DetaileVoiceVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "DetaileVoiceVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_IncrementDetailQueryVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.IncrementDetailQueryVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "IncrementDetailQueryVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_PayFeeHisVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.PayFeeHisVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "PayFeeHisVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_PaymentBankQueryVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.PaymentBankQueryVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "PaymentBankQueryVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_ProductConsumeVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProductConsumeVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_ProductUseExtraInfoVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.ProductUseExtraInfoVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProductUseExtraInfoVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_ProudctUseInfoVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.ProudctUseInfoVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProudctUseInfoVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_ShortMessageDetailVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.ShortMessageDetailVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ShortMessageDetailVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_SpFeeQueryVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.SpFeeQueryVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "SpFeeQueryVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns1_TransferByMonthInfoVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.webservice.feemgt.common.data.TransferByMonthInfoVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "TransferByMonthInfoVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns2_MonthFeeDetailVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.monthFeeQuery.MonthFeeDetailVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://monthFeeQuery.data.feemgt.crm.neusoft.com", "MonthFeeDetailVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns4_DetailPstnVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.detailquery.DetailPstnVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetailPstnVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_tns4_DetailVO");
            cachedSerQNames.add(qName);
            cls = com.neusoft.crm.feemgt.data.detailquery.DetailVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetailVO");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:BillService", "ArrayOf_xsd_anyType");
            cachedSerQNames.add(qName);
            cls = java.lang.Object[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceOutVO callService(com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceInVO in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:BillService", "callService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceOutVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceOutVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceOutVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
