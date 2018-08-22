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

public class Laptops extends AppCompatActivity {
    ListView list;
    String[] Laptops = {
            "Hp15\nPrice 41,999\nDescription 15'6 inches,touch screen,Intel core i3,1TB Hdd,8Gb Ram,Windows 10\nLocation Saruk",
            "Asus X541SA\nPrice 24499\nIntel celeron,500GB Hdd,4GB Ram,windows 8.1\nLocation Saruk",
            "Hp pavilion 15 x360\nPrice 59999\nDescription 8Gb Ram,500Gb Hdd,Core i5,windows 10\nPc world Mpaka road",
            "Dell Inspiron 3542\nPrice 38999\nDescription 4Gb Ram,500Gb Hdd,Core i3,windows 8.1\nPc world Mpaka road",
            "Acer Aspire E14\nPrice 49500\nDescription 4Gb Ram,500Gb Hdd,14' screen,Core i3,windows 10\nPc world Mpaka road",
            "Hp ProBook 450 G3\nPrice 76500\nDescription 8Gb Ram,1Tb Hdd,15'6 screen,Core i5,windows 10\nBright old mutual building",
            "Toshiba C55 \nPrice 59000\nDescription 4Gb Ram,750Gb Hdd,15'6 screen,Core i5,windows 10\nSaruk",
            "Apple Macbook Air 13\nPrice 145000\nDescription 8Gb Ram,125Gb ssd,14' screen,Core i5,windows 10\nPc world Mpaka road",
            "Lenovo Ideapad v310\nPrice 47999\nDescription 4Gb Ram,500Gb Hdd,15'6 screen,Core i3,windows 10\nSaruk",
            "Lenovo ideapad 310\nPrice 52990\nDescription 4Gb Ram,1Tb Hdd,14' screen,2 Gb nvidia graphics card,Core i5,windows 10\nSaruk"
    };
    Integer[] imageId = {
            R.mipmap.hp15,
            R.mipmap.asus,
            R.mipmap.pavilion,
            R.mipmap.dell,
            R.mipmap.aceraspire,
            R.mipmap.probook,
            R.mipmap.toshiba,
            R.mipmap.applemacbookair,
            R.mipmap.lenovo,
            R.mipmap.lenovo

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);

        Laptop adapter = new
                Laptop (Laptops.this, Laptops, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Laptops.this, Laptops[+ position], Toast.LENGTH_SHORT).show();
            }
        });

    }

}

