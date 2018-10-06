package com.github.piasy.fridademo;

import android.content.Intent;
import android.media.AudioRecord;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.mBtnTest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                private_func();
                private_func(123);
                private_func("str");
                private_func("str", true);

                System.out.println("func_with_ret(4): " + func_with_ret(4));

                System.out.println("getMinBufferSize(16000, 16, 2): "
                                   + AudioRecord.getMinBufferSize(16000, 16, 2));
            }
        });

        findViewById(R.id.DebuggerCheck).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, DebuggerCheck.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                MainActivity.this.startActivity(intent);
            }
        });

        findViewById(R.id.WebView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, WebViewActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                MainActivity.this.startActivity(intent);
            }
        });

        findViewById(R.id.CheckFile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, CheckFile.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                MainActivity.this.startActivity(intent);
            }
        });

        findViewById(R.id.RootCheck).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, RootCheck.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                MainActivity.this.startActivity(intent);
            }
        });

    }

    private void private_func() {
        System.out.println("private_func()");
    }

    private void private_func(int i) {
        System.out.println("private_func(int) " + i);
    }

    private void private_func(String s) {
        System.out.println("private_func(String) " + s);
    }

    private void private_func(String s, boolean b) {
        System.out.println("private_func(String, boolean) " + s + ", " + b);
    }

    private int func_with_ret(int i) {
        System.out.println("func_with_ret(int) " + i);
        return i * i;
    }
}
