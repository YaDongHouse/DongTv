package com.example.admin.dongtv.util;

/**
 * Created by admin on 2017/12/2.
 */

public class StringUtils {
    public static boolean isBlank(CharSequence str) {
        return (isEmpty(str) || str.toString().trim().length()==0);
    }
    public static boolean isEmpty(CharSequence str) {
        return (str == null || str.length() == 0);
    }
}
