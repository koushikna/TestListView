package com.example.yasir.testlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView sampleListView;
    ArrayList<String> names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampleListView= (ListView) findViewById(R.id.samplListView);
        names.add("koushik");
        names.add("Ashik");
        names.add("Mustofa");
        names.add("Rema");

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        sampleListView.setAdapter(adapter);
    }
}
