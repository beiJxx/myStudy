/*
 * 文 件 名:  User.java
 * 版    权:  Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 创 建 人:  james
 * 创建时间:  2016年11月4日
 */
package com.nic.model;

import net.sf.oval.constraint.MaxLength;
import net.sf.oval.constraint.MinLength;

/**
 * <一句话功能简述>
 *  
 * @author  james
 * @version  [V1.00, 2016年11月4日]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class User {

	private String name;
	
	private String age;
	

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	private boolean isValid(String name){
		return false;
	}
	
}
