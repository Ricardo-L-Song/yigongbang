package com.example.sl.yigongbang.util;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sl.yigongbang.R;

public class Search extends AppCompatActivity {
    private String[] data={"Apple","Apple","Apple","Apple","Apple","Apple","Apple","Apple","Apple","Apple","Apple",
            "Apple","Apple","Apple","Apple","Apple","Apple","Apple","Apple",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar3);
        ListView listView=(ListView)findViewById(R.id.List_view);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(Search.this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
    }
}
