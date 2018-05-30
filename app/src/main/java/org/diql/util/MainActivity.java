package org.diql.util;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import org.diql.common.util.DisplayUtil;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int px = DisplayUtil.dip2pxInt(this, 10);
        int iOS10Px = DisplayUtil.dip2pxInt(this, 10);
        Log.d(TAG, "onCreate: 10px:" + px);
        Log.d(TAG, "onCreate: iOS10px:" + iOS10Px);
        Toast.makeText(this, "iOS10px:" + iOS10Px, Toast.LENGTH_SHORT).show();
    }
}
