package utils;

import org.dom4j.io.SAXReader; 
import org.dom4j.Document; 
import org.dom4j.DocumentException; 
import org.dom4j.Element; 
import org.dom4j.Node; 

import java.util.Iterator; 
import java.util.List; 
import java.io.InputStream; 

/** 
* Created by IntelliJ IDEA.<br> 
* <b>User</b>: leizhimin<br> 
* <b>Date</b>: 2008-3-26 15:53:51<br> 
* <b>Note</b>: Dom4j��������XML���� 
*/ 
public class TestDom4j { 
    /** 
     * ��ȡָ��xml�ĵ���Document����,xml�ļ�������classpath�п����ҵ� 
     * 
     * @param xmlFilePath xml�ļ�·�� 
     * @return Document���� 
     */ 
    public static Document parse2Document(String xmlFilePath) { 
        SAXReader reader = new SAXReader(); 
        Document document = null; 
        try { 
            InputStream in = TestDom4j.class.getResourceAsStream(xmlFilePath); 
            document = reader.read(in); 
        } catch (DocumentException e) { 
            System.out.println(e.getMessage()); 
            System.out.println("��ȡclasspath��xmlFileName�ļ������쳣������CLASSPATH���ļ����Ƿ���ڣ�"); 
            e.printStackTrace(); 
        } 
        return document; 
    } 

    public static void testParseXMLData(String xmlFileName) { 
        //����һ������������ 
        SAXReader reader = new SAXReader(); 
        //��xml�ĵ�ת��ΪDocument�Ķ��� 
        Document document = parse2Document(xmlFileName); 
        //��ȡ�ĵ��ĸ�Ԫ�� 
        Element root = document.getRootElement(); 
        //������������xml���ݵĻ����ַ������� 
        StringBuffer sb = new StringBuffer(); 
        sb.append("ͨ��Dom4j����XML,���������:\n"); 
        sb.append(xmlFileName + "\n"); 
        sb.append("----------------����start----------------\n"); 
        //������ǰԪ��(�ڴ��Ǹ�Ԫ��)����Ԫ�� 
        for (Iterator i_pe = root.elementIterator(); i_pe.hasNext();) { 
            Element e_pe = (Element) i_pe.next(); 
            //��ȡ��ǰԪ�ص����� 
            String person = e_pe.getName(); 
            //��ȡ��ǰԪ�ص�id��sex���Ե�ֵ���ֱ𸳸�id,sex���� 
            String id = e_pe.attributeValue("id"); 
            String sex = e_pe.attributeValue("sex"); 
            String name = e_pe.element("name").getText(); 
            String age = e_pe.element("age").getText(); 
            //�����ݴ�ŵ��������ַ��������� 
            sb.append(person + ":\n"); 
            sb.append("\tid=" + id + " sex=" + sex + "\n"); 
            sb.append("\t" + "name=" + name + " age=" + age + "\n"); 

            //��ȡ��ǰԪ��e_pe(�ڴ���personԪ��)�µ���Ԫ��adds 
            Element e_adds = e_pe.element("adds"); 
            sb.append("\t" + e_adds.getName() + "\n"); 

            //������ǰԪ��e_adds(�ڴ���addsԪ��)����Ԫ�� 
            for (Iterator i_adds = e_adds.elementIterator(); i_adds.hasNext();) { 
                Element e_add = (Element) i_adds.next(); 
                String code = e_add.attributeValue("code"); 
                String add = e_add.getTextTrim(); 
                sb.append("\t\t" + e_add.getName() + ":" + " code=" + code + " value=\"" + add + "\"\n"); 
            } 
            sb.append("\n"); 
        } 
        sb.append("-----------------����end-----------------\n"); 
        System.out.println(sb.toString()); 


        System.out.println("---------ͨ��XPath��ȡһ��Ԫ��----------"); 
        Node node1 = document.selectSingleNode("/doc/person"); 
        System.out.println("����ڵ�:" + 
                "\t"+node1.asXML()); 

        Node node2 = document.selectSingleNode("/doc/person/@sex"); 
        System.out.println("����ڵ�:" + 
                "\t"+node2.asXML()); 

        Node node3 = document.selectSingleNode("/doc/person[name=\"zhangsan\"]/age"); 
        System.out.println("����ڵ�:" + 
                "\t"+node3.asXML()); 

        System.out.println("\n---------XPath��ȡList�ڵ����------------"); 
        List list = document.selectNodes("/doc/person[name=\"zhangsan\"]/adds/add"); 
        for(Iterator it=list.iterator();it.hasNext();){ 
            Node nodex=(Node)it.next(); 
            System.out.println(nodex.asXML()); 
        } 

        System.out.println("\n---------ͨ��ID��ȡԪ�صĲ���----------"); 
        System.out.println("���壺ͨ��ID��ȡ��Ԫ��ID����������Ϊ����дID����Сд�ġ�id������Ϊ����ͨ���ԣ�"); 
        String id22 = document.elementByID("22").asXML(); 
        String id23 = document.elementByID("23").asXML(); 
        String id24 = null; 
        if (document.elementByID("24") != null) { 
            id24 = document.elementByID("24").asXML(); 
        } else { 
            id24 = "null"; 
        } 

        System.out.println("id22=  " + id22); 
        System.out.println("id23=  " + id23); 
        System.out.println("id24=  " + id24); 
    } 


    public static void main(String args[]) { 
        testParseXMLData("/person.xml"); 
    } 
}
 