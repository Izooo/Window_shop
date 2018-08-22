package com.example.ericsson_23_guest.f_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Isaac kiplel on 22/05/2017.
 */

public class Shoes extends AppCompatActivity {

    ListView list;
    String[] Shoes = {
            "Mens Leather Official\nPrice 1999\nLocation Jumia kaka house",
            "vazi classics leather\nPrice 2199\nLocation Jumia kaka house",
            "Leather boots\nPrice 2499 Jumia\nLocation kaka house",
            "Brown Leather loafers\nPrice 1999\nLocation Jumia kaka house",
            "Brown Leather \nPrice 1999 Jumia kaka house",
            "Mens sneakers\nPrice 1500\nLocation Jumia kaka house",
            "Black High tops ladies\nPrice 500\nLocation Jumia kaka house",
            "Red low cut ladies\nPrice 2200\nLocation Jumia kaka house",

            "Heeled black shoes ladies\nPrice 2050\nLocation Jumia kaka house",
            "Black ladies sneakers\nPrice 500\nLocation Jumia kaka house",
    } ;
    Integer[] imageId = {
            R.mipmap.mensleather,
            R.mipmap.vazi,
            R.mipmap.leatherboots,
            R.mipmap.brownloofers,
            R.mipmap.leatherboots,
            R.mipmap.menssneakers,
            R.mipmap.blackhightop,
            R.mipmap.redlowcut,
            R.mipmap.heelblackshoes,
            R.mipmap.womensneakers,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);

        Shoe adapter = new
                Shoe (Shoes.this, Shoes, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Shoes.this, Shoes[+ position], Toast.LENGTH_SHORT).show();
            }
        });

    }

}

