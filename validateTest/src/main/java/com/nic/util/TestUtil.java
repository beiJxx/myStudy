/*
 * 文 件 名:  TestUtil.java
 * 版    权:  Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 创 建 人:  james
 * 创建时间:  2016年11月4日
 */
package com.nic.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import com.nic.model.User;

import net.sf.oval.ConstraintViolation;

/**
 * <一句话功能简述>
 *  
 * @author  james
 * @version  [V1.00, 2016年11月4日]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class TestUtil {
	
	public static void main(String[] args) {
		User user = new User();
		user.setName("123");
		user.setAge("1");
		HashMap<String, String> msgMap = new HashMap<String,String>();
		List<ConstraintViolation> validate = ValidateUtil.validate(user);
		for (ConstraintViolation constraintViolation : validate) {
			String context = constraintViolation.getContext().toString();
			String msg = constraintViolation.getMessage();
			String substring = context.substring(context.lastIndexOf(".")+1, context.length());
			if(msgMap.containsKey(substring)){
				msgMap.put(substring, msgMap.get(substring) + ";" + msg);
			}else{
				msgMap.put(substring, msg);
			}
		}
		
		Iterator<Entry<String, String>> iterator = msgMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, String> next = iterator.next();
			System.out.println(next.getKey() + ":" + next.getValue());
		}
	}
	
}
