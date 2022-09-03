package com.example.gestationapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class CowAdapter extends ArrayAdapter<Cow> {
    public CowAdapter(Context context, ArrayList<Cow> cows) {
        super(context, 0, cows);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // Get the data item for this position
        Cow cow = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cow_item, parent, false);
        }
        // Lookup view for data population
        TextView cowRef = (TextView) convertView.findViewById(R.id.cowRef);
        TextView AIDate = (TextView) convertView.findViewById(R.id.AIDate);
        LinearLayout LLL = (LinearLayout) convertView.findViewById(R.id.LLL);
        TextView bullName = (TextView) convertView.findViewById(R.id.bullName);
        TextView dueDate = (TextView) convertView.findViewById(R.id.dueDate);
        LinearLayout LLR = (LinearLayout) convertView.findViewById(R.id.LLR);
        // Populate the data into the template view using the data object
        cowRef.setText(cow.getRefNum());
        Date fullDate = cow.getuAIDate();
        String pString = fullDate.getDate()+"/"+(fullDate.getMonth()+1)+"/"+fullDate.getYear();
        AIDate.setText(pString);
        bullName.setText(cow.getBullName());
        fullDate = cow.getDueDate();
        pString = fullDate.getDate()+"/"+(fullDate.getMonth())+"/"+fullDate.getYear();
        dueDate.setText(pString);

        return convertView;
    }
}
