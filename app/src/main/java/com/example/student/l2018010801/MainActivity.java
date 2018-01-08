package com.example.student.l2018010801;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView auto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String abc[]={"aab","aac","aad","ccb","cca"};
        auto=findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,abc);
        auto.setThreshold(1);
        auto.setAdapter(adapter);


    }
}
