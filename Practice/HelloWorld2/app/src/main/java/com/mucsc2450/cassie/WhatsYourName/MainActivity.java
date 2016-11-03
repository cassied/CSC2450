package com.mucsc2450.cassie.WhatsYourName;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mHelloButton, mGoodbyeButton;
    private EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHelloButton = (Button) findViewById(R.id.hello_button);
        mGoodbyeButton = (Button) findViewById(R.id.goodbye_button);
        mNameEditText = (EditText) findViewById(R.id.usersName);

        mHelloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HelloActivity.class);
                i.putExtra("salutation", getString(R.string.hello_toast));
                i.putExtra("name", mNameEditText.getText().toString());
                startActivity(i);
            }
        });

        mGoodbyeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HelloActivity.class);
                i.putExtra("salutation", getString(R.string.goodbye_toast));
                i.putExtra("name", mNameEditText.getText().toString());
                startActivity(i);
            }
        });
    }
}
