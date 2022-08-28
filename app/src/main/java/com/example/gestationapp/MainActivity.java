package com.example.gestationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button firstButton;
    TextView fartText;
    Button firstToSec;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstButton = (Button) findViewById(R.id.BUTTON);

        fartText = (TextView) findViewById(R.id.textView);

        firstToSec = (Button) findViewById(R.id.nextLayout);




        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick (View view){
                if(!fartText.getText().toString().equals("Button was clicked"))
                fartText.setText("Button was clicked");
                else{fartText.setText("Hello Barty");
                }

            }
        });

        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent newIntent = new Intent(MainActivity.this, secondPage.class);
                startActivity(newIntent);
            }
        });



    }


}