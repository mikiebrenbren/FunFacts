package com.veechie.mikiebrenbren.funfacts;

import android.graphics.Color;

/**
 * Created by michaelbrennan on 1/4/15.
 */
public class BackgroundColors {

    private String[] mColors = {"FF39add1","FF3079ab", "FFc25975","FFe15258", "FFf9845b","FF838cc7", "FFb7c0c7"};


    public int changeBackgroundColor(){
        int colorAsInt = Color.parseColor(mColors[FactBook.randomNum]);
        return colorAsInt;
    }

}
