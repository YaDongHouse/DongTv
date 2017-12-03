package com.example.admin.dongtv.util;

import org.junit.Test;

/**
 * Created by admin on 2017/11/22.
 */
public class DecimalFormatUtilTest {

    @Test
    public void DecimalFormatTest() throws Exception{

        String s = DecimalFormatUtil.formatW(12349);
        System.out.println(s);

    }

}