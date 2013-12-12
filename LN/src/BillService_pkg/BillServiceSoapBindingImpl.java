/**
 * BillServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package BillService_pkg;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import utils.Comutils;
import utils.HandleXml;
import cn.chinatelecom.sgw.soap.SGWService;
import cn.chinatelecom.sgw.soap.SgwQueryAck;
import cn.chinatelecom.sgw.soap.SgwQueryReq;
import com.hp.ocs.diameter.DiameterUtils;
import com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceInVO;
import com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceOutVO;

public class BillServiceSoapBindingImpl implements BillService_pkg.BillService {
	private static final Logger logger = LoggerFactory
			.getLogger(BillServiceSoapBindingImpl.class);

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

	public BillWebServiceOutVO callService(BillWebServiceInVO in0) throws java.rmi.RemoteException {
		//----------余额查询----------
		if (in0.getEventType().equals("USER_LEFT_FEE")) {
			logger.info("receive USER_LEFT_FEE ... ");
			SgwQueryReq req = createSgwQueryReq();
			req.setDATA(HandleXml.UserLeftFeeToXmlString(in0));
			req.setSCID("Query.Balance@024.ctnbc-bon.net");
//			req.setSCID("Query.Balance@027.ctnbc-bon.net");
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
					return HandleXml.xmlToUserLeftFee(ack.getDATA(),in0.getServiceId(),in0.getServiceKind(),in0.getCityCode());
				} else {
					logger.warn("request sgw error, error code:" + ack.getRC()
							+ ",reason:" + ack.getDS());
				}
			}
			logger.warn("request sgw error, response is null");
		}
		
		//----------交费历史----------
		if (in0.getEventType().equals("USER_PAY_FEE_HIS")){
			SimpleDateFormat dateformat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS E");
			String date = dateformat1.format(new Date());

			logger.info("receive USER_PAY_FEE_HIS ... ");
			SgwQueryReq req = createSgwQueryReq();
			req.setDATA(HandleXml.UserPAayFeeHisToXmlString(in0));
			logger.info("------------------------ BeginTime:" + date);
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
					return HandleXml.xmlToUserPAayFeeHis(ack.getDATA(),in0.getEventType());
				} else {
					logger.warn("request sgw error, error code:" + ack.getRC()
							+ ",reason:" + ack.getDS());
				}
			}
			logger.warn("request sgw error, response is null");
		}
		
		//----------实时话费查询----------
		if (in0.getEventType().equals("USER_MONTH_FEE_LIST")){
			//实时话费查询
			logger.info("receive USER_MONTH_FEE_LIST ... ");
			SgwQueryReq req = createSgwQueryReq();
			req.setDATA(HandleXml.UsrMothFeListToXmlString(in0));
			req.setSCID("CustomizeBillQuery.Bill@024.ctnbc-bon.net");
//			req.setSCID("CustomizeBillQuery.Bill@027.ctnbc-bon.net");
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
			}
			
			//余额查询
			logger.info("receive USER_LEFT_FEE ... ");
			SgwQueryReq req1 = createSgwQueryReq();
			req1.setDATA(HandleXml.UserLeftFeeToXmlString(in0));
			req1.setSCID("Query.Balance@024.ctnbc-bon.net");
//			req1.setSCID("Query.Balance@027.ctnbc-bon.net");
			SGWService sgwclient1 = Comutils.getSGWServiceClient(sgwServerURL);
			logger.info("send message to sgw,message details: ");
			logger.info("MID:" + req1.getMID());
			logger.info("UID:" + req1.getUID());
			logger.info("PWD:" + req1.getPWD());
			logger.info("SCID:" + req1.getSCID());
			logger.info("DATA:" + req1.getDATA());

			SgwQueryAck ack1 = sgwclient1.sgwQueryRequest(req1);
			if (ack1 != null) {
				logger.info("receive response from sgw,message details: ");
				logger.info("MID:" + ack1.getMID());
				logger.info("RTT:" + ack1.getRTT());
				logger.info("RC:" + ack1.getRC());
				logger.info("DS:" + ack1.getDS());
				logger.info("DATA:" + ack1.getDATA());
			}
			
			//新增业务接口(查询信用度)
			logger.info("receive CreditFee ... ");
			SgwQueryReq req2 = createSgwQueryReq();
			req2.setDATA(HandleXml.CreditFeeToXmlString(in0));
			req2.setSCID("UnifiedQuery.SGW@024.ctnbc-bon.net");
//			req2.setSCID("UnifiedQuery.SGW@027.ctnbc-bon.net");
			SGWService sgwclient2 = Comutils.getSGWServiceClient(sgwServerURL);
			logger.info("send message to sgw,message details: ");
			logger.info("MID:" + req2.getMID());
			logger.info("UID:" + req2.getUID());
			logger.info("PWD:" + req2.getPWD());
			logger.info("SCID:" + req2.getSCID());
			logger.info("DATA:" + req2.getDATA());

			SgwQueryAck ack2 = sgwclient2.sgwQueryRequest(req2);
			if (ack2 != null) {
				logger.info("receive response from sgw,message details: ");
				logger.info("MID:" + ack2.getMID());
				logger.info("RTT:" + ack2.getRTT());
				logger.info("RC:" + ack2.getRC());
				logger.info("DS:" + ack2.getDS());
				logger.info("DATA:" + ack2.getDATA());
			}
			
			if (ack!=null && ack1!=null && ack2!=null) {
				if (Integer.valueOf(ack.getRC()).intValue()==SUCCESS && Integer.valueOf(ack1.getRC()).intValue()==SUCCESS 
						&& Integer.valueOf(ack2.getRC()).intValue()==SUCCESS) {
					return HandleXml.xmlToQueryShortMessageResp(ack.getDATA(),ack1.getDATA(),ack2.getDATA(),in0.getServiceId(),in0.getServiceKind(),in0.getCityCode());
				}
				logger.warn("request sgw error, error code:" + ack.getRC()+","+ack1.getRC()+","+ack2.getRC()
						+ ",reason:" + ack.getDS()+","+ack1.getRC()+","+ack2.getRC()
						+ ",reason:" + ack.getDS()+","+ack1.getRC()+","+ack2.getRC());
			}
			logger.warn("request sgw error, response is null");
		}
		
		//----------套餐使用查询----------
		if(in0.getEventType().equals("PRODUCT_USED_QUERY")){
			//套餐使用查询
			logger.info("receive PRODUCT_USED_QUERY ... ");
			SgwQueryReq req = createSgwQueryReq();
			req.setDATA(HandleXml.ProductUserQueryToXmlString(in0));
			req.setSCID("RatableResourceQuery.Balance@024.ctnbc-bon.net");
//			req.setSCID("RatableResourceQuery.Balance@027.ctnbc-bon.net");
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
			}
			
			//新增业务接口(查询信用度)
			logger.info("receive CreditFee ... ");
			SgwQueryReq req1 = createSgwQueryReq();
			req1.setDATA(HandleXml.EvdoFlagToXmlString(in0));
			req1.setSCID("UnifiedQuery.SGW@024.ctnbc-bon.net");
//			req1.setSCID("UnifiedQuery.SGW@027.ctnbc-bon.net");
			SGWService sgwclient1 = Comutils.getSGWServiceClient(sgwServerURL);
			logger.info("send message to sgw,message details: ");
			logger.info("MID:" + req1.getMID());
			logger.info("UID:" + req1.getUID());
			logger.info("PWD:" + req1.getPWD());
			logger.info("SCID:" + req1.getSCID());
			logger.info("DATA:" + req1.getDATA());

			SgwQueryAck ack1 = sgwclient1.sgwQueryRequest(req1);
			if (ack1 != null) {
				logger.info("receive response from sgw,message details: ");
				logger.info("MID:" + ack1.getMID());
				logger.info("RTT:" + ack1.getRTT());
				logger.info("RC:" + ack1.getRC());
				logger.info("DS:" + ack1.getDS());
				logger.info("DATA:" + ack1.getDATA());
			}
			
			if (ack!=null && ack1!=null) {
				if (Integer.valueOf(ack.getRC()).intValue()==SUCCESS && Integer.valueOf(ack1.getRC()).intValue()==SUCCESS) {

					return HandleXml.xmlToProductUserQuery(ack.getDATA(),ack1.getDATA(),in0.getProductConsumeParamVO().getServiceId());
				}
				logger.warn("request sgw error, error code:" + ack.getRC()+","+ack1.getRC()
						+ ",reason:" + ack.getDS()+","+ack1.getRC()
						+ ",reason:" + ack.getDS()+","+ack1.getRC());
			}
			
			logger.warn("request sgw error, response is null");
		}
		
		//-----------------前N个月账单查询----------------
		if(in0.getEventType().equals("BILL_QUERY_MONTH_ACCOUNT_INFO")){
			
			logger.info("receive NMonth... ");
			SgwQueryReq req2 = createSgwQueryReq();
			req2.setDATA(HandleXml.UnifiedQueryToXmlString(in0));
			req2.setSCID("UnifiedQuery.SGW@024.ctnbc-bon.net");
//			req2.setSCID("UnifiedQuery.SGW@027.ctnbc-bon.net");
			SGWService sgwclient2 = Comutils.getSGWServiceClient(sgwServerURL);
			logger.info("send message to sgw,message details: ");
			logger.info("MID:" + req2.getMID());
			logger.info("UID:" + req2.getUID());
			logger.info("PWD:" + req2.getPWD());
			logger.info("SCID:" + req2.getSCID());
			logger.info("DATA:" + req2.getDATA());

			SgwQueryAck ack2 = sgwclient2.sgwQueryRequest(req2);
			if (ack2 != null) {
				logger.info("receive response from sgw,message details: ");
				logger.info("MID:" + ack2.getMID());
				logger.info("RTT:" + ack2.getRTT());
				logger.info("RC:" + ack2.getRC());
				logger.info("DS:" + ack2.getDS());
				logger.info("DATA:" + ack2.getDATA());
			}
			
			if (ack2!=null) {
				if (Integer.valueOf(ack2.getRC()).intValue()==SUCCESS) {
					return HandleXml.xmlToNMonth(ack2.getDATA());
				}
				logger.warn("request sgw error, error code:" + ack2.getRC()
						+ ",reason:" + ack2.getRC());
			}
			logger.warn("request sgw error, response is null");			
		}
		
		//分月转兑查询
		if (in0.getEventType().equals("TRANSFER_BY_MONTH_QUERY")) {
			logger.info("receive TRANSFER_BY_MONTH_QUERY ... ");
			SgwQueryReq req = createSgwQueryReq();
			req.setDATA(HandleXml.transferByMonthQueryToXmlString(in0));
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
					return HandleXml.xmlTotransferByMonthQuery(ack.getDATA(),in0.getServiceId(),in0.getServiceKind(),in0.getCityCode());
				} else {
					logger.warn("request sgw error, error code:" + ack.getRC()
							+ ",reason:" + ack.getDS());
				}
			}
			logger.warn("request sgw error, response is null");
		}
		
		//SP代收费查询
		if (in0.getEventType().equals("USER_SP_FEE_LIST")) {
			logger.info("receive USER_SP_FEE_LIST ... ");
			SgwQueryReq req = createSgwQueryReq();
			req.setDATA(HandleXml.userSpFeeListToXmlString(in0));
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
					return HandleXml.xmlToUserSpFeeList(ack.getDATA(),in0.getServiceId(),in0.getServiceKind(),in0.getCityCode());
				} else {
					logger.warn("request sgw error, error code:" + ack.getRC()
							+ ",reason:" + ack.getDS());
				}
			}
			logger.warn("request sgw error, response is null");
		}
		
		
		//移动语音详单
		if(in0.getEventType().equals("MOBILE_VOICE_DETAIL")){
			logger.info("receive MOBILE_VOICE_DETAIL ... ");
			SgwQueryReq req = createSgwQueryReq();
			req.setDATA(HandleXml.mobileVoiceDetailToXmlString(in0));
//			req.setSCID("UnifiedQuery.SGW@027.ctnbc-bon.net");
			req.setSCID("UnifiedQuery.SGW@024.ctnbc-bon.net");
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
					return HandleXml.xmlToMobileVoiceDetail(ack.getDATA(),in0);
				} else {
					logger.warn("request sgw error, error code:" + ack.getRC()
							+ ",reason:" + ack.getDS());
				}
			}
			logger.warn("request sgw error, response is null");
		}
		
		//移动短信详单
		if(in0.getEventType().equals("MOBILE_SMS_DETAIL")){
			logger.info("receive MOBILE_SMS_DETAIL ... ");
			SgwQueryReq req = createSgwQueryReq();
			req.setDATA(HandleXml.mobileSmsceDetailToXmlString(in0));
//			req.setSCID("UnifiedQuery.SGW@027.ctnbc-bon.net");
			req.setSCID("UnifiedQuery.SGW@024.ctnbc-bon.net");
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
					return HandleXml.xmlToMobileSmsDetail(ack.getDATA(),in0);
				} else {
					logger.warn("request sgw error, error code:" + ack.getRC()
							+ ",reason:" + ack.getDS());
				}
			}
			logger.warn("request sgw error, response is null");
		}
		
		//移动数据卡详单详单
		if(in0.getEventType().equals("MOBILE_EVDO_DETAIL")){
			logger.info("receive MOBILE_EVDO_DETAIL ... ");
			SgwQueryReq req = createSgwQueryReq();
			req.setDATA(HandleXml.mobileEvdoceDetailToXmlString(in0));
//			req.setSCID("UnifiedQuery.SGW@027.ctnbc-bon.net");
			req.setSCID("UnifiedQuery.SGW@024.ctnbc-bon.net");
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
					return HandleXml.xmlToMobileEvdoDetail(ack.getDATA(),in0);
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