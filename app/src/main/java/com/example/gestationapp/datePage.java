package com.example.gestationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;

public class datePage extends AppCompatActivity {
    Button backToFirst;
    TextView op;
    CalendarView calenderClick;
    Button getDate;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);

        backToFirst = (Button) findViewById(R.id.backButton);
        CalendarView simpleCalendarView = (CalendarView) findViewById(R.id.calendarView);
        getDate = (Button) findViewById(R.id.getDate);
        op = (TextView) findViewById(R.id.output);


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        simpleCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){

            @Override
            public void onSelectedDayChange( CalendarView view, int year, int month, int dayOfMonth) {
                String curDate = dayOfMonth + "/" + ++month + "/" + year;
                op.setText(curDate);

            }
        });





       backToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(datePage.this, MainActivity.class );
                startActivity(newIntent);
            }
        });






    }

}
