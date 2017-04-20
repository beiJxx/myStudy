/*
 * 文 件 名:  ValidateUtil.java
 * 版    权:  Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 创 建 人:  james
 * 创建时间:  2016年11月4日
 */
package com.nic.util;

import java.util.List;

import com.nic.model.User;

import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import net.sf.oval.configuration.xml.XMLConfigurer;

/**
 * <一句话功能简述>
 *  
 * @author  james
 * @version  [V1.00, 2016年11月4日]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class ValidateUtil {

	public static List<ConstraintViolation> validate(Object obj){
		XMLConfigurer x2 = new XMLConfigurer();
        x2.fromXML(User.class.getResourceAsStream("/validate/validation_"+obj.getClass().getSimpleName().toLowerCase()+".xml"));
		Validator validator = new Validator(x2);
		return validator.validate(obj);
	}
	
}
