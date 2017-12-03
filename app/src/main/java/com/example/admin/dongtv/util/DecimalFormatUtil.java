package com.example.admin.dongtv.util;

import java.text.DecimalFormat;

/**
 * Created by admin on 2017/11/21.
 */

public class DecimalFormatUtil {

    private static final DecimalFormat decimalFormat = new DecimalFormat();

    public static String formatW(int value){
        if (value >= 10000){
            float v = value / 10000.0F;
            System.out.println(v);
            return format(v,"#.#'W'");
        }
        return String.valueOf(value);
    }

    public static String format(float value,String pattern){
        decimalFormat.applyPattern(pattern);
        return decimalFormat.format(value);
    }

}
