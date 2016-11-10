package com.mucsc2450.cassie.week11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class EmployeeDetail extends AppCompatActivity {

    private TextView firstName, lastName;
    private String EXTRA_firstName, EXTRA_lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_detail);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);

        firstName = (TextView) findViewById(R.id.firstNamePH);
        lastName = (TextView) findViewById(R.id.lastNamePH);

        EXTRA_firstName = getIntent().getExtras().getString("firstname");
        EXTRA_lastName = getIntent().getExtras().getString("lastname");

        firstName.setText(EXTRA_firstName);
        lastName.setText(EXTRA_lastName);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }
}
