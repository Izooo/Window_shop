package com.example.ericsson_23_guest.f_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Ericsson_23_Guest on 4/4/2017.
 */

public class Items extends AppCompatActivity {

    ImageButton electronics, shoes, clothes,  junks, drinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        electronics = (ImageButton) findViewById(R.id.electronics);
        shoes = (ImageButton) findViewById(R.id.shoes);
        clothes = (ImageButton) findViewById(R.id.clothes);
        junks = (ImageButton) findViewById(R.id.junk);
        drinks = (ImageButton) findViewById(R.id.drinks);


        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Items.this,
                        Shoes.class);
                startActivity(intent);

            }
        });
        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Items.this,
                        Clothes.class);
                startActivity(intent);

            }
        });

        junks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Items.this,
                        Junks.class);
                startActivity(intent);

            }
        });
        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Items.this,
                        Drinks.class);
                startActivity(intent);

            }
        });
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Items.this,
                        Electronics.class);
                startActivity(intent);

            }
        });

    }



    }
