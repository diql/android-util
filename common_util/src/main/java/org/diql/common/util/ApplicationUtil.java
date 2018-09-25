package org.diql.common.util;

import android.app.Application;
import android.support.annotation.NonNull;

/**
 * 保存并向外提供Application.
 * @author diql
 */
public class ApplicationUtil {

    private static Application application;

    private ApplicationUtil() {
        // empty.
    }

    public static void init(@NonNull Application application) {
        Preconditions.checkNotNull(application);
        ApplicationUtil.application = application;
    }

    public static Application getApplication() {
        return application;
    }

}
