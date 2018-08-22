package com.example.ericsson_23_guest.f_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Ericsson_23_Guest on 4/4/2017.
 */

public class Clothes extends AppCompatActivity {

    ListView list;
    String[] Clothes = {
            "Mens Jeans\nPrice 1299\nLocation Jumia kaka house",
            "Chocolate Brown Khaki pants\nPrice 1299\nLocation Jumia kaka house",
            "White dashiki Tshirt\nPrice 1200\nLocation Jumia kaka house ",
            "Heavy round neck tshirt\nPrice 1100\nLocation Jumia kaka house",
            "Black polo Tshirt\nPrice 599\nLocation Jumia kaka house",
            "Combat sweatpants\nPrice 1800\nLocation Jumia kaka house",
            "Turquise Green a line dress\nPrice 2200\nLocation Jumia kaka house",
            "Womens dress\nPrice 2200\nLocation Jumia kaka house",
            "Womens dress red and black\nPrice 1850\nLocation Jumia kaka house",
            "Dashiki shirt\nPrice 1200\nLocation Jumia kaka house",
            "Chiffon Blouse\nPrice 1800\nLocation Jumia kaka house"
    } ;
    Integer[] imageId = {
            R.mipmap.download,
            R.mipmap.brown,
            R.mipmap.dashiki,
            R.mipmap.tshirt,
            R.mipmap.polo,
            R.mipmap.combat,
            R.mipmap.green,
            R.mipmap.dress,
            R.mipmap.red,
            R.mipmap.womendashiki,
            R.mipmap.blouse,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);

        Clothe adapter = new
                Clothe (Clothes.this, Clothes, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Clothes.this, Clothes[+ position], Toast.LENGTH_SHORT).show();
            }
        });

    }

}


