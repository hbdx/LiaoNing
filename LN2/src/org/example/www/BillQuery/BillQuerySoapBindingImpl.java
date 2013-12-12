/**
 * BillQuerySoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.BillQuery;

import java.rmi.RemoteException;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import utils.Comutils;
import utils.HandleXml;

import cn.chinatelecom.sgw.soap.SGWService;
import cn.chinatelecom.sgw.soap.SgwQueryAck;
import cn.chinatelecom.sgw.soap.SgwQueryReq;

import com.hp.ocs.diameter.DiameterUtils;


public class BillQuerySoapBindingImpl implements BillQuery_PortType{
	
	private static final Logger logger = LoggerFactory.getLogger(BillQuerySoapBindingImpl.class);
	
	//读取properties配置文件
	ResourceBundle reb = ResourceBundle.getBundle("prop") ;
	String url = reb.getString("sgwServerURL") ;
	String id = reb.getString("uid") ;

	private static int SUCCESS = 0;
	private String sgwServerURL = url;
	private String uid = id;
	private String pwd = "E807F1FCF82D132F9BB018CA6738A19F";

	public SgwQueryReq createSgwQueryReq() {
		SgwQueryReq req = new SgwQueryReq();
		req.setMID(DiameterUtils.makeSessionID(uid));
		req.setUID(uid);
		req.setPWD(pwd);
		return req;
	}
	
    public BillQueryResponse execute(BillQueryRequest in0) throws RemoteException {
    	
    	//客户级账单查询
    	if(in0.getQueryType().equals("ACCOUNT_BILL_LIST")){
    		logger.info("receive accountBillList ... ");
			SgwQueryReq req = createSgwQueryReq();
			req.setDATA(HandleXml.AccountBillListToXmlString(in0));
			req.setSCID("UnifiedQuery.SGW@024.ctnbc-bon.net");
//			req.setSCID("UnifiedQuery.SGW@027.ctnbc-bon.net");
			SGWService sgwclient = Comutils.getSGWServiceClient(sgwServerURL);
			logger.info("send message to sgw,message details: ");
			logger.info("MID:" + req.getMID());
			logger.info("UID:" + req.getUID());
			logger.info("PWD:" + req.getPWD());
			logger.info("SCID:" + req.getSCID());
			logger.info("DATA:" + req.getDATA());

			SgwQueryAck ack = sgwclient.sgwQueryRequest(req);
			if (ack != null) {
				logger.info("receive response from sgw,message details: ");
				logger.info("MID:" + ack.getMID());
				logger.info("RTT:" + ack.getRTT());
				logger.info("RC:" + ack.getRC());
				logger.info("DS:" + ack.getDS());
				logger.info("DATA:" + ack.getDATA());
				if (Integer.valueOf(ack.getRC()).intValue() == SUCCESS) {
					return HandleXml.xmlToaccountBillList(ack.getDATA());
				} else {
					logger.warn("request sgw error, error code:" + ack.getRC()
							+ ",reason:" + ack.getDS());
				}
			}
			logger.warn("request sgw error, response is null");
    	}
    	
    	//用户级账单查询
    	if(in0.getQueryType().equals("NEW_USER_BILL_LIST")){
    		logger.info("receive newUserBillList ... ");
			SgwQueryReq req = createSgwQueryReq();
			req.setDATA(HandleXml.NewUserBillListToXmlString(in0));
			req.setSCID("UnifiedQuery.SGW@024.ctnbc-bon.net");
//			req.setSCID("UnifiedQuery.SGW@027.ctnbc-bon.net");
			SGWService sgwclient = Comutils.getSGWServiceClient(sgwServerURL);
			logger.info("send message to sgw,message details: ");
			logger.info("MID:" + req.getMID());
			logger.info("UID:" + req.getUID());
			logger.info("PWD:" + req.getPWD());
			logger.info("SCID:" + req.getSCID());
			logger.info("DATA:" + req.getDATA());

			SgwQueryAck ack = sgwclient.sgwQueryRequest(req);
			if (ack != null) {
				logger.info("receive response from sgw,message details: ");
				logger.info("MID:" + ack.getMID());
				logger.info("RTT:" + ack.getRTT());
				logger.info("RC:" + ack.getRC());
				logger.info("DS:" + ack.getDS());
				logger.info("DATA:" + ack.getDATA());
				if (Integer.valueOf(ack.getRC()).intValue() == SUCCESS) {
					return HandleXml.xmlToNewUserBillList(ack.getDATA());
				} else {
					logger.warn("request sgw error, error code:" + ack.getRC()
							+ ",reason:" + ack.getDS());
				}
			}
			logger.warn("request sgw error, response is null");
    	}
    	
    	
    	
    	
    	
    	
    	
        return null;
    }

}
