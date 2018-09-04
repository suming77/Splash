package com.mingyansu.splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * @创建者 mingyan.su
 * @创建时间 2018/9/4 15:00
 * @类描述 ${TODO}主界面
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.tv_main);
        textView.setText("主界面 \n"+"我的博客地址：https://blog.csdn.net/m0_37796683 \n"+"我的github: https://github.com/FollowExcellence");
    }
}
