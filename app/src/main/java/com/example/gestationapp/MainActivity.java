package com.example.gestationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button firstButton,firstToSec,toScroll, toFrame, toGrid;
    TextView welcome;;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = (TextView) findViewById(R.id.textView);

        firstButton = (Button) findViewById(R.id.BUTTON);
        firstToSec = (Button) findViewById(R.id.nextLayout);
        toScroll = (Button) findViewById(R.id.toScrollButton);
        toFrame = (Button) findViewById(R.id.toFrameButton);
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
                Intent newIntent = new Intent(MainActivity.this, datePage.class);
                startActivity(newIntent);
            }
        });

        toScroll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent newIntent = new Intent(MainActivity.this, scrollPage.class);
                startActivity(newIntent);
            }
        });

        toFrame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent newIntent = new Intent(MainActivity.this, framePage.class);
                startActivity(newIntent);
            }
        });

        toGrid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent newIntent = new Intent(MainActivity.this, actualGridPage.class);
                startActivity(newIntent);
            }
        });

    }


}