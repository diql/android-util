package org.diql.util;

import android.app.Application;

import org.diql.common.util.ApplicationUtil;

public class App extends Application {

    @Override
    public void onCreate() {
        ApplicationUtil.init(this);
        super.onCreate();
    }
}
