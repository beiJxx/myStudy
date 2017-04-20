/*
 * Powered By KoolYun.com].
 */

package com.panchong.test;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class EcmCardBins {
	
	/**
	 * 表名: EcmCardBins alias 用于页面显示对应中英文信息  .
	 */
	public static final String TABLE_ALIAS = "EcmCardBins";
	/** 列 ID 的对应中英文信息. */
	public static final String ALIAS_ID = "id";
	/** 列 BANK_NAME 的对应中英文信息. */
	public static final String ALIAS_BANK_NAME = "发卡行名称";
	/** 列 BANK_CODE_MS 的对应中英文信息. */
	public static final String ALIAS_BANK_CODE_MS = "民生代码";
	/** 列 BANK_CODE 的对应中英文信息. */
	public static final String ALIAS_BANK_CODE = "通用行号";
	/** 列 SHORT_NAME 的对应中英文信息. */
	public static final String ALIAS_SHORT_NAME = "发卡行简称";
	/** 列 CARD_NAME 的对应中英文信息. */
	public static final String ALIAS_CARD_NAME = "卡名";
	/** 列 CARD_LEN 的对应中英文信息. */
	public static final String ALIAS_CARD_LEN = "卡长度";
	/** 列 MAIN_CARD 的对应中英文信息. */
	public static final String ALIAS_MAIN_CARD = "主账号";
	/** 列 BIN_LEN 的对应中英文信息. */
	public static final String ALIAS_BIN_LEN = "bin长度";
	/** 列 BIN_VALUE 的对应中英文信息. */
	public static final String ALIAS_BIN_VALUE = "bin值";
	/** 列 CARD_TYPE 的对应中英文信息. */
	public static final String ALIAS_CARD_TYPE = "1-贷记 2-借记 3-预付 4-准贷记";
	/** 列 PROVINCE 的对应中英文信息. */
	public static final String ALIAS_PROVINCE = "省";
	/** 列 CITY 的对应中英文信息. */
	public static final String ALIAS_CITY = "市";
	
	//date formats
	
	//columns START
	/** 变量 id . */
	private String id;
	/** 变量 bankName . */
	private String bankName;
	/** 变量 bankCodeMs . */
	private String bankCodeMs;
	/** 变量 bankCode . */
	private String bankCode;
	/** 变量 shortName . */
	private String shortName;
	/** 变量 cardName . */
	private String cardName;
	/** 变量 cardLen . */
	private java.math.BigDecimal cardLen;
	/** 变量 mainCard . */
	private String mainCard;
	/** 变量 binLen . */
	private java.math.BigDecimal binLen;
	/** 变量 binValue . */
	private String binValue;
	/** 变量 cardType . */
	private String cardType;
	/** 变量 province . */
	private String province;
	/** 变量 city . */
	private String city;
	//columns END

	/**
	* EcmCardBins 的构造函数
	*/
	public EcmCardBins() {
	}
	/**
	* EcmCardBins 的构造函数
	*/
	public EcmCardBins(
		String id
	) {
		this.id = id;
	}

	/**
	 * Id 置值.
	 * @param  java.lang.String
	 */
	public void setId(String value) {
		this.id = value;
	}
	/**
	 * Id 取值.
	 * @return java.lang.String
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * BankName 置值.
	 * @param  java.lang.String
	 */
	public void setBankName(String value) {
		this.bankName = value;
	}
	/**
	 * BankName 取值.
	 * @return java.lang.String
	 */
	public String getBankName() {
		return this.bankName;
	}
	/**
	 * BankCodeMs 置值.
	 * @param  java.lang.String
	 */
	public void setBankCodeMs(String value) {
		this.bankCodeMs = value;
	}
	/**
	 * BankCodeMs 取值.
	 * @return java.lang.String
	 */
	public String getBankCodeMs() {
		return this.bankCodeMs;
	}
	/**
	 * BankCode 置值.
	 * @param  java.lang.String
	 */
	public void setBankCode(String value) {
		this.bankCode = value;
	}
	/**
	 * BankCode 取值.
	 * @return java.lang.String
	 */
	public String getBankCode() {
		return this.bankCode;
	}
	/**
	 * ShortName 置值.
	 * @param  java.lang.String
	 */
	public void setShortName(String value) {
		this.shortName = value;
	}
	/**
	 * ShortName 取值.
	 * @return java.lang.String
	 */
	public String getShortName() {
		return this.shortName;
	}
	/**
	 * CardName 置值.
	 * @param  java.lang.String
	 */
	public void setCardName(String value) {
		this.cardName = value;
	}
	/**
	 * CardName 取值.
	 * @return java.lang.String
	 */
	public String getCardName() {
		return this.cardName;
	}
	/**
	 * CardLen 置值.
	 * @param  java.math.BigDecimal
	 */
	public void setCardLen(java.math.BigDecimal value) {
		this.cardLen = value;
	}
	/**
	 * CardLen 取值.
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getCardLen() {
		return this.cardLen;
	}
	/**
	 * MainCard 置值.
	 * @param  java.lang.String
	 */
	public void setMainCard(String value) {
		this.mainCard = value;
	}
	/**
	 * MainCard 取值.
	 * @return java.lang.String
	 */
	public String getMainCard() {
		return this.mainCard;
	}
	/**
	 * BinLen 置值.
	 * @param  java.math.BigDecimal
	 */
	public void setBinLen(java.math.BigDecimal value) {
		this.binLen = value;
	}
	/**
	 * BinLen 取值.
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getBinLen() {
		return this.binLen;
	}
	/**
	 * BinValue 置值.
	 * @param  java.lang.String
	 */
	public void setBinValue(String value) {
		this.binValue = value;
	}
	/**
	 * BinValue 取值.
	 * @return java.lang.String
	 */
	public String getBinValue() {
		return this.binValue;
	}
	/**
	 * CardType 置值.
	 * @param  java.lang.String
	 */
	public void setCardType(String value) {
		this.cardType = value;
	}
	/**
	 * CardType 取值.
	 * @return java.lang.String
	 */
	public String getCardType() {
		return this.cardType;
	}
	/**
	 * Province 置值.
	 * @param  java.lang.String
	 */
	public void setProvince(String value) {
		this.province = value;
	}
	/**
	 * Province 取值.
	 * @return java.lang.String
	 */
	public String getProvince() {
		return this.province;
	}
	/**
	 * City 置值.
	 * @param  java.lang.String
	 */
	public void setCity(String value) {
		this.city = value;
	}
	/**
	 * City 取值.
	 * @return java.lang.String
	 */
	public String getCity() {
		return this.city;
	}
	/**
	 * 列值转换为String .
	 * @return String 列字符串
	 */
	public String toString() {
		return new ToStringBuilder(this)
			.append("Id", getId())
			.append("BankName", getBankName())
			.append("BankCodeMs", getBankCodeMs())
			.append("BankCode", getBankCode())
			.append("ShortName", getShortName())
			.append("CardName", getCardName())
			.append("CardLen", getCardLen())
			.append("MainCard", getMainCard())
			.append("BinLen", getBinLen())
			.append("BinValue", getBinValue())
			.append("CardType", getCardType())
			.append("Province", getProvince())
			.append("City", getCity())
			.toString();
	}
	/**
	 * 列值转换为hashCode .
	 * @return int hashCode
	 */
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.append(getBankName())
			.append(getBankCodeMs())
			.append(getBankCode())
			.append(getShortName())
			.append(getCardName())
			.append(getCardLen())
			.append(getMainCard())
			.append(getBinLen())
			.append(getBinValue())
			.append(getCardType())
			.append(getProvince())
			.append(getCity())
			.toHashCode();
	}
	/**
	 * 对象是否一样 .
	 * @return boolean 对象是否一样
	 */
	public boolean equals(Object obj) {
		if(obj instanceof EcmCardBins == false) return false;
		if(this == obj) return true;
		EcmCardBins other = (EcmCardBins)obj;
		return new EqualsBuilder()
			.append(getId(), other.getId())
			.append(getBankName(), other.getBankName())
			.append(getBankCodeMs(), other.getBankCodeMs())
			.append(getBankCode(), other.getBankCode())
			.append(getShortName(), other.getShortName())
			.append(getCardName(), other.getCardName())
			.append(getCardLen(), other.getCardLen())
			.append(getMainCard(), other.getMainCard())
			.append(getBinLen(), other.getBinLen())
			.append(getBinValue(), other.getBinValue())
			.append(getCardType(), other.getCardType())
			.append(getProvince(), other.getProvince())
			.append(getCity(), other.getCity())
			.isEquals();
	}
}

