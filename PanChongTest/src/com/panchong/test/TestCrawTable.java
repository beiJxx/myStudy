package com.panchong.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.List;

public class TestCrawTable {
	public static void main(String[] args) {
		try {
			/*Document document = Jsoup.connect(
					"http://www.landnj.cn/LandInfo.aspx?flag=gongshi&Id=172")
					.get();*/
			/*Document document = Jsoup.connect(
					"http://furhr.com/?bankType=&cBankName="+encode+"&cAddr=&no=&search=true")
					.get();*/
            HashSet<String> binSet = Test111.getBin(new File("D:\\sql111.xlsx"));
            for (String s : binSet) {
                String encode = URLEncoder.encode(s, "utf-8");
                Document document = Jsoup.connect(
                        "http://furhr.com/?bankType=&cBankName="+encode+"&cAddr=&no=&search=true")
                        .get();
                System.out.println(s + ":");
                System.out.println("{");
                /*if (document != null) {
                    List<TableElement> tableElemts = DataTableUtil.getFitElement(document);
                    if (tableElemts != null && tableElemts.size() > 0) {
                        List<PropertyInfo> propertyInfos = TableUtil.extractPropertyInfos(tableElemts);
//					List<PropertyInfo> propertyInfos = TableUtil
//					.getTableValue((Element) tableElemts);
                        if (propertyInfos != null && propertyInfos.size() > 0) {
                            for (PropertyInfo propertyInfo : propertyInfos) {
                                System.out.println(propertyInfo.getName() + "  " + propertyInfo.getValue());
                            }
                            System.out.println("-----------------------------------");
                        }
                    }
                }*/
                List<String> bankElement = DataTableUtil.getBankElement(document);
                for (String s1 : bankElement) {
                    System.out.println(s1);
                }
                System.out.println("}");

            }

            /*String decode = URLDecoder.decode("%E6%8B%9B%E5%95%86%E9%93%B6%E8%A1%8C", "utf-8");
			String encode = URLEncoder.encode(decode, "UTF-8");
			System.out.println(encode);
			System.out.println(encode.equals("%E6%8B%9B%E5%95%86%E9%93%B6%E8%A1%8C"));
			System.out.println(decode);*/


		} catch (IOException e) {
			e.printStackTrace();
		}
	}




}
