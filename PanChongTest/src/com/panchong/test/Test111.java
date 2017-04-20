package com.panchong.test;


import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by james on 2017/4/19.
 */
public class Test111 {

    public static List<EcmCardBins> getNumName(File file) throws IOException {
        String[] bankStr = new String[]{"工商银行", "农业银行", "中国银行", "建设银行", "交通银行", "浦发银行", "民生银行", "中信银行", "招商银行", "平安银行", "华夏银行", "兴业银行", "光大银行", "浙商银行", "广发银行", "邮储银行", "北京银行", "宁夏银行", "长安银行", "齐商银行", "重庆银行", "成都银行", "西安银行", "陕西省联社", "汇丰银行", "东亚银行", "宁波银行", "恒丰银行", "昆仑银行", "华润银行", "盛京银行", "农业发展银行", "包商银行", "哈尔滨银行", "天津银行", "上海银行", "江苏银行", "东莞银行", "珠海华润银行", "杭州银行", "广东华兴银行"};
        List<EcmCardBins> list = new ArrayList<EcmCardBins>();
        Workbook book = new XSSFWorkbook(new FileInputStream(file));
        Sheet sheet = book.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.rowIterator();
        Row row0 = rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            EcmCardBins card = new EcmCardBins();
            card.setBankCode(row.getCell(0).getRichStringCellValue().getString());
            card.setBankName(row.getCell(1).getRichStringCellValue().getString());
            boolean exist = false;
            for (String str : bankStr) {
                if (card.getBankName().contains(str)) {
                    exist = true;
                    break;
                }
            }
            if (!exist)
                list.add(card);
        }
        return list;
    }

    public static HashSet<String> getBin(File file) throws IOException {

        HashSet<String> set = new HashSet<String>();
        Workbook book = new XSSFWorkbook(new FileInputStream(file));
        Sheet sheet = book.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.rowIterator();
        Row row0 = rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            //if(StringUtils.isEmpty(row.getCell(3).getRichStringCellValue().getString()))
                set.add(row.getCell(1).getRichStringCellValue().getString());
        }
        return set;
    }


    public static void writeExcel() throws IOException {
        HashSet<String> emptySet = new HashSet<String>();
        Map<String, String> map = getMap();
        Workbook book = new XSSFWorkbook(new FileInputStream("D:\\sql111.xlsx"));
        Sheet sheet = book.getSheetAt(0);  //获取到工作表，因为一个excel可能有多个工作表
        Iterator<Row> rowIterator = sheet.rowIterator();//获取第一行（excel中的行默认从0开始，所以这就是为什么，一个excel必须有字段列头），即，字段列头，便于赋值
        Row row0 = rowIterator.next();
        FileOutputStream out = new FileOutputStream("D:\\sql111.xlsx");  //向d://test.xls中写数据
        int count = 0;
        int setCount = 0;
        while (rowIterator.hasNext()) {
            Row next = rowIterator.next();
            String bankName = next.getCell(1).getRichStringCellValue().getString();
            String bankCode = map.get(bankName);
            if (!StringUtils.isEmpty(bankCode) && !bankCode.contains(",")) {
                next.getCell(3).setCellValue(bankCode);
                setCount++;
            } else if (StringUtils.isEmpty(bankCode)) {
                emptySet.add(bankName);
                count++;
            }
        }
        System.out.println("count : " + count);
        System.out.println("setCount : " + setCount);
        System.out.println("emptySet size : " + emptySet.size());
        /*for (String s : emptySet) {
            System.out.println("emptySet name : " + s);
        }*/

        out.flush();
        book.write(out);
        out.close();
    }


    public static void main(String[] args) throws IOException {
        HashSet<String> binSet = getBin(new File("D:\\sql111.xlsx"));
        System.out.println(binSet.size());
        for (String s : binSet) {
            System.out.println(s);
        }



        //writeExcel();
        /*Map<String, String> map = getMap();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            if(next.getValue().contains(",")){
                System.out.println(next.getKey() + "-" + next.getValue());
                count++;
            }
        }
        System.out.println(count);*/


    }

    public static Map<String, String> getMap() throws IOException {
        Map<String, String> map = new HashMap<String, String>();
        List<EcmCardBins> numNameList = getNumName(new File("D:\\111.xlsx"));
        System.out.println("联行号excel：" + numNameList.size());
        HashSet<String> binSet = getBin(new File("D:\\sql111.xlsx"));
        System.out.println("数据库excel：" + binSet.size());
        for (String binName : binSet) {
            for (EcmCardBins numName : numNameList) {
                if (numName.getBankName().contains(binName)) {
                    if (numName.getBankName().endsWith("股份有限公司")
                            || numName.getBankName().endsWith("股份公司")
                            || numName.getBankName().endsWith("有限责任公司")
                            || numName.getBankName().endsWith("有限责任公司营业部")
                            || numName.getBankName().endsWith("股份有限公司营业部")
                            || numName.getBankName().endsWith("营业部")
                            || numName.getBankName().endsWith("有限公司") || binName.equals(numName.getBankName())) {
                        map.put(binName, numName.getBankCode());
                        break;
                    } else if (!map.containsKey(binName)) {
                        map.put(binName, numName.getBankCode());
                    } else {
                        if (!map.get(binName).equals(numName.getBankCode())) {
                            String code = map.get(binName) + "," + numName.getBankCode();
                            map.put(binName, code);
                        }
                    }
                }
            }
        }
        System.out.println(map.size());
        /*Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }*/
        return map;
    }

}
