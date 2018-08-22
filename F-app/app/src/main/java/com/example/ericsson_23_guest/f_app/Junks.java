package com.example.ericsson_23_guest.f_app;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;




public class Junks extends AppCompatActivity {

    ListView list;
    String[] Junks = {
            "Burger Double crunchy\nPrice 450\nKFC lyris house kimathi street",
            "Chicken deals 2 piece\nPrice 200\nKFC lyris house kimathi street",
            "Chicken deals 5 piece\nPrice 950\nKFC lyris house kimathi street",
            "Chicken deals 9 piece\nPrice 1700\nKFC lyris house kimathi street",
            "Chicken deals 12 piece\nPrice 2100\nKFC lyris house kimathi street",
            "Chicken deals 15 piece\nPrice 2500\nKFC lyris house kimathi street",
            "3 piecer and fries\nPrice 500\nChicken Inn Ngong road",
            "2 piecer and fries\nPrice 300\nChicken Inn Ngong road",
            "Chicken mushroom \nPrice Regular 500  Medium 700  Large  900\nChicken Inn Ngong road",
            "BBq Steak marinated \nPrice Regular 500  Medium 700  Large  900\nChicken Inn Ngong road",
            "Marinated periperi Chicken \nPrice Regular 500  Medium 700  Large  900\nChicken Inn Ngong road",
            "BBQ Chicken, Bacon,sweetcorn,onion \nPrice Regular 550  Medium 750  Large  905\nChicken Inn Ngong road"
    } ;
    Integer[] imageId = {
            R.mipmap.burger,
            R.mipmap.piece,
            R.mipmap.pieces5,
            R.mipmap.pieces9,
            R.mipmap.pieces12,
            R.mipmap.pieces15,
            R.mipmap.chips,
            R.mipmap.chips,
            R.mipmap.pizza2,
            R.mipmap.pizza3,
            R.mipmap.pizza1,
            R.mipmap.pizza2,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junk);

         junk adapter = new
                 junk(Junks.this, Junks, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Junks.this,Junks[+ position], Toast.LENGTH_SHORT).show();
            }
        });

    }

}
