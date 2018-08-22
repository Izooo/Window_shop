package com.example.ericsson_23_guest.f_app;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;

import com.kevinomyonga.droidonboarder.DroidOnBoarderActivity;
import com.kevinomyonga.droidonboarder.DroidOnBoarderFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends DroidOnBoarderActivity{




    @Override
    protected List<Fragment> populateOnBoarder() {
        List<Fragment> introSlides = new ArrayList<>();
        introSlides.add(DroidOnBoarderFragment
                .newInstance(R.mipmap.question, "Want Fashion?", "Well welcome home", Color.WHITE, Color.WHITE));
        introSlides.add(DroidOnBoarderFragment
                .newInstance(R.mipmap.theclothes, "Clothes too come in handy", "Spoil your self this weekend with the current trends",  Color.YELLOW, Color.YELLOW));
        introSlides.add(DroidOnBoarderFragment
                .newInstance(R.mipmap.myshoes, "Have a variety ",  "Cool shoes also included", Color.BLACK, Color.BLACK));
        introSlides.add(DroidOnBoarderFragment
                .newInstance(R.mipmap.me, "lets get started",  "Please click on Done", Color.WHITE, Color.WHITE));

        return introSlides;


    }

    @Override
    protected int setBackgroundColor() {
        return Color.RED;
    }

    @Override
    protected int setButtonTextColor() {
        return Color.GRAY;
    }

    @Override
    protected int setIndicatorStrokeColor() {
        return Color.WHITE;
    }

    @Override
    protected int setIndicatorSelectColor() {
        return Color.WHITE;
    }

    @Override
    protected int setIndicatorUnselectColor() {
        return Color.TRANSPARENT;
    }

    @Override
    protected void finishOnBoarding() {
        finish();
        Intent intent = new Intent(MainActivity.this,
                Items.class);
        startActivity(intent);

    }
}
