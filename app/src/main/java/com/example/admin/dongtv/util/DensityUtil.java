package com.example.admin.dongtv.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/**
 * Created by admin on 2017/11/22.
 */

public class DensityUtil {

    private DensityUtil(){
        throw new AssertionError();
    }

    /**
     * dp转px
     * @param context
     * @param dpVal
     * @return
     */
    public static int dp2px(Context context,float dpVal){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,dpVal,getDisplayMetrics(context));
    }


    /**
     * sp转px
     * @param context
     * @param spVal
     * @return
     */
    public static int sp2px(Context context,float spVal){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,spVal,getDisplayMetrics(context));
    }

    /**
     * px转dp
     * @param context
     * @param pxVal
     * @return
     */
    public static int px2dp(Context context,float pxVal){
       return (int) (pxVal/getDisplayMetrics(context).density + 0.5F);
    }


    /**
     * px转sp
     * @param context
     * @param pxVal
     * @return
     */
    public static int px2sp(Context context,float pxVal){
        return (int) (pxVal/getDisplayMetrics(context).scaledDensity+0.5f);
    }


    /**
     * 获取DisplayMetrics
     * @param context
     * @return
     */
    public static DisplayMetrics getDisplayMetrics(Context context){
        return context.getResources().getDisplayMetrics();
    }

}
