package com.example.gestationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class datePage extends AppCompatActivity {
    Button backToFirst, getDate;
    TextView op;
    CalendarView simpleCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_layout);

        backToFirst = (Button) findViewById(R.id.backButton);
        getDate = (Button) findViewById(R.id.getDate);
        simpleCalendarView = (CalendarView) findViewById(R.id.calendarView);
        op = (TextView) findViewById(R.id.output);



        simpleCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){

            @Override
            public void onSelectedDayChange( CalendarView view, int year, int month, int dayOfMonth) {


                Date d = new Date(year-1900, month, dayOfMonth);

            Calendar c= Calendar.getInstance();
            c.setTime(d);

            c.add(Calendar.DATE, 280);
            c.add(Calendar.MONTH,1);
            c.add(Calendar.YEAR, 1900);
            Date future = c.getTime();

               op.setText((future.getDate() + "/" + future.getMonth() + "/" + future.getYear()));

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
