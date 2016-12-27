package com.woodnaonly.arcprogress;

import android.content.res.Resources;

/**
 * 作者：woodnaonly on 2016/7/4 0031 10:18
 * 邮箱：497917264@qq.com
 * 内容：
 * 备注：
 */
public class Utils
{
    public static float dp2px(Resources resources, float dp)
    {
        final float scale = resources.getDisplayMetrics().density;
        return dp * scale + 0.5f;
    }

    public static float sp2px(Resources resources, float sp)
    {
        final float scale = resources.getDisplayMetrics().scaledDensity;
        return sp * scale;
    }

}
