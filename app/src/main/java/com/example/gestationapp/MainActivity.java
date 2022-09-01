package com.example.gestationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button firstButton,firstToSec,toGrid;
    TextView welcome;;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstButton = (Button) findViewById(R.id.BUTTON);

        welcome = (TextView) findViewById(R.id.textView);

        firstToSec = (Button) findViewById(R.id.nextLayout);

        toGrid = (Button) findViewById(R.id.toGridButton);




        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick (View view){
                if(!welcome.getText().toString().equals("Button was clicked"))
                welcome.setText("Button was clicked");
                else{welcome.setText("Hello Barty");
                }

            }
        });

        firstToSec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent newIntent = new Intent(MainActivity.this, secondPage.class);
                startActivity(newIntent);
            }
        });

        toGrid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent newIntent = new Intent(MainActivity.this, gridActivity.class);
                startActivity(newIntent);
            }
        });


    }


}