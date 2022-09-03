package com.example.gestationapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;

public class notiPage extends AppCompatActivity {
    Button backToFirst, notifyBut;
    EditText ed1,ed2,ed3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noti_layout);

            notifyBut=(Button)findViewById(R.id.notify);
        backToFirst=(Button)findViewById(R.id.back);

            ed1=(EditText)findViewById(R.id.et1);
            ed2=(EditText)findViewById(R.id.et2);
            ed3=(EditText)findViewById(R.id.et3);

            notifyBut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String tittle=ed1.getText().toString().trim();
                    String subject=ed2.getText().toString().trim();
                    String body=ed3.getText().toString().trim();

                    NotificationManager notif=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                    Notification notify=new Notification.Builder
                            (getApplicationContext()).setContentTitle(tittle).setContentText(body).
                            setContentTitle(subject).setSmallIcon(R.drawable.cow).build();

                    notify.flags |= Notification.FLAG_AUTO_CANCEL;
                    notif.notify(0, notify);
                }
            });


       backToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(notiPage.this, MainActivity.class );
                startActivity(newIntent);
            }
        });

    }

}
