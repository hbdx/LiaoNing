package utils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.neusoft.crm.feemgt.data.detailquery.DetaileCDMA1XVO;
import com.neusoft.crm.feemgt.data.detailquery.DetaileNotesVO;
import com.neusoft.crm.feemgt.data.monthFeeQuery.MonthFeeDetailVO;
import com.neusoft.crm.feemgt.data.monthFeeQuery.MonthFeeQueryVO;
import com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceInVO;
import com.neusoft.crm.webservice.feemgt.common.data.BillWebServiceOutVO;
import com.neusoft.crm.webservice.feemgt.common.data.CurrentMonthFeeVO;
import com.neusoft.crm.webservice.feemgt.common.data.DetaileVoiceVO;
import com.neusoft.crm.webservice.feemgt.common.data.LeftFeeVO;
import com.neusoft.crm.webservice.feemgt.common.data.PayFeeHisVO;
import com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeVO;
import com.neusoft.crm.webservice.feemgt.common.data.ProudctUseInfoVO;
import com.neusoft.crm.webservice.feemgt.common.data.SpFeeQueryVO;
import com.neusoft.crm.webservice.feemgt.common.data.TransferByMonthInfoVO;

public class HandleXml {
	
	private static final Logger logger = LoggerFactory.getLogger(HandleXml.class);
	
	//余额查询
	public static String UserLeftFeeToXmlString(BillWebServiceInVO in0) {
		logger.info("convert UserLeftFee to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element1 = serviceInformation.addElement("Balance_Information") ;
		Element element = null ;
		
		element = element1.addElement("Destination_Id") ;
		element.setText(in0.getServiceId()) ;
		
		element = element1.addElement("Destination_Id_Type") ;
		element.setText("2") ;
		
		/**
		 service_kind     destination-attr
				51               1
				8                2
				11、55           3
				其余             	     0
		 * */
		element = element1.addElement("Destination_Attr") ;
		if(String.valueOf(in0.getServiceKind()).equals("51")){
			element.setText("1") ;
		}else if(String.valueOf(in0.getServiceKind()).equals("8")){
			element.setText("2") ;
		}else if(String.valueOf(in0.getServiceKind()).equals("11") || String.valueOf(in0.getServiceKind()).equals("15")){
			element.setText("3") ;
		}else{
			element.setText("0") ;
		}
		
		//SGW转换CityCode:将CityCode转化为区号。
		element = element1.addElement("Area_Code") ;
		//读取配置文件
		ResourceBundle resource = ResourceBundle.getBundle("prop");
		String key1 = resource.getString(in0.getCityCode());
		//logger.info("CityCode-----------"+key1) ;
		element.setText(key1) ;
		
		element = element1.addElement("Query_Flag") ;
		element.setText("1") ;
		
		element = element1.addElement("Query_Item_Type") ;
		element.setText("0") ;

		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static BillWebServiceOutVO xmlToUserLeftFee(String data,String serviceId ,int serviceKind ,String cityCode) {
		logger.info("convert sgw ack to UserLeftFee......");
		BillWebServiceOutVO resp = new BillWebServiceOutVO();
		MonthFeeQueryVO mfu = new MonthFeeQueryVO() ;
		
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(data);
			Element root = doc.getRootElement();

			//Result为0为true；其余为false ；
			Node node = root.selectSingleNode("//Service_Information/Service_Result_Code");
			//logger.info("============="+node.getStringValue()) ;
			if (node != null) {
				if(node.getStringValue().equals("0")){
					resp.setSucess(true) ;
				}else{
					resp.setSucess(false) ;
				}
			}

			node = root.selectSingleNode("//Service_Information/Para_Field_Result");
			if (node != null) {
				resp.setErrorDesc(node.getStringValue()) ;
			}
			
			node = root.selectSingleNode("//Service_Information/Total_Balance_Available") ;
			//logger.info("----------"+node.getStringValue()+"----------") ;
			//logger.info("----------"+Float.parseFloat(node.getStringValue())+"----------") ;
			if(node != null){
				LeftFeeVO lftVo = new LeftFeeVO() ;
				//bankReplaceVO.setLateFee(String.format("%.2f",(Double.parseDouble(node.getStringValue())/100)));   
				lftVo.setRestFee(Float.parseFloat(String.format("%.2f", Float.parseFloat(node.getStringValue())/100))) ;
				//logger.info("==============restFee:"+Float.parseFloat(String.format("%.2f", Float.parseFloat(node.getStringValue())/100))) ;
				resp.setLeftFeeVO(lftVo) ;
			}
			
			mfu.setServiceId(serviceId) ;
			mfu.setServiceKind(serviceKind) ;
			mfu.setCityCode(cityCode) ;
			resp.setMonthFeeQueryVO(mfu) ;
			
			
		} catch (Exception exc) {
			logger.warn("Exception in xmlToUserLeftFee:" + exc);
			exc.printStackTrace();
		}
		logger.info("UserLeftFee:" + resp.toString());
		return resp;
	}
	
	//交费历史
	public static String UserPAayFeeHisToXmlString(BillWebServiceInVO in0) {
		logger.info("convert UserPAayFeeHis to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element = null ;
		
		element = serviceInformation.addElement("Value") ;
		element.setText("23") ;
		
		//直接填入webservice请求中的xml
		int serviceKind ;
		if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("51")){
			serviceKind = 1 ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("8")){
			serviceKind = 2 ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("11") || String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("15")){
			serviceKind = 3 ;
		}else{
			serviceKind = 0 ;
		}
		
		element = serviceInformation.addElement("Data-Table-Simple-Row") ;
		String str ="<eventType>"+in0.getEventType()+"</eventType><cityCode>"+in0.getCityCode()+"</cityCode><serviceId>"+
			in0.getDetailBillListVO().getServiceId()+"</serviceId><serviceKind>"+serviceKind+"</serviceKind><DetailBillListVO><serviceId>"+
			in0.getDetailBillListVO().getServiceId()+"</serviceId><serviceKind>"+in0.getDetailBillListVO().getServiceKind()+
			"</serviceKind><BeginDate>"+in0.getDetailBillListVO().getBeginDate()+"</BeginDate><EndDate>"+in0.getDetailBillListVO()
			.getEndDate()+"</EndDate><QueryKind>"+in0.getDetailBillListVO().getQueryKind()+"</QueryKind><DetailType>"+in0.getDetailBillListVO().getDetailType()+
			"</DetailType></DetailBillListVO>" ;
		element.setText(str) ;

		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	//为了节约内存，将list集合放在外边，不用每次都生成新的list集合
	private static List<String> results = new ArrayList<String>() ;
	/**存在多个Group时，用此方法取到group个数
	 * @param s：从s中取
	 * @param beginIndx:开始位置
	 * @param endIdx:结束位置
	 * @return
	 */
	private static List<String> match(String s,String beginIdx,String endIdx) {
        //List<String> results = new ArrayList<String>();
		results.clear() ;
        Pattern p = Pattern.compile("<"+beginIdx+">([\\w]*)</"+endIdx+">");
        Matcher m = p.matcher(s);
        while (!m.hitEnd() && m.find()) {
            results.add(m.group(1));
        }
        return results;
    }
	
	/**
	 * 当无返回值是返回的格式是：<fee_name />而非<fee_name>0</fee_name>。用来判断是否存在<fee_name />这种格式的返回值
	 * @param s：从s中判断
	 * @param s1：判断存在哪个节点：如<fee_name />
	 * @return
	 */
	private static List<String> match1(String s,String s1) {
	       // List<String> results = new ArrayList<String>();
			results.clear() ;
	        Pattern p = Pattern.compile(s1);
	        Matcher m = p.matcher(s);
	        while (!m.hitEnd() && m.find()) {
	            results.add("true");
	        }
	        return results;
	    }
	
	/**用Dom4j将String转化为XML进行解析,添加root根元素*/	
	public static BillWebServiceOutVO xmlToUserPAayFeeHis(String data ,String eventType) {
		logger.info("convert sgw ack to UserPAayFeeHis......");
		BillWebServiceOutVO resp = new BillWebServiceOutVO();
		
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(data);
			Element root = doc.getRootElement();

			//Result为0为true；其余为false ；
			Node node = root.selectSingleNode("//Service_Information/Service_Result_Code");
			//logger.info("============="+node.getStringValue()) ;
			if (node != null) {
				if(node.getStringValue().equals("0")){
					resp.setSucess(true) ;
				}else{
					resp.setSucess(false) ;
				}
			}
			
			node = root.selectSingleNode("//Service_Information/Para_Field_Result");
			if (node != null) {
				resp.setErrorDesc(node.getStringValue()) ;
			}
			
			node = root.selectSingleNode("//Service_Information/Data-Table-Simple-Row") ;
			//logger.info("-----------------------------1:"+node.getStringValue()) ;
			if(node != null){
				String result = node.getStringValue() ;
				/**
				 * 添加root根元素
				 *   <root>
						<serviceId>15810049355</serviceId>
						<ServiceKind>1</ServiceKind>
						<cityCode>910</cityCode>
						<PayFeeHisVO>
						    <accountFeeKind>shortmessage</accountFeeKind>----
						    <advance_operate_date>201307</advance_operate_date>----
						    <bankName>招商银行</bankName>----
						    <fee_name>短信费</fee_name>----
						    <flow_number>10001210</flow_number>----
						    <last_left>100</last_left>
						    <left_fee>59.6</left_fee>
						    <leftFee>30.7</leftFee>----
						    <no_pay_number>1321568</no_pay_number>
						    <overdue_fee>0.0</overdue_fee>
						    <pay_fee>200.0</pay_fee>----
						    <pay_kind>网上缴费</pay_kind>----
						    <pay_kind_code>1</pay_kind_code>----
						    <payKindName>网上扣账</payKindName>----
						    <payTime>20130719085033</payTime>
						    <payWayName>网上缴费</payWayName>----
						    <service_id>15810049355</service_id>----
						    <service_name>网上缴费</service_name>----
						</PayFeeHisVO>
					</root>
				 * */
				
				String rootResult = "<root>"+result+"</root>" ;
				doc = DocumentHelper.parseText(rootResult) ;
				root = doc.getRootElement() ;
				
				node = root.selectSingleNode("//root/serviceId") ;
				if(node != null){
					resp.setServiceId(node.getStringValue()) ;
				}
				
				node = root.selectSingleNode("//root/ServiceKind") ;
				if(node != null){
					resp.setServiceKind(Integer.parseInt(node.getStringValue())) ;
				}
				
				node = root.selectSingleNode("//root/cityCode") ;
				if(node != null){
					resp.setCityCode(node.getStringValue()) ;
				}
				
				if(eventType != null){
					resp.setEventType(eventType) ;
				}
				
				
				List<Element> payFeeHisVO = root.elements("PayFeeHisVO") ;
				logger.info("----------PayFeeHisVOSize:"+payFeeHisVO.size()) ;
				if(payFeeHisVO != null){
					PayFeeHisVO[] pfhArray = new PayFeeHisVO[payFeeHisVO.size()] ;
					for(int i=0 ;i<payFeeHisVO.size() ;i++){
						PayFeeHisVO pfh = new PayFeeHisVO() ;
						if(payFeeHisVO.get(i).elementText("accountFeeKind")!=null && !payFeeHisVO.get(i).elementText("accountFeeKind").equals("") ){
							pfh.setAccountFeeKind((payFeeHisVO.get(i).elementText("accountFeeKind"))) ;
						}
						
						if(payFeeHisVO.get(i).elementText("advance_operate_date")!=null && !payFeeHisVO.get(i).elementText("advance_operate_date").equals("")){
							pfh.setAdvance_operate_date(payFeeHisVO.get(i).elementText("advance_operate_date")) ;
						}else{
							pfh.setAdvance_operate_date("") ;
						}
						
						if(payFeeHisVO.get(i).elementText("bankName")!=null && !payFeeHisVO.get(i).elementText("bankName").equals("")){
							pfh.setBankName(payFeeHisVO.get(i).elementText("bank Name")) ;
						}
						
						if(payFeeHisVO.get(i).elementText("fee_name")!=null && !payFeeHisVO.get(i).elementText("fee_name").equals("")){
							pfh.setFee_name(payFeeHisVO.get(i).elementText("fee_name")) ;
						}else{
							pfh.setFee_name("") ;
						}
						
						if(payFeeHisVO.get(i).elementText("pay_kind")!=null && !payFeeHisVO.get(i).elementText("pay_kind").equals("")){
							pfh.setPay_kind(payFeeHisVO.get(i).elementText("pay_kind")) ;
						}
						
						if(payFeeHisVO.get(i).elementText("payKindName")!=null && !payFeeHisVO.get(i).elementText("payKindName").equals("")){
							pfh.setPayKindName(payFeeHisVO.get(i).elementText("payKindName")) ;
						}
						
						if(payFeeHisVO.get(i).elementText("payWayName")!=null && !payFeeHisVO.get(i).elementText("payWayName").equals("")){
							pfh.setPayWayName(payFeeHisVO.get(i).elementText("payWayName")) ;
						}
						
						if(payFeeHisVO.get(i).elementText("service_id")!=null && !payFeeHisVO.get(i).elementText("service_id").equals("")){
							pfh.setService_id(payFeeHisVO.get(i).elementText("service_id")) ;
						}
						
						if(payFeeHisVO.get(i).elementText("service_name")!=null && !payFeeHisVO.get(i).elementText("service_name").equals("")){
							pfh.setService_name(payFeeHisVO.get(i).elementText("service_name")) ;
						}
						
						//新增属性：last_left,left_fee,no_pay_number,overdue_fee,payTime,flow_number 、leftFee 、pay_fee 、pay_kind_code
						if(payFeeHisVO.get(i).elementText("flow_number")!=null){
							pfh.setFlow_number(Long.parseLong(payFeeHisVO.get(i).elementText("flow_number"))) ;
						}
						
						//余额单位是分需要/100转换为元。
						//Float.parseFloat(String.format("%.2f", Float.parseFloat(payFeeHisVO.get(i).elementText("leftFee"))/100))
						if(payFeeHisVO.get(i).elementText("leftFee")!=null){
							pfh.setLeftFee(Float.parseFloat(String.format("%.2f", Float.parseFloat(payFeeHisVO.get(i).elementText("leftFee"))/100))) ;
						}
						
						//余额单位是分需要/100转换为元。
						if(payFeeHisVO.get(i).elementText("pay_fee")!=null){
							pfh.setPay_fee(Float.parseFloat(String.format("%.2f", Float.parseFloat(payFeeHisVO.get(i).elementText("pay_fee"))/100))) ;
						}
						
						//余额单位是分需要/100转换为元。
						if(payFeeHisVO.get(i).elementText("last_left")!=null){
							pfh.setLast_left(Float.parseFloat(String.format("%.2f", Float.parseFloat(payFeeHisVO.get(i).elementText("last_left"))/100))) ;
						}
						
						//余额单位是分需要/100转换为元。
						if(payFeeHisVO.get(i).elementText("left_fee")!=null){
							pfh.setLeft_fee(Float.parseFloat(String.format("%.2f", Float.parseFloat(payFeeHisVO.get(i).elementText("left_fee"))/100))) ;
						}
						
						//余额单位是分需要/100转换为元。
						if(payFeeHisVO.get(i).elementText("overdue_fee")!=null){
							pfh.setOverdue_fee(Float.parseFloat(String.format("%.2f", Float.parseFloat(payFeeHisVO.get(i).elementText("overdue_fee"))/100))) ;
						}
						
						if(payFeeHisVO.get(i).elementText("payTime")!=null){
							StringBuffer time = new StringBuffer()  ;
							time.append(payFeeHisVO.get(i).elementText("payTime"));
							time.insert(4, "-").insert(7, "-").insert(10, " ").insert(13, ":").insert(16, ":");
							logger.info("----------Date:"+time) ;
							pfh.setPayTime(time.toString()) ;
						}
						
						if(payFeeHisVO.get(i).elementText("pay_kind_code")!=null){
							pfh.setPay_kind_code(Integer.parseInt(payFeeHisVO.get(i).elementText("pay_kind_code"))) ;
						}
						
						if(payFeeHisVO.get(i).elementText("no_pay_number")!=null){
							pfh.setNo_pay_number(Long.parseLong(payFeeHisVO.get(i).elementText("no_pay_number"))) ;
						}
						
						//新增20个属性，若不存在需要赋初始值：double,int----0   float----0.0    String----"0"
						if(payFeeHisVO.get(i).elementText("access_level")!=null && !payFeeHisVO.get(i).elementText("access_level").equals("")){
							pfh.setAccess_level(Long.parseLong(payFeeHisVO.get(i).elementText("access_level"))) ;
						}else{
							pfh.setAccess_level(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("account_id")!=null && !payFeeHisVO.get(i).elementText("account_id").equals("")){
							pfh.setAccount_id(Long.parseLong(payFeeHisVO.get(i).elementText("account_id"))) ;
						}else{
							pfh.setAccount_id(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("accountFeeId")!=null && !payFeeHisVO.get(i).elementText("accountFeeId").equals("")){
							pfh.setAccountFeeId(Long.parseLong(payFeeHisVO.get(i).elementText("accountFeeId"))) ;
						}else{
							pfh.setAccountFeeId(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("batch_id")!=null && !payFeeHisVO.get(i).elementText("batch_id").equals("")){
							pfh.setBatch_id(Integer.parseInt(payFeeHisVO.get(i).elementText("batch_id"))) ;
						}else{
							pfh.setBatch_id(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("batch_status")!=null && !payFeeHisVO.get(i).elementText("batch_status").equals("")){
							pfh.setBatch_status(Integer.parseInt(payFeeHisVO.get(i).elementText("batch_status"))) ;
						}else{
							pfh.setBatch_status(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("BUNDLE_ID")!=null && !payFeeHisVO.get(i).elementText("BUNDLE_ID").equals("")){
							pfh.setBUNDLE_ID(Long.parseLong(payFeeHisVO.get(i).elementText("BUNDLE_ID"))) ;
						}else{
							pfh.setBUNDLE_ID(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("contract_credit")!=null && !payFeeHisVO.get(i).elementText("contract_credit").equals("")){
							pfh.setContract_credit(Long.parseLong(payFeeHisVO.get(i).elementText("contract_credit"))) ;
						}else{
							pfh.setContract_credit(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("fee")!=null && !payFeeHisVO.get(i).elementText("fee").equals("")){
							pfh.setFee(Float.parseFloat(payFeeHisVO.get(i).elementText("fee"))) ;
						}else{
							pfh.setFee(0.0f) ;
						}
						
						if(payFeeHisVO.get(i).elementText("identity_kind")!=null && !payFeeHisVO.get(i).elementText("identity_kind").equals("")){
							pfh.setIdentity_kind(Integer.parseInt(payFeeHisVO.get(i).elementText("identity_kind"))) ;
						}else{
							pfh.setIdentity_kind(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("if_valid")!=null && !payFeeHisVO.get(i).elementText("if_valid").equals("")){
							pfh.setIf_valid(Integer.parseInt(payFeeHisVO.get(i).elementText("if_valid"))) ;
						}else{
							pfh.setIf_valid(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("prepaid_fee")!=null && !payFeeHisVO.get(i).elementText("prepaid_fee").equals("")){
							pfh.setPrepaid_fee(Float.parseFloat(payFeeHisVO.get(i).elementText("prepaid_fee"))) ;
						}else{
							pfh.setPrepaid_fee(0.0f) ;
						}
						
						if(payFeeHisVO.get(i).elementText("service_favour_id")!=null && !payFeeHisVO.get(i).elementText("service_favour_id").equals("")){
							pfh.setService_favour_id(Long.parseLong(payFeeHisVO.get(i).elementText("service_favour_id"))) ;
						}else{
							pfh.setService_favour_id(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("service_kind")!=null && !payFeeHisVO.get(i).elementText("service_kind").equals("")){
							pfh.setService_kind(Integer.parseInt(payFeeHisVO.get(i).elementText("service_kind"))) ;
						}else{
							pfh.setService_kind(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("service_status")!=null && !payFeeHisVO.get(i).elementText("service_status").equals("")){
							pfh.setService_status(payFeeHisVO.get(i).elementText("service_status")) ;
						}else{
							pfh.setService_status("0") ;
						}
						
						if(payFeeHisVO.get(i).elementText("sum_fee")!=null && !payFeeHisVO.get(i).elementText("sum_fee").equals("")){
							pfh.setSum_fee(Float.parseFloat(payFeeHisVO.get(i).elementText("sum_fee"))) ;
						}else{
							pfh.setSum_fee(0.0f) ;
						}
						
						if(payFeeHisVO.get(i).elementText("total_arrearage")!=null && !payFeeHisVO.get(i).elementText("total_arrearage").equals("")){
							pfh.setTotal_arrearage(Float.parseFloat(payFeeHisVO.get(i).elementText("total_arrearage"))) ;
						}else{
							pfh.setTotal_arrearage(0.0f) ;
						}
						
						if(payFeeHisVO.get(i).elementText("user_id")!=null && !payFeeHisVO.get(i).elementText("user_id").equals("")){
							pfh.setUser_id(Long.parseLong(payFeeHisVO.get(i).elementText("user_id"))) ;
						}else{
							pfh.setUser_id(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("user_kind")!=null && !payFeeHisVO.get(i).elementText("user_kind").equals("")){
							pfh.setUser_kind(Integer.parseInt(payFeeHisVO.get(i).elementText("user_kind"))) ;
						}else{
							pfh.setUser_kind(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("customer_id")!=null && !payFeeHisVO.get(i).elementText("customer_id").equals("")){
							pfh.setCustomer_id(Long.parseLong(payFeeHisVO.get(i).elementText("customer_id"))) ;
						}else{
							pfh.setCustomer_id(0) ;
						}
						
						if(payFeeHisVO.get(i).elementText("credit_solution")!=null && !payFeeHisVO.get(i).elementText("credit_solution").equals("")){
							pfh.setCredit_solution(Long.parseLong(payFeeHisVO.get(i).elementText("credit_solution"))) ;
						}else{
							pfh.setCredit_solution(0) ;
						}
						
						pfhArray[i] = pfh ;
					}
					resp.setPayFeeHisVO(pfhArray);
				}
			}
		} catch (Exception exc) {
			logger.warn("Exception in xmlToUserPAayFeeHis:" + exc);
			exc.printStackTrace();
		}	
		logger.info("UserPAayFeeHis:" + resp.toString());
		return resp;
	}

	public static String UsrMothFeListToXmlString(BillWebServiceInVO in0) {
		logger.info("convert UserMothFeeList to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element1 = serviceInformation.addElement("Bill_Information") ;
		Element element = null ;
		
		element = element1.addElement("Acc_Nbr") ;
		element.setText(in0.getDetailBillListVO().getServiceId()) ;
		
		element = element1.addElement("Destination_Attr") ;
		//logger.info("----------Destination_Attr----------"+in0.getDetailBillListVO().getServiceKind()) ;
		if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("51")){
			element.setText("1") ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("8")){
			element.setText("2") ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("11") || String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("15")){
			element.setText("3") ;
		}else{
			element.setText("0") ;
		}
		
		//当前年月：YYYYMM
		element = element1.addElement("Billing_Cycle") ;
		/*Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;
		String month1 = null ;
		if(String.valueOf(month).length() == 1){
			month1 = "0" + String.valueOf(month) ;
		}*/
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyyMM");
		String date=dateformat.format(new Date());
		element.setText(date) ;
		
		element = element1.addElement("Query_Flag") ;
		element.setText("1") ;
		
		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static String CreditFeeToXmlString(BillWebServiceInVO in0) {
		logger.info("convert CreditFee to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element = null ;
		
		element = serviceInformation.addElement("Value") ;
		element.setText("22") ;
		
		/**
			<eventType>USER_PAY_FEE_HIS</eventType>
			<cityCode>910</cityCode>
			<serviceId>15810049355</serviceId>
			<serviceKind>1</serviceKind>
			<DetailBillListVO>
			    <serviceId>15810049355</serviceId>
			    <serviceKind>1</serviceKind>
			</DetailBillListVO>
		 * */
		int serviceKind ;
		if(String.valueOf(in0.getServiceKind()).equals("51")){
			serviceKind = 1 ;
		}else if(String.valueOf(in0.getServiceKind()).equals("8")){
			serviceKind = 2 ;
		}else if(String.valueOf(in0.getServiceKind()).equals("11") || String.valueOf(in0.getServiceKind()).equals("15")){
			serviceKind = 3 ;
		}else{
			serviceKind = 0 ;
		}
		
		element = serviceInformation.addElement("Data-Table-Simple-Row") ;
		String str = "<eventType>"+in0.getEventType()+"</eventType><cityCode>"+in0.getCityCode()+"</cityCode><serviceId>"+
			in0.getServiceId()+"</serviceId><serviceKind>"+serviceKind+"</serviceKind><DetailBillListVO><serviceId>"+
			in0.getDetailBillListVO().getServiceId()+"</serviceId><serviceKind>"+in0.getDetailBillListVO().getServiceKind()+
			"</serviceKind></DetailBillListVO>" ;
		element.setText(str) ;
		
		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static BillWebServiceOutVO xmlToQueryShortMessageResp(String data,
			String data2, String data3, String serviceId, int serviceKind,
			String cityCode) {
		logger.info("convert sgw ack to UserLeftFee......");
		BillWebServiceOutVO resp = new BillWebServiceOutVO();
		CurrentMonthFeeVO cmf = new CurrentMonthFeeVO() ;
		
		Document doc = null;
		Document doc2 = null;
		Document doc3 = null;
		try {
			if (!"".equals(data) && data != null) {
		    	  doc = DocumentHelper.parseText(data); 
		      } else {
		    	  logger.info("data null error");
		    	  return null;
		      }
		      Element root = doc.getRootElement();//实时话费
		      
		      if (!"".equals(data2) && data2 != null) {
		          doc2 = DocumentHelper.parseText(data2);
		      } else {
		    	  logger.info("data2 null error");
		    	  return null;
		      }
		      Element root2 = doc2.getRootElement();//余额
		      
		      if (!"".equals(data3) && data3 != null) {
		          doc3 = DocumentHelper.parseText(data3);
		      } else {
		    	  logger.info("data3 null error");
		    	  return null;
		      }
		      Element root3 = doc3.getRootElement();//新增信用度
		      
		      Node node = root.selectSingleNode("//Service_Information/Service_Result_Code");
		      Node node2 = root2.selectSingleNode("//Service_Information/Service_Result_Code");
		      Node node3 = root3.selectSingleNode("//Service_Information/Data-Table-Simple-Row");
		      
		    //logger.info("==============Service_Result_Code:"+node2.getStringValue()) ;
		      if (node != null && node2 != null) {
		    	 // logger.info("============="+node.getStringValue()+":"+node2.getStringValue()) ;
					if(node.getStringValue().equals("0") && node2.getStringValue().equals("0")){
						resp.setSucess(true) ;
					}else{
						resp.setSucess(false) ;
					}
				}
		      
		      Node resultNode = root.selectSingleNode("//Service_Information/Para_Field_Result") ;
		      if(resultNode != null){
		    	  if(!node.getStringValue().equals("0") || !node2.getStringValue().equals("0")){
		    		  resp.setErrorDesc(resultNode.getStringValue()) ;
		    	  }
		      }
		      
		      node = root.selectSingleNode("//Service_Information/Bill_Information/Total_Charge") ;
		      //logger.info("setCurrNoFavour------------"+node.getStringValue()) ;
		      if(node != null){
		    	  cmf.setCurrNoFavour(String.format("%.2f", Float.parseFloat(node.getStringValue())/100)) ;
		    	  //logger.info("==============currNoFavour:"+String.format("%.2f", Float.parseFloat(node.getStringValue())/100)) ;
		      }
		      
		      //新增restFee
		      node2 = root2.selectSingleNode("//Service_Information/Total_Balance_Available") ;
		      //logger.info("==============restFee:"+node2.getStringValue()) ;
				if(node2 != null){
					cmf.setRestFee(String.format("%.2f", Float.parseFloat(node2.getStringValue())/100)) ;
					//logger.info("==============restFee:"+String.format("%.2f", Float.parseFloat(node2.getStringValue())/100)) ;
				}
		      
		      node3 = root3.selectSingleNode("//Service_Information/Data-Table-Simple-Row") ;
		      if(node3 != null){
		    	  String result = node3.getStringValue() ;
		    	  int beginIdx;
		    	  int endIdx ;
		    	  if(match1(result, "<creditFee />").size() == 0){
		    		  beginIdx = result.indexOf("<creditFee>") + "<creditFee>".length();
			    	  endIdx = result.indexOf("</creditFee>");
			    	  String creditFee = result.substring(beginIdx, endIdx);
			    	  cmf.setCreditFee(creditFee) ;
					}
		      }
			
		      List<Node> ItemInformationNode = root.selectNodes("//Service_Information/Bill_Information/Item_Information") ;
		      List<Node> ChargeTypeNameNode = root.selectNodes("//Service_Information/Bill_Information/Item_Information/Charge_type_Name") ;
		      List<Node> ChargeNode = root.selectNodes("//Service_Information/Bill_Information/Item_Information/Charge") ;
		      if(ItemInformationNode.size() > 0){
		    	  MonthFeeDetailVO mfd = null ;
		    	  MonthFeeDetailVO[] mfdArr =  new MonthFeeDetailVO[ItemInformationNode.size()] ;
		    	  for(int i=0 ;i<ItemInformationNode.size() ;i++){
		    		  mfd =  new MonthFeeDetailVO() ;
		    		  if(ChargeTypeNameNode != null){
		    			  mfd.setFeeName(ChargeTypeNameNode.get(i).getStringValue()) ;
		    			  //String.format("%.2f", Float.parseFloat(node2.getStringValue())/100)
		    			  mfd.setTotalFee(String.format("%.2f", Float.parseFloat(ChargeNode.get(i).getStringValue())/100)) ;
		    			  mfdArr[i] = mfd ;
		    		  }
		    	  }
		    	  resp.setMonthFeeDetailVO(mfdArr) ;
		      }
		      
		      logger.info("serviceId:"+serviceId+"    ,NserviceKind:"+serviceKind+"    ,NcityCode:"+cityCode) ;
		      resp.setServiceId(serviceId) ;
		      resp.setServiceKind(serviceKind) ;
		      resp.setCityCode(cityCode) ;
		      resp.setCurrentMonthFeeVO(cmf) ;
		      
		} catch (Exception exc) {
			logger.warn("Exception in xmlToUserLeftFee:" + exc);
			exc.printStackTrace();
		}
		logger.info("UserLeftFee:" + resp.toString());
		return resp;
	}

	
	////----------套餐使用查询----------
	public static String ProductUserQueryToXmlString(BillWebServiceInVO in0) {
		logger.info("convert ProductUserQuery to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element1 = serviceInformation.addElement("Bill_Information") ;
		Element element = null ;
		
		element = element1.addElement("Acc_Nbr") ;
		//logger.info("----------in0.getProductConsumeParamVO().getServiceId()"+in0.getProductConsumeParamVO().getServiceId()+"----------") ;
		//logger.info("----------in0.getServiceId()"+in0.getServiceId()+"----------") ;
		element.setText(in0.getProductConsumeParamVO().getServiceId()) ;
		
		element = element1.addElement("Destination_Attr") ;
		if(String.valueOf(in0.getProductConsumeParamVO().getServiceKind()).equals("51")){
			element.setText("1") ;
		}else if(String.valueOf(in0.getProductConsumeParamVO().getServiceKind()).equals("8")){
			element.setText("2") ;
		}else if(String.valueOf(in0.getProductConsumeParamVO().getServiceKind()).equals("11") || String.valueOf(in0.getProductConsumeParamVO().getServiceKind()).equals("15")){
			element.setText("3") ;
		}else{
			element.setText("0") ;
		}
		
		element = element1.addElement("Billing_Cycle") ;
		element.setText(in0.getProductConsumeParamVO().getFeeDate()) ;
		//logger.info("----------FeeDate:"+in0.getProductConsumeParamVO().getFeeDate()) ;
		
		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static String EvdoFlagToXmlString(BillWebServiceInVO in0) {
		logger.info("convert CreditFee to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element = null ;
		
		element = serviceInformation.addElement("Value") ;
		element.setText("24") ;
		
		/**
				<eventType>PRODUCT_USED_QUERY</eventType>
				<ProductConsumeParamVO>
				    <serviceId>15810049355</serviceId>
				    <serviceKind>1</serviceKind>
				    <userId>3124</userId>
				    <cityCode>910</cityCode>
				    <feeDate>20130719</feeDate>
				</ProductConsumeParamVO>
		 * */
		int serviceKind ;
		if(String.valueOf(in0.getProductConsumeParamVO().getServiceKind()).equals("51")){
			serviceKind = 1 ;
		}else if(String.valueOf(in0.getProductConsumeParamVO().getServiceKind()).equals("8")){
			serviceKind = 2 ;
		}else if(String.valueOf(in0.getProductConsumeParamVO().getServiceKind()).equals("11") || String.valueOf(in0.getProductConsumeParamVO().getServiceKind()).equals("15")){
			serviceKind = 3 ;
		}else{
			serviceKind = 0 ;
		}
		
		element = serviceInformation.addElement("Data-Table-Simple-Row") ;
		String str = "<eventType>"+in0.getEventType()+"</eventType><ProductConsumeParamVO><serviceId>"+
			in0.getProductConsumeParamVO().getServiceId()+"</serviceId><serviceKind>"+
			serviceKind+"</serviceKind><userId>"+
			in0.getProductConsumeParamVO().getUserId()+"</userId><cityCode>"+
			in0.getProductConsumeParamVO().getCityCode()+"</cityCode><feeDate>"+
			in0.getProductConsumeParamVO().getFeeDate()+"</feeDate></ProductConsumeParamVO>" ;
		element.setText(str) ;
		
		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static BillWebServiceOutVO xmlToProductUserQuery(String data,String data2,String serviceId) {
		logger.info("convert sgw ack to ProductUserQuery......");
		BillWebServiceOutVO resp = new BillWebServiceOutVO();
		
		Document doc = null;
		Document doc2 = null;
		try {
			if (!"".equals(data) && data != null) {
		    	  doc = DocumentHelper.parseText(data); 
		      } else {
		    	  logger.info("data null error");
		    	  return null;
		      }
		    Element root = doc.getRootElement();//套餐余量
		      if (!"".equals(data2) && data2 != null) {
		          doc2 = DocumentHelper.parseText(data2);
		      } else {
		    	  logger.info("data2 null error");
		    	  return null;
		      }
		    Element root2 = doc2.getRootElement();//新增

			//Result为0为true；其余为false ；
			Node node = root.selectSingleNode("//Service_Information/Service_Result_Code");
			//logger.info("============="+node.getStringValue()) ;
			if (node != null) {
				if(node.getStringValue().equals("0")){
					resp.setSucess(true) ;
				}else{
					resp.setSucess(false) ;
				}
			}

			node = root.selectSingleNode("//Service_Information/Para_Field_Result");
			if (node != null) {
				resp.setErrorDesc(node.getStringValue()) ;
			}
			
			//1
			List<Element> proOffInfoNode = root.elements("Product_OFF_info") ;
			List<Node> ProOffNameNode = root.selectNodes("//Service_Information/Product_OFF_info/Product_OFF_Name") ;
			Node node2 = root2.selectSingleNode("//Service_Information/Data-Table-Simple-Row") ;
			int beginIdx ,endIdx ;
			
			if(proOffInfoNode.size() > 0){
				List<Element> childList = null ;
				ProudctUseInfoVO pui = null ;
				ProudctUseInfoVO[] puiArr = new ProudctUseInfoVO[proOffInfoNode.size()] ;
				//logger.info("-------proOffInfoNode:"+proOffInfoNode.size()) ;
				for (int i = 0; i < proOffInfoNode.size(); i++) {
					pui = new ProudctUseInfoVO() ;
					//logger.info("-------pruductName:"+ ProOffNameNode.get(i).getStringValue());
					pui.setServiceId(serviceId);
					if (node2 != null) {
						String result = node2.getStringValue();
						String evdoFlag = null;
						// logger.info("----------"+result+"----------") ;
						// <evdoFlag>1</evdoFlag>
						if (match1(result, "<evdoFlag />").size() == 0) {
							beginIdx = result.indexOf("<evdoFlag>")+ "<evdoFlag>".length();
							endIdx = result.indexOf("</evdoFlag>");
							evdoFlag = result.substring(beginIdx, endIdx);
						}
						// logger.info("----------"+evdoFlag+"----------") ;
						if (evdoFlag.equals("1")) {
							pui.setEvdoFlag(true);
						} else if (evdoFlag.equals("0")) {
							pui.setEvdoFlag(false);
						}
					}
					
					
					//可以取到节点下存在几个子节点
					//logger.info("----------------Elements:"+proOffInfoNode.get(i).elements("Respond_Ratable_Query").size()) ;
					childList = proOffInfoNode.get(i).elements("Respond_Ratable_Query") ;
					if(childList.size()>0){
						ProductConsumeVO pc = null ;
						ProductConsumeVO[] pcArr =  new ProductConsumeVO[childList.size()] ;
						for(int j=0 ;j<childList.size() ;j++){
							pc = new ProductConsumeVO() ;
							pc.setProductName(ProOffNameNode.get(i).getStringValue()) ;
							if(childList.get(j).elementText("Ratable_Resource_name") != null){
								pc.setFavourName(childList.get(j).elementText("Ratable_Resource_name")) ;
								//logger.info("-------Ratable_Resource_name:"+childList.get(j).elementText("Ratable_Resource_name")) ;
							}
							if(childList.get(j).elementText("Ratable_Amount") != null){
								if(childList.get(j).elementText("UnitType_Id").equals("0")){
									pc.setFreeNumber(String.format("%.2f", Float.parseFloat(childList.get(j).elementText("Ratable_Amount"))/100)) ;
									//logger.info("-----"+String.format("%.2f", Float.parseFloat(childList.get(i).elementText("Ratable_Amount"))/100)) ;
								}else if(childList.get(j).elementText("UnitType_Id").equals("3")){
									pc.setFreeNumber(String.format("%.2f", Float.parseFloat(childList.get(j).elementText("Ratable_Amount"))/1024)) ;
									//logger.info("-----"+String.format("%.2f", Float.parseFloat(childList.get(i).elementText("Ratable_Amount"))/1024)) ;
								}else if (childList.get(j).elementText("UnitType_Id").equals("2")){
									pc.setFreeNumber(childList.get(j).elementText("Ratable_Amount")) ;
								}
							}
							if(childList.get(j).elementText("Balance_Amount")!=null && childList.get(j).elementText("Ratable_Amount")!=null){
								if(childList.get(j).elementText("UnitType_Id").equals("0")){
									pc.setConsumeNumber(String.valueOf(Float.parseFloat(String.format("%.2f", Float.parseFloat(childList.get(j).elementText("Ratable_Amount"))/100)) - Float.parseFloat(String.format("%.2f", Float.parseFloat(childList.get(j).elementText("Balance_Amount"))/100)))) ;
									//logger.info("-----"+String.valueOf(Float.parseFloat(String.format("%.2f", Float.parseFloat(ratAmtNode.get(j).getStringValue())/100)) - Float.parseFloat(String.format("%.2f", Float.parseFloat(balAmtNode.get(j).getStringValue())/100)))) ;
								}else if(childList.get(j).elementText("UnitType_Id").equals("3")){
									pc.setConsumeNumber(String.valueOf(Float.parseFloat(String.format("%.2f", Float.parseFloat(childList.get(j).elementText("Ratable_Amount"))/1024)) - Float.parseFloat(String.format("%.2f", Float.parseFloat(childList.get(j).elementText("Balance_Amount"))/1024)))) ;
									//logger.info("-----"+String.valueOf(Float.parseFloat(String.format("%.2f", Float.parseFloat(ratAmtNode.get(j).getStringValue())/1024)) - Float.parseFloat(String.format("%.2f", Float.parseFloat(balAmtNode.get(j).getStringValue())/1024)))) ;
								}else if(childList.get(j).elementText("UnitType_Id").equals("2")){//childList.get(j).elementText("Ratable_Amount") - childList.get(j).elementText("Balance_Amount")
									pc.setConsumeNumber(String.valueOf(Integer.parseInt(childList.get(j).elementText("Ratable_Amount"))-Integer.parseInt(childList.get(j).elementText("Balance_Amount")))) ;
								}
							}
							if(childList.get(j).elementText("Balance_Amount") != null){
								if(childList.get(j).elementText("UnitType_Id").equals("0")){
									pc.setRemainingNumber(String.format("%.2f", Float.parseFloat(childList.get(j).elementText("Balance_Amount"))/100)) ;
									//logger.info("-----"+String.format("%.2f", Float.parseFloat(balAmtNode.get(j).getStringValue())/100)) ;
								}else if(childList.get(j).elementText("UnitType_Id").equals("3")){
									pc.setRemainingNumber(String.format("%.2f", Float.parseFloat(childList.get(j).elementText("Balance_Amount"))/1024)) ;
									//logger.info("-----"+String.format("%.2f", Float.parseFloat(balAmtNode.get(j).getStringValue())/1024)) ;
								}else if(childList.get(j).elementText("UnitType_Id").equals("2")){
									pc.setRemainingNumber(childList.get(j).elementText("Balance_Amount")) ;
								}
							}
							if(childList.get(j).elementText("UnitType_Id") != null){
								if(childList.get(j).elementText("UnitType_Id").equals("0")){
									pc.setUnit("元") ;
								}else if(childList.get(j).elementText("UnitType_Id").equals("1")){
									pc.setUnit("分钟") ;
								}else if(childList.get(j).elementText("UnitType_Id").equals("2")){
									pc.setUnit("条") ;
								}else if(childList.get(j).elementText("UnitType_Id").equals("3")){
									pc.setUnit("M") ;
								}
							}
							if(serviceId != null){
								pc.setServiceId(serviceId) ;
							}
							pcArr[j] = pc ;
							//logger.info("---------------------------------") ;
						}
						pui.setProductConsumeArray(pcArr) ;
					}
					puiArr[i] = pui ;
					//logger.info("==============================") ;
				}
				//pui.setProductConsumeArray(pcArr) ;
				resp.setProudctUseInfoArray(puiArr) ;
			}

		} catch (Exception exc) {
			logger.warn("Exception in xmlToProductUserQuery:" + exc);
			exc.printStackTrace();
		}
		logger.info("ProductUserQuery:" + resp.toString());
		return resp;
	}

	public static String PointQueryToXmlString(BillWebServiceInVO in0) {
		logger.info("convert PointQuery to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element1 = serviceInformation.addElement("Point_Information") ;
		Element element = null ;
		
		element = element1.addElement("ValueType") ;
		element.setText("1") ;
		
		element = element1.addElement("Value") ;
		element.setText(in0.getServiceId()) ;
		
		//SGW转换CityCode:将CityCode转化为区号。
		element = element1.addElement("Area_Code") ;
		//读取配置文件
		ResourceBundle resource = ResourceBundle.getBundle("prop");
		String key1 = resource.getString(in0.getCityCode());
		//logger.info("CityCode-----------"+key1) ;
		element.setText(key1) ;
		
		element = element1.addElement("BeginCycle") ;
		element.setText(in0.getDetailBillListVO().getFeeDate()) ;
		
		element = element1.addElement("EndCycle") ;
		element.setText(in0.getDetailBillListVO().getFeeDate()) ;

		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static String UnifiedQueryToXmlString(BillWebServiceInVO in0) {
		logger.info("convert ACCOUNT_BILL_LIST_UnifiedQuery to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element = null ;
		
		element = serviceInformation.addElement("Value") ;
		element.setText("34") ;
		
		//直接填入webservice请求中的xml
		int serviceKind ;
		if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("51")){
			serviceKind = 1 ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("8")){
			serviceKind = 2 ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("11") || String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("15")){
			serviceKind = 3 ;
		}else{
			serviceKind = 0 ;
		}
		boolean success ;
		
		element = serviceInformation.addElement("Data-Table-Simple-Row") ;
		
		String str = "<cityCode>"+in0.getCityCode()+"</cityCode><detailBillListVO><accountId>"+
			in0.getDetailBillListVO().getAccountId()+"</accountId><customerId>"+
			in0.getDetailBillListVO().getCustomerId()+"</customerId><detailType>"+
			in0.getDetailBillListVO().getDetailType()+"</detailType><queryKind>"+
			in0.getDetailBillListVO().getQueryKind()+"</queryKind><queryMonthCount>"+
			in0.getDetailBillListVO().getQueryMonthCount()+"</queryMonthCount><serviceKind>"+
			serviceKind+"</serviceKind><userId>"+in0.getDetailBillListVO().getUserId()+"</userId></detailBillListVO><end>"+
			in0.getEnd()+"</end><eventType>"+in0.getEventType()+"</eventType><ifContinue>"+
			in0.getIfContinue()+"</ifContinue><payfee>"+in0.getPayfee()+"</payfee><serviceId>"+
			in0.getServiceId()+"</serviceId><serviceKind>"+serviceKind+"</serviceKind><start>"+
			in0.getStart()+"</start>";
		
		element.setText(str) ;

		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	
	
	public static String transferByMonthQueryToXmlString(BillWebServiceInVO in0) {
		logger.info("convert TransferByMonthQuery to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element = null ;
		
		element = serviceInformation.addElement("Value") ;
		element.setText("15") ;
		
		//直接填入webservice请求中的xml
		int serviceKind ;
		if(String.valueOf(in0.getServiceKind()).equals("51")){
			serviceKind = 1 ;
		}else if(String.valueOf(in0.getServiceKind()).equals("8")){
			serviceKind = 2 ;
		}else if(String.valueOf(in0.getServiceKind()).equals("11") || String.valueOf(in0.getServiceKind()).equals("15")){
			serviceKind = 3 ;
		}else{
			serviceKind = 0 ;
		}
		
		element = serviceInformation.addElement("Data-Table-Simple-Row") ;

		String str = "<eventType>"+in0.getEventType()+"</eventType><serviceId>"+in0.getServiceId()+
			"</serviceId><serviceKind>"+serviceKind+"</serviceKind>" ;
		element.setText(str) ;

		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static BillWebServiceOutVO xmlTotransferByMonthQuery(String data, String serviceId, int serviceKind, String cityCode) {
		logger.info("convert sgw ack to TransferByMonthQuery......");
		BillWebServiceOutVO resp = new BillWebServiceOutVO();
		
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(data);
			Element root = doc.getRootElement();

			if(serviceId != null){
				resp.setServiceId(serviceId) ;
			}
			
			if(String.valueOf(serviceKind).equals("")){
				resp.setServiceKind(serviceKind) ;
			}
			
			if(cityCode != null){
				resp.setCityCode(cityCode) ;
			}
			
			//Result为0为true；其余为false ；
			Node node = root.selectSingleNode("//Service_Information/Service_Result_Code");
			//logger.info("============="+node.getStringValue()) ;
			if (node != null) {
				if(node.getStringValue().equals("0")){
					resp.setSucess(true) ;
				}else{
					resp.setSucess(false) ;
				}
			}
			
			node = root.selectSingleNode("//Service_Information/Para_Field_Result");
			if (node != null) {
				resp.setErrorDesc(node.getStringValue()) ;
			}
			
			node = root.selectSingleNode("//Service_Information/Data-Table-Simple-Row") ;
			if(node != null){
				String result = node.getStringValue() ;
				/**
				 * 添加root根元素
				 *   <root>
						<serviceId>18102417057</serviceId>
						<ServiceKind>8</ServiceKind>
						<cityCode>910</cityCode>
						<Success>true</Success>
						<errorDesc></errorDesc>
						<TransferByMonthInfoVO>
							<account_fee_name></account_fee_name>
							<device_no></device_no>
							<trans_level></trans_level>
						    <trans_name>1</trans_name>
						    <transfer_fee>10</transfer_fee>
						    <left_fee>200</left_fee>
						    <write_off>5</write_off>
						    <unit_fee>1000</unit_fee>
						    <status>1</status>
						    <start_date>2012-06-20</start_date>
						    <invalid_date>2100-01-01</invalid_date>
						    
						    <curr_write_off>
						</TransferByMonthInfoVO>
					</root>
				 * */
				String rootResult = "<root>"+result+"</root>" ;
				doc = DocumentHelper.parseText(rootResult) ;
				root = doc.getRootElement() ;
				
				TransferByMonthInfoVO[] tbmiArr = null ;
				List<Element> transferByMonthInfoVONode = root.elements("TransferByMonthInfoVO");
				StringBuffer time = null  ;
//				time.append("20130823");
//				time.insert(4, "-").insert(7, "-");
				if(transferByMonthInfoVONode.size() > 0){
					time = new StringBuffer() ;
//					SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd") ;
					tbmiArr = new TransferByMonthInfoVO[transferByMonthInfoVONode.size()] ;
					for(int i=0 ;i<transferByMonthInfoVONode.size() ;i++){
						TransferByMonthInfoVO tbmi = new TransferByMonthInfoVO() ;
						if (transferByMonthInfoVONode.get(i).elementText("trans_name") == null) {
							tbmi.setTrans_name("");
						} else {
							tbmi.setTrans_name(transferByMonthInfoVONode.get(i).elementText("trans_name"));
						}
						
						//新增
						if(transferByMonthInfoVONode.get(i).elementText("curr_write_off") != null){
							tbmi.setCurr_write_off(Float.parseFloat(transferByMonthInfoVONode.get(i).elementText("curr_write_off"))) ;
						}
						
						if(transferByMonthInfoVONode.get(i).elementText("account_fee_name") != null){
							tbmi.setAccount_fee_name(transferByMonthInfoVONode.get(i).elementText("account_fee_name")) ;
						}
						
						if(transferByMonthInfoVONode.get(i).elementText("trans_level") != null){
							tbmi.setTrans_level(transferByMonthInfoVONode.get(i).elementText("trans_level")) ;
						}
						
						if (transferByMonthInfoVONode.get(i).elementText("device_no") == null) {
							tbmi.setDevice_no("");
						} else {
							tbmi.setDevice_no(transferByMonthInfoVONode.get(i).elementText("device_no"));
						}
						
						if(transferByMonthInfoVONode.get(i).elementText("transfer_fee") != null){
							tbmi.setTransfer_fee(transferByMonthInfoVONode.get(i).elementText("transfer_fee")) ;
						}
						
						/*if(transferByMonthInfoVONode.get(i).elementText("transfer_fee").equals("0.00")||transferByMonthInfoVONode.get(i).elementText("transfer_fee").equals("0.0")||
								transferByMonthInfoVONode.get(i).elementText("transfer_fee").equals("0")){
							tbmi.setTransfer_fee("0");
						}else{
							tbmi.setTransfer_fee(String.valueOf(Integer.parseInt(transferByMonthInfoVONode.get(i).elementText("transfer_fee"))/100)) ;
						}*/
						
						if(transferByMonthInfoVONode.get(i).elementText("left_fee") != null){
							tbmi.setLeft_fee(Float.parseFloat(transferByMonthInfoVONode.get(i).elementText("left_fee"))) ;
						}
						
						if(transferByMonthInfoVONode.get(i).elementText("write_off") != null){
							tbmi.setWrite_off(Float.parseFloat(transferByMonthInfoVONode.get(i).elementText("write_off"))) ;
						}
						
						if(transferByMonthInfoVONode.get(i).elementText("unit_fee") != null){
							tbmi.setUnit_fee(Float.parseFloat(transferByMonthInfoVONode.get(i).elementText("unit_fee"))) ;
						}
						
						if(transferByMonthInfoVONode.get(i).elementText("status") != null){
							tbmi.setStatus(transferByMonthInfoVONode.get(i).elementText("status")) ;
						}
						
						//根据StringBuffer的属性来对接收到的字符串进行处理，处理为需要的格式
						if(transferByMonthInfoVONode.get(i).elementText("start_date") != null){
							time = time.append(transferByMonthInfoVONode.get(i).elementText("start_date")) ;
							time = time.delete(7+1, time.length()).insert(4, "-").insert(7, "-");
							tbmi.setStart_date(time.toString()) ;
							time.setLength(0);//清空StringBuffer
						}
						
						//根据StringBuffer的属性来对接收到的字符串进行处理，处理为需要的格式
						if(transferByMonthInfoVONode.get(i).elementText("invalid_date") != null){
							time = time.append(transferByMonthInfoVONode.get(i).elementText("invalid_date"));
							time = time.delete(7+1,time.length()).insert(4, "-").insert(7, "-") ;
							tbmi.setInvalid_date(time.toString()) ;
							time.setLength(0) ;
						}
						
						tbmiArr[i] = tbmi ;
						
					}
					resp.setTransferByMonthInfoColl(tbmiArr) ;
				}
			}
		} catch (Exception exc) {
			logger.warn("Exception in xmlToTransferByMonthQuery:" + exc);
			exc.printStackTrace();
		}	
		logger.info("TransferByMonthQuery:" + resp.toString());
		return resp;
	}

	public static String userSpFeeListToXmlString(BillWebServiceInVO in0) {
		logger.info("convert UserSpFeeList to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element = null ;
		
		element = serviceInformation.addElement("Value") ;
		element.setText("16") ;
		
		//直接填入webservice请求中的xml
		int serviceKind ;
		if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("51")){
			serviceKind = 1 ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("8")){
			serviceKind = 2 ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("11") || String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("15")){
			serviceKind = 3 ;
		}else{
			serviceKind = 0 ;
		}
		
		element = serviceInformation.addElement("Data-Table-Simple-Row") ;
		
		String str = "<eventType>"+in0.getEventType()+"</eventType><cityCode>"+in0.getCityCode()+
			"</cityCode><serviceId>"+in0.getServiceId()+"</serviceId><serviceKind>"+serviceKind+
			"</serviceKind><DetailBillListVO><serviceId>"+in0.getDetailBillListVO().getServiceId()+
			"</serviceId><serviceKind>"+in0.getDetailBillListVO().getServiceKind()+
			"</serviceKind><feeDate>"+in0.getDetailBillListVO().getFeeDate()+
			"</feeDate><BeginDate>"+in0.getDetailBillListVO().getBeginDate()+
			"</BeginDate><EndDate>"+in0.getDetailBillListVO().getEndDate()+
			"</EndDate><QueryKind>0</QueryKind><DetailType>0</DetailType></DetailBillListVO>" ;
		
		element.setText(str) ;

		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static BillWebServiceOutVO xmlToUserSpFeeList(String data,String serviceId, int serviceKind, String cityCode) {
		logger.info("convert sgw ack to UserSpFeeList......");
		BillWebServiceOutVO resp = new BillWebServiceOutVO();
		
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(data);
			Element root = doc.getRootElement();

			if(serviceId != null){
				resp.setServiceId(serviceId) ;
			}
			
			if(String.valueOf(serviceKind).equals("")){
				resp.setServiceKind(serviceKind) ;
			}
			
			if(cityCode != null){
				resp.setCityCode(cityCode) ;
			}
			
			//Result为0为true；其余为false ；
			Node node = root.selectSingleNode("//Service_Information/Service_Result_Code");
			//logger.info("============="+node.getStringValue()) ;
			if (node != null) {
				if(node.getStringValue().equals("0")){
					resp.setSucess(true) ;
				}else{
					resp.setSucess(false) ;
				}
			}
			
			node = root.selectSingleNode("//Service_Information/Para_Field_Result");
			if (node != null) {
				resp.setErrorDesc(node.getStringValue()) ;
			}
			
			node = root.selectSingleNode("//Service_Information/Data-Table-Simple-Row") ;
			if(node != null){
				String result = node.getStringValue() ;
				/**
				 * 添加root根元素
				 *   <root>
						<serviceId>18102417057<serviceId>
						<ServiceKind>8<ServiceKind>
						<cityCode>910<cityCode>
						<Success>1<Success>
						<errorDesc><errorDesc>
						<SpFeeQueryVO>
						    <feeName>a<feeName>
						    <feeValue>100.0<feeValue>
						</SpFeeQueryVO>
					</root>
				 * */
				String rootResult = "<root>"+result+"</root>" ;
				doc = DocumentHelper.parseText(rootResult) ;
				root = doc.getRootElement() ;
				
				SpFeeQueryVO[] sfqArr = null ;
				List<Element> spFeeQueryVONode = root.elements("SpFeeQueryVO");
				if(spFeeQueryVONode.size() > 0){
					sfqArr = new SpFeeQueryVO[spFeeQueryVONode.size()] ;
					for(int i=0 ;i<spFeeQueryVONode.size() ;i++){
						SpFeeQueryVO sfq = new SpFeeQueryVO() ;
						if(spFeeQueryVONode.get(i).elementText("feeName") != null){
							sfq.setFeeName(spFeeQueryVONode.get(i).elementText("feeName")) ;
						}
						if(spFeeQueryVONode.get(i).elementText("feeValue") != null){
							sfq.setFeeValue(String.valueOf(Integer.parseInt(spFeeQueryVONode.get(i).elementText("feeValue"))/100)) ;
						}
						sfqArr[i] = sfq ;
					}
					resp.setSpFeeQueryVO(sfqArr) ;
				}
			}
		} catch (Exception exc) {
			logger.warn("Exception in xmlToUserSpFeeList:" + exc);
			exc.printStackTrace();
		}	
		logger.info("UserSpFeeList:" + resp.toString());
		return resp;
	}

	public static BillWebServiceOutVO xmlToNMonth(String data) {
		logger.info("convert sgw ack to NMonth......");
		BillWebServiceOutVO resp = new BillWebServiceOutVO();
		
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(data);
			Element root = doc.getRootElement();
			
			//Result为0为true；其余为false ；
			Node node = root.selectSingleNode("//Service_Information/Service_Result_Code");
			//logger.info("============="+node.getStringValue()) ;
			if (node != null) {
				if(node.getStringValue().equals("0")){
					resp.setSucess(true) ;
				}else{
					resp.setSucess(false) ;
				}
			}
			
			List<Node> errorDesc = root.selectNodes("//Service_Information/Para_Field_Result") ;
			if(errorDesc.size() > 0){
				String errorDescs = "|" ;
				for(int i=0 ;i<errorDesc.size() ;i++){
					errorDescs += errorDesc.get(i).getStringValue()+"|" ;
				}
				resp.setErrorDesc(errorDescs);
				logger.info("---------------------------"+errorDescs);
			}
			
			node = root.selectSingleNode("//Service_Information/Data-Table-Simple-Row") ;
			if(node != null){
				String result = node.getStringValue() ;
				/**
				 * 添加root根元素
				 *   <root>
						<monthAccountStr>2013年07月`          0.00~2013年08月`          0.00~</monthAccountStr>
					</root>
				 * */
				String rootResult = "<root>"+result+"</root>" ;
				doc = DocumentHelper.parseText(rootResult) ;
				root = doc.getRootElement() ;
				
				Node monthAccountStrNode = root.selectSingleNode("//root/monthAccountStr");
				resp.setMonthAccountStr(monthAccountStrNode.getStringValue());
				
			}
		} catch (Exception exc) {
			logger.warn("Exception in xmlToNMonth:" + exc);
			exc.printStackTrace();
		}	
		logger.info("NMonth:" + resp.toString());
		return resp;
	}

	public static String mobileVoiceDetailToXmlString(BillWebServiceInVO in0) {
		logger.info("convert MobileVoiceDetail to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element = null ;
		
		element = serviceInformation.addElement("Value") ;
		element.setText("33") ;
		
		//直接填入webservice请求中的xml
		int serviceKind ;
		if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("51")){
			serviceKind = 1 ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("8")){
			serviceKind = 2 ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("11") || String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("15")){
			serviceKind = 3 ;
		}else{
			serviceKind = 0 ;
		}
		
		element = serviceInformation.addElement("Data-Table-Simple-Row") ;
		
		String str = "<eventType>"+in0.getEventType()+"</eventType><CityCode>"+in0.getCityCode()+
		"</CityCode><ServiceId>"+in0.getServiceId()+"</ServiceId><ServiceKind>"+serviceKind+
		"</ServiceKind><Start>"+in0.getStart()+"</Start><End>"+in0.getEnd()+
		"</End><DetailBillListVO><serviceId>"+in0.getDetailBillListVO().getServiceId()+
		"</serviceId><serviceKind>"+in0.getDetailBillListVO().getServiceKind()+
		"</serviceKind><FeeDate>"+in0.getDetailBillListVO().getFeeDate()+
		"</FeeDate><BeginDate>"+in0.getDetailBillListVO().getBeginDate()+
		"</BeginDate><EndDate>"+in0.getDetailBillListVO().getEndDate()+
		"</EndDate><QueryKind>0</QueryKind><DetailType>1</DetailType></DetailBillListVO>" ;
		
		element.setText(str) ;

		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static BillWebServiceOutVO xmlToMobileVoiceDetail(String data, BillWebServiceInVO in0) {
		logger.info("convert sgw ack to MobileVoiceDetail......");
		BillWebServiceOutVO resp = new BillWebServiceOutVO();
		
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(data);
			Element root = doc.getRootElement();
			
			//Result为0为true；其余为false ；
			Node node = root.selectSingleNode("//Service_Information/Service_Result_Code");
			if (node != null) {
				if(node.getStringValue().equals("0")){
					resp.setSucess(true) ;
				}else{
					resp.setSucess(false) ;
				}
			}
			
			List<Node> errorDesc = root.selectNodes("//Service_Information/Para_Field_Result") ;
			if(errorDesc.size() > 0){
				String errorDescs = "|" ;
				for(int i=0 ;i<errorDesc.size() ;i++){
					errorDescs += errorDesc.get(i).getStringValue()+"|" ;
				}
				resp.setErrorDesc(errorDescs);
			}
			
			if(in0.getServiceId() != null){
				resp.setServiceId(in0.getServiceId());
			}
			if(String.valueOf(in0.getServiceKind()) != null){
				resp.setServiceKind(in0.getServiceKind());
			}
			if(in0.getCityCode() != null){
				resp.setCityCode(in0.getCityCode());
			}
			
			node = root.selectSingleNode("//Service_Information/Data-Table-Simple-Row") ;
			if(node != null){
				String result = node.getStringValue() ;
				/**
				 * 添加root根元素
				 *   <root>
				 *   	<count></count>
				 *   	<eventType>MOBILE_VOICE_DETAIL</eventType>
				 *   	<DetaileVoiceVO>
							<queryMonth>201306</queryMonth>
							<counterNumber>18909846009</counterNumber>
							<callDate>2013-06-01 12:11:31</callDate>
							<duration>361</duration>
							<callType>主叫</callType>
							<counterAreaCode>0411</counterAreaCode>
							<feeName>市话网内主叫费</feeName>
							<baseFee>280</baseFee>
							<totalFee>0</totalFee>
							<tollAdd>0</tollAdd>
							<otherFee>0</otherFee>
							<favour>280</favour>
							<total>100</total>
						</DetaileVoiceVO>
					</root>
				 * */
				String rootResult = "<root>"+result+"</root>" ;
				doc = DocumentHelper.parseText(rootResult) ;
				root = doc.getRootElement() ;
				
				Node node1 = root.selectSingleNode("//root/Count");
				//logger.info("------------------count:"+node1.getStringValue());
				if(node1 != null){
					resp.setCount(Integer.parseInt(node1.getStringValue()));
				}
				
				node = root.selectSingleNode("//root/eventType");
				//logger.info("---------------------------eventType:"+node.getStringValue());
				if(node != null){
					resp.setEventType(node.getStringValue());
				}
				
				List<Element> detaileVoiceVOElement = root.elements("DetaileVoiceVO");
				DetaileVoiceVO[] detaileVoiceVOArr = new DetaileVoiceVO[detaileVoiceVOElement.size()];
				for(int i=0 ;i<detaileVoiceVOElement.size() ;i++){
					DetaileVoiceVO detaileVoiceVO = new DetaileVoiceVO();
					if(detaileVoiceVOElement.get(i).elementText("queryMonth") != null){
						detaileVoiceVO.setQueryMonth(detaileVoiceVOElement.get(i).elementText("queryMonth"));
					}
					if(detaileVoiceVOElement.get(i).elementText("counterNumber") != null){
						detaileVoiceVO.setCounterNumber(detaileVoiceVOElement.get(i).elementText("counterNumber"));
					}
					if(detaileVoiceVOElement.get(i).elementText("callDate") != null){
						detaileVoiceVO.setCallDate(detaileVoiceVOElement.get(i).elementText("callDate"));
					}
					if(detaileVoiceVOElement.get(i).elementText("duration") != null){
						detaileVoiceVO.setDuration(Integer.parseInt(detaileVoiceVOElement.get(i).elementText("duration")));
					}
					if(detaileVoiceVOElement.get(i).elementText("callType") != null){
						detaileVoiceVO.setCallType(detaileVoiceVOElement.get(i).elementText("callType"));
					}
					if(detaileVoiceVOElement.get(i).elementText("counterAreaCode") != null){
						detaileVoiceVO.setCounterAreaCode(detaileVoiceVOElement.get(i).elementText("counterAreaCode"));
					}
					if(detaileVoiceVOElement.get(i).elementText("feeName") != null){
						detaileVoiceVO.setFeeName(detaileVoiceVOElement.get(i).elementText("feeName"));
					}
					if(detaileVoiceVOElement.get(i).elementText("baseFee") != null){
						if(detaileVoiceVOElement.get(i).elementText("baseFee").equals("0.00")||
								detaileVoiceVOElement.get(i).elementText("baseFee").equals("0.0")||
								detaileVoiceVOElement.get(i).elementText("baseFee").equals("0")){
							detaileVoiceVO.setBaseFee(0);
						}else{
							detaileVoiceVO.setBaseFee(Double.parseDouble(detaileVoiceVOElement.get(i).elementText("baseFee"))/100);
						}
					}
					if(detaileVoiceVOElement.get(i).elementText("totalFee") != null){
						if(detaileVoiceVOElement.get(i).elementText("totalFee").equals("0.00")||
								detaileVoiceVOElement.get(i).elementText("totalFee").equals("0.0")||
								detaileVoiceVOElement.get(i).elementText("totalFee").equals("0")){
							detaileVoiceVO.setTollFee(0);
						}else{
							detaileVoiceVO.setTollFee(Double.parseDouble(detaileVoiceVOElement.get(i).elementText("totalFee"))/100);
						}
					}
					if(detaileVoiceVOElement.get(i).elementText("tollAdd") != null){
						if(detaileVoiceVOElement.get(i).elementText("tollAdd").equals("0.00")||
								detaileVoiceVOElement.get(i).elementText("tollAdd").equals("0.0")||
								detaileVoiceVOElement.get(i).elementText("tollAdd").equals("0")){
							detaileVoiceVO.setTollAdd(0);
						}else{
							detaileVoiceVO.setTollAdd(Double.parseDouble(detaileVoiceVOElement.get(i).elementText("tollAdd"))/100);
						}
					}
					if(detaileVoiceVOElement.get(i).elementText("otherFee") != null){
						if(detaileVoiceVOElement.get(i).elementText("otherFee").equals("0.00")||
								detaileVoiceVOElement.get(i).elementText("otherFee").equals("0.0")||
								detaileVoiceVOElement.get(i).elementText("otherFee").equals("0")){
							detaileVoiceVO.setOtherFee(0);
						}else{
							detaileVoiceVO.setOtherFee(Double.parseDouble(detaileVoiceVOElement.get(i).elementText("otherFee"))/100);
						}
					}
					if(detaileVoiceVOElement.get(i).elementText("favour") != null){
						if(detaileVoiceVOElement.get(i).elementText("favour").equals("0.00")||
								detaileVoiceVOElement.get(i).elementText("favour").equals("0.0")||
								detaileVoiceVOElement.get(i).elementText("favour").equals("0")){
							detaileVoiceVO.setFavour(0);
						}else{
							detaileVoiceVO.setFavour(Double.parseDouble(detaileVoiceVOElement.get(i).elementText("favour"))/100);
						}
						
					}
					if(detaileVoiceVOElement.get(i).elementText("total") != null){
						if(detaileVoiceVOElement.get(i).elementText("total").equals("0.00")||
								detaileVoiceVOElement.get(i).elementText("total").equals("0.0")||
								detaileVoiceVOElement.get(i).elementText("total").equals("0")){
							detaileVoiceVO.setTotal(0);
						}else{
							detaileVoiceVO.setTotal(Double.parseDouble(detaileVoiceVOElement.get(i).elementText("total"))/100);
						}
					}
					detaileVoiceVOArr[i] = detaileVoiceVO;
				}
				resp.setDetaileVoiceVO(detaileVoiceVOArr);
			}
		} catch (Exception exc) {
			logger.warn("Exception in xmlToMobileVoiceDetail:" + exc);
			exc.printStackTrace();
		}	
		logger.info("MobileVoiceDetail:" + resp.toString());
		return resp;
	}

	public static String mobileSmsceDetailToXmlString(BillWebServiceInVO in0) {
		logger.info("convert MobileVoiceDetail to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element = null ;
		
		element = serviceInformation.addElement("Value") ;
		element.setText("27") ;
		
		//直接填入webservice请求中的xml
		int serviceKind ;
		if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("51")){
			serviceKind = 1 ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("8")){
			serviceKind = 2 ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("11") || String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("15")){
			serviceKind = 3 ;
		}else{
			serviceKind = 0 ;
		}
		
		element = serviceInformation.addElement("Data-Table-Simple-Row") ;
		
		String str = "<eventType>"+in0.getEventType()+"</eventType><CityCode>"+in0.getCityCode()+
		"</CityCode><ServiceKind>"+serviceKind+
		"</ServiceKind><Start>"+in0.getStart()+"</Start><End>"+in0.getEnd()+
		"</End><DetailBillListVO><serviceId>"+in0.getDetailBillListVO().getServiceId()+
		"</serviceId><serviceKind>"+in0.getDetailBillListVO().getServiceKind()+
		"</serviceKind><FeeDate>"+in0.getDetailBillListVO().getFeeDate()+
		"</FeeDate><BeginDate>"+in0.getDetailBillListVO().getBeginDate()+
		"</BeginDate><EndDate>"+in0.getDetailBillListVO().getEndDate()+
		"</EndDate><QueryKind>0</QueryKind><DetailType>2</DetailType></DetailBillListVO>" ;
		
		element.setText(str) ;

		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static BillWebServiceOutVO xmlToMobileSmsDetail(String data,	BillWebServiceInVO in0) {
		logger.info("convert sgw ack to MobileSmsDetai......");
		BillWebServiceOutVO resp = new BillWebServiceOutVO();
		
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(data);
			Element root = doc.getRootElement();
			
			//Result为0为true；其余为false ；
			Node node = root.selectSingleNode("//Service_Information/Service_Result_Code");
			if (node != null) {
				if(node.getStringValue().equals("0")){
					resp.setSucess(true) ;
				}else{
					resp.setSucess(false) ;
				}
			}
			
			List<Node> errorDesc = root.selectNodes("//Service_Information/Para_Field_Result") ;
			if(errorDesc.size() > 0){
				String errorDescs = "|" ;
				for(int i=0 ;i<errorDesc.size() ;i++){
					errorDescs += errorDesc.get(i).getStringValue()+"|" ;
				}
				resp.setErrorDesc(errorDescs);
			}
			
			if(in0.getServiceId() != null){
				resp.setServiceId(in0.getServiceId());
			}
			if(String.valueOf(in0.getServiceKind()) != null){
				resp.setServiceKind(in0.getServiceKind());
			}
			if(in0.getCityCode() != null){
				resp.setCityCode(in0.getCityCode());
			}
			
			node = root.selectSingleNode("//Service_Information/Data-Table-Simple-Row") ;
			if(node != null){
				String result = node.getStringValue() ;
				/**
				 * 添加root根元素
				 *   <root>
				 *   	<DetaileNotesVO>
							<beginDate>1</beginDate>
							<callPhone>1</callPhone>
							<callType>1</callType>
							<feeKind>1</feeKind>
							<fee>100</fee>
							<infoFee>100</infoFee>
							<favourInfoFee>100</favourInfoFee>
							<monthFee>100</monthFee>
							<total>200</total>
						</DetaileNotesVO>
					</root>
				 * */
				String rootResult = "<root>"+result+"</root>" ;
				doc = DocumentHelper.parseText(rootResult) ;
				root = doc.getRootElement() ;
				
				Node node1 = root.selectSingleNode("//root/Count");
				//logger.info("------------------count:"+node1.getStringValue());
				if(node1 != null){
					resp.setCount(Integer.parseInt(node1.getStringValue()));
				}
				
				List<Element> detaileNotesVOElement = root.elements("detaileNotesVO");
				DetaileNotesVO[] detaileNotesVOArr = new DetaileNotesVO[detaileNotesVOElement.size()];
				for(int i=0 ;i<detaileNotesVOElement.size() ;i++){
					DetaileNotesVO detaileNotesVO = new DetaileNotesVO();
					if(detaileNotesVOElement.get(i).elementText("beginDate") != null){
						detaileNotesVO.setBeginDate(detaileNotesVOElement.get(i).elementText("beginDate"));
					}
					if(detaileNotesVOElement.get(i).elementText("callPhone") != null){
						detaileNotesVO.setCallPhone(detaileNotesVOElement.get(i).elementText("callPhone"));
					}
					if(detaileNotesVOElement.get(i).elementText("callType") != null){
						detaileNotesVO.setCallType(detaileNotesVOElement.get(i).elementText("callType"));
					}
					if(detaileNotesVOElement.get(i).elementText("feeKind") != null){
						detaileNotesVO.setFeeKind(detaileNotesVOElement.get(i).elementText("feeKind"));
					}
					if(detaileNotesVOElement.get(i).elementText("fee") != null){
						if(detaileNotesVOElement.get(i).elementText("fee").equals("0.00")||
								detaileNotesVOElement.get(i).elementText("fee").equals("0.0")||
								detaileNotesVOElement.get(i).elementText("fee").equals("0")){
							detaileNotesVO.setFee(0);
						}else{
							detaileNotesVO.setFee(Double.parseDouble(detaileNotesVOElement.get(i).elementText("fee"))/100);
						}
					}
					if(detaileNotesVOElement.get(i).elementText("infoFee") != null){
						if(detaileNotesVOElement.get(i).elementText("infoFee").equals("0.00")||
								detaileNotesVOElement.get(i).elementText("infoFee").equals("0.0")||
								detaileNotesVOElement.get(i).elementText("infoFee").equals("0")){
							detaileNotesVO.setInfoFee(0);
						}else{
							detaileNotesVO.setInfoFee(Double.parseDouble(detaileNotesVOElement.get(i).elementText("infoFee"))/100);
						}
					}
					if(detaileNotesVOElement.get(i).elementText("favourInfoFee") != null){
						if(detaileNotesVOElement.get(i).elementText("favourInfoFee").equals("0.00")||
								detaileNotesVOElement.get(i).elementText("favourInfoFee").equals("0.0")||
								detaileNotesVOElement.get(i).elementText("favourInfoFee").equals("0")){
							detaileNotesVO.setFavourInfoFee(0);
						}else{
							detaileNotesVO.setFavourInfoFee(Double.parseDouble(detaileNotesVOElement.get(i).elementText("favourInfoFee"))/100);
						}
					}
					if(detaileNotesVOElement.get(i).elementText("monthFee") != null){
						if(detaileNotesVOElement.get(i).elementText("monthFee").equals("0.00")||
								detaileNotesVOElement.get(i).elementText("monthFee").equals("0.0")||
								detaileNotesVOElement.get(i).elementText("monthFee").equals("0")){
							detaileNotesVO.setMonthFee(0);
						}else{
							detaileNotesVO.setMonthFee(Double.parseDouble(detaileNotesVOElement.get(i).elementText("monthFee"))/100);
						}
					}
					if(detaileNotesVOElement.get(i).elementText("total") != null){
						if(detaileNotesVOElement.get(i).elementText("total").equals("0.00")||
								detaileNotesVOElement.get(i).elementText("total").equals("0.0")||
								detaileNotesVOElement.get(i).elementText("total").equals("0")){
							detaileNotesVO.setTotal(0);
						}else{
							detaileNotesVO.setTotal(Double.parseDouble(detaileNotesVOElement.get(i).elementText("total"))/100);
						}
						
					}
					detaileNotesVOArr[i] = detaileNotesVO;
				}
				resp.setDetaileNotesVO(detaileNotesVOArr);
			}
		} catch (Exception exc) {
			logger.warn("Exception in xmlToMobileSmsDetai:" + exc);
			exc.printStackTrace();
		}	
		logger.info("MobileSmsDetai:" + resp.toString());
		return resp;
	}

	public static String mobileEvdoceDetailToXmlString(BillWebServiceInVO in0) {
		logger.info("convert MobileEvdoDetail to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element = null ;
		
		element = serviceInformation.addElement("Value") ;
		element.setText("28") ;
		
		//直接填入webservice请求中的xml
		int serviceKind ;
		if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("51")){
			serviceKind = 1 ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("8")){
			serviceKind = 2 ;
		}else if(String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("11") || String.valueOf(in0.getDetailBillListVO().getServiceKind()).equals("15")){
			serviceKind = 3 ;
		}else{
			serviceKind = 0 ;
		}
		
		element = serviceInformation.addElement("Data-Table-Simple-Row") ;
		
		String str = "<eventType>"+in0.getEventType()+"</eventType><CityCode>"+in0.getCityCode()+
		"</CityCode><ServiceKind>"+serviceKind+
		"</ServiceKind><Start>"+in0.getStart()+"</Start><End>"+in0.getEnd()+
		"</End><DetailBillListVO><serviceId>"+in0.getDetailBillListVO().getServiceId()+
		"</serviceId><serviceKind>"+in0.getDetailBillListVO().getServiceKind()+
		"</serviceKind><FeeDate>"+in0.getDetailBillListVO().getFeeDate()+
		"</FeeDate><BeginDate>"+in0.getDetailBillListVO().getBeginDate()+
		"</BeginDate><EndDate>"+in0.getDetailBillListVO().getEndDate()+
		"</EndDate><QueryKind>0</QueryKind><DetailType>9</DetailType></DetailBillListVO>" ;
		
		element.setText(str) ;

		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static BillWebServiceOutVO xmlToMobileEvdoDetail(String data, BillWebServiceInVO in0) {
		logger.info("convert sgw ack to MobileEvdoDetail......");
		BillWebServiceOutVO resp = new BillWebServiceOutVO();
		
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(data);
			Element root = doc.getRootElement();
			
			//Result为0为true；其余为false ；
			Node node = root.selectSingleNode("//Service_Information/Service_Result_Code");
			if (node != null) {
				if(node.getStringValue().equals("0")){
					resp.setSucess(true) ;
				}else{
					resp.setSucess(false) ;
				}
			}
			
			List<Node> errorDesc = root.selectNodes("//Service_Information/Para_Field_Result") ;
			if(errorDesc.size() > 0){
				String errorDescs = "|" ;
				for(int i=0 ;i<errorDesc.size() ;i++){
					errorDescs += errorDesc.get(i).getStringValue()+"|" ;
				}
				resp.setErrorDesc(errorDescs);
			}
			
			if(in0.getServiceId() != null){
				resp.setServiceId(in0.getServiceId());
			}
			if(String.valueOf(in0.getServiceKind()) != null){
				resp.setServiceKind(in0.getServiceKind());
			}
			if(in0.getCityCode() != null){
				resp.setCityCode(in0.getCityCode());
			}
			
			node = root.selectSingleNode("//Service_Information/Data-Table-Simple-Row") ;
			if(node != null){
				String result = node.getStringValue() ;
				/**
				 * 添加root根元素
				 *   <root>
				 *   	<DetaileCDMA1XVO>
							<feeName>数据卡详单</feeName>
							<beginCallDate>2013-09-01 00:00:00</beginCallDate>
							<endCallDate>2013-09-30 00:00:00</endCallDate>
							<inBytes>100</inBytes>
							<outBytes>100</outBytes>
							<duration>100</duration>
							<baseFee>100</baseFee>
							<dischargeFee>100</dischargeFee>
							<favourFee>100</favourFee>
							<total>100</total>
							
							<feeKind>
				 *   		<roamType>
				 *   		<spName>
				 *   		<spsrvname>
				 *   		<srvName>
						</DetaileCDMA1XVO>
					</root>
				 * */
				String rootResult = "<root>"+result+"</root>" ;
				doc = DocumentHelper.parseText(rootResult) ;
				root = doc.getRootElement() ;
				
				Node node1 = root.selectSingleNode("//root/Count");
				//logger.info("------------------count:"+node1.getStringValue());
				if(node1 != null){
					resp.setCount(Integer.parseInt(node1.getStringValue()));
				}
				
				List<Element> detaileCDMA1XVOElement = root.elements("DetaileCDMA1XVO");
				DetaileCDMA1XVO[] detaileCDMA1XVOArr = new DetaileCDMA1XVO[detaileCDMA1XVOElement.size()];
				for(int i=0 ;i<detaileCDMA1XVOElement.size() ;i++){
					DetaileCDMA1XVO detaileCDMA1XVO = new DetaileCDMA1XVO();
					
					if(detaileCDMA1XVOElement.get(i).elementText("feeKind") != null){
						detaileCDMA1XVO.setFeeKind(detaileCDMA1XVOElement.get(i).elementText("feeKind"));
					}
					if(detaileCDMA1XVOElement.get(i).elementText("roamType") != null){
						detaileCDMA1XVO.setRoamType(detaileCDMA1XVOElement.get(i).elementText("roamType"));
					}
					if(detaileCDMA1XVOElement.get(i).elementText("spName") != null){
						detaileCDMA1XVO.setSpName(detaileCDMA1XVOElement.get(i).elementText("spName"));
					}
					if(detaileCDMA1XVOElement.get(i).elementText("spsrvname") != null){
						detaileCDMA1XVO.setSpsrvname(detaileCDMA1XVOElement.get(i).elementText("spsrvname"));
					}
					if(detaileCDMA1XVOElement.get(i).elementText("srvName") != null){
						detaileCDMA1XVO.setSrvName(detaileCDMA1XVOElement.get(i).elementText("srvName"));
					}
					
					
					if(detaileCDMA1XVOElement.get(i).elementText("feeName") != null){
						detaileCDMA1XVO.setFeeName(detaileCDMA1XVOElement.get(i).elementText("feeName"));
					}
					if(detaileCDMA1XVOElement.get(i).elementText("beginCallDate") != null){
						detaileCDMA1XVO.setBeginCallDate(detaileCDMA1XVOElement.get(i).elementText("beginCallDate"));
					}
					if(detaileCDMA1XVOElement.get(i).elementText("endCallDate") != null){
						detaileCDMA1XVO.setEndCallDate(detaileCDMA1XVOElement.get(i).elementText("endCallDate"));
					}
					//inBytes/1024后保留2位小数
					if(detaileCDMA1XVOElement.get(i).elementText("inBytes") != null){
						//detaileCDMA1XVO.setInBytes(Long.parseLong(detaileCDMA1XVOElement.get(i).elementText("inBytes")));
						detaileCDMA1XVO.setInBytes(Long.parseLong(String.valueOf(new BigDecimal(String.valueOf(Float.parseFloat(detaileCDMA1XVOElement.get(i).elementText("inBytes"))/1024)).setScale(0, BigDecimal.ROUND_HALF_UP))));
					}
					//outBytes/1024后保留2位小数
					if(detaileCDMA1XVOElement.get(i).elementText("outBytes") != null){
						//detaileCDMA1XVO.setOutBytes(Long.parseLong(detaileCDMA1XVOElement.get(i).elementText("outBytes")));
						detaileCDMA1XVO.setOutBytes(Long.parseLong(String.valueOf(new BigDecimal(String.valueOf(Float.parseFloat(detaileCDMA1XVOElement.get(i).elementText("outBytes"))/1024)).setScale(0, BigDecimal.ROUND_HALF_UP))));
					}
					if(detaileCDMA1XVOElement.get(i).elementText("duration") != null){
						detaileCDMA1XVO.setDuration(Long.parseLong(detaileCDMA1XVOElement.get(i).elementText("duration")));
					}
					if(detaileCDMA1XVOElement.get(i).elementText("baseFee") != null){
						if(detaileCDMA1XVOElement.get(i).elementText("baseFee").equals("0.00")||
								detaileCDMA1XVOElement.get(i).elementText("baseFee").equals("0.0")||
								detaileCDMA1XVOElement.get(i).elementText("baseFee").equals("0")){
							detaileCDMA1XVO.setBaseFee(0);
						}else{
							detaileCDMA1XVO.setBaseFee(Double.parseDouble(detaileCDMA1XVOElement.get(i).elementText("baseFee"))/100);
						}
					}
					if(detaileCDMA1XVOElement.get(i).elementText("dischargeFee") != null){
						if(detaileCDMA1XVOElement.get(i).elementText("dischargeFee").equals("0.00")||
								detaileCDMA1XVOElement.get(i).elementText("dischargeFee").equals("0.0")||
								detaileCDMA1XVOElement.get(i).elementText("dischargeFee").equals("0")){
							detaileCDMA1XVO.setDischargeFee(0);
						}else{
							detaileCDMA1XVO.setDischargeFee(Double.parseDouble(detaileCDMA1XVOElement.get(i).elementText("dischargeFee"))/100);
						}
					}
					if(detaileCDMA1XVOElement.get(i).elementText("favourFee") != null){
						if(detaileCDMA1XVOElement.get(i).elementText("favourFee").equals("0.00")||
								detaileCDMA1XVOElement.get(i).elementText("favourFee").equals("0.0")||
								detaileCDMA1XVOElement.get(i).elementText("favourFee").equals("0")){
							detaileCDMA1XVO.setFavourFee(0);
						}else{
							detaileCDMA1XVO.setFavourFee(Double.parseDouble(detaileCDMA1XVOElement.get(i).elementText("favourFee"))/100);
						}
					}
					if(detaileCDMA1XVOElement.get(i).elementText("total") != null){
						if(detaileCDMA1XVOElement.get(i).elementText("total").equals("0.00")||
								detaileCDMA1XVOElement.get(i).elementText("total").equals("0.0")||
								detaileCDMA1XVOElement.get(i).elementText("total").equals("0")){
							detaileCDMA1XVO.setTotal(0);
						}else{
							detaileCDMA1XVO.setTotal(Double.parseDouble(detaileCDMA1XVOElement.get(i).elementText("total"))/100);
						}
					}
					detaileCDMA1XVOArr[i] = detaileCDMA1XVO;
				}
				resp.setDetaileCDMA1XVO(detaileCDMA1XVOArr);
			}
		} catch (Exception exc) {
			logger.warn("Exception in xmlToMobileEvdoDetail:" + exc);
			exc.printStackTrace();
		}	
		logger.info("MobileEvdoDetail:" + resp.toString());
		return resp;
	}
	
	

}