package com.example.gestationapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Date;

public class CowListActivity extends AppCompatActivity {
    CowAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cow_list_layout);

        ArrayList<Cow> cows = new ArrayList<>();
        for(int i=0;i<30;i++){
            Date today = new Date(2022,0,i);
            Cow tempCow = new Cow("ar"+(i+100),today);
            cows.add(tempCow);
        }
        adapter = new CowAdapter(this, cows);
        listView = (ListView) findViewById(R.id.lvItems);
        listView.setAdapter(adapter);
    }
}
