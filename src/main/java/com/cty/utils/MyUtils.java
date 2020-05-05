package com.cty.utils;

import java.util.Random;

/**
 * @Author wuyong7
 * @Description
 * @data 2020/5/5 18:53
 */
public class MyUtils {

    public static String fillStr(String p_srcStr, String p_fillStr, int p_totalLen, boolean p_leftFlag) {
        if (p_srcStr == null) {
            return null;
        }
        if (p_srcStr.length() > p_totalLen || p_fillStr == null || p_fillStr.length() == 0) {
            return p_srcStr.substring(p_srcStr.length() - p_totalLen, p_srcStr.length());
        }
        if (((p_totalLen - p_srcStr.length()) % p_fillStr.length()) != 0) {
            return p_srcStr;
        }
        String result = p_srcStr;
        int i = p_totalLen - p_srcStr.length();
        while (i > 0) {
            result = p_leftFlag ? (p_fillStr + result) : (result + p_fillStr);
            i = i - p_fillStr.length();
        }
        return result;
    }

    public static long getRecordId() {

        String recordStr = String.valueOf("841654");
        recordStr = fillStr(recordStr, "0", 6, true);
        int length = recordStr.length();
        recordStr = recordStr.substring(length - 6);

        String preRecord = TimeUtil.now("yyMMddHHmm");
        String recordID = preRecord + recordStr;
        return Long.parseLong(recordID);
    }
}
