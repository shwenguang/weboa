package com.harmony.wenguang.support;

import java.net.URLEncoder;
import java.util.regex.Pattern;

public class CommonUtils {
    private static String digitalPattern = "^[+-]?\\d+$";
    private static String decimalPattern = "^[+-]?\\d+(\\.?\\d*)$";
    
    public static boolean blank(String str){
    	if(str == null || str.trim().length()==0){
    		return true;
    	}
    	return false;
    }
    
    public static String encodeurl(String str){
    	if(str==null || str.trim().length()==0){
    		return "";
    	}
    	return URLEncoder.encode(str);
    }
    
    public static boolean isDigital(String input) {
        if (input == null || input.length() == 0) {
            return false;
        }
        return Pattern.matches(digitalPattern, input);
    }

    public static boolean isDecimal(String input) {
        if (input == null || input.length() == 0) {
            return false;
        }
        return Pattern.matches(decimalPattern, input);
    }

    public static Long parseLong(String str, Long defaultValue) {
        if (!isDigital(str)) {
            return defaultValue;
        }
        return Long.parseLong(str);
    }
    public static Integer parseInt(String str, Integer defaultValue) {
        if (!isDigital(str)) {
            return defaultValue;
        }
        return Integer.parseInt(str);
    }
}
