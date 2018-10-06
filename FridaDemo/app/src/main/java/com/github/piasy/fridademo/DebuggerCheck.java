package com.github.piasy.fridademo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DebuggerCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (android.os.Debug.isDebuggerConnected()) {
                    Toast.makeText(getApplicationContext(), "App is Being Debugged", Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}
