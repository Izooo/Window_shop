package com.example.ericsson_23_guest.f_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Ericsson_23_Guest on 4/4/2017.
 */

public class Electronics extends AppCompatActivity {

    Button phones,laptop;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);

        phones = (Button)findViewById(R.id.phones);
        phones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Electronics.this,
                        Phones.class);
                startActivity(intent);
            }
        });
        laptop = (Button)findViewById(R.id.laptop);
        laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Electronics.this,
                        Laptops.class);
                startActivity(intent);
            }
        });
        back = (ImageButton)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Electronics.this,
                        Items.class);
                startActivity(intent);

            }
        });
    }
}
