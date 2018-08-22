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

public class Phones extends AppCompatActivity {
    ListView list;
    String[] Phones = {
            "Tecno l9 plus\nPrice 14999\nDescription 3Gb ram,16GbInternal storage,android 7.0,13Mp back camera,5Mp front camera,5000Mah,fingerprint among others\n MobileHub sasa shopping mall",
            "Tecno Camon C7\nPrice 10299\nDescription 2Gb ram,16gb internal,android 6.0,13Mp back and front,2500Mah among others\nLocation Mobile hub sasa shopping mall",
            "Cubot Manito\nPrice 9999\nDescription 3Gb ram,16GbInternal storage,android 7.0,13Mp back camera among others\n Kilimall likoni line",
            "Cubot Dinosaur\nPrice 12999\nDescription 3Gb ram,16GbInternal storage,android 6.0,13Mp back camera,4150 Mah,fingerprint among others\nKilimall likoni lane",
            "Samsung galaxy J2\nPrice 12999\nDescription 1Gb ram,8GbInternal storage,android 6.0,5Mp back camera,2Mp front camera among others\nKilimall likoni lane",
            "Huawei P8 lite\nPrice 16000\nDescription 2Gb ram,16GbInternal storage,android 6.0,13Mp back camera,5Mp front camera,2200Mah, among others\nKilimall likoni lane",
            "Infinix S2 Pro\nPrice 15600\nDescription 3Gb ram,32GbInternal storage,android 6.0,13Mp back camera,8Mp front camera,3000Mah, among others\nJumia kaka house ",
            "Lenovo A1000\nPrice 14999\nDescription 1Gb ram,8GbInternal storage,android 5.0,5Mp back camera,2Mp front camera,3000Mah, among others\nJumia kaka house",
            "HTC Desire 630\nPrice 14990\\nDescription 2Gb ram,16GbInternal storage,android 6.0,13Mp back camera,5Mp front camera,2200Mah, among others\nPhones place Kimathi House"
    } ;
    Integer[] imageId = {
            R.mipmap.tecnol9plus,
            R.mipmap.tecnocamonc7,
            R.mipmap.cubotmanito,
            R.mipmap.cubotdinosaur,
            R.mipmap.samsunggalaxyj2,
            R.mipmap.huawei,
            R.mipmap.infinixs2pro,
            R.mipmap.lenevoa1000,
            R.mipmap.htcdesire630,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        Phone adapter = new
                Phone (Phones.this, Phones, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Phones.this, Phones[+ position], Toast.LENGTH_SHORT).show();
            }
        });

    }

}

