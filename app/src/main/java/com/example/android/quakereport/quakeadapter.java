package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class quakeadapter extends ArrayAdapter {
    public quakeadapter(Activity context, ArrayList<Earthquake> words) {
        super(context, 0, words);


    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquakelist, parent, false);
        }

        Earthquake earthquake=(Earthquake) getItem(position);
        TextView magnitude=(TextView) listItemView.findViewById(R.id.mag);
        magnitude.setText(""+earthquake.getMag());
        TextView location=(TextView) listItemView.findViewById(R.id.location);
        location.setText(earthquake.getCountry());
        TextView time=(TextView) listItemView.findViewById(R.id.date);
        time.setText(earthquake.getDate());
        return listItemView;




    }

}