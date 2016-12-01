package com.mucsc2450.cassie.arraylistexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);

        ListManager.addListItems("Cassie", "Dusute");
        ListManager.addListItems("Steve", "Ristovski");

        final ArrayList<ListManager> itemList = ListManager.getList();

        String[] listItems = new String[ListManager.getInstance().list.size()];

        for(int i = 0; i < itemList.size(); i++){
            ListManager item = itemList.get(i);
            listItems[i] = item.firstName + " " + item.lastName;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter(this, R.layout.activity_listview, listItems);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, itemDetail.class);
                i.putExtra("position", position);
                startActivity(i);
            }

        });
    }
}
