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

public class Drinks extends AppCompatActivity {

    ListView list;
    String[] drinks = {
            "Johnie walker\n Price 1700\nSTRICTLY NOT for children under the age of 18\nWoW beverages",
            "Jomesons\n Price 1900\nSTRICTLY NOT for children under the age of 18\nWoW beverages",
            "Jack Daniels\n Price 3200\nSTRICTLY NOT for children under the age of 18\nWoW beverages",
            "Bacardi\n Price 1500\nSTRICTLY NOT for children under the age of 18\nTribeka lounge",
            "malibu\n Price 1650\nSTRICTLY NOT for children under the age of 18\nTribeka lounge",
            "Captain morgun\nPrice 1900\nSTRICTLY NOT for children under the age of 18\nTribeka lounge\"",
            "Monster Energy 500ml\nPrice 150\nJumia kaka house",
            "Minute Maid\nPrice 189\nJumia kaka house",

    } ;
    Integer[] imageId = {
            R.mipmap.johniewalker,
            R.mipmap.jameson,
            R.mipmap.jackdaniels,
            R.mipmap.bacardi,
            R.mipmap.malibu,
            R.mipmap.captainmorgan,
            R.mipmap.monsterdrink,
            R.mipmap.minutemaid

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        Drink adapter = new
                Drink (Drinks.this, drinks, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Drinks.this, drinks[+ position], Toast.LENGTH_SHORT).show();
            }
        });

    }

}

