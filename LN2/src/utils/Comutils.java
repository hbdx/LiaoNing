/**
 * 
 */
package utils;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import cn.chinatelecom.sgw.soap.SGWService;
import cn.chinatelecom.sgw.soap.SGWService_Service;

/**
 * @author sunhaiy
 * 
 */
public class Comutils {
	/**
	 * 返回一个符号SGWService 接口的WS client,
	 * 
	 * @param serverURL
	 *            server 的WS访问地址
	 * @return SGWService
	 */
	public static SGWService getSGWServiceClient(String serverURL) {
		URL wsdlURL;
		QName serviceQname = new QName("http://www.chinatelecom.cn/SGW/SOAP","SGWService");
		String wsdl = "All_SGW_WEBSERVICE.wsdl";
		try {
			wsdlURL = Thread.currentThread().getContextClassLoader().getResource(wsdl);
			if (wsdlURL == null) {
				throw new RuntimeException("cant' find wsdl file " + wsdl);
			}
		} catch (Exception e) {
			throw new RuntimeException("bad wsdl url:" + e);
		}
		SGWService_Service sgwServiceClient = new SGWService_Service(wsdlURL,serviceQname);
		SGWService client = sgwServiceClient.getSGWServiceSOAP();
		Map<String, Object> ctx = ((BindingProvider) client).getRequestContext();
		ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serverURL);
		return client;
	}

	public static AtomicInteger reqSerialNum = new AtomicInteger(0);

	/**
	 * 生成ReqSerial流水号
	 * 
	 * @return
	 */
	public static String genReqSerialNum() {
		if (reqSerialNum.get() == 99999999) {
			reqSerialNum.set(0);
		}
		int newValue = reqSerialNum.incrementAndGet();

		StringBuilder result = new StringBuilder(Integer.toString(newValue));
		int len = result.length();
		for (int i = len; i <= 8; i++) {
			result.insert(0, "0");
		}
		return result.toString();
	}

	public static String getReqSerial() {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmmss");
		return dateformat.format(new Date()) + genReqSerialNum() + "05";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comutils comutils = new Comutils();
		String n = comutils.getReqSerial();
		System.out.println(n);
	}

}
