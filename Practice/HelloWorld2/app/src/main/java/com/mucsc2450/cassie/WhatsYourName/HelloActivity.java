package com.mucsc2450.cassie.WhatsYourName;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {
    private TextView mSalutationText;
    private String EXTRA_Sent_Salutation, EXTRA_Name;
    private Button mContactButton, mGoBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        EXTRA_Sent_Salutation = getIntent().getExtras().getString("salutation");
        EXTRA_Name = getIntent().getExtras().getString("name");

        mSalutationText   = (TextView) findViewById(R.id.salutation_text);
        mContactButton = (Button) findViewById(R.id.contact_button);
        mGoBackButton = (Button) findViewById(R.id.return_button);

        mSalutationText.setText(EXTRA_Sent_Salutation + " " + EXTRA_Name);

        mContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HelloActivity.this, Contact.class);
                i.putExtra("name", EXTRA_Name);
                startActivity(i);
            }
        });

        mGoBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}


