package utils;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.example.www.BillQuery.AcctFeeInfo;
import org.example.www.BillQuery.BillInfo;
import org.example.www.BillQuery.BillQueryRequest;
import org.example.www.BillQuery.BillQueryResponse;
import org.example.www.BillQuery.CoutesyReminderInfo;
import org.example.www.BillQuery.FeeInfo;
import org.example.www.BillQuery.PointInfo;
import org.example.www.BillQuery.UseInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HandleXml {
	
	private static final Logger logger = LoggerFactory.getLogger(HandleXml.class);

	public static String AccountBillListToXmlString(BillQueryRequest in0) {
		logger.info("convert AccountBillList to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element = null ;
		
		element = serviceInformation.addElement("Value") ;
		element.setText("25") ;
		
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
		
		String str ="<feeDate>"+in0.getFeeDate()+"</feeDate><queryType>"+in0.getQueryType()+
			"</queryType><requestId>"+in0.getRequestId()+"</requestId><serviceId>"+in0.getServiceId()+
			"</serviceId><serviceKind>"+serviceKind+"</serviceKind><systemId>"+in0.getSystemId()+"</systemId>" ;
		element.setText(str) ;

		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static BillQueryResponse xmlToaccountBillList(String data) {
		logger.info("convert sgw ack to AccountBillList......");
		BillQueryResponse resp = new BillQueryResponse();
		
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(data);
			Element root = doc.getRootElement();
			
			Node node = root.selectSingleNode("//Service_Information/Data-Table-Simple-Row") ;
			if(node != null){
				String result = node.getStringValue() ;
				/**
				 * 添加root根元素
				 *   <root>
						【注2】
					</root>
				 * */
				String rootResult = "<root>"+result+"</root>" ;
				doc = DocumentHelper.parseText(rootResult) ;
				root = doc.getRootElement() ;
				
				node = root.selectSingleNode("//root/responseId");
				if(node != null){
					resp.setResponseId(node.getStringValue()) ;
				}
				
				node = root.selectSingleNode("//root/resultCode");
				if(node != null){
					resp.setResultCode(node.getStringValue()) ;
				}
				
				node = root.selectSingleNode("//root/totalBillFee");
				if(node != null){
					resp.setTotalBillFee(Long.parseLong(node.getStringValue())) ;
				}
				
				List<Element> acctFeeInfos = root.elements("acctFeeInfo") ;
				if(acctFeeInfos != null){
					AcctFeeInfo  acctFeeInfo = new AcctFeeInfo() ;
					if(acctFeeInfos.get(0).elementText("paidFee") != null){
						acctFeeInfo.setPaidFee(Long.parseLong(acctFeeInfos.get(0).elementText("paidFee")));
					}
					if(acctFeeInfos.get(0).elementText("paidPreFee") != null){
						acctFeeInfo.setPaidPreFee(Long.parseLong(acctFeeInfos.get(0).elementText("paidPreFee")));
					}
					if(acctFeeInfos.get(0).elementText("paidTransFee") != null){
						acctFeeInfo.setPaidTransFee(Long.parseLong(acctFeeInfos.get(0).elementText("paidTransFee")));
					}
					if(acctFeeInfos.get(0).elementText("shouldPayFee") != null){
						acctFeeInfo.setShouldPayFee(Long.parseLong(acctFeeInfos.get(0).elementText("shouldPayFee")));
					}
					if(acctFeeInfos.get(0).elementText("usedFee") != null){
						acctFeeInfo.setUsedFee(Long.parseLong(acctFeeInfos.get(0).elementText("usedFee")));
					}
					resp.setAcctFeeInfo(acctFeeInfo);
				}
				
				List<Element> coutesyReminderInfos = root.elements("coutesyReminderInfo") ;
				if(coutesyReminderInfos != null){
					CoutesyReminderInfo coutesyReminderInfo = new CoutesyReminderInfo() ;
					if(coutesyReminderInfos.get(0).elementText("consumptionAnalysis") != null){
						coutesyReminderInfo.setConsumptionAnalysis(coutesyReminderInfos.get(0).elementText("consumptionAnalysis"));
					}
					if(coutesyReminderInfos.get(0).elementText("prodEstimate") != null){
						coutesyReminderInfo.setProdEstimate(coutesyReminderInfos.get(0).elementText("prodEstimate"));
					}
					resp.setCoutesyReminderInfo(coutesyReminderInfo) ;
				}
				
				List<Element> pointInfos = root.elements("pointInfo");
				if(pointInfos != null){
					PointInfo pointInfo = new PointInfo() ;
					if(pointInfos.get(0).elementText("addPoint") != null){
						pointInfo.setAddPoint(Double.parseDouble(pointInfos.get(0).elementText("addPoint")));
					}
					if(pointInfos.get(0).elementText("lastPoint") != null){
						pointInfo.setLastPoint(Double.parseDouble(pointInfos.get(0).elementText("lastPoint")));
					}
					if(pointInfos.get(0).elementText("thisPoint") != null){
						pointInfo.setThisPoint(Double.parseDouble(pointInfos.get(0).elementText("thisPoint")));
					}
					if(pointInfos.get(0).elementText("usePoint") != null){
						pointInfo.setUsePoint(Double.parseDouble(pointInfos.get(0).elementText("usePoint")));
					}
					if(pointInfos.get(0).elementText("yearPoint") != null){
						pointInfo.setYearPoint(Double.parseDouble(pointInfos.get(0).elementText("yearPoint")));
					}
					resp.setPointInfo(pointInfo) ;
				}
				
				List<Element> billInfoGroups = root.elements("billInfoGroup");
				if(billInfoGroups != null){
					BillInfo[] billInfoArr = new BillInfo[billInfoGroups.size()];
					for(int i=0 ;i<billInfoGroups.size() ;i++){
						BillInfo billInfo = new BillInfo() ;
						if(billInfoGroups.get(i).elementText("ifHaveOverlyPkg") != null){
							billInfo.setIfHaveOverlyPkg(billInfoGroups.get(i).elementText("ifHaveOverlyPkg")) ;
						}
						if(billInfoGroups.get(i).elementText("prodName") != null){
							billInfo.setProdName(billInfoGroups.get(i).elementText("prodName")) ;
						}
						if(billInfoGroups.get(i).elementText("serviceInfoStr") != null){
							billInfo.setServiceInfoStr(billInfoGroups.get(i).elementText("serviceInfoStr")) ;
						}
						
						List<Element> useInfos = billInfoGroups.get(i).elements("useInfo");
						if(useInfos != null){
							UseInfo[] useInfoArr = new UseInfo[useInfos.size()] ; 
							for(int j=0 ;j<useInfos.size() ;j++){
								UseInfo useInfo = new UseInfo() ;
								if(useInfos.get(j).elementText("amountType") != null){
									useInfo.setAmountType(Integer.parseInt(useInfos.get(j).elementText("amountType"))) ;
								}
								if(useInfos.get(j).elementText("prodUseName") != null){
									useInfo.setProdUseName(useInfos.get(j).elementText("prodUseName")) ;
								}
								if(useInfos.get(j).elementText("serviceId") != null){
									useInfo.setServiceId(useInfos.get(j).elementText("serviceId")) ;
								}
								if(useInfos.get(j).elementText("totalUseValue") != null){
									useInfo.setTotalUseValue(useInfos.get(j).elementText("totalUseValue")) ;
								}
								if(useInfos.get(j).elementText("useInfoValue") != null){
									useInfo.setUseInfoValue(useInfos.get(j).elementText("useInfoValue")) ;
								}
								useInfoArr[j] = useInfo ;
							}
							billInfo.setUseInfo(useInfoArr);
						}
						
						List<Element> feeInfos = billInfoGroups.get(i).elements("feeInfo");
						if(feeInfos != null){
							FeeInfo[] feeInfoArr = new FeeInfo[feeInfos.size()] ;
							for(int z=0 ;z<feeInfos.size() ;z++){
								FeeInfo feeInfo = new FeeInfo() ;
								if(feeInfos.get(z).elementText("level") != null){
									feeInfo.setLevel(Integer.parseInt(feeInfos.get(z).elementText("level"))) ;
								}
								if(feeInfos.get(z).elementText("name") != null){
									feeInfo.setName(feeInfos.get(z).elementText("name")) ;
								}
								if(feeInfos.get(z).elementText("value") != null){
									feeInfo.setValue(feeInfos.get(z).elementText("value")) ;
								}
								feeInfoArr[z] = feeInfo ;
							}
							billInfo.setFeeInfo(feeInfoArr) ;
						}
						billInfoArr[i] = billInfo ;
					}
					resp.setBillInfoGroup(billInfoArr) ;
				}
				
			}
		} catch (Exception exc) {
			logger.warn("Exception in xmlToAccountBillList:" + exc);
			exc.printStackTrace();
		}	
		logger.info("AccountBillList:" + resp.toString());
		return resp;
	}

	public static String NewUserBillListToXmlString(BillQueryRequest in0) {
		logger.info("convert NewUserBillList to xml......");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element element = null ;
		
		element = serviceInformation.addElement("Value") ;
		element.setText("26") ;
		
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
		
		String str ="<feeDate>"+in0.getFeeDate()+"</feeDate><queryType>"+in0.getQueryType()+
			"</queryType><requestId>"+in0.getRequestId()+"</requestId><serviceId>"+in0.getServiceId()+
			"</serviceId><serviceKind>"+serviceKind+"</serviceKind><systemId>"+in0.getSystemId()+"</systemId>" ;
		element.setText(str) ;

		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static BillQueryResponse xmlToNewUserBillList(String data) {
		logger.info("convert sgw ack to NewUserBillList......");
		BillQueryResponse resp = new BillQueryResponse();
		
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(data);
			Element root = doc.getRootElement();
			
			Node node = root.selectSingleNode("//Service_Information/Data-Table-Simple-Row") ;
			if(node != null){
				String result = node.getStringValue() ;
				/**
				 * 添加root根元素
				 *   <root>
						【注2】
					</root>
				 * */
				String rootResult = "<root>"+result+"</root>" ;
				doc = DocumentHelper.parseText(rootResult) ;
				root = doc.getRootElement() ;
				
				node = root.selectSingleNode("//root/responseId");
				if(node != null){
					resp.setResponseId(node.getStringValue()) ;
				}
				
				node = root.selectSingleNode("//root/resultCode");
				if(node != null){
					resp.setResultCode(node.getStringValue()) ;
				}
				
				node = root.selectSingleNode("//root/totalBillFee");
				if(node != null){
					resp.setTotalBillFee(Long.parseLong(node.getStringValue())) ;
				}
				
				List<Element> coutesyReminderInfos = root.elements("coutesyReminderInfo");
				if(coutesyReminderInfos != null){
					CoutesyReminderInfo coutesyReminderInfo = new CoutesyReminderInfo();
					if(coutesyReminderInfos.get(0).elementText("consumptionAnalysis") != null){
						coutesyReminderInfo.setConsumptionAnalysis(coutesyReminderInfos.get(0).elementText("consumptionAnalysis"));
					}
					if(coutesyReminderInfos.get(0).elementText("prodEstimate") != null){
						coutesyReminderInfo.setProdEstimate(coutesyReminderInfos.get(0).elementText("prodEstimate"));
					}
					resp.setCoutesyReminderInfo(coutesyReminderInfo);
				}
				
				List<Element> billInfoGroup = root.elements("billInfoGroup");
				if(billInfoGroup != null){
					BillInfo[] billInfoArr = new BillInfo[billInfoGroup.size()] ;
					BillInfo billInfo = new BillInfo();
					
					if(billInfoGroup.get(0).elementText("ifHaveOverlyPkg") != null){
						billInfo.setIfHaveOverlyPkg(billInfoGroup.get(0).elementText("ifHaveOverlyPkg"));
					}
					if(billInfoGroup.get(0).elementText("prodName") != null){
						billInfo.setProdName(billInfoGroup.get(0).elementText("prodName")) ;
					}
					if(billInfoGroup.get(0).elementText("serviceInfoStr") != null){
						billInfo.setServiceInfoStr(billInfoGroup.get(0).elementText("serviceInfoStr")) ;
					}
					
					List<Element> feeInfos = billInfoGroup.get(0).elements("feeInfo");
					if(feeInfos != null){
						FeeInfo[] feeInfoArr = new FeeInfo[feeInfos.size()] ;
						for(int i=0 ;i<feeInfos.size() ;i++){
							FeeInfo feeInfo = new FeeInfo() ;
							if(feeInfos.get(i).elementText("level") != null){
								feeInfo.setLevel(Integer.parseInt(feeInfos.get(i).elementText("level")));
							}
							if(feeInfos.get(i).elementText("name") != null){
								feeInfo.setName(feeInfos.get(i).elementText("name"));
							}
							if(feeInfos.get(i).elementText("value") != null){
								feeInfo.setValue(feeInfos.get(i).elementText("value"));
							}
							feeInfoArr[i] = feeInfo ;
						}
						billInfo.setFeeInfo(feeInfoArr) ;
					}
					
					List<Element> useInfos = billInfoGroup.get(0).elements("useInfo") ;
					if(useInfos != null){
						UseInfo[] useInfoArr = new UseInfo[useInfos.size()] ;
						for(int j=0 ;j<useInfos.size() ;j++){
							UseInfo useInfo  = new UseInfo();
							if(useInfos.get(j).elementText("amountType") != null){
								useInfo.setAmountType(Integer.parseInt(useInfos.get(j).elementText("amountType")));
							}
							if(useInfos.get(j).elementText("prodUseName") != null){
								useInfo.setProdUseName(useInfos.get(j).elementText("prodUseName"));
							}
							if(useInfos.get(j).elementText("serviceId") != null){
								useInfo.setServiceId(useInfos.get(j).elementText("serviceId"));
							}
							if(useInfos.get(j).elementText("totalUseValue") != null){
								useInfo.setTotalUseValue(useInfos.get(j).elementText("totalUseValue"));
							}
							if(useInfos.get(j).elementText("useInfoValue") != null){
								useInfo.setUseInfoValue(useInfos.get(j).elementText("useInfoValue"));
							}
							useInfoArr[j] = useInfo ;
						}
						billInfo.setUseInfo(useInfoArr);
					}
					billInfoArr[0] = billInfo ;
					resp.setBillInfoGroup(billInfoArr);
				}
			}
		} catch (Exception exc) {
			logger.warn("Exception in xmlToNewUserBillList:" + exc);
			exc.printStackTrace();
		}	
		logger.info("NewUserBillList:" + resp.toString());
		return resp;
	}
	
	

}