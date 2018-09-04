package com.mingyansu.splash;

import android.content.Context;

/**
 * @创建者 mingyan.su
 * @创建时间 2018/9/4 15:44
 * @类描述 ${TODO}工具类
 */
public class UIUtils {

    private static Context mContext;

    public static void init(Context context) {
        mContext = context;
    }
    /**
     * dp -> px
     */
    public static int dp2Px(int dp) {
        float density = mContext.getResources().getDisplayMetrics().density;
        int px = (int) (dp * density + .5f);
        return px;
    }

    /**
     * px -> dp
     *
     * @param px
     * @return
     */
    public static int px2Dp(int px) {
        float density = mContext.getResources().getDisplayMetrics().density;
        int dp = (int) (px / density + .5f);
        return dp;
    }
}
