package com.example.idea.tester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    private Button btn;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView)findViewById(R.id.simpleListView);
        btn =(Button)findViewById(R.id.btn);

        list = new ArrayList<String>();
        for (int i=0;i<20;i++){
            list.add("India ("+i+")");
            list.add("China ("+i+")");
            list.add("australia ("+i+")");
            list.add("Portugle ("+i+")");
            list.add("America ("+i+")");
            list.add("NewZealand ("+i+")");

            ///add array with return value
            String country="----- Indonesia ("+i+") -----";
            getValue(country);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, list);
        simpleList.setAdapter(arrayAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                //intent.putStringArrayListExtra("stock_list", list);
                intent.putExtra("stock_list", list);
                startActivity(intent);

            }
        });

        //cek array value
        for(int i=0;i<list.size();i++){
            Log.e("test",list.get(i));
            String countr=list.get(i).toString();

        }

    }

    private ArrayList<String> getValue(String country) {
        list.add(country);
        return list;
    }
}
