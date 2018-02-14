package com.example.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initEvent();
    }

    // 初始化点击事件
    private void initEvent() {
        findViewById(R.id.toast_btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast1();
            }
        });
    }

    // 显示默认Toast
    private void showToast1() {
//        Toast toast = Toast.makeText(this, "默认Toast", Toast.LENGTH_SHORT);
        Toast toast = Toast.makeText(this, R.string.app_name, Toast.LENGTH_LONG);
        toast.show();
    }
}
