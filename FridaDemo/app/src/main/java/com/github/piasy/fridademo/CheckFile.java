package com.github.piasy.fridademo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.io.File;


public class CheckFile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                File file = new File("/sdcard/test");
                if (file.exists()) {
                    Toast.makeText(getApplicationContext(),"File Exist",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"File Doesnt Exist",Toast.LENGTH_LONG).show();
                }
            }
        });


    }

}


