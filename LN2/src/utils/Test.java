package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;

import com.sun.org.apache.xerces.internal.parsers.CachingParserPool.SynchronizedGrammarPool;

public class Test {
	public static void main(String[] args) {
		/*String str = "<serviceId>15810049355</serviceId><ServiceKind>1</ServiceKind><cityCode>910</cityCode><PayFeeHisVO><accountFeeKind>shortmessage</accountFeeKind><advance_operate_date>201307</advance_operate_date><bankName>招商银行</bankName><fee_name>短信费</fee_name><flow_number>10001210</flow_number><last_left>100</last_left><left_fee>59.6</left_fee><leftFee>30.7</leftFee><no_pay_number>1321568</no_pay_number><overdue_fee>0.0</overdue_fee><pay_fee>200.0</pay_fee><pay_kind>网上缴费</pay_kind><pay_kind_code>1</pay_kind_code><payKindName>网上扣账</payKindName><payTime>20130719085033</payTime><payWayName>网上缴费</payWayName><service_id>15810049355</service_id><service_name>网上缴费</service_name></PayFeeHisVO>" ;
		System.out.println(str.contains("pay_kind"));
		String result = "<root>"+str+"</root>" ;
		try {
			Document doc = DocumentHelper.parseText(result) ;
			System.out.println(doc.asXML());
			Element root = doc.getRootElement() ;
			Node node = root.selectSingleNode("//root/PayFeeHisVO/accountFeeKind") ;
			System.out.println(node.getStringValue());
			
			List<Element> list = root.elements("PayFeeHisVO") ;
			System.out.println(list.size());
			System.out.println(list.get(0).elementText("i don't know"));
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}*/
		
		StringBuffer time1 = new StringBuffer()  ;
		time1.append("20131001140250");
		time1.delete(7+1,time1.length()).insert(4, "-").insert(7, "-");
		System.out.println(time1.toString());
		
		
		try {
			StringBuffer time = new StringBuffer()  ;
			time.append("20130823140250");
			time.insert(4, "-").insert(7, "-").insert(10, " ").insert(13, ":").insert(16, ":");
			System.out.println(time.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
