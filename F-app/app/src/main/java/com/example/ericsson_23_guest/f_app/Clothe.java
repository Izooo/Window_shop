package com.example.ericsson_23_guest.f_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Isaac kiplel on 22/05/2017.
 */

public class Clothe extends ArrayAdapter<String> {


    private final Activity context;
    private final String[] clothes;
    private final Integer[] imageId;
    public Clothe(Activity context,
                String[] clothes, Integer[] imageId) {
        super(context, R.layout.junk, clothes);
        this.context = context;
        this.clothes = clothes;
        this.imageId = imageId;


    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.junk, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(clothes[position]);


        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}

