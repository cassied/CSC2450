package com.mucsc2450.cassie.week11;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        overridePendingTransition(R.anim.right_in, R.anim.right_out);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mListView = (ListView) findViewById(R.id.listView);

        //String listItems[] = {"One","Two","Three", "Four","Five"};

        final ArrayList<Employee> employeeList = Employee.getEmployeesFromFile("employees.json", this);

        String[] listItems = new String[employeeList.size()];

        for(int i = 0; i < employeeList.size(); i++){
            Employee employee = employeeList.get(i);
            listItems[i] = employee.firstName;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter(this, R.layout.activity_listview, listItems);
        mListView.setAdapter(adapter);

//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                // 1
//                Employee selectedEmployee = employeeList.get(position);
//
//                Intent i = new Intent(MainActivity.this, EmployeeDetail.class);
//                i.putExtra("firstname", selectedEmployee.firstName);
//                i.putExtra("lastname", selectedEmployee.lastName);
//                startActivity(i);
//            }
//
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_home) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
