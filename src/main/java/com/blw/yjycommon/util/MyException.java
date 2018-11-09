package com.blw.yjycommon.util;

public class MyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 13 * 错误编码 14
	 */
	private String errorCode;

	/**
	 * 消息是否为属性文件中的Key
	 */
	private boolean propertiesKey = true;

	/**
	 * 23 * 构造一个基本异常. 24 * 25 * @param message 26 * 信息描述 27
	 */
	public MyException(String message) {
		super(message);
	}

	/**
	 * 34 * 构造一个基本异常. 35 * 36 * @param errorCode 37 * 错误编码 38 * @param message 39 *
	 * 信息描述 40
	 */
	public MyException(String errorCode, String message) {
		this(errorCode, message, true);
	}

	/**
	 * 47 * 构造一个基本异常. 48 * 49 * @param errorCode 50 * 错误编码 51 * @param message 52 *
	 * 信息描述 53
	 */
	public MyException(String errorCode, String message, Throwable cause) {
		this(errorCode, message, cause, true);
	}

	/**
	 * 60 * 构造一个基本异常. 61 * 62 * @param errorCode 63 * 错误编码 64 * @param message 65 *
	 * 信息描述 66 * @param propertiesKey 67 * 消息是否为属性文件中的Key 68
	 */
	public MyException(String errorCode, String message, boolean propertiesKey) {
		super(message);
		this.setErrorCode(errorCode);
		this.setPropertiesKey(propertiesKey);
	}

	/**
	 * 77 * 构造一个基本异常. 78 * 79 * @param errorCode 80 * 错误编码 81 * @param message 82 *
	 * 信息描述 83
	 */
	public MyException(String errorCode, String message, Throwable cause, boolean propertiesKey) {
		super(message, cause);
		this.setErrorCode(errorCode);
		this.setPropertiesKey(propertiesKey);
	}

	/**
	 * 92 * 构造一个基本异常. 93 * 94 * @param message 95 * 信息描述 96 * @param cause 97 *
	 * 根异常类（可以存入任何异常） 98
	 */
	public MyException(String message, Throwable cause) {
		super(message, cause);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public boolean isPropertiesKey() {
		return propertiesKey;
	}

	public void setPropertiesKey(boolean propertiesKey) {
		this.propertiesKey = propertiesKey;
	}

}
