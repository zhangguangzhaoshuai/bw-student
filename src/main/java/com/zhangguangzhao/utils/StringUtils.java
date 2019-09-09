package com.zhangguangzhao.utils;

public class StringUtils {

	public static String toHtml(String text){
		StringBuffer buffer = new StringBuffer();
		String[] split = text.split("(\n\r)");
		for (String string : split) {
			buffer.append("<p>");
			String replaceAll = string.replaceAll("(\r)", "<br/>");
			buffer.append(replaceAll);
			buffer.append("</p>");
		}
		return text.toString();
	}
	
	public static boolean isPhone(String str) {
		return str.matches("^1[3|4|5|7|8][0-9]\\d{8}$");
	}
	
	public static boolean isEmail(String str) {
		return str.matches("^([a-z0-9A-Z+])@([a-z0-9A-Z]\\.)([a-zA-Z]{2,})$");
	}
}
