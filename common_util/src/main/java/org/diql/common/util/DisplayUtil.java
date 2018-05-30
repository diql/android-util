package org.diql.common.util;

import android.content.Context;
import android.support.annotation.NonNull;

import java.util.Objects;

/**
 * Created by qinglian on 2018/5/5.
 */
public class DisplayUtil {
    private static final String TAG = "DisplayUtil";

    public static final float IOS_DP_SCALE = 360 / 375F;

    private DisplayUtil() {
        // empty.
    }

    public static float dip2pxFloat(@NonNull Context context, final float dipValue) {
//        checkNull(context);
        return context.getResources().getDisplayMetrics().density * dipValue;
    }

    public static int dip2pxInt(@NonNull Context context, final float dipValue) {
//        checkNull(context);
        return (int) (context.getResources().getDisplayMetrics().density * dipValue + 0.5);
    }

    public static float px2dipFloat(@NonNull Context context, final float pxValue) {
        return pxValue / context.getResources().getDisplayMetrics().density;
    }

    public static int px2dipInt(@NonNull Context context, final float pxValue) {
        return (int) (pxValue / context.getResources().getDisplayMetrics().density + 0.5);
    }

    public static float sp2pxFloat(@NonNull Context context, final float spValue) {
        return spValue * context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static int sp2pxInt(@NonNull Context context, final float spValue) {
        return (int) (spValue * context.getResources().getDisplayMetrics().scaledDensity + 0.5);
    }

    public static float px2spFloat(@NonNull Context context, final float pxValue) {
        return pxValue / context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static int px2spInt(@NonNull Context context, final float pxValue) {
        return (int) (pxValue / context.getResources().getDisplayMetrics().scaledDensity + 0.5);
    }

    public static float iOSdip2pxFloat(@NonNull Context context, final float iOSdipValue) {
        return dip2pxFloat(context, iOSdipValue) * IOS_DP_SCALE;
    }

    public static int iOSdip2pxInt(@NonNull Context context, final float iOSdipValue) {
        return (int) (iOSdip2pxFloat(context, iOSdipValue)+ 0.5);
    }

}
