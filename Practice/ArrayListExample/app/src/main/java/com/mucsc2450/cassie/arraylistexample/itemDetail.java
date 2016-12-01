package com.mucsc2450.cassie.arraylistexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class itemDetail extends AppCompatActivity {
    private TextView firstName, lastName;
    private int EXTRA_POSITION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        firstName = (TextView) findViewById(R.id.firstNamePH);
        lastName = (TextView) findViewById(R.id.lastNamePH);

        EXTRA_POSITION = getIntent().getIntExtra("position", 0);

        firstName.setText(ListManager.getInstance().list.get(EXTRA_POSITION).firstName);
        lastName.setText(ListManager.getInstance().list.get(EXTRA_POSITION).lastName);
    }
}
