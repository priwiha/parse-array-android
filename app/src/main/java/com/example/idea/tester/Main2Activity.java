package com.example.idea.tester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ListView simpleList;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        back = (Button) findViewById(R.id.back);

        Bundle b = getIntent().getExtras();

        if (null != b) {

        final ArrayList<String> list = b.getStringArrayList("stock_list");//new ArrayList<String>();
            Log.e("List", "Passed Array List :: " + list);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, list);
            simpleList.setAdapter(arrayAdapter);

        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
