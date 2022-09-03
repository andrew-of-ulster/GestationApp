package com.example.gestationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button firstButton,toDateBut,toScrollBut, toFrameBut, toGridBut, toNotiBut;
    TextView welcome;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = (TextView) findViewById(R.id.textView);

        firstButton = (Button) findViewById(R.id.BUTTON);
        toDateBut = (Button) findViewById(R.id.nextLayout);
        toScrollBut = (Button) findViewById(R.id.toScrollButton);
        toFrameBut = (Button) findViewById(R.id.toFrameButton);
        toGridBut = (Button) findViewById(R.id.toGridButton);
        toNotiBut = (Button) findViewById(R.id.toNotiButton);


        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick (View view){
                if(!welcome.getText().toString().equals("Button was clicked"))
                welcome.setText("Button was clicked");
                else{welcome.setText("Hello Barty");
                }

            }
        });

        toDateBut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent newIntent = new Intent(MainActivity.this, datePage.class);
                startActivity(newIntent);
            }
        });

        toScrollBut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent newIntent = new Intent(MainActivity.this, scrollPage.class);
                startActivity(newIntent);
            }
        });

        toFrameBut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent newIntent = new Intent(MainActivity.this, framePage.class);
                startActivity(newIntent);
            }
        });

        toGridBut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent newIntent = new Intent(MainActivity.this, actualGridPage.class);
                startActivity(newIntent);
            }
        });

        toNotiBut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent newIntent = new Intent(MainActivity.this, notiPage.class);
                startActivity(newIntent);
            }
        });

    }


}