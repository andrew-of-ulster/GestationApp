package com.example.gestationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class secondPage extends AppCompatActivity {
    Button backToFirst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);


        backToFirst = (Button) findViewById(R.id.backButton);

       backToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(secondPage.this, MainActivity.class );
                startActivity(newIntent);
            }
        });
    }

}
