package org.diql.util;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.diql.common.util.DisplayUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int px = DisplayUtil.dip2pxInt(this, 10);
        Toast.makeText(this, "10px:" + px, Toast.LENGTH_SHORT).show();
    }
}
