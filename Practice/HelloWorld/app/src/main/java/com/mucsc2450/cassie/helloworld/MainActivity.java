package com.mucsc2450.cassie.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button mHelloButton, mGoodbyeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGoodbyeButton = (Button) findViewById(R.id.goodbye_button);
        mHelloButton = (Button) findViewById(R.id.hello_button);


        mHelloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        R.string.hello_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });


        mGoodbyeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        R.string.goodbye_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
